package com.facebook.proxygen;

/* loaded from: classes10.dex */
public class NativeRunnable extends NativeHandleImpl implements Runnable {
    public native void close();

    @Override // java.lang.Runnable
    public native void run();

    public void finalize() {
        close();
    }
}
