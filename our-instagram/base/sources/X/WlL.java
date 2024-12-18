package X;

import android.app.Activity;
import android.location.Location;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WlL implements XAv {
    public boolean A00;
    public final Activity A01;
    public final C70394WTw A02;
    public final UserSession A03;
    public final InterfaceC127465pP A04 = new C70963WlA(this, 2);
    public final MQC A05 = new C70966WlD(this, 3);
    public final boolean A06;

    public static void A00(WlL wlL) {
        Location AuZ = wlL.AuZ("updateCameraToCurrentLocation");
        C70394WTw c70394WTw = wlL.A02;
        if (c70394WTw != null && AuZ != null) {
            C70109W4g.A00(c70394WTw, AbstractC43594JPz.A0L(AuZ), 11.0f);
        }
    }

    @Override // X.XAv
    public final Location AuZ(String str) {
        C1VW c1vw = C1VW.A00;
        c1vw.getClass();
        return c1vw.getLastLocation(this.A03, AnonymousClass001.A0R("MediaLocationMapMyLocationHelper:", str));
    }

    public WlL(Activity activity, C70394WTw c70394WTw, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = activity;
        this.A02 = c70394WTw;
        this.A06 = AbstractC23451Ch.A05(activity, "android.permission.ACCESS_FINE_LOCATION");
    }
}
