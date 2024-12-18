package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fuy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36000Fuy implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "AvatarMimicryFlowLogger";
    public final C18920wW A00;
    public final UserSession A01;

    public C36000Fuy(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(this, userSession);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_avatar_sticker_mimicry_flow";
    }

    public final void A00(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        if (z3) {
            str2 = "create_avatar_nux";
        } else {
            str2 = "avatar_sticker";
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mimicry_upsell_cta_clicked");
        AbstractC31171DnF.A1G(A0f, str2);
        A0f.AAP("has_avatar", String.valueOf(z));
        A0f.AAP("is_sender", String.valueOf(z2));
        A0f.AAP("ig_user_id", this.A01.userId);
        if (!z4) {
            if (str == null) {
                str = "None";
            }
            A0f.AAP("sticker_template_id", str);
        }
        A0f.Cht();
    }
}
