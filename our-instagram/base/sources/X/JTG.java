package X;

/* loaded from: classes8.dex */
public final class JTG implements InterfaceC74963Ym {
    public long A00;
    public C5Y6 A01;
    public C62C A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC118485Xk A07;
    public final InterfaceC74953Yl A08;
    public final /* synthetic */ BH5 A09;

    public JTG(C5Y6 c5y6, BH5 bh5, InterfaceC118485Xk interfaceC118485Xk, Object obj, Object obj2) {
        this.A09 = bh5;
        this.A03 = obj;
        this.A04 = obj2;
        this.A07 = interfaceC118485Xk;
        this.A08 = AbstractC25230BEn.A0U(obj);
        this.A01 = c5y6;
        this.A02 = new C62C(c5y6, null, interfaceC118485Xk, this.A03, this.A04);
    }

    @Override // X.InterfaceC74963Ym
    public final Object getValue() {
        return this.A08.getValue();
    }
}
