package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class CWW {
    public InterfaceC65600Tnp A00;
    public InterfaceC65600Tnp A01;
    public CZT A02;
    public final CT1 A03;
    public final InterfaceC30916DiT A04;
    public final InterfaceC30916DiT A05;
    public final InterfaceC30917DiU A06;
    public final InterfaceC30917DiU A07;
    public final Object A08;
    public final List A09;
    public final InterfaceC30785DgM A0A;
    public final InterfaceC30917DiU A0B;
    public final InterfaceC30917DiU A0C;

    public CWW(Object obj) {
        this.A08 = obj;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A09 = A1E;
        Integer num = C28365CfP.A0A;
        C14360o3.A08(num);
        this.A03 = new CT1(num);
        this.A07 = new C28878Com(obj, A1E, -2);
        this.A0B = new C28878Com(obj, A1E, 0);
        this.A05 = new C28877Col(obj, A1E, 0);
        this.A06 = new C28878Com(obj, A1E, -1);
        this.A0C = new C28878Com(obj, A1E, 1);
        this.A04 = new C28877Col(obj, A1E, 1);
        this.A0A = new C28875Coj(obj, A1E);
        DK4 dk4 = DK4.A00;
        this.A01 = new C28876Cok(dk4);
        this.A00 = new C28876Cok(dk4);
        this.A02 = CZT.A00;
    }

    public final void A00(CT1 ct1) {
        C14360o3.A0B(ct1, 0);
        A01(ct1.A03, ct1.A02);
    }

    public final void A01(CVH cvh, CVH cvh2) {
        boolean A1a = AbstractC167017dG.A1a(cvh, cvh2);
        this.A07.ChD(cvh, 0.0f, 0.0f);
        this.A06.ChD(cvh2, 0.0f, 0.0f);
        this.A09.add(new DHM(this, 0.5f, A1a ? 1 : 0));
    }

    public final void A02(InterfaceC65600Tnp interfaceC65600Tnp) {
        this.A00 = interfaceC65600Tnp;
        this.A09.add(new C65076Td9(9, this, interfaceC65600Tnp));
    }

    public final void A03(InterfaceC65600Tnp interfaceC65600Tnp) {
        this.A01 = interfaceC65600Tnp;
        this.A09.add(new C65076Td9(10, this, interfaceC65600Tnp));
    }
}
