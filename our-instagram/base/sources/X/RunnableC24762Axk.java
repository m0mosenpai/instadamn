package X;

/* renamed from: X.Axk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC24762Axk implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C8JE A02;

    public /* synthetic */ RunnableC24762Axk(C8JE c8je, int i, int i2) {
        this.A02 = c8je;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8JE c8je = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        c8je.A02(i);
        c8je.A05.EMO(i, i2);
    }
}
