package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.launcher.ExternalBrowserLauncher;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.IAq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40918IAq {
    public static final boolean A00(FragmentActivity fragmentActivity, C120985dq c120985dq, UserSession userSession) {
        C114595Ff c114595Ff;
        AndroidLink A03;
        String CHN;
        boolean z;
        if (c120985dq != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if ((C18U.A06(c06090Tz, userSession, 36317517608785212L) || C18U.A06(c06090Tz, userSession, 36317517608719675L) || C18U.A06(c06090Tz, userSession, 2342160526819923243L) || C18U.A06(c06090Tz, userSession, 36317517606556973L) || C18U.A06(c06090Tz, userSession, 36317517608916286L)) && c120985dq.CdW() && !c120985dq.A0F() && ((!C76253bV.A00(c120985dq, userSession) || C18U.A06(c06090Tz, userSession, 36323444660645116L)) && (((c114595Ff = c120985dq.A06().A08) == null || !AbstractC166997dE.A1Z(c114595Ff.A00, false)) && (A03 = AbstractC905941u.A03(fragmentActivity, userSession, c120985dq.A06().A04(), false)) != null && (CHN = A03.CHN()) != null))) {
                C14K c14k = C14J.A04;
                C14J A00 = c14k.A00();
                if (A00 != null && A00.A00(userSession, CHN) != null) {
                    z = true;
                } else {
                    c14k.A00();
                    z = false;
                }
                boolean z2 = !new ExternalBrowserLauncher(fragmentActivity, userSession).A02().equals(C05F.A0G);
                if (AbstractC114965Hm.A01(A03) == EnumC906041v.AD_DESTINATION_WEB && !z && !z2) {
                    return true;
                }
            }
        }
        return false;
    }
}
