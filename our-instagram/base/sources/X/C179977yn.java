package X;

import android.os.Handler;
import java.io.File;

/* renamed from: X.7yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179977yn extends AbstractC178807ws implements InterfaceC178737wl, InterfaceC179967ym {
    public AML A00;
    public InterfaceC179867yc A01;
    public C176507t8 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final C22811A4e A08;
    public final InterfaceC178677wf A09;
    public final InterfaceC175597rZ A0A;
    public final C1814082s A0B;
    public final C178747wm A0C;

    @Override // X.InterfaceC178737wl
    public final void AQb(Runnable runnable) {
    }

    @Override // X.InterfaceC178737wl
    public final boolean ECL() {
        return false;
    }

    @Override // X.InterfaceC178737wl
    public final /* synthetic */ void EaB(C176377su c176377su, Object obj) {
    }

    @Override // X.InterfaceC178737wl
    public final /* synthetic */ void EbX(C176307sn c176307sn) {
    }

    @Override // X.InterfaceC178737wl
    public final void A9p(C176507t8 c176507t8) {
        this.A00.A02.BQq().A8h(new C176517t9(this.A0C, c176507t8), 0);
    }

    @Override // X.InterfaceC178737wl
    public final void AAS(InterfaceC175477rN interfaceC175477rN) {
        if (this.A0B.A01(interfaceC175477rN)) {
            AML aml = this.A00;
            int i = aml.A01;
            int i2 = aml.A00;
            if (i > 0 && i2 > 0) {
                interfaceC175477rN.DX9(i, i2, 0, 0, this.A03);
            }
        }
    }

    @Override // X.InterfaceC178737wl
    public final InterfaceC175497rP C4Q() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC178737wl
    public final boolean CLt() {
        return this.A00.A02.CLu();
    }

    @Override // X.InterfaceC178737wl
    public final void EG3(C176507t8 c176507t8) {
        this.A00.A02.BQq().EFO(0, c176507t8);
    }

    @Override // X.InterfaceC178737wl
    public final void EGM(InterfaceC175477rN interfaceC175477rN) {
        this.A0B.A02(interfaceC175477rN);
    }

    @Override // X.InterfaceC179967ym
    public final void ERv(Integer num) {
        this.A00.A03 = num;
    }

    @Override // X.InterfaceC179967ym
    public final void ERw(Integer num) {
        this.A00.A04 = num;
    }

    @Override // X.InterfaceC179967ym
    public final void EaO(int i, int i2) {
        AML aml = this.A00;
        if (AML.A03(aml)) {
            aml.A01 = i;
            aml.A00 = i2;
        } else {
            aml.A06.post(new RunnableC24727AxB(aml, i, i2));
        }
    }

    @Override // X.InterfaceC178737wl
    public final void EbN(boolean z) {
        C176507t8 c176507t8 = this.A02;
        if (c176507t8 != null) {
            c176507t8.A0D = z;
        }
    }

    @Override // X.InterfaceC178737wl
    public final void Egy(InterfaceC176297sm interfaceC176297sm) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC179967ym
    public final void Epv(C22814A4h c22814A4h, File file, boolean z) {
        boolean z2 = false;
        if (this.A0A == null) {
            z2 = true;
        }
        this.A00.A04(c22814A4h, z2);
    }

    public C179977yn(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        this.A0B = new C1814082s();
        this.A08 = new C22811A4e(this);
        this.A09 = new AZX(this);
        C178747wm c178747wm = (C178747wm) A09(InterfaceC178107vj.A00, new C178747wm());
        this.A0C = c178747wm;
        Handler handler = (Handler) interfaceC178207vu.AqG(InterfaceC178107vj.A0I);
        if (handler == null) {
            C178307w4 c178307w4 = InterfaceC178297w3.A00;
            InterfaceC178207vu interfaceC178207vu2 = super.A00;
            interfaceC178207vu2.getClass();
            handler = ((InterfaceC178297w3) interfaceC178207vu2.Aq1(c178307w4)).BAu("Lite-SurfacePipe-Thread");
        }
        this.A07 = handler;
        boolean booleanValue = ((Boolean) A09(BE0.A02, false)).booleanValue();
        this.A03 = booleanValue;
        this.A00 = new AML(handler, interfaceC178207vu, c178747wm, booleanValue);
        if (((Boolean) A09(BE0.A00, false)).booleanValue()) {
            C72094XNo c72094XNo = new C72094XNo(handler);
            this.A0A = c72094XNo;
            c72094XNo.EfS(30);
        }
        this.A06 = ((Boolean) A09(BE0.A01, false)).booleanValue();
    }
}
