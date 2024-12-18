package X;

/* renamed from: X.Ay4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24782Ay4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C185488Kq A02;

    public RunnableC24782Ay4(C185488Kq c185488Kq, int i, int i2) {
        this.A02 = c185488Kq;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C185488Kq.A01(this.A02).A00(this.A00 - this.A01);
    }
}
