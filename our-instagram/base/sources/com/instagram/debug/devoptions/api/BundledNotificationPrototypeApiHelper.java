package com.instagram.debug.devoptions.api;

import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.C1ON;
import X.C1P1;
import X.C25621Ms;
import X.C40781ul;
import X.C55702hA;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public class BundledNotificationPrototypeApiHelper {
    public static C1ON createBundledActivityFeedPrototypeTask(UserSession userSession, String str, C1P1 c1p1) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("commerce/inbox/prototype/");
        A0M.A9s("experience", str);
        C1ON A0S = AbstractC31172DnG.A0S(A0M, C40781ul.class, C55702hA.class);
        A0S.A00 = c1p1;
        return A0S;
    }

    public static C1ON createBundledActivityFeedRetrieveExperienceTask(UserSession userSession, C1P1 c1p1) {
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("commerce/inbox/prototype/setting/");
        C1ON A0S = AbstractC31172DnG.A0S(A0N, BundledActivityFeedExperienceResponse.class, BundledActivityFeedExperienceResponse__JsonHelper.class);
        A0S.A00 = c1p1;
        return A0S;
    }
}
