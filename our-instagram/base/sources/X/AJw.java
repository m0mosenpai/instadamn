package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class AJw {
    public static final AJw A00 = new Object();

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(223));
        String str3 = userSession.userId;
        C14360o3.A0B(str3, 0);
        A0f.A9K("igid", Long.valueOf(AbstractC167027dH.A03(str3)));
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        AbstractC167027dH.A0t(A0f, "tap");
        A0f.A7v("is_profile_owner", Boolean.valueOf(C14360o3.A0K(user.getId(), userSession.userId)));
        A0f.A9K(AbstractC111324zv.A00(1191), Long.valueOf(AbstractC167027dH.A03(user.getId())));
        A0f.AAP("sticker_type", C148276lx.A1Z.A0Z);
        A0f.AAP("media_id", str);
        A0f.Cht();
    }
}
