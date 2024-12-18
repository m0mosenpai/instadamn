package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.Dvn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31682Dvn implements InterfaceC55172gH {
    public final /* synthetic */ C38P A00;

    public C31682Dvn(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC55172gH
    public final void D0F(C4NL c4nl) {
        C14360o3.A0B(c4nl, 0);
        C38P c38p = this.A00;
        if (c38p.isAdded()) {
            C64752wZ c64752wZ = (C64752wZ) c38p.A0x.getValue();
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0R;
            C50171MDy c50171MDy = new C50171MDy(21, c4nl, c38p);
            c64752wZ.A00(c38p.requireActivity(), c38p.getSession(), c4nl, quickPromotionSlot, c50171MDy);
        }
    }
}
