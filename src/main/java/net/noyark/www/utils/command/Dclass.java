package net.noyark.www.utils.command;

import net.noyark.www.utils.encode.DecryptStart;

public class Dclass implements CommandBase {

    @Override
    public Object excute(String[] args) {
        try{
            DecryptStart.decode(args,true);
        }catch (Exception e){
            e.printStackTrace();
            return "解码失败";
        }
        return "解码成功";
    }
}
