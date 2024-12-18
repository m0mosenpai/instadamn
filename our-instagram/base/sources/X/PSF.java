package X;

/* loaded from: classes9.dex */
public final class PSF implements Runnable {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public PSF(C25814BbV c25814BbV, String str, String str2) {
        this.A00 = c25814BbV;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25814BbV c25814BbV = this.A00;
        c25814BbV.A0A.A0M(this.A01, this.A02);
    }
}
