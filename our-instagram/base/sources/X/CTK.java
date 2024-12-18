package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* loaded from: classes5.dex */
public final class CTK {
    public Integer A00;
    public Integer A01;
    public final CSA A02;
    public final CSA A03;
    public final CSA A04;
    public final CSA A05;
    public final CSA A06;
    public final CSA A07;
    public final CSA A08;
    public final CSA A09;
    public final CSA A0A;
    public final CSA A0B;
    public final java.util.Set A0C;
    public final C05A A0D;

    public CTK() {
        Float A0l = AbstractC25227BEk.A0l();
        Float valueOf = Float.valueOf(-16.0f);
        InterfaceC118485Xk interfaceC118485Xk = AbstractC118445Xg.A02;
        CSA csa = new CSA(AbstractC25225BEi.A0I(null, 1.0f, 1500.0f), interfaceC118485Xk, A0l, valueOf);
        this.A0A = csa;
        long j = 0 << 32;
        C119235af c119235af = new C119235af(j);
        C119235af c119235af2 = new C119235af(20 | ((-20) << 32));
        InterfaceC118485Xk interfaceC118485Xk2 = AbstractC118445Xg.A03;
        CSA csa2 = new CSA(AbstractC25225BEi.A0I(null, 1.0f, 1500.0f), interfaceC118485Xk2, c119235af, c119235af2);
        this.A09 = csa2;
        Float valueOf2 = Float.valueOf(1.0f);
        Float valueOf3 = Float.valueOf(0.85f);
        CSA csa3 = new CSA(AbstractC25225BEi.A0I(null, 1.0f, 1500.0f), interfaceC118485Xk, valueOf2, valueOf3);
        this.A0B = csa3;
        InterfaceC118485Xk interfaceC118485Xk3 = AbstractC118445Xg.A05;
        InterfaceC30898DiB interfaceC30898DiB = AbstractC25328BIx.A01;
        CSA csa4 = new CSA(C25245BFe.A01(interfaceC30898DiB, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0), interfaceC118485Xk3, 0, 20);
        this.A08 = csa4;
        CSA csa5 = new CSA(C25245BFe.A01(interfaceC30898DiB, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0), interfaceC118485Xk, valueOf2, A0l);
        this.A07 = csa5;
        CSA csa6 = new CSA(AbstractC25225BEi.A0I(null, 1.0f, 1500.0f), interfaceC118485Xk, Float.valueOf(16.0f), A0l);
        this.A05 = csa6;
        CSA csa7 = new CSA(AbstractC25225BEi.A0I(null, 1.0f, 1500.0f), interfaceC118485Xk2, new C119235af(20 | (20 << 32)), new C119235af(j));
        this.A04 = csa7;
        CSA csa8 = new CSA(AbstractC25225BEi.A0I(null, 1.0f, 1500.0f), interfaceC118485Xk, valueOf3, valueOf2);
        this.A06 = csa8;
        CSA csa9 = new CSA(C25245BFe.A01(interfaceC30898DiB, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0), interfaceC118485Xk3, 20, 0);
        this.A03 = csa9;
        CSA csa10 = new CSA(C25245BFe.A01(interfaceC30898DiB, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0), interfaceC118485Xk, A0l, valueOf2);
        this.A02 = csa10;
        CSA[] csaArr = {csa, csa2, csa3, csa4, csa5, csa6, csa7, csa8, csa9, csa10};
        C14360o3.A0B(csaArr, 0);
        this.A0C = AbstractC009903n.A0K(csaArr);
        this.A0D = AbstractC25235BEs.A1A(false);
    }
}
