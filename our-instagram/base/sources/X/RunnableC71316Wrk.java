package X;

/* renamed from: X.Wrk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71316Wrk implements Runnable {
    public final /* synthetic */ WEY A00;

    public RunnableC71316Wrk(WEY wey) {
        this.A00 = wey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HandlerC50752MbH handlerC50752MbH;
        WEY wey = this.A00;
        if (wey.A0D.get() != 0) {
            AbstractC180277zH abstractC180277zH = wey.A01;
            if (abstractC180277zH != null) {
                abstractC180277zH.A02();
            }
            wey.A01 = null;
            C55169OdX c55169OdX = wey.A03;
            if (c55169OdX != null && (handlerC50752MbH = c55169OdX.A05) != null) {
                handlerC50752MbH.sendEmptyMessage(4);
            }
            wey.A03 = null;
        }
    }
}
