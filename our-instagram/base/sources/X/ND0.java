package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository;

/* loaded from: classes9.dex */
public final class ND0 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public ND0(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        StoryCommentsDashboardRepository storyCommentsDashboardRepository = new StoryCommentsDashboardRepository(new O42(userSession));
        return new C51046Mgy(C1DW.A00(userSession), new C149766oT(userSession), storyCommentsDashboardRepository, this.A02, this.A01);
    }
}
