package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LFx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47943LFx {
    public C45038JwT A00;
    public boolean A01;
    public final HashMap A02 = AbstractC166987dD.A1G();

    public static final void A00(C47943LFx c47943LFx, List list) {
        C45038JwT c45038JwT = c47943LFx.A00;
        if (c45038JwT != null) {
            list.add(c45038JwT);
            return;
        }
        Iterator A14 = AbstractC166997dE.A14(c47943LFx.A02);
        while (A14.hasNext()) {
            A00((C47943LFx) AbstractC31176DnK.A0j(A14), list);
        }
    }

    public final void A01(C47497KyQ c47497KyQ) {
        C45038JwT c45038JwT;
        C45038JwT c45038JwT2 = this.A00;
        if (c45038JwT2 != null && ((c45038JwT = c47497KyQ.A00) == null || c47497KyQ.A01.compare(c45038JwT2, c45038JwT) > 0)) {
            c47497KyQ.A00 = c45038JwT2;
        }
        Iterator A14 = AbstractC166997dE.A14(this.A02);
        while (A14.hasNext()) {
            ((C47943LFx) AbstractC31176DnK.A0j(A14)).A01(c47497KyQ);
        }
    }

    public C47943LFx(boolean z) {
        this.A01 = z;
    }
}
