package com.dz.dzim.utils;/**
 * @className ObjectUtis
 * @description TODO
 * @author xxxyyy
 * @date 2021/2/2 11:32
 */

import java.lang.reflect.Field;

/**
 *@className ObjectUtis
 *@description TODO
 *@author xxxyyy
 *@date 2021/2/2 11:32
 */
public class ObjectUtis {

    //判断该对象是否: 返回ture表示所有属性为null  返回false表示不是所有属性都是null
    public static boolean isAllFieldNull(Object obj) {
        Class stuCla = (Class) obj.getClass();// 得到类对象
        Field[] fs = stuCla.getDeclaredFields();//得到属性集合
        boolean flag = true;
        for (Field f : fs) {//遍历属性
            f.setAccessible(true); // 设置属性是可以访问的(私有的也可以)
            Object val = null;// 得到此属性的值
            try {
                val = f.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if(val!=null) {//只要有1个属性不为空,那么就不是所有的属性值都为空
                flag = false;
                break;
            }
        }
        return flag;
    }

}
