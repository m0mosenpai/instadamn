package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I4S {
    public static final void A00(Activity activity, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC72963Ox interfaceC72963Ox) {
        Reel A00 = AbstractC73123Pn.A00(userSession, InterfaceC73103Pl.A00, false);
        if (A00 != null) {
            C38E c38e = new C38E(interfaceC11380iw, userSession, AbstractC37301Gc2.A0L(fragment));
            c38e.A0C = AbstractC166997dE.A0n();
            c38e.A05 = new C31559Dtj(activity, interfaceC72963Ox.Ahl(), (InterfaceC63982vJ) null);
            if (interfaceC72963Ox instanceof InterfaceC58290Psi) {
                List A1J = AbstractC166987dD.A1J(A00);
                List A1J2 = AbstractC166987dD.A1J(A00);
                c38e.A07(A00, C3G2.A08, (InterfaceC58290Psi) interfaceC72963Ox, A1J, A1J2, 0);
                return;
            }
            if (interfaceC72963Ox instanceof C3Ow) {
                c38e.A04(A00, C3G2.A08, (C3Ow) interfaceC72963Ox);
            } else {
                c38e.A04(A00, C3G2.A08, null);
            }
        }
    }
}
