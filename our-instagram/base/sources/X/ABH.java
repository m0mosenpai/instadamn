package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Use CrosspostingAccountLinkingManager")
/* loaded from: classes4.dex */
public final class ABH {
    public final UserSession A00;
    public final C196098lz A01;

    public final C196168m6 A00(CallerContext callerContext) {
        C196148m4 c196148m4;
        List list;
        List list2 = (List) this.A01.A00.A00(callerContext, "ig_android_service_cache_crossposting_setting", AbstractC166987dD.A1J("CROSS_POSTING_SETTING")).get("CROSS_POSTING_SETTING");
        if (list2 != null && (c196148m4 = (C196148m4) AbstractC001800i.A0J(list2)) != null && (list = c196148m4.A01) != null) {
            return (C196168m6) AbstractC001800i.A0J(list);
        }
        return null;
    }

    public ABH(UserSession userSession) {
        this.A00 = userSession;
        C14360o3.A0B(userSession, 0);
        this.A01 = (C196098lz) userSession.A01(C196098lz.class, new C50152MDf(userSession, 13));
    }
}
