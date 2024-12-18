package X;

import android.os.Handler;

/* renamed from: X.7yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180037yt extends AbstractC178657wd implements InterfaceC179947yk, InterfaceC180047yu {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC178817wt A04;
    public BEL A05;
    public InterfaceC178737wl A06;
    public Integer A07;
    public InterfaceC180017yr A08;
    public final Handler A09;
    public final InterfaceC176007sJ A0A;
    public final C23467Aae A0B;
    public final InterfaceC175477rN A0C;
    public final InterfaceC178337w7 A0D;
    public final AGu A0E;
    public final InterfaceC176037sM A0F;
    public final InterfaceC176007sJ A0G;

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A05 = (BEL) A0A(BEL.A00);
        C178087vh c178087vh = InterfaceC180017yr.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) this).A00;
        if (interfaceC178207vu.CRY(c178087vh)) {
            this.A08 = (InterfaceC180017yr) A0A(c178087vh);
        }
        C178087vh c178087vh2 = InterfaceC178737wl.A00;
        if (interfaceC178207vu.CRY(c178087vh2)) {
            InterfaceC178737wl interfaceC178737wl = (InterfaceC178737wl) A0A(c178087vh2);
            this.A06 = interfaceC178737wl;
            interfaceC178737wl.AAS(this.A0C);
            this.A06.Egy(this.A0B);
        } else {
            Object obj = this.A08;
            if (obj != null) {
                C23467Aae c23467Aae = this.A0B;
                InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) obj).A00;
                interfaceC178207vu2.getClass();
                ((InterfaceC178737wl) interfaceC178207vu2.Aq0(c178087vh2)).Egy(c23467Aae);
            }
        }
        C178087vh c178087vh3 = InterfaceC178817wt.A01;
        if (interfaceC178207vu.CRY(c178087vh3)) {
            this.A04 = (InterfaceC178817wt) A0A(c178087vh3);
        }
        this.A07 = C05F.A00;
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC179947yk.A00;
    }

    public C180037yt(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        InterfaceC178337w7 interfaceC178337w7;
        this.A0C = new C23407AZg(this);
        this.A0A = new AVL(this);
        this.A0G = new AVM(this);
        C178307w4 c178307w4 = InterfaceC178337w7.A00;
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178657wd) this).A00;
        if (interfaceC178207vu2.CRZ(c178307w4)) {
            interfaceC178337w7 = (InterfaceC178337w7) interfaceC178207vu2.Aq1(c178307w4);
        } else {
            interfaceC178337w7 = null;
        }
        this.A0D = interfaceC178337w7;
        C178307w4 c178307w42 = InterfaceC178407wE.A00;
        InterfaceC178407wE interfaceC178407wE = interfaceC178207vu2.CRZ(c178307w42) ? (InterfaceC178407wE) interfaceC178207vu2.Aq1(c178307w42) : null;
        this.A09 = ((InterfaceC178297w3) interfaceC178207vu2.Aq1(InterfaceC178297w3.A00)).BAu("Lite-Controller-Thread");
        this.A0B = new C23467Aae(this);
        this.A0E = (AGu) interfaceC178207vu2.AqG(InterfaceC180047yu.A01);
        this.A0F = new C176027sL(interfaceC178407wE);
    }
}
