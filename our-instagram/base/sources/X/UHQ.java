package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHQ extends C1I4 {
    public int A00 = -1;
    public boolean A01;
    public final AbstractC61802rh A02;
    public final C6FG A03;
    public final C102884kP A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UHQ uhq = (UHQ) obj;
            return this.A02 == uhq.A02 && this.A04.A04 == uhq.A04.A04;
        }
        return false;
    }

    public static void A00(C6FG c6fg, C102884kP c102884kP, int i, boolean z) {
        C6FX c6fx;
        InterfaceC103384lE A0B = c102884kP.A0B(97);
        if (A0B != null) {
            c6fx = new C6FX();
            c6fx.A01(Integer.valueOf(i));
            c6fx.A02(Boolean.valueOf(z));
            c6fx.A03(c6fg, 2);
        } else {
            A0B = c102884kP.A0B(51);
            if (A0B == null) {
                return;
            }
            c6fx = new C6FX();
            c6fx.A01(Integer.valueOf(i));
            c6fx.A02(c6fg);
        }
        AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, A0B);
    }

    public final int hashCode() {
        return (this.A02.hashCode() * 31) + this.A04.A04;
    }

    public UHQ(AbstractC61802rh abstractC61802rh, C6FG c6fg, C102884kP c102884kP) {
        this.A03 = c6fg;
        this.A04 = c102884kP;
        this.A02 = abstractC61802rh;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        AbstractC70663Fe abstractC70663Fe;
        View A03;
        int A02;
        int A032 = C0f9.A03(1016989187);
        boolean z = true;
        if (i != 1) {
            if (i == 0 && (abstractC70663Fe = recyclerView.A0D) != null && (A03 = this.A02.A03(abstractC70663Fe)) != null && ((A02 = RecyclerView.A02(A03)) != this.A00 || this.A01)) {
                A00(this.A03, this.A04, A02, this.A01);
                this.A00 = A02;
                z = false;
            }
            C0f9.A0A(623014885, A032);
        }
        this.A01 = z;
        C0f9.A0A(623014885, A032);
    }
}
