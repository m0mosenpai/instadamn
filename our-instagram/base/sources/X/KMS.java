package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KMS extends AbstractRunnableC14200nk {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ C7FG A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMS(C26086BgF c26086BgF, C7FG c7fg, Long l, List list, boolean z, boolean z2) {
        super(1194426243, 2, false, false);
        this.A01 = c7fg;
        this.A03 = list;
        this.A04 = z;
        this.A00 = c26086BgF;
        this.A02 = l;
        this.A05 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7FG c7fg = this.A01;
        List list = this.A03;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (((C45029JwK) obj).A03) {
                A1E.add(obj);
            }
        }
        if (!(A1E instanceof Collection) || !A1E.isEmpty()) {
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                C45029JwK c45029JwK = (C45029JwK) it.next();
                if (!AbstractC23048AEe.A01(C44059Jdk.A00(c45029JwK.A00.A0X, 0), c7fg.A06, false, true)) {
                    return;
                }
            }
        }
        C11T.A02(new RunnableC50031M6u(this.A00, c7fg, this.A02, list, this.A04, this.A05));
    }
}
