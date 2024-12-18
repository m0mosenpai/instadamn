package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.EiV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33072EiV extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final InterfaceC37108GWt A01() {
        InterfaceC37108GWt interfaceC37108GWt;
        UserSession userSession = this.A01.A09;
        if (AbstractC166987dD.A10(userSession).A1T() && !AbstractC166987dD.A0x(userSession).getBoolean("shopping_has_tapped_orders_navbar_icon", false)) {
            interfaceC37108GWt = new C36585GBj(0);
        } else {
            interfaceC37108GWt = C36584GBi.A00;
        }
        return interfaceC37108GWt;
    }

    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        UserSession userSession = c70d.A09;
        Context context = c70d.A05;
        AbstractC167007dF.A17(AbstractC31176DnK.A0e(userSession), "shopping_has_tapped_orders_navbar_icon");
        String string = context.getResources().getString(2131969262);
        AbstractC27401Ut.getInstance();
        C64501TGn A01 = new C64501TGn(userSession).A01(AbstractC58317Pt9.A00(568));
        A01.A07 = string;
        A01.A02(context);
    }
}
