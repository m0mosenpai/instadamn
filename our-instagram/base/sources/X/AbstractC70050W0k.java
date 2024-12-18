package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.W0k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70050W0k {
    public static final Map A00 = AbstractC25232BEp.A1F(6, "CATEGORY", new C09530e4(1, "HASHTAG"), new C09530e4(2, "LOCATION"));

    public static final void A00(UserSession userSession, AbstractC65924TwV abstractC65924TwV) {
        C14360o3.A0B(userSession, 0);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("map/register_recent_search/");
        A0c.A9s("target_id", abstractC65924TwV.A01());
        A0c.A9s("target_type", (String) AbstractC166997dE.A0m(A00, abstractC65924TwV.A01));
        A0c.A0R(C32125E9y.class, FS6.class);
        A0c.A0R = true;
        C1GJ.A03(A0c.A0N());
    }
}
