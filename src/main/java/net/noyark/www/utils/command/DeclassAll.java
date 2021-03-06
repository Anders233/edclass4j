package net.noyark.www.utils.command;

import net.noyark.www.utils.api.Pool;
import net.noyark.www.utils.encode.SimpleClassCoder;

/**
 * 解密全部项目的class文件，目前只支持将class文件加密打包
 *
 * declassall mainClass KeyFile
 * classpath在配置文件
 *
 */
public class DeclassAll implements CommandBase {

    @Override
    public Object execute(String[] args) {

        Pool.getClassCoder().recursiveDecode(args[0],args[1]);
        return "success";
    }

    @Override
    public String[] usage() {
        return new String[]{"解密指定application classpath下全部的class文件","main_class 运行主类 keyFile 加密key"};
    }
}
