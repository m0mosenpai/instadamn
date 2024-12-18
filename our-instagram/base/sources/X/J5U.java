package X;

/* loaded from: classes7.dex */
public final class J5U implements Runnable {
    public final /* synthetic */ C29X A00;
    public final /* synthetic */ C15370ps A01;
    public final /* synthetic */ boolean A02;

    public J5U(C29X c29x, C15370ps c15370ps, boolean z) {
        this.A00 = c29x;
        this.A01 = c15370ps;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C29X.A04((java.util.Set) this.A01.A00, this.A02);
    }
}
