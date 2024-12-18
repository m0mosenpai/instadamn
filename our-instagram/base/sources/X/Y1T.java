package X;

import android.os.Handler;

/* loaded from: classes12.dex */
public final class Y1T {
    public static final InterfaceC09390do A03 = AbstractC09440dt.A01(YL3.A00);
    public Runnable A00;
    public Runnable A01;
    public final Handler A02 = AbstractC167007dF.A0J();

    public final void A00(C75113Zb c75113Zb) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
            this.A01 = null;
        }
        Runnable runnable2 = this.A00;
        if (runnable2 != null) {
            this.A02.removeCallbacks(runnable2);
            this.A00 = null;
        }
        if (false != c75113Zb.A1n) {
            c75113Zb.A1n = false;
            C75113Zb.A00(c75113Zb, 79);
        }
    }

    public final void A01(C75113Zb c75113Zb, long j, long j2) {
        A00(c75113Zb);
        RunnableC73516YHg runnableC73516YHg = new RunnableC73516YHg(this, c75113Zb);
        this.A01 = runnableC73516YHg;
        this.A00 = new RunnableC73517YHh(this, c75113Zb);
        Handler handler = this.A02;
        handler.postDelayed(runnableC73516YHg, j);
        Runnable runnable = this.A00;
        if (runnable != null) {
            handler.postDelayed(runnable, j + j2);
        }
    }
}
