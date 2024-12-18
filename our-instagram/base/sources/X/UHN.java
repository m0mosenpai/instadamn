package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHN extends C1I4 {
    public final C6FG A00;
    public final C102884kP A01;
    public final InterfaceC103384lE A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UHN)) {
            return false;
        }
        UHN uhn = (UHN) obj;
        return uhn.A02 == this.A02 && uhn.A01.A03(53, 0) == this.A01.A03(53, 0);
    }

    public UHN(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c102884kP;
        this.A02 = interfaceC103384lE;
        this.A00 = c6fg;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        String str;
        int A03 = C0f9.A03(-189203120);
        C102884kP c102884kP = this.A01;
        int A032 = c102884kP.A03(53, 0);
        if (A032 != 0) {
            if (recyclerView.canScrollVertically(A032)) {
                str = "can_scroll";
            } else {
                str = "cannot_scroll";
            }
            C6FX c6fx = new C6FX();
            c6fx.A03(str, 0);
            C6FG c6fg = this.A00;
            c6fx.A02(c6fg);
            C6FP.A03(c6fg, c102884kP, c6fx.A00(), this.A02);
        }
        C0f9.A0A(1451509297, A03);
    }
}
