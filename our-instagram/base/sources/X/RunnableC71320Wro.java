package X;

/* renamed from: X.Wro, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71320Wro implements Runnable {
    public final /* synthetic */ WFJ A00;

    public RunnableC71320Wro(WFJ wfj) {
        this.A00 = wfj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WFJ wfj = this.A00;
        int i = WFJ.A0A;
        wfj.A06.getOverlay().remove(wfj.A05);
        wfj.A02 = false;
    }
}
