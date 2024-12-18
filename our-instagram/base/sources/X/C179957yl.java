package X;

import android.os.Handler;
import java.io.File;

/* renamed from: X.7yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179957yl extends AbstractC178807ws implements InterfaceC179967ym {
    public final AML A00;

    @Override // X.InterfaceC179967ym
    public final void ERw(Integer num) {
        C14360o3.A0B(num, 0);
        this.A00.A04 = num;
    }

    @Override // X.InterfaceC179967ym
    public final void ERv(Integer num) {
        this.A00.A03 = num;
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

    @Override // X.InterfaceC179967ym
    public final void Epv(C22814A4h c22814A4h, File file, boolean z) {
        this.A00.A04(c22814A4h, true);
    }

    public C179957yl(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        C178747wm c178747wm = (C178747wm) A09(InterfaceC178107vj.A00, new C178747wm());
        Handler handler = (Handler) interfaceC178207vu.AqG(InterfaceC178107vj.A0I);
        if (handler == null) {
            C178307w4 c178307w4 = InterfaceC178297w3.A00;
            InterfaceC178207vu interfaceC178207vu2 = super.A00;
            interfaceC178207vu2.getClass();
            handler = ((InterfaceC178297w3) interfaceC178207vu2.Aq1(c178307w4)).BAu("Lite-SurfacePipe-Thread");
        }
        this.A00 = new AML(handler, interfaceC178207vu, c178747wm, ((Boolean) A09(BE0.A02, false)).booleanValue());
    }
}
