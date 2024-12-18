package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.launcher.ExternalBrowserLauncher;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.Gl6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37852Gl6 {
    public static final boolean A01(FragmentActivity fragmentActivity, C120985dq c120985dq, UserSession userSession) {
        AndroidLink A03;
        C14360o3.A0B(userSession, 1);
        if (C59942oc.A07(c120985dq, userSession) || !c120985dq.CdW() || (A03 = AbstractC905941u.A03(fragmentActivity, userSession, c120985dq.A06().A04(), false)) == null || A03.CHN() == null || AbstractC114965Hm.A01(A03) != EnumC906041v.AD_DESTINATION_LEAD_AD) {
            return false;
        }
        return true;
    }

    public static final boolean A00(FragmentActivity fragmentActivity, C120985dq c120985dq, UserSession userSession) {
        String str;
        String CHN;
        boolean z;
        boolean A1Y = AbstractC25229BEm.A1Y(userSession);
        if (C59942oc.A07(c120985dq, userSession)) {
            return A1Y;
        }
        if (!c120985dq.CdW()) {
            return false;
        }
        AndroidLink A03 = AbstractC905941u.A03(fragmentActivity, userSession, c120985dq.A06().A04(), A1Y);
        C38321qM c38321qM = c120985dq.A02;
        EnumC906041v enumC906041v = null;
        if (c38321qM != null) {
            str = c38321qM.A0C.BEO();
        } else {
            str = null;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36328740355063553L)) {
            if (A03 != null) {
                enumC906041v = AbstractC114965Hm.A01(A03);
            }
            if (enumC906041v == EnumC906041v.AD_DESTINATION_DEEPLINK && str != null) {
                A03 = AbstractC114965Hm.A00(str);
            }
        }
        if (A03 == null || (CHN = A03.CHN()) == null) {
            return false;
        }
        C14K c14k = C14J.A04;
        C14J A00 = c14k.A00();
        if (A00 != null && A00.A00(userSession, CHN) != null) {
            z = true;
        } else {
            c14k.A00();
            z = false;
        }
        boolean z2 = !new ExternalBrowserLauncher(fragmentActivity, userSession).A02().equals(C05F.A0G);
        if (AbstractC114965Hm.A01(A03) != EnumC906041v.AD_DESTINATION_WEB || z || z2) {
            return false;
        }
        return true;
    }

    public static final boolean A02(FragmentActivity fragmentActivity, C120985dq c120985dq, UserSession userSession) {
        AndroidLink A03;
        boolean A1Y = AbstractC25229BEm.A1Y(userSession);
        if (!C18U.A06(C06090Tz.A05, userSession, 36317517608457527L) || C59942oc.A07(c120985dq, userSession) || !c120985dq.CdW() || (A03 = AbstractC905941u.A03(fragmentActivity, userSession, c120985dq.A06().A04(), A1Y)) == null || A03.CHN() == null || AbstractC114965Hm.A01(A03) != EnumC906041v.AD_DESTINATION_APP_STORE) {
            return false;
        }
        return true;
    }
}
