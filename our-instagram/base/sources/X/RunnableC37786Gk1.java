package X;

import java.util.Iterator;

/* renamed from: X.Gk1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37786Gk1 implements Runnable {
    public final /* synthetic */ C57782kr A00;
    public final /* synthetic */ java.util.Set A01;
    public final /* synthetic */ java.util.Set A02;

    public RunnableC37786Gk1(C57782kr c57782kr, java.util.Set set, java.util.Set set2) {
        this.A00 = c57782kr;
        this.A02 = set;
        this.A01 = set2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            this.A00.A03.remove(it.next());
        }
        C57782kr c57782kr = this.A00;
        java.util.Set set = c57782kr.A01.A02;
        java.util.Set set2 = this.A01;
        set.removeAll(set2);
        c57782kr.A04.addAll(set2);
    }
}
