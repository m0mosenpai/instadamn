package X;

import java.util.Iterator;

/* renamed from: X.PKs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56848PKs implements Runnable {
    public final /* synthetic */ C55039OZl A00;

    public RunnableC56848PKs(C55039OZl c55039OZl) {
        this.A00 = c55039OZl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Set set = this.A00.A03;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC166987dD.A1Y(it.next());
        }
        set.clear();
    }
}
