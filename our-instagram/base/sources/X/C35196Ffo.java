package X;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ffo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35196Ffo {
    public static final long A01 = TimeUnit.DAYS.toMillis(1);
    public static volatile C35196Ffo A02;
    public C33609EtL A00;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Ffo, java.lang.Object] */
    public static C35196Ffo A00() {
        if (A02 == null) {
            synchronized (C35196Ffo.class) {
                if (A02 == null) {
                    A02 = new Object();
                }
            }
        }
        return A02;
    }

    public static void A01(C35196Ffo c35196Ffo) {
        C33609EtL c33609EtL = c35196Ffo.A00;
        if (c33609EtL != null) {
            InterfaceC19610xo ARD = AbstractC19750y3.A01("RNWhiteListedRouteStore_Prefs").ARD();
            ARD.E7G("RNWhiteListedRouteStore_TS", c33609EtL.A01);
            ARD.E7D("RNWhiteListedRouteStore_RC", c33609EtL.A00);
            java.util.Set set = c33609EtL.A02;
            if (set == null) {
                set = AbstractC166987dD.A1H();
                c33609EtL.A02 = set;
            }
            ARD.E7L("RNWhiteListedRouteStore_RL", Collections.unmodifiableSet(set));
            ARD.apply();
        }
    }
}
