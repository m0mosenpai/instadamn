package com.fbpay.ptt.impl.javacpp;

import X.AbstractC31173DnH;
import X.C09170dP;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes10.dex */
public class ServerCertsVerifierImpl {
    public HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native String verifyCerts(String[] strArr);

    public String verifyCerts(List list) {
        return verifyCerts(AbstractC31173DnH.A1b(list, 0));
    }

    static {
        C09170dP.A0C("fbpayptt-android");
    }
}
