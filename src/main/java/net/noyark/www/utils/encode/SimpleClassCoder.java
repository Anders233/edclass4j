package net.noyark.www.utils.encode;

import net.noyark.www.utils.Message;
import net.noyark.www.utils.ex.ParseException;

public class SimpleClassCoder {

    private static SimpleClassCoder classCoder;

    static {
        classCoder = new SimpleClassCoder();
    }

    public void encode(String fileName,String... classname){
        try{
            //create key
            GenerateKey.createKey(new String[]{fileName});
            EncryptClasses.encode(fileName,classname);
            Message.info("create key file "+fileName);
        }catch (Exception e){
            throw new ParseException("the class have some problems..",e);
        }
    }

    public void decode(String keyFile,String classname,boolean executeMain){
        try{
            DecryptStart.decode(new String[]{keyFile,classname},executeMain);
        }catch (Exception e){
            e.printStackTrace();
            throw new ParseException("the class have some problems..",e);
        }
    }
    //不执行main
    public void decode(String keyFile,String classname){
        decode(keyFile,classname,false);
    }

    public static SimpleClassCoder getClassCoder() {
        return classCoder;
    }
}
