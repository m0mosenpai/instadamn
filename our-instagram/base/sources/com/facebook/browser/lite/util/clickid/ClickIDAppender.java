package com.facebook.browser.lite.util.clickid;

import X.C09170dP;
import X.C14360o3;
import X.C4P0;
import com.facebook.jni.HybridData;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ClickIDAppender {
    public static final C4P0 Companion = new Object();
    public final HybridData mHybridData;

    public ClickIDAppender(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0(List list, List list2);

    public final native String appendFbclid(String str, String str2);

    public final native String appendParams(String str, Map map);

    public final native String extractDestDomain(String str);

    public final native String extractDestUri(String str);

    public final native String getFbclid(String str);

    public final native Map getParams(String str, Set set);

    public final native String injectFbclidClickTimestamp(String str, long j);

    public final native String removeParams(String str, Set set);

    public final native String setClickTimestamp(String str, long j);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4P0, java.lang.Object] */
    static {
        C09170dP.A0C("clickid");
    }
}
