package X;

/* renamed from: X.4CI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C41461vv A02;
    public final /* synthetic */ short A03;

    public C4CI(C41461vv c41461vv, int i, long j, short s) {
        this.A02 = c41461vv;
        this.A00 = i;
        this.A03 = s;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41461vv.A00(this.A02, this.A00, this.A01, this.A03);
    }
}
