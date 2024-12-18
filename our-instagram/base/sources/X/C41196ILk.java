package X;

import java.lang.ref.WeakReference;

/* renamed from: X.ILk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41196ILk {
    public final InterfaceC103384lE A00;
    public final InterfaceC103384lE A01;
    public final WeakReference A02;
    public final WeakReference A03;

    public final void A00(boolean z) {
        InterfaceC103384lE interfaceC103384lE;
        C102884kP c102884kP = (C102884kP) this.A03.get();
        C6FG c6fg = (C6FG) this.A02.get();
        if (z) {
            interfaceC103384lE = this.A00;
        } else {
            interfaceC103384lE = this.A01;
        }
        if (interfaceC103384lE != null && c102884kP != null && c6fg != null) {
            AbstractC37304Gc5.A1O(c6fg, c102884kP, interfaceC103384lE);
        }
    }

    public C41196ILk(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2) {
        WeakReference A16 = AbstractC25225BEi.A16(c102884kP);
        WeakReference A162 = AbstractC25225BEi.A16(c6fg);
        this.A03 = A16;
        this.A02 = A162;
        this.A00 = interfaceC103384lE;
        this.A01 = interfaceC103384lE2;
    }
}
