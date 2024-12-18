package X;

/* renamed from: X.Apb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24270Apb implements Runnable {
    public final /* synthetic */ C23128AMg A00;

    public RunnableC24270Apb(C23128AMg c23128AMg) {
        this.A00 = c23128AMg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23128AMg c23128AMg = this.A00;
        if (c23128AMg.A0V.get() != 0) {
            AbstractC180277zH abstractC180277zH = c23128AMg.A09;
            if (abstractC180277zH != null) {
                abstractC180277zH.A02();
                c23128AMg.A09 = null;
            }
            C55172Odb c55172Odb = c23128AMg.A0G;
            if (c55172Odb != null) {
                HandlerC50751MbG handlerC50751MbG = c55172Odb.A05;
                if (handlerC50751MbG != null) {
                    handlerC50751MbG.sendEmptyMessage(4);
                }
                c23128AMg.A0G = null;
            }
        }
    }
}
