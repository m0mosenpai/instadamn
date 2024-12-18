package com.facebook.papaya.client;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C09170dP;
import X.C14360o3;
import X.EnumC53219NgH;
import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import com.facebook.jni.HybridClassBase;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class PapayaJNI extends HybridClassBase {
    public static final PapayaJNI INSTANCE = new HybridClassBase();

    public static final native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static final native void nativeCancelAllExecutors();

    public static final native void nativeCancelExecutor(String str, String str2);

    public static final native void nativeInitialize(String str, Set set, Context context, ComponentName componentName, String str2, String str3, Map map);

    public static final native void nativeRegisterEngine(String str, IEngineFactory iEngineFactory);

    public static final native void nativeReset();

    public static final native void nativeResetScheduler();

    public static final native void nativeRun(Map map);

    public static final native void nativeSetCallback(ICallback iCallback);

    public static final native void nativeStop();

    public static final native void nativeSubmitExecutor(String str, String str2);

    public static final native void nativeUninitialize();

    public static final void run(PapayaRestrictions papayaRestrictions) {
        C14360o3.A0B(papayaRestrictions, 0);
        if (AbstractC25225BEi.A1a(Looper.myLooper(), Looper.getMainLooper())) {
            nativeRun(papayaRestrictions.A00());
            return;
        }
        throw AbstractC166987dD.A14("Papaya.run() may only be invoked from background thread!");
    }

    public static final void setCallback(ICallback iCallback) {
        C14360o3.A0B(iCallback, 0);
        nativeSetCallback(iCallback);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.jni.HybridClassBase, com.facebook.papaya.client.PapayaJNI] */
    static {
        C09170dP.A0C("papaya");
    }

    public static final synchronized void initialize(String str, ImmutableSet immutableSet, Context context, ComponentName componentName, String str2, String str3, ImmutableMap immutableMap) {
        synchronized (PapayaJNI.class) {
            C14360o3.A0B(str, 0);
            AbstractC167027dH.A13(immutableSet, context, componentName);
            C14360o3.A0B(immutableMap, 6);
            nativeInitialize(str, immutableSet, AbstractC166987dD.A0O(context), componentName, str2, str3, immutableMap);
        }
    }

    public static final void addLogSink(String str, EnumC53219NgH enumC53219NgH, LogSink logSink) {
        AbstractC167027dH.A12(str, enumC53219NgH, logSink);
        nativeAddLogSink(str, enumC53219NgH.A00, logSink);
    }

    public static final void cancelAllExecutors() {
        nativeCancelAllExecutors();
    }

    public static final void cancelExecutor(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        nativeCancelExecutor(str, str2);
    }

    public static final void registerEngine(String str, IEngineFactory iEngineFactory) {
        AbstractC167017dG.A1N(str, iEngineFactory);
        nativeRegisterEngine(str, iEngineFactory);
    }

    public static final void reset() {
        nativeReset();
    }

    public static final void resetScheduler() {
        nativeResetScheduler();
    }

    public static final void stop() {
        if (AbstractC25225BEi.A1a(Looper.myLooper(), Looper.getMainLooper())) {
            nativeStop();
            return;
        }
        throw AbstractC166987dD.A14("Papaya.stop() may only be invoked from background thread!");
    }

    public static final void submitExecutor(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        nativeSubmitExecutor(str, str2);
    }

    public static final void uninitialize() {
        nativeUninitialize();
    }
}
