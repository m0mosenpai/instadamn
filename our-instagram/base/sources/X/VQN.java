package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VQN {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object obj = c6fw.A00.get(0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) obj;
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        String A0L = c102884kP.A0L(45);
        String A0L2 = c102884kP.A0L(46);
        String A0H = c102884kP.A0H();
        if (A0H != null) {
            str = AbstractC65702TsY.A0g(A0H);
        } else {
            str = null;
        }
        XIGIGBoostDestination A00 = VPS.A00(str);
        boolean A0U = c102884kP.A0U(false);
        C14360o3.A07(c102884kP.A0O(43));
        C6PZ.A02(A04, A00, new C70610Wdo(c6fq, c102884kP), userSession, A0L, A0L2, A0U);
        return null;
    }
}
