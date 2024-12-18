package X;

/* loaded from: classes6.dex */
public final class GL0 implements Runnable {
    public final /* synthetic */ C34599FMi A00;

    public GL0(C34599FMi c34599FMi) {
        this.A00 = c34599FMi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34599FMi c34599FMi = this.A00;
        synchronized (c34599FMi.A03) {
            c34599FMi.A00 = AbstractC25225BEi.A16(c34599FMi.A01);
            c34599FMi.A01 = null;
        }
    }
}
