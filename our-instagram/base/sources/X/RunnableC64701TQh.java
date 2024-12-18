package X;

/* renamed from: X.TQh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64701TQh implements Runnable {
    public final /* synthetic */ C63364SiN A00;
    public final /* synthetic */ EnumC61139Rft A01;
    public final /* synthetic */ RhR A02;
    public final /* synthetic */ Throwable A03;

    public RunnableC64701TQh(C63364SiN c63364SiN, EnumC61139Rft enumC61139Rft, RhR rhR, Throwable th) {
        this.A00 = c63364SiN;
        this.A02 = rhR;
        this.A01 = enumC61139Rft;
        this.A03 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63364SiN.A03(this.A00, this.A01, this.A02, this.A03);
    }
}
