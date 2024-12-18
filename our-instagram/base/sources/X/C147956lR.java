package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.6lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147956lR implements InterfaceC55932he {
    public int A00;
    public boolean A01;
    public final C55982hj A02;
    public final InterfaceC147266kB A03;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        InterfaceC147266kB interfaceC147266kB = this.A03;
        if (interfaceC147266kB != null) {
            View A0D = ((C147256kA) interfaceC147266kB).A04.A0D(this.A00);
            if (A0D != null && (A0D.getTag() instanceof InterfaceC143626e2)) {
                InterfaceC143626e2 interfaceC143626e2 = (InterfaceC143626e2) A0D.getTag();
                C14360o3.A0A(interfaceC143626e2);
                interfaceC143626e2.ERN(f);
            }
        }
    }

    public final void A00() {
        InterfaceC147266kB interfaceC147266kB = this.A03;
        if (interfaceC147266kB != null) {
            ReboundViewPager reboundViewPager = ((C147256kA) interfaceC147266kB).A04;
            int i = reboundViewPager.A08;
            this.A00 = i;
            View A0D = reboundViewPager.A0D(i);
            if (A0D != null && (A0D.getTag() instanceof InterfaceC143626e2)) {
                C14360o3.A0A(A0D.getTag());
            }
            this.A02.A06(0.0d);
        }
    }

    public final boolean A01() {
        C55982hj c55982hj = this.A02;
        if (c55982hj.A09.A00 == 1.0d) {
            return false;
        }
        c55982hj.A06(1.0d);
        return true;
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        if (this.A02.A09.A00 == 1.0d) {
            this.A00 = -1;
            return;
        }
        InterfaceC147266kB interfaceC147266kB = this.A03;
        if (interfaceC147266kB == null) {
            return;
        }
        View A0D = ((C147256kA) interfaceC147266kB).A04.A0D(this.A00);
        if (A0D == null) {
            return;
        }
        if (A0D.getTag() instanceof C138376Ot) {
            C138376Ot c138376Ot = (C138376Ot) A0D.getTag();
            C14360o3.A0A(c138376Ot);
            c138376Ot.A0T.setVisibility(8);
        }
        if (!this.A01) {
            return;
        }
        if (A0D.getTag() instanceof InterfaceC143626e2) {
            C14360o3.A0A(A0D.getTag());
        }
        this.A01 = false;
    }

    public C147956lR(InterfaceC147266kB interfaceC147266kB) {
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A06 = true;
        this.A02 = A02;
        A02.A05(1.0d);
        this.A03 = interfaceC147266kB;
    }
}
