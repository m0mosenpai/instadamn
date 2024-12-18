package X;

import com.facebook.traffic.nts.TrafficNetworkTelemetryServicesManager;
import com.instagram.common.session.UserSession;
import com.instagram.traffic.nts.tigonprovider.IGTrafficNTSTigonProvider;

/* renamed from: X.1BD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BD {
    public static final C1BD A00 = new Object();

    public final void A00(UserSession userSession) {
        YCE yce;
        IGTrafficNTSTigonProvider A002;
        C14360o3.A0B(userSession, 0);
        C1BE c1be = new C1BE();
        if (C20150ym.A07(AbstractC20100yh.A00(36325175532794707L))) {
            yce = new YCE(c1be);
        } else {
            yce = null;
        }
        TrafficNetworkTelemetryServicesManager.Companion.initialize(c1be, yce);
        if ((C20150ym.A07(AbstractC20100yh.A00(36325175532401485L)) || C20150ym.A07(AbstractC20100yh.A00(36325175533056855L))) && (A002 = IGTrafficNTSTigonProvider.Companion.A00()) != null) {
            A002.setupTNTSTigonProvider(userSession);
        }
    }
}
