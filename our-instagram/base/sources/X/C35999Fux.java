package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fux, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35999Fux implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "AvatarStickersLogger";
    public final C18920wW A00;
    public final UserSession A01;

    public C35999Fux(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(this, userSession);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_avatar_stickers";
    }

    public final void A00(String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "stickers_tray_opened");
        A0f.AAP("ig_user_id", this.A01.userId);
        AbstractC31175DnJ.A17(A0f, str);
    }
}
