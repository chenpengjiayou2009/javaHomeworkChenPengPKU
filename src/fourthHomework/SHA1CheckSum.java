package fourthHomework;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

public class SHA1CheckSum {
    // 传入文件夹名和MessageDigest对象地址，在递归过程中不断更新MessageDigest对象的值，最终返回该MessageDigest对象生成的byte[]数组
    public static MessageDigest SHA1CheckSum4Dir(String path, MessageDigest complete) throws Exception{
        byte[] buffer = new byte[1024];
        File dir = new File(path);
        File[] fs = dir.listFiles();
        if(fs==null){return complete;}
        Arrays.sort(fs); // 将该文件夹按File内置规则进行排序，以保证每次调用该函数都能生成相同的SHA-1 code
        for(File f:fs){
            // if f is a directory
            if(f.isDirectory()){
                SHA1CheckSum4Dir(path + File.separator + f.getName(),complete);
                continue; // 继续处理后面的文件
            }
            // if f is a file
            FileInputStream is = new FileInputStream(f);
            int numRead = 0;
            do {
                numRead = is.read(buffer);
                if(numRead > 0){
                    complete.update(buffer,0,numRead);
                }
            } while(numRead!=-1);
            is.close();
        }
        return complete;
    }


    public static void main(String[] args){
        try{
            String path = "."; // 用于测试的文件夹名
            MessageDigest complete = MessageDigest.getInstance("SHA-1"); // 用于计算SHA-1 HASHCODE 的 MessageDigest类
            byte[] sha1 = SHA1CheckSum4Dir(path,complete).digest(); // 保存结果

            String result = "";
            for(int i=0;i<sha1.length;i++){
                result += Integer.toString(sha1[i]&0xFF,16);
            }
            System.out.println("hashcode for directory" + path + " is " + result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
