package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;

/* renamed from: X.Aa4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23431Aa4 implements InterfaceC178157vo {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AWC A01;
    public final /* synthetic */ C178027vb A02;
    public final /* synthetic */ InterfaceC174657pz A03;
    public final /* synthetic */ C23324AVj A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC178157vo
    public final void ChI(InterfaceC178207vu interfaceC178207vu, C178637wb c178637wb) {
        InterfaceC178067vf interfaceC178067vf;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC178207vu, c178637wb);
        if (this.A06) {
            InterfaceC174657pz interfaceC174657pz = this.A03;
            if (interfaceC174657pz != null) {
                InterfaceC25218BDs interfaceC25218BDs = this.A01.A00;
                C14360o3.A0A(interfaceC25218BDs);
                interfaceC25218BDs.ERx(AbstractC174897qP.A01, interfaceC174657pz);
            }
            c178637wb.A00(new C179907yg(this.A01, interfaceC178207vu));
            interfaceC178067vf = InterfaceC178207vu.A01(interfaceC178207vu);
        } else {
            C180027ys c180027ys = new C180027ys(interfaceC178207vu);
            c180027ys.EbP(this.A00);
            interfaceC178067vf = c180027ys;
        }
        c178637wb.A00(interfaceC178067vf);
        c178637wb.A00(new C180157z5(interfaceC178207vu));
        c178637wb.A00(new C178797wr(interfaceC178207vu));
        c178637wb.A00(new C178727wk(interfaceC178207vu, A1R, A1R));
        C175607ra.A01(new C180147z4(interfaceC178207vu, false), interfaceC178207vu, c178637wb);
        if (this.A05) {
            c178637wb.A00(new C9X1(interfaceC178207vu));
        }
        c178637wb.A00(new C211499Wy(interfaceC178207vu));
        C23324AVj c23324AVj = this.A04;
        c23324AVj.A02 = interfaceC178207vu;
        c178637wb.A00(new C9X0(c23324AVj, interfaceC178207vu));
        c178637wb.A00(c23324AVj);
        c178637wb.A00(new C179887ye(interfaceC178207vu));
        C178027vb c178027vb = this.A02;
        if (AbstractC166997dE.A1Z(c178027vb.A00.get(InterfaceC175747ro.A01), A1R)) {
            c178637wb.A00(new C212349b3(interfaceC178207vu));
        }
    }

    @Override // X.InterfaceC178157vo
    public final /* synthetic */ void ChK(InterfaceC178207vu interfaceC178207vu, C179757yP c179757yP) {
    }

    @Override // X.InterfaceC178157vo
    public final /* synthetic */ void ChM(InterfaceC178207vu interfaceC178207vu, C178257vz c178257vz) {
    }

    public C23431Aa4(AWC awc, C178027vb c178027vb, InterfaceC174657pz interfaceC174657pz, C23324AVj c23324AVj, int i, boolean z, boolean z2) {
        this.A02 = c178027vb;
        this.A06 = z;
        this.A03 = interfaceC174657pz;
        this.A01 = awc;
        this.A00 = i;
        this.A05 = z2;
        this.A04 = c23324AVj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.8mh, X.7yI] */
    @Override // X.InterfaceC178157vo
    public final void ChJ(InterfaceC178207vu interfaceC178207vu, C179677yH c179677yH) {
        AbstractC179687yI abstractC179687yI;
        boolean A1a = AbstractC167017dG.A1a(interfaceC178207vu, c179677yH);
        C178027vb c178027vb = this.A02;
        if (AbstractC166997dE.A1Z(c178027vb.A00.get(InterfaceC175747ro.A01), A1a)) {
            ?? abstractC179687yI2 = new AbstractC179687yI(interfaceC178207vu);
            abstractC179687yI2.A01 = EnumC222819sM.A03;
            abstractC179687yI = abstractC179687yI2;
        } else if (!this.A06) {
            return;
        } else {
            abstractC179687yI = new AbstractC179687yI(interfaceC178207vu);
        }
        c179677yH.A00(abstractC179687yI);
    }

    @Override // X.InterfaceC178157vo
    public final void ChL(InterfaceC178207vu interfaceC178207vu, C179787yS c179787yS) {
        AbstractC167017dG.A1N(interfaceC178207vu, c179787yS);
        if (this.A06) {
            c179787yS.A00(new BasicCameraOutputController(interfaceC178207vu));
        }
    }
}
