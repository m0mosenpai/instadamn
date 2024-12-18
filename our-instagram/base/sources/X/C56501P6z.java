package X;

import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.P6z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56501P6z implements InterfaceC55172gH {
    public final /* synthetic */ NewsfeedFragment A00;
    public final /* synthetic */ C64752wZ A01;

    public C56501P6z(NewsfeedFragment newsfeedFragment, C64752wZ c64752wZ) {
        this.A01 = c64752wZ;
        this.A00 = newsfeedFragment;
    }

    @Override // X.InterfaceC55172gH
    public final void D0F(C4NL c4nl) {
        C14360o3.A0B(c4nl, 0);
        C64752wZ c64752wZ = this.A01;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A05;
        NewsfeedFragment newsfeedFragment = this.A00;
        C57531Pg5 A00 = C57531Pg5.A00(c4nl, newsfeedFragment, 42);
        c64752wZ.A00(newsfeedFragment.requireActivity(), AbstractC166987dD.A0r(newsfeedFragment.A0A), c4nl, quickPromotionSlot, A00);
    }
}
