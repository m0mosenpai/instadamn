package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GhB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37616GhB {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC60442pS A02;

    public C37616GhB(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43203J8a(this, 7));
    }

    public final void A05(View view, EnumC71343Hv enumC71343Hv, InterfaceC30930Dik interfaceC30930Dik, C40971v4 c40971v4, Integer num) {
        C14360o3.A0B(view, 0);
        A01(view, enumC71343Hv, interfaceC30930Dik, null, c40971v4, num, false, false);
        A00(this).A0B(view, new String[0]);
        A03(view);
    }

    public final void A06(View view, EnumC71343Hv enumC71343Hv, Integer num) {
        C14360o3.A0B(view, 0);
        if (enumC71343Hv != null) {
            A00(this).A09(view, new C71353Hw(num, enumC71343Hv, null, null), new String[0], 1);
        } else {
            A00(this).A0B(view, new String[0]);
        }
    }

    public static C71313Hs A00(C37616GhB c37616GhB) {
        return (C71313Hs) c37616GhB.A01.getValue();
    }

    public final ViewOnClickListenerC77633dn A02(EnumC71343Hv enumC71343Hv, Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        return AbstractC37693GiU.A00(new ViewOnClickListenerC37847Gl1(interfaceC16660sJ, 20), enumC71343Hv, this.A00, num);
    }

    private final void A01(View view, EnumC71343Hv enumC71343Hv, InterfaceC30930Dik interfaceC30930Dik, C38321qM c38321qM, C40971v4 c40971v4, Integer num, boolean z, boolean z2) {
        C71313Hs A00;
        InterfaceC79643hF c79623hD;
        view.hashCode();
        if (enumC71343Hv != null) {
            if (c40971v4 != null || z) {
                if (num != null) {
                    A00(this).A06(view, enumC71343Hv, num.intValue());
                } else {
                    A00(this).A05(view, enumC71343Hv);
                }
            } else {
                return;
            }
        }
        if (c40971v4 != null) {
            A00 = A00(this);
            UserSession userSession = this.A00;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            if (z2) {
                C38321qM c38321qM2 = c40971v4.A0K;
                c79623hD = new C37997Gni(new C86933u7(AbstractC166997dE.A0L(view), AbstractC37303Gc4.A0E(c38321qM2), userSession, c38321qM2), interfaceC30930Dik, userSession, interfaceC60442pS, c40971v4, "in_app_browser_v2", C16910sj.A00);
            } else {
                c79623hD = new C37997Gni(null, interfaceC30930Dik, userSession, interfaceC60442pS, c40971v4);
            }
        } else {
            if (!z || c38321qM == null) {
                return;
            }
            A00 = A00(this);
            c79623hD = new C79623hD(null, this.A00, c38321qM, this.A02);
        }
        A00.A0A(view, c79623hD);
    }

    public final void A03(View view) {
        view.hashCode();
        A00(this).A04(view);
    }

    public final void A04(View view, EnumC71343Hv enumC71343Hv, InterfaceC30930Dik interfaceC30930Dik, C120985dq c120985dq, Integer num, boolean z, boolean z2) {
        C40971v4 A07;
        if (c120985dq.CdW()) {
            A07 = c120985dq.A06();
        } else {
            A07 = c120985dq.A07();
            if (A07 == null) {
                A07 = null;
            }
        }
        A01(view, enumC71343Hv, interfaceC30930Dik, c120985dq.A02, A07, num, z, z2);
    }
}
