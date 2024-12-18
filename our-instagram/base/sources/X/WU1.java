package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WU1 implements InterfaceC71946XBv, InterfaceC127465pP {
    public final UserSession A00;
    public final C1VW A01 = C1VW.A00;

    @Override // X.InterfaceC71946XBv
    public final InterfaceC71946XBv AKE() {
        return new WU1(this.A00);
    }

    @Override // X.InterfaceC71946XBv
    public final Location AuZ(String str) {
        return this.A01.getLastLocation(this.A00, AnonymousClass001.A0R("InstagramGeoLocation:", "MapConfig"));
    }

    public WU1(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
    }

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
    }
}
