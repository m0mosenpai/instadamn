package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KqD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46994KqD {
    public static final void A00(EnumC53373NjO enumC53373NjO, UserSession userSession, String str) {
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "business_inbox_rich_media";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "direct_professional_file_share_events");
        if (A0f.isSampled()) {
            A0f.A8R(enumC53373NjO, "action");
            A0f.AAk("participant_ids", AbstractC166987dD.A1J(str));
            A0f.Cht();
        }
    }
}
