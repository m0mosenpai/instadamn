package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Ez1 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        String A0f = AbstractC31171DnF.A0f(A03);
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, A0f);
        List list = c6fw.A00;
        Object obj = list.get(2);
        String A0l = AbstractC31180DnO.A0l(list);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", A0W.token), AbstractC166987dD.A1L("FollowListFragment.EntryType", C05F.A0u), AbstractC166987dD.A1L("FollowListFragment.FollowListData", AbstractC31565Dtq.A00(EnumC31556Dtg.A09, AbstractC166987dD.A10(A0W).getId(), null, false)), AbstractC166987dD.A1L("FollowListFragment.DisplayOnlyMutual", false), AbstractC166987dD.A1L("FollowListFragment.Group", A03), AbstractC166987dD.A1L("FollowListFragment.GroupTitle", A032), AbstractC166987dD.A1L("FollowListFragment.ShowSearchBar", false), AbstractC166987dD.A1L("FollowListFragment.GroupSubtitle", obj), AbstractC166987dD.A1L("FollowListFragment.UserCount", 0), AbstractC166987dD.A1L("FollowListFragment.AllowActionBarBulkManage", true), AbstractC166987dD.A1L("FollowListFragment.ShouldHideMoreOptionsMenu", true));
        if (A0l != null && A0l.length() != 0) {
            A00.putString("FollowListFragment.Category", A0l);
        }
        C140966Yy A0P = AbstractC31173DnH.A0P(C6BQ.A04(c6fq), A0W);
        AbstractC31412DrH.A00();
        AbstractC31175DnJ.A0v(A00, new C31535DtK(), A0P);
        return null;
    }
}
