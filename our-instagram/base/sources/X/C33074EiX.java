package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EiX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33074EiX extends AbstractC151906sa {
    public final UserSession A00;

    public C33074EiX(UserSession userSession, C70D c70d) {
        super(c70d, new C33055EiE(new C36995GRm(userSession)), "tap_shopping_bag", R.drawable.instagram_shopping_cart_pano_outline_24);
        this.A00 = userSession;
    }

    @Override // X.AbstractC151906sa
    public final InterfaceC37108GWt A01() {
        InterfaceC37108GWt interfaceC37108GWt;
        UserSession userSession = this.A00;
        if (!AbstractC166987dD.A0x(userSession).getBoolean("has_tapped_on_shopping_bag_menu_option", false) && AbstractC166987dD.A0x(userSession).getBoolean("has_used_shopping_bag", false)) {
            interfaceC37108GWt = new C36585GBj(0);
        } else {
            interfaceC37108GWt = C36584GBi.A00;
        }
        return interfaceC37108GWt;
    }

    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        C1XJ c1xj = C1XJ.A00;
        UserSession userSession = c70d.A09;
        int A0K = AbstractC167017dG.A0K(c1xj.A0Y(userSession));
        C54392et A0b = AbstractC31173DnH.A0b(userSession);
        C54432ex c54432ex = new C54432ex(EnumC54222eY.A0g, A0K);
        EnumC58162lY enumC58162lY = EnumC58162lY.A0D;
        EnumC58122lU enumC58122lU = EnumC58122lU.A05;
        A0b.A01(enumC58122lU, enumC58162lY, c54432ex);
        C54412ev A0c = AbstractC31174DnI.A0c(userSession);
        C54432ex c54432ex2 = new C54432ex(EnumC54222eY.A0b, A0K);
        EnumC58162lY enumC58162lY2 = EnumC58162lY.A0F;
        C14360o3.A0B(enumC58162lY2, 0);
        A0c.A03(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex2, false);
        C1XJ.A00.A1H(userSession, Integer.valueOf(A0K), null, "profile_menu");
        AbstractC167007dF.A17(AbstractC31176DnK.A0e(userSession), "has_tapped_on_shopping_bag_menu_option");
        C1XJ.A00.A0p(c70d.A06, EnumC39651Hig.A06, EnumC39644HiZ.PROFILE, EnumC39650Hif.A04, EnumC39649Hie.A04, userSession, null, c70d.A0A.getModuleName(), "side_tray_profile", null, null, null, false);
    }
}
