package X;

import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.2Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48922Ml {
    public final PandoRealtimeInfoJNI forSubscription(String str) {
        C14360o3.A0B(str, 0);
        return new PandoRealtimeInfoJNI(str);
    }

    public final PandoRealtimeInfoJNI forLiveQuery(String str) {
        return forLiveQuery(str, "", "");
    }

    public final PandoRealtimeInfoJNI forLiveQuery(String str, String str2, String str3) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        return new PandoRealtimeInfoJNI(str, str2, str3);
    }
}
