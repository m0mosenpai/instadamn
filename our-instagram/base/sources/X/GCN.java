package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* loaded from: classes6.dex */
public final class GCN implements InterfaceC55112gB {
    public final int A00;
    public final Object A01;

    public GCN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC55112gB
    public final void DMz(Context context, C4NL c4nl, InterfaceC55362gb interfaceC55362gb, String str) {
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(interfaceC55362gb, c4nl);
                C27961Xa A00 = AbstractC54912fq.A00();
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                A00.A07(abstractC59962oe.requireContext(), abstractC59962oe, c4nl, interfaceC55362gb);
                return;
            case 1:
                AbstractC167027dH.A12(interfaceC55362gb, c4nl, context);
                C27961Xa A002 = AbstractC54912fq.A00();
                JR2 jr2 = (JR2) this.A01;
                A002.A07(context, jr2.A1L, c4nl, interfaceC55362gb);
                AbstractC54912fq.A00();
                UserSession A0p = jr2.A0p();
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0J;
                C14360o3.A0B(A0p, 1);
                AbstractC69976Vys.A01(context, A0p, c4nl, quickPromotionSlot, Integer.valueOf(R.id.layout_container_right));
                return;
            case 2:
                AbstractC167017dG.A1P(c4nl, context);
                AbstractC167007dF.A0J().postDelayed(new GQ0(context, c4nl, (C50685MZd) this.A01), 1000L);
                return;
            default:
                AbstractC167017dG.A1N(interfaceC55362gb, c4nl);
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                Context context2 = abstractC59962oe2.getContext();
                if (context2 != null) {
                    AbstractC54912fq.A00().A07(context2, abstractC59962oe2, c4nl, interfaceC55362gb);
                    return;
                }
                return;
        }
    }
}
