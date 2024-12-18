package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class BK7 extends AnonymousClass358 {
    public final C675432t A00;
    public final java.util.Set A01;

    @Override // X.AnonymousClass358
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        List A3n;
        C84923qg c84923qg;
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (A3n = c38321qM.A3n()) != null && (c84923qg = (C84923qg) AbstractC001800i.A0J(A3n)) != null && !c84923qg.A02()) {
            java.util.Set set = this.A01;
            if (!set.contains(c84923qg.A0G)) {
                set.add(c84923qg.A0G);
                this.A00.A02(c84923qg, c120985dq.A02);
            }
        }
    }

    public BK7(C675432t c675432t, long j) {
        super(j);
        this.A00 = c675432t;
        java.util.Set synchronizedSet = Collections.synchronizedSet(AbstractC166987dD.A1H());
        C14360o3.A07(synchronizedSet);
        this.A01 = synchronizedSet;
    }
}
