package com.facebook.profilo.logger.api;

/* loaded from: classes.dex */
public abstract class ProfiloClassLoadTracer {
    public static volatile ProfiloClassLoadTracer sTracer;

    public abstract void classLoadEnd(Class cls);

    public abstract void classLoadFailed();

    public abstract void classLoadStart();

    public static ProfiloClassLoadTracer get() {
        return sTracer;
    }

    public static void setInstance(ProfiloClassLoadTracer profiloClassLoadTracer) {
        sTracer = profiloClassLoadTracer;
    }
}
