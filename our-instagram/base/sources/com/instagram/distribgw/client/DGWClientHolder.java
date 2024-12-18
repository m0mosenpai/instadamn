package com.instagram.distribgw.client;

import X.C09170dP;
import X.C14360o3;
import X.C53632cp;
import com.facebook.distribgw.client.DGWClient;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class DGWClientHolder {
    public static final C53632cp Companion = new Object();
    public static final String TAG = "DGWClientHolder";
    public final DGWClient client;

    public DGWClientHolder(DGWClient dGWClient) {
        C14360o3.A0B(dGWClient, 1);
        this.client = dGWClient;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2cp, java.lang.Object] */
    static {
        C09170dP.A0C("mnscertificateverifier");
    }

    public static final synchronized DGWClientHolder getInstance(UserSession userSession) {
        DGWClientHolder A00;
        synchronized (DGWClientHolder.class) {
            A00 = Companion.A00(userSession);
        }
        return A00;
    }

    public final DGWClient getClient() {
        return this.client;
    }
}
