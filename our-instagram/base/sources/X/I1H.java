package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes7.dex */
public abstract class I1H {
    public static C1ON A00(UserSession userSession, C38321qM c38321qM, Hashtag hashtag) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("tags/hashtag_media_report/");
        A0M.A9s("m_pk", c38321qM.getId());
        A0M.A9s("h_id", hashtag.getId());
        AbstractC31176DnK.A1P(A0M, "tag", hashtag.getName());
        return AbstractC31176DnK.A0P(A0M);
    }
}
