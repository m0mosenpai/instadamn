package X;

import java.util.Iterator;

/* renamed from: X.Gjc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37763Gjc implements Runnable {
    public final /* synthetic */ C37762Gjb A00;
    public final /* synthetic */ C37752GjR A01;

    public RunnableC37763Gjc(C37762Gjb c37762Gjb, C37752GjR c37752GjR) {
        this.A00 = c37762Gjb;
        this.A01 = c37752GjR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Set set = this.A00.A05;
        C37752GjR c37752GjR = this.A01;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC116905Qw) it.next()).D5G(c37752GjR);
        }
    }
}
