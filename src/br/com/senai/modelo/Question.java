package br.com.senai.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;


public class Question implements Serializable {

    private String question;
    private String [] op;
    private Resp correta;

    public static final long  serialVersionUID = 100L;

    public Question (String question, String a, String b, String c, String d, Resp correta){
        this.question = question;
        op = new String[4];
        op[0] = a;
        op[1] = b;
        op[2] = c;
        op[3] = d;
        this.correta = correta;
    }

    public String getOpCorreta(){
        if(correta == Resp.A){
            return op[0];
        } else if (correta == Resp.B){
            return op[1];
        } else if (correta == Resp.C){
            return op[2];
        } else if (correta == Resp.D){
            return op[3];
        }

        return "Correta não encontrada";
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAllOpsSorted() {

        String [] newOp = new String[op.length];
        ArrayList<String> as = new ArrayList<>();
        Random r = new Random();
        for(int x = 0; x < op.length; x++){
            String add = op[r.nextInt(op.length)];
            if(!as.contains(add)){
                as.add(add);
            } else {
                x--;
            }
        }

        for (int x = 0; x < newOp.length; x++){
            newOp[x] = as.get(x);
        }

        return newOp;
    }
    
    public String[] getAllOps(){
        return op;
    }

    public void setAllOps(String[] op) {
        this.op = op;
    }

    public void setOpCorreta(Resp correta) {
        this.correta = correta;
    }



}
