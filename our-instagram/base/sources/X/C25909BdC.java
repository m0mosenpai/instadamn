package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.BdC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25909BdC extends C1I4 {
    public final C6FG A00;
    public final C102884kP A01;
    public final InterfaceC103384lE A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25909BdC)) {
            return false;
        }
        C25909BdC c25909BdC = (C25909BdC) obj;
        return c25909BdC.A02 == this.A02 && c25909BdC.A01 == this.A01;
    }

    public C25909BdC(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c102884kP;
        this.A00 = c6fg;
        this.A02 = interfaceC103384lE;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int A03 = C0f9.A03(84679385);
        if (i == 0 && i2 == 0) {
            i3 = 2103881540;
        } else {
            C102884kP c102884kP = this.A01;
            InterfaceC103384lE interfaceC103384lE = this.A02;
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A01(c102884kP);
            C6FP.A03(this.A00, c102884kP, A0s.A00(), interfaceC103384lE);
            i3 = -1058710327;
        }
        C0f9.A0A(i3, A03);
    }
}
