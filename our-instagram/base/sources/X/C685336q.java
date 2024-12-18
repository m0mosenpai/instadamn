package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.36q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C685336q {
    public final UserSession A00;
    public final C64842wi A01;
    public final C64752wZ A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2wZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2fr, java.lang.Object] */
    public C685336q(final AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = userSession;
        AbstractC54912fq.A00();
        this.A02 = new Object();
        C27961Xa A00 = AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0Z;
        AbstractC54912fq.A00();
        ?? obj = new Object();
        obj.A00 = new InterfaceC55172gH() { // from class: X.36r
            @Override // X.InterfaceC55172gH
            public final void D0F(C4NL c4nl) {
                C14360o3.A0B(c4nl, 0);
                C685336q c685336q = C685336q.this;
                C64752wZ c64752wZ = c685336q.A02;
                QuickPromotionSlot quickPromotionSlot2 = QuickPromotionSlot.A0Z;
                MHV mhv = new MHV(12, c4nl, c685336q);
                UserSession userSession2 = c685336q.A00;
                FragmentActivity activity = abstractC59962oe.getActivity();
                C14360o3.A0C(activity, "null cannot be cast to non-null type android.app.Activity");
                c64752wZ.A00(activity, userSession2, c4nl, quickPromotionSlot2, mhv);
            }
        };
        this.A01 = A00.A02(abstractC59962oe, interfaceC11380iw, userSession, obj.A00(), quickPromotionSlot);
    }
}
