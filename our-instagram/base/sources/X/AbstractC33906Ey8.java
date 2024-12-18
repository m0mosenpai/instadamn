package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ey8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33906Ey8 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A01 = c6fw.A01();
        if (A01 instanceof String) {
            str = (String) A01;
        } else {
            str = null;
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        AbstractC12990ll abstractC12990ll = null;
        if (A0B instanceof UserSession) {
            abstractC12990ll = A0B;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        FragmentActivity A042 = C6BQ.A04(c6fq);
        if (str != null && abstractC12990ll != null) {
            C32242EIa A00 = F0K.A00(str);
            C189448aO A0y = AbstractC25225BEi.A0y(abstractC12990ll);
            AbstractC25226BEj.A1M(A042, A0y, 2131954026);
            AbstractC31173DnH.A0w(A04, A00, A0y);
        }
        return null;
    }
}
