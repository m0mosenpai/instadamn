package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ez8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33967Ez8 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC2050795x enumC2050795x;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        EnumC2050795x[] values = EnumC2050795x.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC2050795x = values[i];
                if (A0d.equalsIgnoreCase(enumC2050795x.name())) {
                    break;
                }
                i++;
            } else {
                enumC2050795x = EnumC2050795x.UNKNOWN;
                break;
            }
        }
        FBM.A00(A04, enumC2050795x, AbstractC31171DnF.A0D(AbstractC111324zv.A00(990)), A0W);
        return null;
    }
}
