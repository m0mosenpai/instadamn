package X;

import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.model.PillsFilterCategory;

/* loaded from: classes5.dex */
public abstract class CJR {
    public static final MUI A00(UserSession userSession, PillsFilterCategory pillsFilterCategory, String str) {
        C14360o3.A0B(userSession, 0);
        MUI mui = new MUI();
        AbstractC25227BEk.A1C(mui, AbstractC167007dF.A1b("summary_id", str, AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.token), AbstractC166987dD.A1L("newsfeed_filter", pillsFilterCategory)));
        return mui;
    }
}
