package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.FrK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35782FrK implements CallerContextable {
    public static final String __redex_internal_original_name = "NuxHelper";
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC11380iw A02;

    public final void A00() {
        UserSession userSession = this.A01;
        userSession.A03(C34267F9n.class);
        C35017Fbq.A00().A02();
        C35790FrS c35790FrS = C35790FrS.A04;
        if (c35790FrS == null) {
            c35790FrS = new C35790FrS(userSession);
            C35790FrS.A04 = c35790FrS;
        }
        c35790FrS.A01();
        AbstractC31525Dt9.A08(this.A00.getActivity(), this.A02, userSession);
    }

    public final void A01() {
        Fragment fragment = this.A00;
        C140966Yy A0N = AbstractC31177DnL.A0N(fragment.requireActivity(), this.A01);
        Bundle bundle = fragment.mArguments;
        ELT elt = new ELT();
        elt.setArguments(bundle);
        A0N.A0E(elt);
        A0N.A0G = true;
        A0N.A04();
    }

    public C35782FrK(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = interfaceC11380iw;
    }
}
