package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VPv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68413VPv {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0P = AbstractC65702TsY.A0P(c6fw, 0);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        String A0G = A0P.A0G();
        String str = "";
        if (A0G == null) {
            A0G = "";
        }
        String A0J = A0P.A0J();
        if (A0J != null) {
            str = A0J;
        }
        String A0H = A0P.A0H();
        AbstractC25651Mw.A00(userSession).A01(new C42272Inw(A0P.A0B(43), userSession, c6fq, str, 0), C70711Wfa.class);
        AbstractC70398WUa.A02(A04, userSession, A0G, str, A0H, null, "ig_boost", null, false);
        return null;
    }
}
