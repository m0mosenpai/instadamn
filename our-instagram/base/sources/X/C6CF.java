package X;

import android.app.Activity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.common.session.UserSession;

/* renamed from: X.6CF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CF {
    public final UserSession A00;

    public C6CF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A01(Activity activity) {
        if (activity == null) {
            return false;
        }
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C14360o3.A07(googleApiAvailability);
        return googleApiAvailability.A03(activity, 12451000) == 0 && C6CB.A02(this.A00, 36315928467803861L);
    }

    public final boolean A00() {
        boolean z;
        Boolean bool;
        UserSession userSession = this.A00;
        C6CG c6cg = new C6CG(userSession);
        Boolean BBY = C17060sy.A01.A01(userSession).A03.BBY();
        if (BBY != null) {
            z = BBY.booleanValue();
        } else {
            z = false;
        }
        C6CH c6ch = (C6CH) c6cg.A02.getValue();
        if (!c6ch.A00) {
            c6ch.A01.markerStart(724764879);
        }
        UserSession userSession2 = c6cg.A00;
        boolean A02 = C6CB.A02(userSession2, 36315928475078439L);
        InterfaceC19630xq interfaceC19630xq = c6cg.A01;
        boolean contains = interfaceC19630xq.contains("EB_ENABLED_PREF_KEY");
        boolean A022 = C6CB.A02(userSession2, 36315928475143976L);
        if (contains) {
            bool = true;
        } else {
            bool = null;
        }
        if (A02) {
            if (contains) {
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.EEj("EB_ENABLED_PREF_KEY");
                ARD.apply();
            }
        } else {
            if (!contains) {
                if (z) {
                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                    ARD2.E77("EB_ENABLED_PREF_KEY", true);
                    ARD2.apply();
                } else {
                    if (A022) {
                        InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
                        ARD3.E77("EB_ENABLED_PREF_KEY", true);
                        ARD3.apply();
                    }
                    z = false;
                }
            }
            C6CG.A00(c6cg, bool, A022, z, A02, true);
            return true;
        }
        C6CG.A00(c6cg, bool, A022, z, A02, A022);
        return A022;
    }
}
