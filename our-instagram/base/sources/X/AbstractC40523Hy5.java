package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hy5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40523Hy5 {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        C102884kP c102884kP = (C102884kP) list.get(7);
        if (c102884kP == null) {
            AbstractC25241Le.A02("IgBloksExtensions", "openProductDetailsPageExtras is null");
            return null;
        }
        C6DZ.A01(C131845xK.A00(c6fq, C6FW.A01, c102884kP.A0A()));
        C102884kP c102884kP2 = (C102884kP) c6fw.A00();
        String A0s = AbstractC31173DnH.A0s(list, 3);
        String A0s2 = AbstractC31173DnH.A0s(list, 5);
        String A0s3 = AbstractC31173DnH.A0s(list, 6);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        String A0L = c102884kP.A0L(45);
        String A0K2 = c102884kP.A0K();
        AbstractC41288IPd.A01(A04, A08, c6fq, c102884kP2, A0K, AbstractC37301Gc2.A0b(c102884kP, 59), AbstractC37301Gc2.A0b(c102884kP, 57), Long.valueOf(c102884kP.A04(46, 0L)), A0s, A0L, A0s2, A0s3, A0K2, c102884kP.A0L(44), c102884kP.A0H(), c102884kP.A0L(50), c102884kP.A0L(48), c102884kP.A0L(56), c102884kP.A0L(58));
        return null;
    }
}
