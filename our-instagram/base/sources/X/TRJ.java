package X;

/* loaded from: classes10.dex */
public final class TRJ implements Runnable {
    public final /* synthetic */ C63291Sgr A00;
    public final /* synthetic */ C61549RpU A01;
    public final /* synthetic */ C58770Q8c A02;
    public final /* synthetic */ InterfaceC65507Tlc A03;
    public final /* synthetic */ SE2 A04;
    public final /* synthetic */ C63152Se0 A05;

    public TRJ(C63291Sgr c63291Sgr, C61549RpU c61549RpU, C58770Q8c c58770Q8c, InterfaceC65507Tlc interfaceC65507Tlc, SE2 se2, C63152Se0 c63152Se0) {
        this.A02 = c58770Q8c;
        this.A01 = c61549RpU;
        this.A04 = se2;
        this.A03 = interfaceC65507Tlc;
        this.A00 = c63291Sgr;
        this.A05 = c63152Se0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C58770Q8c c58770Q8c = this.A02;
        C58252li A00 = TW3.A00(c58770Q8c.A06.A04(this.A01, AbstractC58319PtB.A0W(this.A04.A01)), c58770Q8c, 4);
        A00.A09(new C63625SqX(7, A00, this));
    }
}
