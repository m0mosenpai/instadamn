package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BRx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25560BRx extends AbstractC77733dx {
    public C2WF A00;

    public final void A0A(AbstractC50812Vc abstractC50812Vc) {
        if (abstractC50812Vc != null) {
            C2WF c2wf = this.A00;
            List list = c2wf.A03;
            if (list == null) {
                list = new ArrayList();
                c2wf.A03 = list;
            }
            list.add(abstractC50812Vc);
        }
    }
}
