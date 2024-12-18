package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eys, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33952Eys {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP = (C102884kP) c6fw.A03(0);
        C27956CUa A00 = AnonymousClass548.A00().A00();
        FragmentActivity A04 = C6BQ.A04(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        G7R g7r = new G7R();
        String str = "";
        String A0I = c102884kP.A0I();
        if (A0I != null) {
            str = A0I;
        }
        boolean A0S = c102884kP.A0S(36, false);
        boolean A0S2 = c102884kP.A0S(40, false);
        c102884kP.A03(41, 0);
        A00.A01(A04, EnumC120785dO.COMMENT_BUTTON, A0K, g7r, str, null, null, A0S, A0S2, c102884kP.A0S(35, false), true, false, false);
        return null;
    }
}
