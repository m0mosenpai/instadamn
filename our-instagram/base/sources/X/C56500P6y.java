package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.P6y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56500P6y implements InterfaceC55172gH {
    public final int A00;
    public final Object A01;

    public C56500P6y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.N8F] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.N7l, java.lang.Object] */
    @Override // X.InterfaceC55172gH
    public final void D0F(C4NL c4nl) {
        C64752wZ c64752wZ;
        QuickPromotionSlot quickPromotionSlot;
        int i;
        N8G n8g;
        InterfaceC16820sZ mhw;
        UserSession A0r;
        int i2;
        N8G n8g2;
        FragmentActivity activity;
        ?? r1;
        int i3 = this.A00;
        C14360o3.A0B(c4nl, 0);
        switch (i3) {
            case 0:
                N8G n8g3 = (N8G) this.A01;
                c64752wZ = n8g3.A0B;
                quickPromotionSlot = QuickPromotionSlot.A0C;
                i = 42;
                n8g = n8g3;
                mhw = new MHW(i, c4nl, n8g);
                A0r = AbstractC166987dD.A0r(((AbstractC52114N4m) n8g).A09);
                n8g2 = n8g;
                activity = n8g2.getActivity();
                AbstractC31171DnF.A1O(activity);
                break;
            case 1:
                ?? r12 = (N8F) this.A01;
                c64752wZ = r12.A03;
                quickPromotionSlot = QuickPromotionSlot.A0C;
                i = 43;
                n8g = r12;
                mhw = new MHW(i, c4nl, n8g);
                A0r = AbstractC166987dD.A0r(((AbstractC52114N4m) n8g).A09);
                n8g2 = n8g;
                activity = n8g2.getActivity();
                AbstractC31171DnF.A1O(activity);
                break;
            case 2:
                N8C n8c = (N8C) this.A01;
                c64752wZ = n8c.A02;
                quickPromotionSlot = QuickPromotionSlot.A0C;
                i2 = 47;
                r1 = n8c;
                mhw = new MHW(i2, c4nl, (Object) r1);
                A0r = AbstractC166987dD.A0r(r1.A01);
                n8g2 = r1;
                activity = n8g2.getActivity();
                AbstractC31171DnF.A1O(activity);
                break;
            case 3:
                N8B n8b = (N8B) this.A01;
                c64752wZ = n8b.A01;
                quickPromotionSlot = QuickPromotionSlot.A0C;
                i2 = 49;
                r1 = n8b;
                mhw = new MHW(i2, c4nl, (Object) r1);
                A0r = AbstractC166987dD.A0r(r1.A01);
                n8g2 = r1;
                activity = n8g2.getActivity();
                AbstractC31171DnF.A1O(activity);
                break;
            default:
                C26872BtZ c26872BtZ = (C26872BtZ) this.A01;
                c64752wZ = (C64752wZ) c26872BtZ.A03.getValue();
                quickPromotionSlot = QuickPromotionSlot.A0T;
                mhw = C57531Pg5.A00(c4nl, c26872BtZ, 37);
                A0r = AbstractC166987dD.A0r(c26872BtZ.A0C);
                activity = c26872BtZ.requireActivity();
                break;
        }
        c64752wZ.A00(activity, A0r, c4nl, quickPromotionSlot, mhw);
    }
}
