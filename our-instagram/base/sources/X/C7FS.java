package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7FS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FS {
    public final C18920wW A00;

    public final void A00(C3o9 c3o9, boolean z) {
        String str;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_edit_message");
        if (A00.isSampled()) {
            if (z) {
                str = "thread_upsell_shown";
            } else {
                str = "thread_upsell_dismissed";
            }
            A00.AAP("action", str);
            A00.AAP("message_type", C2EY.A1i.toString());
            A00.AAP("message_id", "");
            A00.A7v("is_e2ee", false);
            A00.AAP("open_thread_id", AbstractC43827JZq.A01(c3o9));
            A00.A9K("occamadillo_thread_id", AbstractC43827JZq.A00(c3o9));
            A00.Cht();
        }
    }

    public C7FS(UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(new C19270xB("direct_thread"), userSession);
    }
}
