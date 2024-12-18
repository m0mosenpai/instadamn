package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;

/* renamed from: X.Ewg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33816Ewg {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean A06;
        boolean z = false;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        String A0i = AbstractC31180DnO.A0i(c6fw, 1);
        Object A032 = c6fw.A03(2);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.Number");
        long A0N = AbstractC166987dD.A0N(A032) * 1000;
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 3);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 4);
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A03(A03, 0);
        C6FW A00 = A0s.A00();
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        if (userSession == null) {
            A06 = false;
        } else {
            A06 = C18U.A06(C06090Tz.A05, userSession, 36313699379579081L);
        }
        if (!A06) {
            C131845xK.A00(c6fq, A00, A0I2);
            return null;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A0i == null || A0i.length() == 0) {
            z = true;
        }
        if (AbstractC34826FWh.A01(A0N, !z)) {
            C14360o3.A0B(userSession, 1);
            AbstractC35083Fcu.A02(A04, userSession, true);
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        C14360o3.A07(calendar);
        calendar.setTimeInMillis(A0N);
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int A05 = AbstractC31173DnH.A05(calendar);
        C08790ch A002 = AbstractC018607g.A00(A04);
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A9s("day", AbstractC31181DnP.A0G(A0C, "age_platform/age_verification/is_eligible/", i, i2, A05));
        C1ON A0J = AbstractC31178DnM.A0J(A0C, ED5.class, C34730FRt.class);
        A0J.A00 = new C32505ETf(A04, c6fq, A00, A0I2, A0I, userSession, i, i2, A05);
        C1GJ.A00(A04, A002, A0J);
        return null;
    }
}
