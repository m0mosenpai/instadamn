package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5om, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127085om {
    public UserSession A00;

    public final void A00(User user, String str, String str2, String str3, String str4) {
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(str), this.A00);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_feed_favorites_user_action_add");
        if (A00.isSampled()) {
            A00.AAP("module", str);
            A00.A9K("target_user_id", Long.valueOf(Long.parseLong(user.getId())));
            A00.AAP("management_session_id", str2);
            A00.AAP("detail", str3);
            A00.AAP("event_source", str4);
            A00.Cht();
        }
    }

    public final void A01(User user, String str, String str2, String str3, String str4) {
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(str), this.A00);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_feed_favorites_user_action_remove");
        if (A00.isSampled()) {
            A00.AAP("module", str);
            A00.A9K("target_user_id", Long.valueOf(Long.parseLong(user.getId())));
            A00.AAP("management_session_id", str2);
            A00.AAP("detail", str3);
            A00.AAP("event_source", str4);
            A00.Cht();
        }
    }
}
