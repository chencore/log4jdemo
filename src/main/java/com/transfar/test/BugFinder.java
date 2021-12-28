package com.transfar.test;

/**
 * 攻击类BugFinder，用于启动本地的计算器
 */
public class BugFinder {

    public BugFinder() {
        try {
            System.out.println("执行漏洞代码");
            String[] commands = {"open", "/System/Applications/Calculator.app"};
            Process pc = Runtime.getRuntime().exec(commands);
            pc.waitFor();
            System.out.println("完成执行漏洞代码");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BugFinder bugFinder = new BugFinder();
    }

}
