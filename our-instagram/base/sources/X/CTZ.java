package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CTZ {
    public final InterfaceC09390do A00;

    public CTZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC09440dt.A00(EnumC09460dv.A02, DGW.A00(userSession, 4));
    }

    public final void A00(C8W c8w, Long l) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00.getValue(), "ig_ai_memu_in_feed_setting_disable");
        if (A0f.isSampled()) {
            A0f.AAP("container_module", "feed_timeline");
            A0f.A8R(c8w, "reason");
            if (l != null && l.longValue() == -1) {
                l = null;
            }
            A0f.A9K("content_id", l);
            A0f.Cht();
        }
    }
}
