package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.I5k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40782I5k {
    public static final void A00(C6SG c6sg) {
        C105864px c105864px;
        List list;
        C66362zD c66362zD;
        C41181vS c41181vS = c6sg.A04;
        if (c41181vS != null && (c105864px = c41181vS.A07) != null && (list = c105864px.A01) != null && c6sg.A02 != null && (c66362zD = c6sg.A03) != null) {
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                H6F h6f = (H6F) obj;
                A0q.add(new C45213Jzt(h6f.A00, h6f.A01, null, null, i));
                i = i2;
            }
            A0E.A01(A0q);
            c66362zD.A05(A0E);
        }
    }
}
