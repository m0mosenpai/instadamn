package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dq7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31342Dq7 {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;

    public C31342Dq7(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167007dF.A1F(userSession, 2, interfaceC11380iw);
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A01 = interfaceC11380iw;
    }

    public final boolean A05(C51693MsO c51693MsO, C5HW c5hw, String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A02;
        if (F9P.A00(userSession)) {
            int i = c5hw.A00;
            switch (i) {
                case 195:
                case 436:
                case 537:
                    FragmentActivity fragmentActivity = this.A00;
                    String str2 = c5hw.A04.A0f;
                    if (str2 != null) {
                        AbstractC35253Fgm.A05(fragmentActivity, userSession, "bc_inbox", str2, false);
                        break;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                case 198:
                case 526:
                case 534:
                    FragmentActivity fragmentActivity2 = this.A00;
                    String str3 = c5hw.A04.A0f;
                    if (str3 != null) {
                        AbstractC35253Fgm.A05(fragmentActivity2, userSession, "bc_inbox", str3, true);
                        break;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                case 277:
                case 281:
                case 283:
                case 938:
                    AbstractC35253Fgm.A03(this.A00, userSession, str, i);
                    break;
                case 432:
                case 433:
                    FragmentActivity fragmentActivity3 = this.A00;
                    C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity3, userSession);
                    C35028Fc1 A00 = C35028Fc1.A00(str);
                    A00.A0M = true;
                    A00.A0E = this.A03.getModuleName();
                    A00.A02 = AnonymousClass341.A0W;
                    A00.A0I = fragmentActivity3.getString(2131954221);
                    A0r.A0D(A00.A02());
                    A0r.A04();
                    break;
                case 558:
                    AbstractC35253Fgm.A06(this.A00, userSession, "bc_inbox", false);
                    break;
            }
            A03(this, c51693MsO, c5hw);
            return true;
        }
        return false;
    }

    public static final void A00(UserMonetizationProductType userMonetizationProductType, C31342Dq7 c31342Dq7, String str, String str2) {
        if (userMonetizationProductType == UserMonetizationProductType.A05) {
            C55045OZt c55045OZt = FE6.A00;
            FragmentActivity fragmentActivity = c31342Dq7.A00;
            UserSession userSession = c31342Dq7.A02;
            c55045OZt.A02(null, fragmentActivity, userMonetizationProductType, userSession, IRO.A00(userSession, AbstractC166987dD.A1G()), c31342Dq7.A01.getModuleName(), "MONETIZATION_INBOX", AbstractC166997dE.A0p(fragmentActivity, 2131976470), str, null, "MONETIZATION_INBOX");
            return;
        }
        FragmentActivity fragmentActivity2 = c31342Dq7.A00;
        UserSession userSession2 = c31342Dq7.A02;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity2, userSession2);
        A0P.A0A = "MONETIZATION_INBOX";
        A0P.A0B(null, C55045OZt.A01(userMonetizationProductType, userSession2, "MONETIZATION_INBOX", str, str2));
        A0P.A04();
    }

    public static final void A01(C31342Dq7 c31342Dq7) {
        FragmentActivity fragmentActivity = c31342Dq7.A00;
        UserSession userSession = c31342Dq7.A02;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0D(AbstractC31364DqT.A02().A08(EnumC33341Eoa.A02, C05F.A00, userSession.userId, AbstractC166997dE.A0Y(userSession).getUsername(), true));
        A0r.A04();
    }

    public static final void A02(C31342Dq7 c31342Dq7) {
        FragmentActivity fragmentActivity = c31342Dq7.A00;
        UserSession userSession = c31342Dq7.A02;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        C28431Ze A02 = AbstractC31364DqT.A02();
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, userSession.userId, "branded_content_activity_notification", c31342Dq7.A01.getModuleName());
        A01.A0O = AbstractC111324zv.A00(262);
        C31368DqX.A02(A0r, userSession, A02, A01);
    }

    public static final void A03(C31342Dq7 c31342Dq7, C51693MsO c51693MsO, C5HW c5hw) {
        UserSession userSession = c31342Dq7.A02;
        MUK.A01(userSession).A0I(c31342Dq7.A01, c51693MsO, c5hw, userSession.userId, null, null, null, null);
        c5hw.A0E();
        String str = c5hw.A04.A0s;
        if (str != null) {
            String str2 = c5hw.A09;
            C14360o3.A07(str2);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("business/branded_content/news/log/");
            A0c.A9s("action", "click");
            A0c.A9s("pk", str2);
            C1GJ.A03(AbstractC31178DnM.A0K(A0c, "tuuid", str));
        }
    }

    public static final void A04(C31342Dq7 c31342Dq7, C5HW c5hw) {
        String A09 = c5hw.A09("media_id");
        String A092 = c5hw.A09("permission_id");
        if (A09 != null && A09.length() != 0) {
            Bundle A0D = AbstractC31177DnL.A0D("media_id", A09, "permission_id", A092);
            A0D.putBoolean(AbstractC111324zv.A00(524), false);
            C1XJ c1xj = C1XJ.A00;
            UserSession userSession = c31342Dq7.A02;
            FragmentActivity fragmentActivity = c31342Dq7.A00;
            c1xj.A0i(A0D, fragmentActivity, userSession, EnumC39540HdC.A02, null, null, fragmentActivity.getString(2131969835), A09, null, null, null);
        }
    }
}
