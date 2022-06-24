package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;


    //Конструктор:
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("ERROR! MISSION № " + i + " IS IMPOSSIBLE!");
                continue;
            }
            callback.onDone("Job " + i + " is done");
        }

    }

}