package com.facebook.common.dextricks;

/* loaded from: classes.dex */
public class CanaryLoader {
    public static Runnable sInstance;

    public static synchronized Runnable getInstance() {
        Runnable runnable;
        synchronized (CanaryLoader.class) {
            runnable = sInstance;
        }
        return runnable;
    }

    public static synchronized void setInstance(Runnable runnable) {
        synchronized (CanaryLoader.class) {
            sInstance = runnable;
        }
    }

    public static void verifyCanaryClasses() {
        Runnable canaryLoader = getInstance();
        if (canaryLoader != null) {
            canaryLoader.run();
        }
    }
}
