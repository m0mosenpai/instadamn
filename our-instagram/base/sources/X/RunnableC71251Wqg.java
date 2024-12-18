package X;

/* renamed from: X.Wqg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71251Wqg implements Runnable {
    public final /* synthetic */ C66542ULx A00;

    public RunnableC71251Wqg(C66542ULx c66542ULx) {
        this.A00 = c66542ULx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66542ULx c66542ULx = this.A00;
        if (((AbstractC68892Vdo) c66542ULx).A00) {
            C1LC it = C66542ULx.A00(c66542ULx).A09.iterator();
            while (it.hasNext()) {
                it.next();
                System.currentTimeMillis();
            }
            c66542ULx.A00.postDelayed(this, 10000L);
        }
    }
}
