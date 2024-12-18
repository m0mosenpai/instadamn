package X;

import android.os.Handler;

/* renamed from: X.Wu1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71439Wu1 implements Runnable {
    public final /* synthetic */ C70167WEj A00;
    public final /* synthetic */ UAE A01;

    public RunnableC71439Wu1(C70167WEj c70167WEj, UAE uae) {
        this.A01 = uae;
        this.A00 = c70167WEj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UAE uae = this.A01;
        C4RQ c4rq = uae.A08;
        C4RQ.A05(c4rq, "stop", new Object[0]);
        Handler handler = c4rq.A0E;
        handler.sendMessage(handler.obtainMessage(37));
        uae.setAlpha(0.0f);
        C70167WEj c70167WEj = this.A00;
        c70167WEj.A00++;
        c70167WEj.A06 = false;
        c70167WEj.A05 = false;
        c70167WEj.A03 = null;
        c70167WEj.A04 = null;
        C50627MWo c50627MWo = c70167WEj.A02;
        if (c50627MWo != null) {
            c70167WEj.A04(c50627MWo);
            c70167WEj.A02 = null;
        }
    }
}
