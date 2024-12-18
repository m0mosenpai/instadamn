package com.deidentified.ohai.tigon;

import X.C09170dP;
import X.C14360o3;
import X.C4IE;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes2.dex */
public final class TigonOhaiServiceHolder extends TigonServiceHolder {
    public static final C4IE Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonOhaiServiceHolder(TigonServiceHolder tigonServiceHolder, String str, String str2) {
        super(initHybrid(tigonServiceHolder, str, str2));
        C14360o3.A0B(tigonServiceHolder, 1);
    }

    public static final native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, String str, String str2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4IE, java.lang.Object] */
    static {
        C09170dP.A0C("tigonohaiserviceholder-jni");
    }
}
