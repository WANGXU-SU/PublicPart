package com.statics.publics.part.interfaces.student;


/***
 *  学生消息推送
 * @author chenlin
 * */
public interface SendMessage {


    /***
     *  给学发送通知
     * @param userId 学生id
     */
      boolean massSend(int[] userId,String messger);


}
