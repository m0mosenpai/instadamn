package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hy3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40521Hy3 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        C102884kP c102884kP = (C102884kP) list.get(5);
        if (c102884kP != null) {
            boolean A0S = c102884kP.A0S(43, false);
            String A0s = AbstractC31173DnH.A0s(list, 0);
            Object A02 = c6fw.A02();
            AbstractC25225BEi.A1S(A02);
            String str = (String) A02;
            String A0s2 = AbstractC31173DnH.A0s(list, 2);
            String A0s3 = AbstractC31173DnH.A0s(list, 3);
            String A0s4 = AbstractC31173DnH.A0s(list, 4);
            String A0E = c102884kP.A0E();
            long A04 = c102884kP.A04(36, 0L);
            boolean A0S2 = c102884kP.A0S(40, false);
            String A0H = c102884kP.A0H();
            FragmentActivity A042 = C6BQ.A04(c6fq);
            UserSession A0W = AbstractC31172DnG.A0W(c6fq);
            C1XJ c1xj = C1XJ.A00;
            Long valueOf = Long.valueOf(A04);
            Boolean valueOf2 = Boolean.valueOf(A0S2);
            if (A0S) {
                c1xj.A16(A042, A0W, valueOf2, valueOf, str, A0s2, A0s3, null, null, A0s4, null, A0E, A0H, false, false, false);
                return null;
            }
            c1xj.A16(A042, A0W, valueOf2, valueOf, str, A0s2, A0s3, A0s, null, A0s4, null, A0E, A0H, false, false, false);
            return null;
        }
        return null;
    }
}
