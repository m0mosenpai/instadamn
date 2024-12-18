package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LXf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48256LXf implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "PinnedMessagesLogger";
    public final C18920wW A00;

    public C48256LXf(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A01(this, userSession);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "pinned_messages_logger_module";
    }

    public final void A00(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        InterfaceC02590Ai A0H = JQ0.A0H(this.A00, "direct_eyebrow_text_impression", str, str2);
        AbstractC31171DnF.A1G(A0H, "");
        A0H.AAP("content", "pinned");
        A0H.Cht();
    }

    public final void A01(String str, String str2, String str3) {
        AbstractC167017dG.A1N(str, str2);
        InterfaceC02590Ai A0H = JQ0.A0H(this.A00, "direct_replace_pin_click", str, str2);
        A0H.AAP("target", str3);
        A0H.Cht();
    }
}
