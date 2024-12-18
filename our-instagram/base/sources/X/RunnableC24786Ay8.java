package X;

/* renamed from: X.Ay8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24786Ay8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C218269ky A01;
    public final /* synthetic */ boolean A02;

    public RunnableC24786Ay8(C218269ky c218269ky, int i, boolean z) {
        this.A02 = z;
        this.A01 = c218269ky;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A02;
        C218269ky c218269ky = this.A01;
        if (z) {
            ((C8J9) c218269ky).A01.EMO(this.A00, ((C8JF) c218269ky.A01).A00);
        } else {
            ((C8J9) c218269ky).A01.A08(this.A00);
        }
    }
}
