package X;

import android.content.Context;
import com.instagram.quickpromotion.intf.Trigger;

/* loaded from: classes9.dex */
public final class P70 implements InterfaceC55112gB {
    public final int A00;
    public final Object A01;

    public P70(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC55112gB
    public final void DMz(Context context, C4NL c4nl, InterfaceC55362gb interfaceC55362gb, String str) {
        AbstractC59962oe abstractC59962oe;
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(interfaceC55362gb, c4nl);
                AbstractC54912fq.A00();
                abstractC59962oe = (AbstractC59962oe) this.A01;
                break;
            case 1:
                AbstractC167017dG.A1N(interfaceC55362gb, c4nl);
                AbstractC54912fq.A00();
                abstractC59962oe = (AbstractC59962oe) this.A01;
                break;
            default:
                boolean A1a = AbstractC167017dG.A1a(interfaceC55362gb, c4nl);
                java.util.Set CB6 = c4nl.CB6();
                if (CB6 != null && CB6.contains(Trigger.A1R) == A1a) {
                    C56049OuO c56049OuO = (C56049OuO) this.A01;
                    AbstractC59962oe abstractC59962oe2 = c56049OuO.A0A;
                    C1ON A01 = AbstractC55182Odn.A01(c56049OuO.A0D);
                    A01.A00 = new NAD(12, interfaceC55362gb, c4nl, c56049OuO);
                    abstractC59962oe2.schedule(A01);
                    return;
                }
                return;
        }
        AbstractC54119NwH.A00(abstractC59962oe.requireContext(), abstractC59962oe, c4nl, interfaceC55362gb);
    }
}
