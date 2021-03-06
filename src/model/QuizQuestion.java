package model;

import java.util.Arrays;

/**
 * @name AutoCMS v3.0.0 OB1
 * @created 03/06/2020
 * @author ThienDepZaii - SystemError
 * @Facebook /ThienDz.SystemError
 * @Gmail ThienDz.DEV@gmail.com
 */

public class QuizQuestion {
    //tên quiz
    private String name;
    // kiểu [text, checkbox, radio]
    private String type;
    //câu hỏi
    private String question;
    //key request
    private String key;
    //value request
    private String[] listValue;
    //số lượng câu hỏi trên một question (dành cho type text)
    private int amountInput;
    //có chọn nhiều đáp ans ko
    private boolean multiChoice;
    //giá trị request đi
    private String selectValue;
    //số lần thử
    private int testCount;
    //hoàn thành
    private boolean correct;

    public QuizQuestion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String[] getListValue() {
        return listValue;
    }

    public void setListValue(String[] listValue) {
        this.listValue = listValue;
    }

    public int getAmountInput() {
        return amountInput;
    }

    public void setAmountInput(int amountInput) {
        this.amountInput = amountInput;
    }

    public boolean isMultiChoice() {
        return multiChoice;
    }

    public void setMultiChoice(boolean multiChoice) {
        this.multiChoice = multiChoice;
    }

    public String getSelectValue() {
        return selectValue;
    }

    public void setSelectValue(String selectValue) {
        this.selectValue = selectValue;
    }

    public int getTestCount() {
        return testCount;
    }

    public void setTestCount(int testCount) {
        this.testCount = testCount;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "QuizQuestion{" + "name=" + name + ", type=" + type + ", question=" + question + ", key=" + key + ", listValue=" + Arrays.toString(listValue) + ", amountInput=" + amountInput + ", multiChoice=" + multiChoice + ", selectValue=" + selectValue + ", testCount=" + testCount + ", correct=" + correct + '}';
    }




 
}
