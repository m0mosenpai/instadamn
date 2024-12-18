package X;

/* loaded from: classes9.dex */
public final class POT implements Runnable {
    public final /* synthetic */ C55535OlT A00;

    public POT(C55535OlT c55535OlT) {
        this.A00 = c55535OlT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OXC oxc = this.A00.A0B;
        if (oxc != null) {
            oxc.A01();
        }
    }
}
