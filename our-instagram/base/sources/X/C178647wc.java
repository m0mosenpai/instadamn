package X;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import java.util.Map;

/* renamed from: X.7wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178647wc extends AbstractC178657wd implements InterfaceC178667we {
    public boolean A00;
    public final InterfaceC178677wf A01;
    public final C175007qa A02;
    public final InterfaceC174927qS A03;
    public final InterfaceC174967qW A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.7q2] */
    public static C174647py A00(InterfaceC174637px interfaceC174637px) {
        InterfaceC174637px interfaceC174637px2 = interfaceC174637px;
        Map map = C174647py.A01;
        EnumC174667q0 enumC174667q0 = EnumC174667q0.HIGH;
        if (interfaceC174637px == null) {
            interfaceC174637px2 = new Object();
        }
        C174647py c174647py = new C174647py(new Object(), enumC174667q0, enumC174667q0, interfaceC174637px2, false, false, false);
        c174647py.A00(InterfaceC174657pz.A06, true);
        return c174647py;
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        Looper mainLooper;
        C178087vh c178087vh = InterfaceC179867yc.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) this).A00;
        if (interfaceC178207vu.CRY(c178087vh)) {
            ((InterfaceC179867yc) A0A(c178087vh)).A9y(this.A01);
        } else {
            View view = (View) interfaceC178207vu.AqG(AbstractC174817qH.A03);
            if (view == null) {
                view = (View) A0B(AbstractC174817qH.A02);
            }
            this.A03.Eh1(view);
        }
        InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) interfaceC178207vu.Aq1(InterfaceC178297w3.A00);
        InterfaceC178337w7 interfaceC178337w7 = (InterfaceC178337w7) interfaceC178207vu.Aq1(InterfaceC178337w7.A00);
        InterfaceC178407wE interfaceC178407wE = (InterfaceC178407wE) interfaceC178207vu.Aq1(InterfaceC178407wE.A00);
        if (interfaceC178337w7.CUZ(110)) {
            mainLooper = interfaceC178297w3.BAu("Lite-Controller-Thread").getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A02.A09 = new C175857rz(interfaceC178407wE, new HandlerC174707q5(mainLooper));
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC178667we.A00;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.7qY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.7qZ, java.lang.Object] */
    public C178647wc(InterfaceC178207vu interfaceC178207vu, InterfaceC174927qS interfaceC174927qS) {
        super(interfaceC178207vu);
        this.A04 = new InterfaceC174967qW() { // from class: X.7qV
            @Override // X.InterfaceC174967qW
            public final /* synthetic */ void D6q(C177447ue c177447ue, C175007qa c175007qa) {
            }

            @Override // X.InterfaceC174967qW
            public final /* synthetic */ void D7C(C175007qa c175007qa, Exception exc) {
            }

            @Override // X.InterfaceC174967qW
            public final /* synthetic */ void D7E(C175007qa c175007qa, String str, String str2) {
            }

            @Override // X.InterfaceC174967qW
            public final void D76(C177447ue c177447ue, C175007qa c175007qa) {
                C178647wc.this.A00 = true;
            }

            @Override // X.InterfaceC174967qW
            public final void DAc(C175007qa c175007qa) {
                C178647wc c178647wc = C178647wc.this;
                c178647wc.A00 = false;
                C175007qa c175007qa2 = c178647wc.A02;
                hashCode();
                c175007qa2.A0M.A02(this);
            }

            @Override // X.InterfaceC174967qW
            public final void DAd(C175007qa c175007qa, Exception exc) {
                C178647wc c178647wc = C178647wc.this;
                c178647wc.A00 = false;
                C175007qa c175007qa2 = c178647wc.A02;
                hashCode();
                c175007qa2.A0M.A02(this);
            }
        };
        this.A01 = new InterfaceC178677wf() { // from class: X.7qX
            @Override // X.InterfaceC178677wf
            public final void Dah(C176507t8 c176507t8) {
            }

            @Override // X.InterfaceC178677wf
            public final void Dai(C176507t8 c176507t8) {
            }

            @Override // X.InterfaceC178677wf
            public final void Daj(C176507t8 c176507t8, int i, int i2) {
                C178647wc.this.A03.ER0(i, i2);
            }

            @Override // X.InterfaceC178677wf
            public final void Dan(View view) {
                if (view != null) {
                    C178647wc.this.A03.Eh1(view);
                }
            }
        };
        this.A03 = interfaceC174927qS;
        Context context = interfaceC178207vu.getContext();
        ?? obj = new Object();
        String str = (String) A0B(C178027vb.A02);
        EnumC177227uI enumC177227uI = (EnumC177227uI) ((AbstractC178657wd) this).A00.AqG(AbstractC174817qH.A00);
        EnumC174667q0 enumC174667q0 = EnumC174667q0.HIGH;
        this.A02 = new C175007qa(context, enumC177227uI, enumC174667q0, enumC174667q0, interfaceC174927qS, obj, new Object(), str, 0, false, false);
    }
}
