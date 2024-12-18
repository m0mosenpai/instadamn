package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fg9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35216Fg9 {
    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession, C34649FOh c34649FOh, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(userSession, 1);
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C155506yf A00 = AbstractC155496ye.A00(userSession);
        boolean z = c34649FOh.A0b;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/update_fb_profile_link/");
        A0c.A0I(AbstractC58317Pt9.A00(132), z);
        C1ON A0e = AbstractC25227BEk.A0e(A0c, EDP.class, C34863FXy.class);
        A0e.A00 = new C32541EUr(8, A00, requireActivity, userSession, interfaceC16620sF);
        abstractC59962oe.schedule(A0e);
    }

    public static final void A01(AbstractC59962oe abstractC59962oe, UserSession userSession, C34649FOh c34649FOh, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(userSession, 1);
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C155506yf A00 = AbstractC155496ye.A00(userSession);
        boolean z = c34649FOh.A0c;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/update_fb_page_link/");
        A0c.A0R(EDP.class, C34863FXy.class);
        A0c.A0I(AbstractC58317Pt9.A00(133), z);
        C1ON A0U = AbstractC31172DnG.A0U(A0c, true);
        A0U.A00 = new C32541EUr(9, A00, requireActivity, userSession, interfaceC16620sF);
        abstractC59962oe.schedule(A0U);
    }

    public static final void A03(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C1ON A06 = AbstractC152476ta.A06(userSession);
        C31702Dw7.A01(A06, interfaceC16660sJ, 20);
        C1GJ.A03(A06);
    }

    public static void A02(UserSession userSession, Object obj, int i) {
        A03(new GSg(obj, i), userSession);
    }

    public static final void A04(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0B(AbstractC111324zv.A00(1880));
        A0D.A9s("edit", "true");
        C1ON A0e = AbstractC25227BEk.A0e(A0D, EC8.class, C34860FXu.class);
        C31456Ds0.A00(A0e, interfaceC16660sJ, userSession, 43);
        C1GJ.A03(A0e);
    }
}
