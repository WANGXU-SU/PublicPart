package com.statics.publics.part.interfaces.worker;

import com.statics.publics.part.pojo.worker.CurriculumOrder;

import java.util.List;
import java.util.Map;

/**
 * 课程的服务接口
 * @author WangXu
 */
public interface CurriculumPublicPartService {



    /**
     * 报名 主要用于更新人数
     *
     * @param id 课程id
     * @return
     */
    boolean applyCurriculum(int id);

    /**
     * 取消报名 主要用于更新人数
     *
     * @param id 课程id
     * @return
     */
    boolean cancelCurriculum(int id);

    /**
     * 创建订单 主要用于更新人数
     *
     * @param curriculumOrder 订单对象
     * @return
     */
    boolean createOrder(CurriculumOrder curriculumOrder);

    /**
     * 取消订单 主要用于更新人数
     *
     * @param id 订单id
     * @param stuId 学生id
     * @return
     */
    boolean cancelOrder(String id,int stuId);

    //付钱

    /**
     * 取消订单
     * @param orderId 订单id
     * @return
     */
    Map<String,Object> pay(String orderId);

    //得到课程信息 以生成订单信息

    /**
     * 用于支付宝生成订单的课程信息
     * @param curriculumId 课程id
     * @return
     */
    Map<String, Object> getInfo(int curriculumId);

    //查询订单

    /**
     * 查询学生下的所有订单
     * @param stuId 学生id
     * @param isPay 是否付钱  -1未付 1付过
     * @param entryFormStatus -1开课 0提醒付款 1课程开始 2课程结束
     * @param isExpires 是否过期 true 过期  false未过期
     * @return
     */
    List<Map<String, Object>> checkOrder(int stuId, Integer isPay,Integer entryFormStatus,Boolean isExpires);


    //得到订单信息

    /**
     * 得到单个订单信息
     * @param orderId 订单id
     * @param stuId 学生id
     * @return
     */
    Map<String, Object> getSingleOrder(String orderId,int stuId);








}
