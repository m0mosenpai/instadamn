package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hxy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40516Hxy {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        C3G2 c3g2;
        String str = (String) c6fw.A01();
        String str2 = (String) c6fw.A03(1);
        C4M5.A00();
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (str2.equals("live_shopping_netego")) {
            c3g2 = C3G2.A1J;
        } else {
            c3g2 = C3G2.A0J;
        }
        C14360o3.A0B(A0K, 0);
        AbstractC167007dF.A1D(A04, 1, str);
        C3KX A01 = C3KW.A01(A04, A0K);
        if (A01.A01 != null && A01.A00 != null) {
            C3KX.A05(new C43055J1v(c3g2, A01, null, null, null, null, false), A01, C05F.A00, str, false);
        }
        return null;
    }
}
