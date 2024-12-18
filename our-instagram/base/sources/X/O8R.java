package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class O8R {
    public final UserSession A00;
    public final java.util.Set A01;

    public O8R(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC001800i.A0j(AbstractC001800i.A0k(AbstractC001800i.A0X(AbstractC166987dD.A0x(userSession).C2v("quick_snap_seen_media_ids"))));
    }
}
