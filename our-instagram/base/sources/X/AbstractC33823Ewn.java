package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ewn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33823Ewn {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        String A0s2 = AbstractC31173DnH.A0s(list, 1);
        String A0l = AbstractC31180DnO.A0l(list);
        Object A03 = c6fw.A03(4);
        String A0f = AbstractC31171DnF.A0f(A03);
        String str = (String) A03;
        String A0o = AbstractC31176DnK.A0o(c6fw, A0f, 5);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
            AbstractC31171DnF.A1Q(A0A);
            C35243Fgc.A00(c6fg.A00, null, (UserSession) A0A, A0s, A0s2, A0l, str, A0o);
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
