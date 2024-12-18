package X;

/* renamed from: X.AzK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24859AzK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC197978p8 A02;
    public final /* synthetic */ C179877yd A03;
    public final /* synthetic */ C22821A4q A04;

    public RunnableC24859AzK(InterfaceC197978p8 interfaceC197978p8, C179877yd c179877yd, C22821A4q c22821A4q, int i, int i2) {
        this.A04 = c22821A4q;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = c179877yd;
        this.A02 = interfaceC197978p8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23128AMg c23128AMg = this.A04.A00;
        c23128AMg.A03 = this.A01;
        c23128AMg.A02 = this.A00;
        c23128AMg.A0C = this.A03;
        C178927x4 c178927x4 = new C178927x4(c23128AMg.A0Q, 3);
        c23128AMg.A08 = c178927x4;
        InterfaceC197978p8 interfaceC197978p8 = this.A02;
        if (interfaceC197978p8 != null) {
            interfaceC197978p8.Ehr(c178927x4, 1);
        }
        C179877yd c179877yd = c23128AMg.A0C;
        c179877yd.getClass();
        c23128AMg.A0F = new AKR(c179877yd);
        C23128AMg.A01(c23128AMg);
    }
}
