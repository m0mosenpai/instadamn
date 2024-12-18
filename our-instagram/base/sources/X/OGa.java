package X;

import android.app.Activity;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OGa {
    public final void A00(Activity activity, Fragment fragment, C82G c82g, C82H c82h, UserSession userSession, InterfaceC57990Pna interfaceC57990Pna, String str, String str2, boolean z) {
        AbstractC167007dF.A1G(userSession, 2, interfaceC57990Pna);
        C14360o3.A0B(str, 7);
        NVj nVj = (NVj) userSession.A01(NVj.class, new C43205J8c(userSession, 16));
        ((OwC) nVj).A00 = c82g;
        nVj.A00 = c82h;
        nVj.A06 = interfaceC57990Pna;
        nVj.A0C = z;
        nVj.A09 = str;
        nVj.A0A = str2;
        C35038FcB A00 = FXY.A00(userSession);
        A00.A02((ComponentActivity) activity, null, c82g.toString(), c82h.toString());
        nVj.A04 = A00;
        if (fragment != null) {
            A00.A01(fragment);
        }
        nVj.A05(activity);
    }
}
