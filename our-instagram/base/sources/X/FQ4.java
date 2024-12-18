package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;

/* loaded from: classes6.dex */
public final class FQ4 {
    public UserSession A00;
    public C31349DqE A01;
    public C31361DqQ A02;
    public UserDetailFragment A03;

    public final void A01() {
        C31349DqE c31349DqE = this.A01;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
            this.A01 = null;
        }
    }

    public static void A00(FragmentActivity fragmentActivity, UserSession userSession, User user, EnumC31556Dtg enumC31556Dtg) {
        C1XQ A01 = AbstractC31412DrH.A01();
        user.getId();
        FollowListData A00 = AbstractC31565Dtq.A00(enumC31556Dtg, user.getId(), null, false);
        C14360o3.A0B(userSession, 0);
        Bundle AME = ((C1XP) A01).AME(userSession, A00, false);
        AME.putBoolean("FollowListFragment.ShowSearchBar", false);
        AME.putBoolean("FollowListFragment.ShouldBypassUnfollowConfirmationDialog", true);
        C31535DtK c31535DtK = new C31535DtK();
        c31535DtK.setArguments(AME);
        AbstractC31177DnL.A15(c31535DtK, fragmentActivity, userSession);
    }
}
