package com.wjx.android.wanandroidmvp.bean.base;

import com.wjx.android.wanandroidmvp.bean.db.Article;

/**
 * @author wangyz
 * @time 2019/1/23 15:45
 * @description Event
 */
public class Event {

    /**
     * 登录成功
     */
    public static final int TYPE_LOGIN = 1;

    /**
     * 退出登录
     */
    public static final int TYPE_LOGOUT = 2;

    /**
     * 收藏
     */
    public static final int TYPE_COLLECT = 3;

    /**
     * 取消收藏
     */
    public static final int TYPE_UNCOLLECT = 4;

    /**
     * 切换夜间模式
     */
    public static final int TYPE_CHANGE_DAY_NIGHT_MODE = 5;

    /**
     * 开始动画
     */
    public static final int TYPE_START_ANIMATION = 6;

    /**
     * 停止动画
     */
    public static final int TYPE_STOP_ANIMATION = 7;

    /**
     * 取消收藏刷新列表
     */
    public static final int TYPE_UNCOLLECT_REFRESH = 8;

    /**
     * 更换主题颜色
     */
    public static final int TYPE_REFRESH_COLOR = 9;

    /**
     * 删除分享的文章
     */
    public static final int TYPE_DELETE_SHARE = 10;

    /**
     * 目标界面-MainActivity
     */
    public static final int TARGET_MAIN = 1;

    /**
     * 目标界面-我的
     */
    public static final int TARGET_ME = 2;

    /**
     * 目标界面-首页
     */
    public static final int TARGET_HOME = 3;

    /**
     * 目标界面-体系
     */
    public static final int TARGET_TREE = 4;

    /**
     * 目标界面-项目
     */
    public static final int TARGET_PROJECT = 5;

    /**
     * 目标界面-公众号
     */
    public static final int TARGET_WX = 6;

    /**
     * 目标界面-广场
     */
    public static final int TARGET_SQUARE = 7;

    /**
     * 目标界面-收藏列表
     */
    public static final int TARGET_COLLECT = 7;

    /**
     * 目标界面-搜索结果
     */
    public static final int TARGET_SEARCH_RESULT = 8;

    /**
     * 目标界面-积分排行
     */
    public static final int TARGET_INTEGRAL_RANK = 9;

    /**
     * 目标界面-设置界面
     */
    public static final int TARGET_SETTING = 10;

    /**
     * 目标界面-主广场页
     */
    public static final int TARGET_PARENT_SQUARE = 11;

    /**
     * 目标界面-闪屏页
     */
    public static final int TARGET_SPLASH = 12;

    /**
     * 目标界面-导航界面
     */
    public static final int TARGET_NAVI = 13;

    /**
     * 目标界面-分享页面
     */
    public static final int TARGET_SQUARE_SHARE = 14;

    /**
     * 目标界面-分享列表页面
     */
    public static final int TARGET_ME_SHARE = 15;


    public static final int TARGET_ADAPTER = 16;


    public int target;

    public int type;

    public String data;
}
