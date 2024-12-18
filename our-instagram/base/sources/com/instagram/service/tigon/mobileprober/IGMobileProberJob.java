package com.instagram.service.tigon.mobileprober;

import X.C09170dP;
import X.C2051696h;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.instagram.service.tigon.IGTigonService;

/* loaded from: classes4.dex */
public final class IGMobileProberJob {
    public static final C2051696h Companion = new Object();

    public static final native void initializeMobileProberNative(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, IGTigonService iGTigonService);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.96h, java.lang.Object] */
    static {
        C09170dP.A0C("igmobileproberjob");
    }
}
