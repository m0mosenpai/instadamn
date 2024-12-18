package com.instagram.service.http;

import X.AbstractC12990ll;
import X.C09170dP;
import X.C14360o3;
import X.C54190NxU;
import X.X2z;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes9.dex */
public final class IGTigonAsyncHttpServiceHolder extends TigonServiceHolder {
    public static final C54190NxU Companion = new Object();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IGTigonAsyncHttpServiceHolder(com.instagram.service.http.IGTigonAsyncHttpService r2) {
        /*
            r1 = this;
            r0 = 1
            X.C14360o3.A0B(r2, r0)
            com.facebook.jni.HybridData r0 = initHybrid(r2)
            X.C14360o3.A0A(r0)
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.http.IGTigonAsyncHttpServiceHolder.<init>(com.instagram.service.http.IGTigonAsyncHttpService):void");
    }

    public static final IGTigonAsyncHttpServiceHolder getInstance(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return (IGTigonAsyncHttpServiceHolder) abstractC12990ll.A01(IGTigonAsyncHttpServiceHolder.class, new X2z(abstractC12990ll, 30));
    }

    public static final native HybridData initHybrid(IGTigonAsyncHttpService iGTigonAsyncHttpService);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NxU] */
    static {
        C09170dP.A0C("igtigonasynchttpservice-jni");
    }
}
