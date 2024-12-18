package X;

/* renamed from: X.In3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42217In3 implements InterfaceC24551Hy {
    public boolean A00;
    public final /* synthetic */ C1IA A01;
    public final /* synthetic */ InterfaceC23511Cn A02;
    public final /* synthetic */ C11Q A03;
    public final /* synthetic */ InterfaceC24551Hy A04;
    public final /* synthetic */ InterfaceC24551Hy A05;
    public final /* synthetic */ C24531Hw A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVR() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DgK() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    public C42217In3(C1IA c1ia, InterfaceC23511Cn interfaceC23511Cn, C11Q c11q, InterfaceC24551Hy interfaceC24551Hy, InterfaceC24551Hy interfaceC24551Hy2, C24531Hw c24531Hw, String str, boolean z) {
        this.A03 = c11q;
        this.A01 = c1ia;
        this.A07 = str;
        this.A04 = interfaceC24551Hy;
        this.A06 = c24531Hw;
        this.A08 = z;
        this.A05 = interfaceC24551Hy2;
        this.A02 = interfaceC23511Cn;
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        InterfaceC55612h1 interfaceC55612h1 = (InterfaceC55612h1) interfaceC40801un;
        boolean A1b = AbstractC25233BEq.A1b(interfaceC26451Qa, c3jx, interfaceC55612h1);
        if (interfaceC55612h1.Ajf() == -1) {
            C0w9.A03("IgApiPrefetchStreamingScheduler", "invalid cache responseObject");
        }
        this.A01.A00.put(this.A07, new C62292sU(this.A03, interfaceC55612h1.Ajf()));
        if (!this.A00) {
            this.A00 = A1b;
        }
        InterfaceC24551Hy interfaceC24551Hy = this.A04;
        if (interfaceC24551Hy != null) {
            interfaceC24551Hy.DVQ(interfaceC55612h1, interfaceC26451Qa, c3jx);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final void Dg4() {
        InterfaceC24551Hy interfaceC24551Hy = this.A04;
        if (interfaceC24551Hy != null) {
            interfaceC24551Hy.Dg4();
        }
    }

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        AbstractC167017dG.A1N(interfaceC26451Qa, abstractC115105If);
        C24531Hw c24531Hw = this.A06;
        if (c24531Hw != null && (!this.A08 || this.A01.A02())) {
            C1IA c1ia = this.A01;
            String str = this.A07;
            C1IA.A01(c1ia, this.A02, this.A05, this.A04, c24531Hw, str);
        }
        InterfaceC24551Hy interfaceC24551Hy = this.A04;
        if (interfaceC24551Hy != null) {
            interfaceC24551Hy.DFq(abstractC115105If, interfaceC26451Qa);
        }
    }
}
