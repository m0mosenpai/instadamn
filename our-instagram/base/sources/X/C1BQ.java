package X;

import com.instagram.common.session.UserSession;
import com.instagram.traffic.nts.tigonprovider.IGTrafficNTSTigonProvider;

/* renamed from: X.1BQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BQ {
    public final synchronized IGTrafficNTSTigonProvider A00() {
        return IGTrafficNTSTigonProvider.sharedProvider;
    }

    public final synchronized IGTrafficNTSTigonProvider A01(UserSession userSession) {
        IGTrafficNTSTigonProvider iGTrafficNTSTigonProvider;
        C14360o3.A0B(userSession, 0);
        iGTrafficNTSTigonProvider = IGTrafficNTSTigonProvider.sharedProvider;
        if (iGTrafficNTSTigonProvider == null) {
            iGTrafficNTSTigonProvider = new IGTrafficNTSTigonProvider(userSession);
            IGTrafficNTSTigonProvider.sharedProvider = iGTrafficNTSTigonProvider;
        }
        return iGTrafficNTSTigonProvider;
    }
}
