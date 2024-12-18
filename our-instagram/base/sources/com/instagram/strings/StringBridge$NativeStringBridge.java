package com.instagram.strings;

import X.AbstractC20100yh;
import X.AnonymousClass001;
import X.C05F;
import X.C09170dP;
import X.C0K8;
import X.C0w9;
import X.C20150ym;
import X.MSZ;
import android.os.Looper;
import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public final class StringBridge$NativeStringBridge {
    public static boolean sFailedToLoadStrings;
    public static boolean sTriedInitStatic;
    public final HybridData mHybridData = nativeInitHybrid();

    public static native HybridData nativeInitHybrid();

    public native String nativeGetInstagramString(String str);

    public static synchronized void initStatic() {
        Integer num;
        C0w9 c0w9;
        Integer num2;
        Throwable th;
        String str;
        String A0e;
        synchronized (StringBridge$NativeStringBridge.class) {
            if (!sTriedInitStatic) {
                sTriedInitStatic = true;
                long nanoTime = System.nanoTime();
                try {
                    C09170dP.A0C("scrambler");
                    C09170dP.A0C("strings");
                } catch (Throwable th2) {
                    try {
                        sFailedToLoadStrings = true;
                        if (!C20150ym.A07(AbstractC20100yh.A00(36313570530756774L))) {
                            C0K8.A0I("StringBridge:failedInit", "Failed to load native string libraries", th2);
                            c0w9 = C0w9.A01;
                            num2 = C05F.A0Y;
                            c0w9.EHC(num2, "StringBridge:failedInit", "Failed to load native string libraries", th2);
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                long A0B = MSZ.A0B(nanoTime);
                                th = new Throwable();
                                str = "StringBridge:loadOnMainThread";
                                C0K8.A0M("StringBridge:loadOnMainThread", "StringBridge load on main - time=%sms", th, Long.valueOf(A0B));
                                if (A0B <= 1000) {
                                    num2 = C05F.A00;
                                }
                                A0e = AnonymousClass001.A0e("StringBridge load on main - time=", "ms", A0B);
                            }
                        } else {
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            long A0B2 = MSZ.A0B(nanoTime);
                            Throwable th4 = new Throwable();
                            C0K8.A0M("StringBridge:loadOnMainThread", "StringBridge load on main - time=%sms", th4, Long.valueOf(A0B2));
                            C0w9 c0w92 = C0w9.A01;
                            if (A0B2 > 1000) {
                                num = C05F.A0Y;
                            } else {
                                num = C05F.A00;
                            }
                            c0w92.EHC(num, "StringBridge:loadOnMainThread", AnonymousClass001.A0e("StringBridge load on main - time=", "ms", A0B2), th4);
                        }
                        throw th3;
                    }
                }
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    long A0B3 = MSZ.A0B(nanoTime);
                    th = new Throwable();
                    str = "StringBridge:loadOnMainThread";
                    C0K8.A0M("StringBridge:loadOnMainThread", "StringBridge load on main - time=%sms", th, Long.valueOf(A0B3));
                    c0w9 = C0w9.A01;
                    if (A0B3 > 1000) {
                        num2 = C05F.A0Y;
                    } else {
                        num2 = C05F.A00;
                    }
                    A0e = AnonymousClass001.A0e("StringBridge load on main - time=", "ms", A0B3);
                    c0w9.EHC(num2, str, A0e, th);
                }
            }
        }
    }

    static {
        initStatic();
    }
}
