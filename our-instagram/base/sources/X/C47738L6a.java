package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.L6a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47738L6a {
    public final C18920wW A00;

    public final void A00(Long l, Long l2, String str, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "sable_news_event");
        if (A0f.isSampled()) {
            A0f.AAP("event_name", str);
            long j = 0;
            A0f.A9K("ig_user_id", Long.valueOf(AbstractC25232BEp.A0t(l)));
            if (l2 != null) {
                j = l2.longValue();
            }
            A0f.A9K("account_viewed_id", Long.valueOf(j));
            A0f.A7v("viewer_is_regulated_c18", Boolean.valueOf(z));
            A0f.Cht();
        }
    }

    public C47738L6a(UserSession userSession) {
        this.A00 = AbstractC12220kQ.A02(userSession);
    }
}
