package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Hy0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40518Hy0 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP;
        Object A03 = c6fw.A03(0);
        if (A03 instanceof C102884kP) {
            c102884kP = (C102884kP) A03;
        } else {
            c102884kP = null;
        }
        InterfaceC103384lE A00 = C1344465q.A00(c6fw.A03(1));
        if (c102884kP != null) {
            FragmentActivity A04 = C6BQ.A04(c6fq);
            UserSession A0K = AbstractC31179DnN.A0K(c6fq);
            Product A01 = AbstractC41287IPc.A01(c102884kP);
            List list = A01.A0O;
            if (list == null) {
                if (A00 != null) {
                    C6FX c6fx = new C6FX();
                    c6fx.A03(A01.A0H, 0);
                    c6fx.A03(AbstractC37302Gc3.A0d(A01), 1);
                    AbstractC25227BEk.A1M(c6fq, c6fx, A00);
                }
            } else {
                new C41742IeG(A04, A0K, true);
                HashMap A1G = AbstractC166987dD.A1G();
                if (list.isEmpty()) {
                    throw AbstractC31172DnG.A0u();
                }
                if (list.isEmpty()) {
                    throw AbstractC31172DnG.A0u();
                }
                list.size();
                A1G.size();
                if (A00 != null) {
                    C6FX c6fx2 = new C6FX();
                    c6fx2.A03(A01.A0H, 0);
                    c6fx2.A03(AbstractC37302Gc3.A0d(A01), 1);
                    AbstractC25227BEk.A1M(c6fq, c6fx2, A00);
                    return null;
                }
            }
        }
        return null;
    }
}
