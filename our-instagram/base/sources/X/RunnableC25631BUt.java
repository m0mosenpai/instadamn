package X;

/* renamed from: X.BUt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25631BUt implements Runnable {
    public final /* synthetic */ C25626BUo A00;

    public RunnableC25631BUt(C25626BUo c25626BUo) {
        this.A00 = c25626BUo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25626BUo c25626BUo = this.A00;
        int i = C25626BUo.A0A;
        c25626BUo.A06.postDelayed(this, 1000L);
        c25626BUo.A00++;
    }
}
