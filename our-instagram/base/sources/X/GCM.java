package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* loaded from: classes6.dex */
public final class GCM implements InterfaceC55172gH {
    public final int A00;
    public final Object A01;

    public GCM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // X.InterfaceC55172gH
    public final void D0F(C4NL c4nl) {
        C64752wZ c64752wZ;
        QuickPromotionSlot quickPromotionSlot;
        InterfaceC16820sZ c37018GSz;
        UserSession A0r;
        Fragment fragment;
        int i = this.A00;
        C14360o3.A0B(c4nl, 0);
        switch (i) {
            case 0:
                C32314ELd c32314ELd = (C32314ELd) this.A01;
                c64752wZ = c32314ELd.A13;
                quickPromotionSlot = QuickPromotionSlot.A0N;
                c37018GSz = new C37018GSz(32, c32314ELd, c4nl);
                A0r = AbstractC166987dD.A0r(c32314ELd.A17);
                fragment = c32314ELd;
                c64752wZ.A00(fragment.requireActivity(), A0r, c4nl, quickPromotionSlot, c37018GSz);
                return;
            case 1:
                JR2 jr2 = (JR2) this.A01;
                c64752wZ = (C64752wZ) jr2.A2V.getValue();
                quickPromotionSlot = QuickPromotionSlot.A0J;
                c37018GSz = new C50170MDx(16, c4nl, jr2);
                A0r = jr2.A0p();
                fragment = jr2.A1L;
                c64752wZ.A00(fragment.requireActivity(), A0r, c4nl, quickPromotionSlot, c37018GSz);
                return;
            default:
                JR3 jr3 = (JR3) this.A01;
                c64752wZ = jr3.A0B;
                if (c64752wZ != null) {
                    quickPromotionSlot = QuickPromotionSlot.A0J;
                    c37018GSz = new C50170MDx(23, c4nl, jr3);
                    A0r = JR3.A01(jr3);
                    fragment = jr3;
                    c64752wZ.A00(fragment.requireActivity(), A0r, c4nl, quickPromotionSlot, c37018GSz);
                    return;
                }
                return;
        }
    }
}
