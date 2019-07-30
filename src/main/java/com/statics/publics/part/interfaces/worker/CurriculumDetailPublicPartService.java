package com.statics.publics.part.interfaces.worker;

import com.statics.publics.part.pojo.worker.DetailOrderList;
import com.statics.publics.part.pojo.worker.EntryForm;

import java.util.List;
import java.util.Map;

/**
 * 课时的服务接口
 *
 * @author WangXu
 */
public interface CurriculumDetailPublicPartService {


    /**
     * 学生报名课程  主要更新课时和课程人数
     *
     * @param id   课时id
     * @param kind 报名种类 -1报名课时 1报名课程
     * @return
     */
    boolean applyDetail(int id, int kind);


    /**
     * @param id 要报名的课时id
     * @return
     */
    int getCurrentEntryFormId(int id);


    /**
     * 根据批次id查询课时批次状态
     *
     * @param entryFormId 批次id
     * @return
     */
    EntryForm getEntryFormById(int entryFormId);

    /**
     * 根据批次id查询相关信息
     *
     * @param entryFormIds 批次ids数组
     * @param orderIds     学生端的报名id
     * @return
     */
    List<Map<String, Object>> getInfoByEntryId(int[] entryFormIds, int[] orderIds);

    /**
     * 取消报名 主要更新课时和课程人数
     *
     * @param id   课时id
     * @param kind 报名种类 -1报名课时 1报名课程
     * @return
     */
    boolean cancelDetail(int id, int kind);


    /**
     * 创建订单
     *
     * @param detailOrderList 订单实体类
     * @return
     */
    boolean createOrder(DetailOrderList detailOrderList);


    /**
     * 取消订单
     *
     * @param id    订单id
     * @param stuId 学生id
     * @return
     */
    boolean cancelOrder(String id, int stuId);


    /**
     * 付钱
     *
     * @param id 订单id
     * @return map封装返回信息  success（boolean）是否支付成功  msg(String)信息说明
     */
    Map<String, Object> pay(String id, String aliId);


    /**
     * 查询订单
     * 查询全部只传递 stuId 其他全为null
     *
     * @param stuId           学生id
     * @param isPay           支付状态 -1未支付 1已支付 null查全部
     * @param entryFormStatus 课时状态  -1报名 0提醒缴费状态  1上课中 2课时结束
     * @param isExpires       true  已过期  false 未过期
     * @return 返回所需要的信息 以map格式返回
     */
    List<Map<String, Object>> checkOrder(int stuId, Integer isPay, Integer entryFormStatus, Boolean isExpires, boolean isVisible);


    /**
     * 得到课时信息生成订单
     *
     * @param id 课时id
     * @return 返回所需要的信息 以map格式返回
     */
    Map<String, Object> getInfo(int id,int kind);


    /**
     * 查询单个订单信息  用于未付款订单 在查询订单页面付款
     *
     * @param orderId 订单编号
     * @return
     */
    Map<String, Object> findSingleOrderInfo(String orderId);

}
