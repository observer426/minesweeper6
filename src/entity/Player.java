//该类主要用于设置游戏玩家，以及分数，失误次数的加减，需要其他类来调该类方法

package entity;

import java.util.Random;

public class Player {
    private static Random ran = new Random();

    private String userName;
    private int score;
    private int mistake;
    private int tool1Num = 3;//道具1的使用次数
    private int tool2Num = 3;//道具2的使用次数
    private int lastScore = 0;
    private int tool3Num = 3;//记录自己上回合的score，在又轮到自己后清零。

    public void changeTool1Num() {
        tool1Num--;
    }

    public void changeTool3Num() {
        tool3Num--;
    }

    public int getLastScore() {
        return lastScore;
    }

    public int getTool3Num() {
        return tool3Num;
    }

    public void setLastScore(int lastScore) {
        this.lastScore = lastScore;
    }

    public void changeTool2Num() {
        tool2Num--;
    }

    public void plusLastScore() {
        lastScore++;
    }

    public void minusLastScore() {
        lastScore--;
    }

    public int getTool1Num() {
        return tool1Num;
    }

    public int getTool2Num() {
        return tool2Num;
    }

    /**
     * 通过特定名字初始化一个玩家对象。
     *
     * @param userName 玩家的名字
     */

    public Player(String userName, int score, int mistake) {
        this.userName = userName;
        this.score = score;
        this.mistake = mistake;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setMistake(int mistake) {
        this.mistake = mistake;
    }

    /**
     * 通过默认名字初始化一个玩家对象。
     */
    public Player(int score, int mistake) {
        userName = "无名英雄" + (ran.nextInt(9000) + 1000);
    }

    /**
     * 为玩家加一分。
     */
    public void addScore() {
        score++;
    }

    /**
     * 为玩家扣一分。
     */
    public void costScore() {
        score--;
    }

    /**
     * 为玩家增加一次失误数。
     */
    public void addMistake() {
        mistake++;
    }


    public int getScore() {
        return score;
    }

    public String getUserName() {
        return userName;
    }

    public int getMistake() {
        return mistake;
    }

}
