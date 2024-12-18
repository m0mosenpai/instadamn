package X;

/* renamed from: X.Aym, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24826Aym implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ BCS A02;
    public final /* synthetic */ AKN A03;

    public RunnableC24826Aym(BCS bcs, AKN akn, int i, int i2) {
        this.A03 = akn;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bcs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC179967ym interfaceC179967ym = (InterfaceC179967ym) this.A03.A0A.Aq0(InterfaceC179967ym.A00);
        interfaceC179967ym.ERw(C05F.A01);
        interfaceC179967ym.ERv(100);
        interfaceC179967ym.EaO(this.A01, this.A00);
        interfaceC179967ym.Epv(new C22814A4h(this.A02), null, false);
    }
}
