package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ex0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33836Ex0 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, MSV.A00(10));
        C102884kP c102884kP = (C102884kP) A02;
        C102884kP A08 = c102884kP.A08(40);
        if (A08 != null) {
            AHE ahe = null;
            String str = "";
            String A0J = c102884kP.A0J();
            if (A0J != null) {
                str = A0J;
            }
            String str2 = "";
            String A0L = c102884kP.A0L(44);
            if (A0L != null) {
                str2 = A0L;
            }
            String A0G = c102884kP.A0G();
            AHE A00 = FDI.A00(A08);
            String A0H = c102884kP.A0H();
            int A03 = c102884kP.A03(35, 0);
            String str3 = "";
            String A0K = c102884kP.A0K();
            if (A0K != null) {
                str3 = A0K;
            }
            C102884kP A082 = c102884kP.A08(38);
            if (A082 != null) {
                ahe = FDI.A00(A082);
            }
            C1816383s c1816383s = new C1816383s(null, ahe, A00, A0H, str3, A0G, str, "", str2, A03);
            UserSession A0W = AbstractC31172DnG.A0W(c6fq);
            AbstractC23115AHe.A01(C6BQ.A04(c6fq), C22P.A4U, A0W, c1816383s);
            return null;
        }
        throw AbstractC166987dD.A12("Requires valid creator model");
    }
}
