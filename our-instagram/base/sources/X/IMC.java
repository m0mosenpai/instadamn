package X;

import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class IMC {
    public final InterfaceC103384lE A00;
    public final InterfaceC103384lE A01;
    public final InterfaceC103384lE A02;
    public final InterfaceC103384lE A03;
    public final WeakReference A04;
    public final WeakReference A05;

    public final void A00(boolean z, boolean z2) {
        InterfaceC103384lE interfaceC103384lE;
        C102884kP c102884kP = (C102884kP) this.A05.get();
        C6FG c6fg = (C6FG) this.A04.get();
        if (z) {
            if (z2) {
                interfaceC103384lE = this.A01;
            } else {
                interfaceC103384lE = this.A00;
            }
        } else if (z2) {
            interfaceC103384lE = this.A03;
        } else {
            interfaceC103384lE = this.A02;
        }
        if (interfaceC103384lE != null && c102884kP != null && c6fg != null) {
            AbstractC37304Gc5.A1O(c6fg, c102884kP, interfaceC103384lE);
        }
    }

    public IMC(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, InterfaceC103384lE interfaceC103384lE3, InterfaceC103384lE interfaceC103384lE4) {
        WeakReference A16 = AbstractC25225BEi.A16(c102884kP);
        WeakReference A162 = AbstractC25225BEi.A16(c6fg);
        this.A05 = A16;
        this.A04 = A162;
        this.A01 = interfaceC103384lE;
        this.A00 = interfaceC103384lE2;
        this.A03 = interfaceC103384lE3;
        this.A02 = interfaceC103384lE4;
    }
}
