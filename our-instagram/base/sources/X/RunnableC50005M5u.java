package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.M5u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50005M5u implements Runnable {
    public final /* synthetic */ C44744JrR A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ C15080pO A02;

    public RunnableC50005M5u(C44744JrR c44744JrR, List list, C15080pO c15080pO) {
        this.A00 = c44744JrR;
        this.A02 = c15080pO;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredWidth = this.A00.A01.getMeasuredWidth() / 3;
        float f = measuredWidth / this.A02.A00;
        List list = this.A01;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC13880nE.A0h(((C49576LvV) it.next()).A00, measuredWidth, (int) f);
            A0q.add(C0eB.A00);
        }
    }
}
