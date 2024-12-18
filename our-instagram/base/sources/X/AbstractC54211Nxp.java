package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nxp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54211Nxp {
    public static final boolean A00(Activity activity, Context context, Fragment fragment, C82G c82g, UserSession userSession, InterfaceC57990Pna interfaceC57990Pna) {
        InterfaceC57990Pna interfaceC57990Pna2 = interfaceC57990Pna;
        C14360o3.A0B(userSession, 2);
        if (interfaceC57990Pna == null) {
            interfaceC57990Pna2 = PGF.A00;
        }
        C55088Oal c55088Oal = NVk.A03;
        C82H c82h = C55088Oal.A00(userSession).A00;
        if (!OwC.A0F.A00(c82g, userSession) || context == null || !AbstractC14490oL.A0B(context)) {
            return false;
        }
        if ((c82g == C82G.A0j && !AbstractC31177DnL.A1U(C06090Tz.A05, userSession, 36314090222389656L)) || !C197838ou.A03(c82g, c82h, userSession)) {
            return false;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36321743853332267L)) {
            C196068lw.A00(userSession).A01(NVk.A02, new P1P(2, new ODL(activity, fragment, c82g, userSession, interfaceC57990Pna2), userSession), "after_new_fbc");
        } else {
            c55088Oal.A02(activity, fragment, c82g, null, userSession, null, interfaceC57990Pna2, null, null, "", "", true);
        }
        return true;
    }
}
