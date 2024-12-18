package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I5U {
    public static C1ON A00(UserSession userSession, C41159IJy c41159IJy) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "media/%s/%s/story_quiz_answer/", new Object[]{c41159IJy.A03, c41159IJy.A04});
        A0M.A9s("answer", String.valueOf(c41159IJy.A00));
        AbstractC37300Gc1.A0y(A0M, c41159IJy.A05);
        A0M.A9s("delivery_class", c41159IJy.A02);
        A0M.A9s("tray_session_id", c41159IJy.A06);
        A0M.A9s("nav_chain", AbstractC25225BEi.A14());
        return AbstractC31172DnG.A0S(A0M, C32169EBq.class, FWo.class);
    }
}
