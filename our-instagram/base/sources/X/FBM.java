package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* loaded from: classes6.dex */
public abstract class FBM {
    public static final void A00(FragmentActivity fragmentActivity, EnumC2050795x enumC2050795x, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C140966Yy A0r;
        String str;
        boolean A1T = AbstractC31175DnJ.A1T(1, userSession, fragmentActivity);
        if (enumC2050795x == EnumC2050795x.CHILD_ACCOUNT) {
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
            AbstractC167017dG.A1L(A0x.ARD(), A0x, "account_linking_login_info_tapped_count", A1T ? 1 : 0);
            ((C34387FEd) userSession.A01(C34387FEd.class, GTC.A00)).A00 = UUID.randomUUID();
            Bundle A05 = AbstractC31178DnM.A05(userSession);
            C53Z c53z = new C53Z();
            c53z.setArguments(A05);
            A0r = AbstractC31174DnI.A0N(c53z, fragmentActivity, userSession);
            str = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME";
        } else {
            if (enumC2050795x != EnumC2050795x.MAIN_ACCOUNT) {
                return;
            }
            InterfaceC19630xq A0x2 = AbstractC166987dD.A0x(userSession);
            AbstractC167017dG.A1L(A0x2.ARD(), A0x2, "account_linking_login_info_tapped_count", A1T ? 1 : 0);
            GTC gtc = GTC.A00;
            ((C34387FEd) userSession.A01(C34387FEd.class, gtc)).A00 = UUID.randomUUID();
            C19280xC A00 = C19280xC.A00(interfaceC11380iw, "ig_manage_main_account_settings_click");
            A00.A0C("account_linking_session_id", String.valueOf(((C34387FEd) userSession.A01(C34387FEd.class, gtc)).A00));
            AbstractC31173DnH.A1S(A00, userSession);
            Bundle A052 = AbstractC31178DnM.A05(userSession);
            A052.putBoolean("should_pop_back_stack_without_name", true);
            ELI eli = new ELI();
            eli.setArguments(A052);
            A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
            A0r.A0C = eli.mTag;
            A0r.A0D(eli);
            str = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME";
        }
        A0r.A0A = str;
        A0r.A04();
    }
}
