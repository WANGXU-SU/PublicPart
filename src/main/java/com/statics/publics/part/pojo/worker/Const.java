package com.statics.publics.part.pojo.worker;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Const implements Serializable {
    //状态容器
    public static Map<String, String> status = new HashMap<>();
    //用户排序容器
    public static Map<Integer, String> workerSort = new HashMap<>();

    //课程排序容器
    public static Map<Integer, String> curriculumSort = new HashMap<>();

    //评论排序容器
    public static Map<String, String> scoreSort = new HashMap<>();

    //课时排序容器
    public static Map<String, String> detailSort = new HashMap<>();

    //状态容器
    public static Map<String, Integer> dbStatus = new HashMap<>();



    //教师利率
    public static final double rate = 0.4;


    //随机数类
    private static Random random = new Random();







    static {
        status.put("00001", "正常返回");
        status.put("00002", "错误的提交参数");
        status.put("00003", "token过期或无效");
        status.put("00004", "非法操作");
        status.put("00005", "账号或密码错误");
        status.put("00006", "token有效");
        status.put("00007", "短信验证码已发送，请注意查收");
        status.put("00008", "验证码错误");
        status.put("00009", "验证码过期,请重新发送");
        status.put("00010", "系统异常");

        workerSort.put(0, null);
        workerSort.put(1, "workerStar");

        curriculumSort.put(0, null);
        curriculumSort.put(1, "curriculumTotalCount");

        scoreSort.put("no", null);
        scoreSort.put("last", "score_time");

        detailSort.put("no", null);
        detailSort.put("allCount", "curriculumDetailSumPeople");
        detailSort.put("currentCount", "curriculumDetailCurrentPeople");


        dbStatus.put("all", null);//审核未通过
        dbStatus.put("notPut", -1);//未提交申请
        dbStatus.put("putting", 0);//审核中
        dbStatus.put("passed", 1);//审核通过
        dbStatus.put("refused", 2);//审核未通过

    }

    //fastDFS文件服务器地址
    public static final String url = "http://106.12.86.106:8888";


    public static void generalBox(String code, GeneralResult generalResult, Object obj) {
        switch (code) {
            case "00001":
                generalResult.setSuccess(true);
                generalResult.setCode("00001");
                generalResult.setMsg(status.get("00001"));
                break;
            case "00002":
                generalResult.setSuccess(false);
                generalResult.setCode("00002");
                generalResult.setMsg(status.get("00002"));
                break;
            case "00003":
                generalResult.setSuccess(false);
                generalResult.setCode("00003");
                generalResult.setMsg(status.get("00003"));
                break;
            case "00004":
                generalResult.setSuccess(false);
                generalResult.setCode("00004");
                generalResult.setMsg(status.get("00004"));
                break;

            case "00005":
                generalResult.setSuccess(false);
                generalResult.setCode("00005");
                generalResult.setMsg(status.get("00005"));
                break;
            case "00006":
                generalResult.setSuccess(false);
                generalResult.setCode("00006");
                generalResult.setMsg(status.get("00006"));
                break;
            case "00007":
                generalResult.setSuccess(false);
                generalResult.setCode("00007");
                generalResult.setMsg(status.get("00007"));
                break;
            case "00008":
                generalResult.setSuccess(false);
                generalResult.setCode("00008");
                generalResult.setMsg(status.get("00008"));
                break;
            case "00009":
                generalResult.setSuccess(false);
                generalResult.setCode("00009");
                generalResult.setMsg(status.get("00009"));
                break;
            case "00010":
                generalResult.setSuccess(false);
                generalResult.setCode("00010");
                generalResult.setMsg(status.get("00010"));
                break;
        }
        generalResult.setData(obj);
    }


    public static String createPassCode() {
        return random.nextInt(89999999)+10000000+"";
    }



}
