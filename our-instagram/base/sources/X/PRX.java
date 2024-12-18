package X;

/* loaded from: classes9.dex */
public final class PRX implements Runnable {
    public final /* synthetic */ N55 A00;
    public final /* synthetic */ C09530e4 A01;

    public PRX(N55 n55, C09530e4 c09530e4) {
        this.A01 = c09530e4;
        this.A00 = n55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C09530e4 c09530e4 = this.A01;
        if (c09530e4 != null) {
            this.A00.A00 = AbstractC25229BEm.A0A(c09530e4);
        }
    }
}
