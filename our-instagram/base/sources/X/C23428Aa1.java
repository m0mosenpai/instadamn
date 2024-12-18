package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController;

/* renamed from: X.Aa1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23428Aa1 implements InterfaceC178157vo {
    public final /* synthetic */ C178027vb A00;

    @Override // X.InterfaceC178157vo
    public final void ChI(InterfaceC178207vu interfaceC178207vu, C178637wb c178637wb) {
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC178207vu, c178637wb);
        c178637wb.A00(InterfaceC178207vu.A01(interfaceC178207vu));
        c178637wb.A00(new C180157z5(interfaceC178207vu));
        c178637wb.A00(new C178687wg(interfaceC178207vu));
        c178637wb.A00(new C178727wk(interfaceC178207vu, A1R, false));
        c178637wb.A00(new C175557rV(interfaceC178207vu));
        C175607ra.A01(new C178797wr(interfaceC178207vu), interfaceC178207vu, c178637wb);
        c178637wb.A00(new C179557y5(interfaceC178207vu));
        C178027vb c178027vb = this.A00;
        if (AbstractC166997dE.A1Z(c178027vb.A00.get(InterfaceC175747ro.A01), A1R)) {
            c178637wb.A00(new C212349b3(interfaceC178207vu));
        }
        c178637wb.A00(new ComponentCallbacks2C179637yD(interfaceC178207vu));
    }

    @Override // X.InterfaceC178157vo
    public final /* synthetic */ void ChM(InterfaceC178207vu interfaceC178207vu, C178257vz c178257vz) {
    }

    public C23428Aa1(C178027vb c178027vb) {
        this.A00 = c178027vb;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.8mh, X.7yI] */
    @Override // X.InterfaceC178157vo
    public final void ChJ(InterfaceC178207vu interfaceC178207vu, C179677yH c179677yH) {
        AbstractC179687yI abstractC179687yI;
        boolean A1a = AbstractC167017dG.A1a(interfaceC178207vu, c179677yH);
        C178027vb c178027vb = this.A00;
        if (AbstractC166997dE.A1Z(c178027vb.A00.get(InterfaceC175747ro.A01), A1a)) {
            ?? abstractC179687yI2 = new AbstractC179687yI(interfaceC178207vu);
            abstractC179687yI2.A01 = EnumC222819sM.A03;
            abstractC179687yI = abstractC179687yI2;
        } else {
            abstractC179687yI = new AbstractC179687yI(interfaceC178207vu);
        }
        c179677yH.A00(abstractC179687yI);
        c179677yH.A00(new AbstractC179687yI(interfaceC178207vu));
        c179677yH.A00(new C179717yL(interfaceC178207vu));
    }

    @Override // X.InterfaceC178157vo
    public final void ChK(InterfaceC178207vu interfaceC178207vu, C179757yP c179757yP) {
        AbstractC167017dG.A1N(interfaceC178207vu, c179757yP);
        c179757yP.A00(new C179767yQ(interfaceC178207vu));
        c179757yP.A00(new AbstractC179777yR(interfaceC178207vu));
    }

    @Override // X.InterfaceC178157vo
    public final void ChL(InterfaceC178207vu interfaceC178207vu, C179787yS c179787yS) {
        AbstractC167017dG.A1N(interfaceC178207vu, c179787yS);
        c179787yS.A00(new AbstractC179807yU(interfaceC178207vu));
        c179787yS.A00(new BasicCameraOutputController(interfaceC178207vu));
        c179787yS.A00(new BasicTouchGestureOutputController(interfaceC178207vu));
        c179787yS.A00(new C180107z0(interfaceC178207vu));
        c179787yS.A00(new AbstractC179807yU(interfaceC178207vu));
    }
}
