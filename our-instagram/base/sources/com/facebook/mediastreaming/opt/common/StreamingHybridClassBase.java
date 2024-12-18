package com.facebook.mediastreaming.opt.common;

import X.AbstractC167017dG;
import X.C09170dP;
import X.C0JY;
import X.C14360o3;
import X.C53688Nod;
import X.EnumC53246Ngk;
import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public class StreamingHybridClassBase {
    public static final C53688Nod Companion = new Object();
    public final HybridData mHybridData;

    public StreamingHybridClassBase(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    private final native void fireError(int i, String str, String str2, String str3);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Nod, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    public final void fireError(EnumC53246Ngk enumC53246Ngk, String str, Throwable th) {
        String str2;
        AbstractC167017dG.A1N(enumC53246Ngk, str);
        String str3 = "";
        if (th == null) {
            str2 = "";
        } else {
            str3 = th.toString();
            str2 = C0JY.A00(th);
        }
        fireError(enumC53246Ngk.A00, str, str3, str2);
    }
}
