package X;

/* renamed from: X.Ww1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC71552Ww1 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C96184Ub A01;
    public final /* synthetic */ byte[] A02;

    public /* synthetic */ RunnableC71552Ww1(C96184Ub c96184Ub, byte[] bArr, long j) {
        this.A01 = c96184Ub;
        this.A02 = bArr;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C96184Ub c96184Ub = this.A01;
        ((C4TV) c96184Ub.A01).A05.A0v.DVN(this.A02, this.A00);
    }
}
