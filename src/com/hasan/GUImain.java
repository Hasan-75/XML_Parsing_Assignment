package com.hasan;

public class GUImain {
    private FileChooseAndViewOutput frame;
    private static GUImain instance;

    private GUImain(){

    }

    private static GUImain getInstance(){
        if(instance==null)
            instance = new GUImain();
        return instance;
    }

    public static void main(String args[]) {
        GUImain gm = GUImain.getInstance();
        gm.frame = new FileChooseAndViewOutput();
        gm.frame.showFrame(gm.frame);
    }
}
