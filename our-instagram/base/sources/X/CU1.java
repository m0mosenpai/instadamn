package X;

/* loaded from: classes5.dex */
public final class CU1 {
    public final InterfaceC74953Yl A00 = AbstractC25230BEn.A0U(null);
    public final InterfaceC118485Xk A01;
    public final String A02;
    public final /* synthetic */ BTO A03;

    public CU1(BTO bto, InterfaceC118485Xk interfaceC118485Xk, String str) {
        this.A03 = bto;
        this.A01 = interfaceC118485Xk;
        this.A02 = str;
    }

    public final C28793CnP A00(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        InterfaceC74953Yl interfaceC74953Yl = this.A00;
        C28793CnP c28793CnP = (C28793CnP) interfaceC74953Yl.getValue();
        if (c28793CnP == null) {
            BTO bto = this.A03;
            Object invoke = interfaceC16660sJ2.invoke(bto.A04());
            InterfaceC118485Xk interfaceC118485Xk = this.A01;
            AbstractC118405Xc abstractC118405Xc = (AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(interfaceC16660sJ2.invoke(bto.A04()));
            abstractC118405Xc.A02();
            c28793CnP = new C28793CnP(this, new C28795CnR(abstractC118405Xc, bto, interfaceC118485Xk, invoke), interfaceC16660sJ, interfaceC16660sJ2);
            interfaceC74953Yl.Egh(c28793CnP);
            bto.A09.add(c28793CnP.A02);
        }
        BTO bto2 = this.A03;
        c28793CnP.A00 = interfaceC16660sJ2;
        c28793CnP.A01 = interfaceC16660sJ;
        c28793CnP.A00(bto2.A03());
        return c28793CnP;
    }
}
