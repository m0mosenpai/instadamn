package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;

/* renamed from: X.Aa3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23430Aa3 implements InterfaceC178157vo {
    public final /* synthetic */ AWB A00;
    public final /* synthetic */ C23324AVj A01;

    @Override // X.InterfaceC178157vo
    public final void ChI(InterfaceC178207vu interfaceC178207vu, C178637wb c178637wb) {
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC178207vu, c178637wb);
        c178637wb.A00(new C179907yg(this.A00, interfaceC178207vu));
        c178637wb.A00(InterfaceC178207vu.A01(interfaceC178207vu));
        c178637wb.A00(new C9X3(interfaceC178207vu));
        c178637wb.A00(new C179587y8(interfaceC178207vu));
        c178637wb.A00(new C180007yq(interfaceC178207vu));
        c178637wb.A00(new C179987yo(interfaceC178207vu));
        c178637wb.A00(new C178797wr(interfaceC178207vu));
        c178637wb.A00(new C178727wk(interfaceC178207vu, false, A1R));
        C175607ra.A01(new C175557rV(interfaceC178207vu), interfaceC178207vu, c178637wb);
        c178637wb.A00(new C211499Wy(interfaceC178207vu));
        C23324AVj c23324AVj = this.A01;
        c23324AVj.A02 = interfaceC178207vu;
        c178637wb.A00(new C211509Wz(c23324AVj, interfaceC178207vu));
        c178637wb.A00(c23324AVj);
        c178637wb.A00(new C9X1(interfaceC178207vu));
        c178637wb.A00(new C180197z9(interfaceC178207vu));
        c178637wb.A00(new ComponentCallbacks2C179637yD(interfaceC178207vu));
    }

    @Override // X.InterfaceC178157vo
    public final /* synthetic */ void ChK(InterfaceC178207vu interfaceC178207vu, C179757yP c179757yP) {
    }

    public C23430Aa3(AWB awb, C23324AVj c23324AVj) {
        this.A00 = awb;
        this.A01 = c23324AVj;
    }

    @Override // X.InterfaceC178157vo
    public final void ChJ(InterfaceC178207vu interfaceC178207vu, C179677yH c179677yH) {
        AbstractC167017dG.A1N(interfaceC178207vu, c179677yH);
        c179677yH.A00(new AbstractC179687yI(interfaceC178207vu));
    }

    @Override // X.InterfaceC178157vo
    public final void ChL(InterfaceC178207vu interfaceC178207vu, C179787yS c179787yS) {
        AbstractC167017dG.A1N(interfaceC178207vu, c179787yS);
        c179787yS.A00(new BasicCameraOutputController(interfaceC178207vu));
    }

    @Override // X.InterfaceC178157vo
    public final void ChM(InterfaceC178207vu interfaceC178207vu, C178257vz c178257vz) {
        AbstractC167017dG.A1N(interfaceC178207vu, c178257vz);
        C178267w0 c178267w0 = new C178267w0(interfaceC178207vu);
        c178257vz.A02.put(InterfaceC178297w3.A00, c178267w0);
        c178257vz.A01.add(c178267w0);
    }
}
