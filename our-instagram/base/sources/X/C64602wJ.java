package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.2wJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64602wJ implements InterfaceC64612wK {
    public final UserSession A00;
    public final C61382r1 A01;
    public final C64592wI A02;
    public final C60862qA A03;

    public C64602wJ(UserSession userSession, C61382r1 c61382r1, C64592wI c64592wI, C60862qA c60862qA) {
        C14360o3.A0B(c61382r1, 2);
        this.A02 = c64592wI;
        this.A01 = c61382r1;
        this.A03 = c60862qA;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC64612wK
    public final void DGM(String str) {
        String A00 = AbstractC111324zv.A00(936);
        UserSession userSession = this.A00;
        C61382r1 c61382r1 = this.A01;
        String moduleName = AbstractC60942qI.A00.getModuleName();
        FragmentActivity activity = this.A03.A00.getActivity();
        if (activity != null) {
            new C684436h(activity, userSession).A04(moduleName, c61382r1.getSessionId(), A00);
        }
    }

    @Override // X.InterfaceC64612wK
    public final void DH3() {
        C60862qA c60862qA = this.A03;
        C1EN c1en = C1EN.A0C;
        C60662pp c60662pp = c60862qA.A00;
        c60662pp.A09 = c1en;
        UserSession userSession = this.A00;
        if (AbstractC49092Nc.A00(userSession).A00(CallerContext.A00(C60662pp.class), "ig_find_new_friends")) {
            if (AbstractC35067Fce.A02()) {
                C140966Yy c140966Yy = new C140966Yy(c60662pp.requireActivity(), userSession);
                c140966Yy.A08();
                c140966Yy.A0B(null, AbstractC35067Fce.A00().A00().A01("empty_feed", c60662pp.getString(2131962611)));
                c140966Yy.A04();
                return;
            }
            return;
        }
        AbstractC34213F7l.A00().A01(c60662pp, userSession, new C36782GJf(this.A02)).A06("ig_fb_nux_main_screen", null);
    }
}
