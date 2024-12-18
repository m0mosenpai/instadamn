package X;

/* loaded from: classes9.dex */
public final class PSN implements Runnable {
    public final /* synthetic */ PUP A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public PSN(PUP pup, String str, boolean z) {
        this.A00 = pup;
        this.A02 = z;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03.DiH(this.A02, this.A01);
    }
}
