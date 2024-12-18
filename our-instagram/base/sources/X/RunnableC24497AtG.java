package X;

/* renamed from: X.AtG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24497AtG implements Runnable {
    public final /* synthetic */ C69663Vt4 A00;

    public RunnableC24497AtG(C69663Vt4 c69663Vt4) {
        this.A00 = c69663Vt4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69663Vt4 c69663Vt4 = this.A00;
        c69663Vt4.A05 = true;
        c69663Vt4.A0F.countDown();
    }
}
