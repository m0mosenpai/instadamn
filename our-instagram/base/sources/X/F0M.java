package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F0M {
    public static final C1ON A00(UserSession userSession, List list) {
        C14360o3.A0B(userSession, 1);
        String A02 = C71473Il.A00(',').A02(list);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("media/infos/");
        A0M.A9s("media_ids", A02);
        A0M.A9s("ranked_content", "true");
        A0M.A9s("include_inactive_reel", "true");
        return AbstractC25227BEk.A0e(A0M, C74293Vk.class, C74313Vm.class);
    }
}
