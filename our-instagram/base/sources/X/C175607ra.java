package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.7ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175607ra extends AbstractC178657wd implements InterfaceC178057ve {
    public final C179107xM A00;

    public C175607ra(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        C178037vc c178037vc = InterfaceC178137vm.A00;
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178657wd) this).A00;
        C179107xM c179107xM = (C179107xM) interfaceC178207vu2.AqG(c178037vc);
        if (c179107xM == null) {
            Handler A00 = AbstractC178767wo.A00(interfaceC178207vu);
            Context context = interfaceC178207vu2.getContext();
            InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) interfaceC178207vu2.Aq1(InterfaceC178297w3.A00);
            InterfaceC178407wE interfaceC178407wE = (InterfaceC178407wE) interfaceC178207vu2.Aq1(InterfaceC178407wE.A00);
            C14360o3.A0B(context, 1);
            C14360o3.A0B(interfaceC178297w3, 2);
            C14360o3.A0B(interfaceC178407wE, 3);
            Object AqG = interfaceC178207vu2.AqG(InterfaceC178057ve.A00);
            this.A00 = AbstractC179127xO.A00(context, A00, null, null, interfaceC178407wE, interfaceC178297w3, true, false, false, false, true, false, false, ((Boolean) (AqG != null ? AqG : false)).booleanValue());
        } else {
            InterfaceC178407wE interfaceC178407wE2 = (InterfaceC178407wE) interfaceC178207vu2.Aq1(InterfaceC178407wE.A00);
            if (interfaceC178407wE2 != null) {
                c179107xM.A05 = interfaceC178407wE2;
            }
            this.A00 = c179107xM;
        }
        C178037vc c178037vc2 = InterfaceC178137vm.A01;
        Object valueOf = Float.valueOf(1.0f);
        Object AqG2 = interfaceC178207vu2.AqG(c178037vc2);
        float floatValue = ((Number) (AqG2 != null ? AqG2 : valueOf)).floatValue();
        if (floatValue != 0.0f) {
            C179107xM c179107xM2 = this.A00;
            if (floatValue == 0.0f) {
                c179107xM2.A0N.A00(EnumC200658u8.A0R);
            }
            c179107xM2.A00 = floatValue;
            C179157xR c179157xR = c179107xM2.A0M;
            if (floatValue == 0.0f) {
                c179157xR.A05.A00(EnumC200658u8.A0S);
            }
            c179157xR.A00 = floatValue;
            return;
        }
        throw new IllegalStateException("scaleFactor cannot be 0");
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC178057ve.A01;
    }

    @Override // X.InterfaceC178057ve
    public final InterfaceC179077xJ BQo() {
        return this.A00;
    }

    public static C178087vh A00(C23385AYj c23385AYj, InterfaceC178067vf interfaceC178067vf, C178087vh c178087vh) {
        c23385AYj.A01(interfaceC178067vf, c178087vh);
        c23385AYj.A01(new C175607ra(c23385AYj), InterfaceC178057ve.A01);
        C178087vh c178087vh2 = InterfaceC179497xz.A01;
        c23385AYj.A01(new C179487xy(c23385AYj), c178087vh2);
        return c178087vh2;
    }

    public static void A01(InterfaceC178067vf interfaceC178067vf, InterfaceC178207vu interfaceC178207vu, C178637wb c178637wb) {
        c178637wb.A00(interfaceC178067vf);
        c178637wb.A00(new C175607ra(interfaceC178207vu));
        c178637wb.A00(new C179487xy(interfaceC178207vu));
    }
}
