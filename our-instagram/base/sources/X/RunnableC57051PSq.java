package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.PSq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57051PSq implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PCQ A01;
    public final /* synthetic */ C15100pQ A02;

    public RunnableC57051PSq(PCQ pcq, C15100pQ c15100pQ, int i) {
        this.A01 = pcq;
        this.A02 = c15100pQ;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PCQ pcq = this.A01;
        View A0d = AbstractC166987dD.A0d(pcq.A0A);
        int i = this.A02.A00;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(A0d);
        if ((A0G.topMargin == i && MSY.A05(pcq.A07) == i2) || !(A0d.getParent() instanceof ViewGroup)) {
            return;
        }
        AbstractC43593JPy.A1W(pcq.A07, i2);
        C50797McE c50797McE = new C50797McE(A0d, A0G, A0G.topMargin, i, 2);
        c50797McE.setAnimationListener(new NY1(pcq));
        c50797McE.setDuration(300L);
        A0d.startAnimation(c50797McE);
    }
}
