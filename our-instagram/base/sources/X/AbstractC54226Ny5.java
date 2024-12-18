package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.Ny5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54226Ny5 {
    public static final C1ON A00(UserSession userSession, SearchContext searchContext, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String str7;
        String str8 = null;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC37301Gc2.A1M(A0c, MSX.A0k("story_interactions/", str2), str);
        A0c.A9s("container_module", str3);
        A0c.A9s("tray_session_id", str5);
        A0c.A0D("tray_position", i);
        A0c.A9s("viewer_session_id", str6);
        A0c.A0H("delivery_class", str4);
        if (searchContext != null) {
            str8 = searchContext.A05;
        }
        A0c.A0H("search_session_id", str8);
        if (searchContext != null) {
            str7 = searchContext.A03;
        } else {
            str7 = null;
        }
        A0c.A0H("rank_token", str7);
        A0c.A0H("query_text", searchContext != null ? searchContext.A02 : null);
        return AbstractC31178DnM.A0J(A0c, C40781ul.class, C55702hA.class);
    }
}
