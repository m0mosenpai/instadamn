package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DpB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31289DpB {
    public final C18920wW A00;

    public final void A00(EnumC33478ErD enumC33478ErD, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_upsell");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1H(A0f, str);
            A0f.A8R(enumC33478ErD, "action");
            A0f.AAP("upsell_type", "fan_club_fan_dm_upsell_banner_key");
            A0f.A8R(EnumC33466Er1.BANNER, "upsell_layout");
            AbstractC31171DnF.A1G(A0f, null);
            A0f.A7v("is_showing_another_upsell", null);
            A0f.Cht();
        }
    }

    public final void A01(EnumC33478ErD enumC33478ErD, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_upsell");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1H(A0f, str);
            A0f.A8R(enumC33478ErD, "action");
            A0f.AAP("upsell_type", "fan_club_bc_upsell_messaging_led_banner_key");
            A0f.A8R(EnumC33466Er1.BANNER, "upsell_layout");
            AbstractC31171DnF.A1G(A0f, null);
            A0f.A7v("is_showing_another_upsell", null);
            A0f.Cht();
        }
    }

    public final void A02(EnumC33478ErD enumC33478ErD, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "direct_upsell");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1H(A0f, str);
            A0f.A8R(enumC33478ErD, "action");
            A0f.AAP("upsell_type", "fan_club_bc_upsell_dialog_key");
            A0f.A8R(EnumC33466Er1.DIALOG, "upsell_layout");
            AbstractC31171DnF.A1G(A0f, str2);
            A0f.A7v("is_showing_another_upsell", null);
            A0f.Cht();
        }
    }

    public C31289DpB(UserSession userSession) {
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "direct_upsell";
        this.A00 = c12210kP.A00();
    }
}
