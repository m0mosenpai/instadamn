package X;

/* renamed from: X.PPt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56978PPt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C56206OxF A01;

    public RunnableC56978PPt(C56206OxF c56206OxF, int i) {
        this.A01 = c56206OxF;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56206OxF c56206OxF = this.A01;
        C51109MiE c51109MiE = c56206OxF.A03;
        ((AbstractC110824yu) c51109MiE).A00 = this.A00;
        AbstractC70663Fe abstractC70663Fe = c56206OxF.A04.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A10(c51109MiE);
        }
    }
}
