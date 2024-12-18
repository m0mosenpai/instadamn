package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eyd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33937Eyd {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        User user;
        User user2;
        AHE ahe;
        C102884kP c102884kP = (C102884kP) c6fw.A03(0);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        C34396FEm c34396FEm = (C34396FEm) C102884kP.A00(c102884kP, 38);
        if (c34396FEm != null) {
            user = c34396FEm.A00;
        } else {
            user = null;
        }
        user.getClass();
        AHE ahe2 = new AHE(user.getUsername(), AbstractC25228BEl.A19(user), user.isVerified());
        C34396FEm c34396FEm2 = (C34396FEm) C102884kP.A00(c102884kP, 46);
        if (c34396FEm2 != null) {
            user2 = c34396FEm2.A00;
        } else {
            user2 = null;
        }
        String str = "";
        if (user2 == null) {
            String str2 = "";
            String A0L = c102884kP.A0L(51);
            if (A0L != null) {
                str2 = A0L;
            }
            String str3 = "";
            String A0L2 = c102884kP.A0L(52);
            if (A0L2 != null) {
                str3 = A0L2;
            }
            ahe = new AHE(str2, str3, false);
        } else {
            ahe = new AHE(user2.getUsername(), AbstractC25228BEl.A19(user2), user2.isVerified());
        }
        String str4 = "";
        String A0H = c102884kP.A0H();
        if (A0H != null) {
            str4 = A0H;
        }
        String str5 = "";
        String A0J = c102884kP.A0J();
        if (A0J != null) {
            str5 = A0J;
        }
        String str6 = "";
        String A0F = c102884kP.A0F();
        if (A0F != null) {
            str6 = A0F;
        }
        String str7 = "";
        String A0G = c102884kP.A0G();
        if (A0G != null) {
            str7 = A0G;
        }
        String str8 = "";
        String A0K = c102884kP.A0K();
        if (A0K != null) {
            str8 = A0K;
        }
        String A0L3 = c102884kP.A0L(48);
        if (A0L3 != null) {
            str = A0L3;
        }
        AbstractC23115AHe.A01(C6BQ.A04(c6fq), C22P.A4U, A0W, new C1816383s(null, ahe, ahe2, str7, str, str8, str6, str5, str4, c102884kP.A03(50, 0)));
        return null;
    }
}
