package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes10.dex */
public final class TFA implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "MapLocationManager";
    public Location A00;
    public boolean A01;
    public final Context A02;
    public final AbstractC128665rZ A03;
    public final UserSession A04;
    public final java.util.Set A05;
    public final InterfaceC65486Tl6 A06;
    public final C1VW A07;

    public TFA(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = C3VK.A00(context, userSession).A05();
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            this.A07 = c1vw;
            this.A06 = new C64073Syp(this, 1);
            this.A05 = new CopyOnWriteArraySet();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final Location A00(String str) {
        C14360o3.A0B(str, 0);
        Context context = this.A02;
        UserSession userSession = this.A04;
        if (!C1VW.isLocationPermitted(context, userSession, "MEDIA_MAP")) {
            return null;
        }
        Location location = this.A00;
        if (location != null) {
            return location;
        }
        Location lastLocation = this.A07.getLastLocation(userSession, AnonymousClass001.A0R("MapLocationManager:", str));
        this.A00 = lastLocation;
        return lastLocation;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void A01() {
        if (!this.A01 && C1VW.isLocationPermitted(this.A02, this.A04, "MEDIA_MAP")) {
            this.A01 = true;
            this.A03.A07(this.A06, new C58516Pwk(null, C05F.A0C, null, 10000L, 10.0f, 0.6666667f, 120000L, 500L, false, true, true), __redex_internal_original_name);
        }
    }
}
