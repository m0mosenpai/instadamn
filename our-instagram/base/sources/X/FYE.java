package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.recommended.FollowListData;

/* loaded from: classes6.dex */
public abstract class FYE {
    public static final C140966Yy A00(FragmentActivity fragmentActivity, UserSession userSession, FollowListData followListData, boolean z) {
        Integer num;
        Bundle A0b = AbstractC166987dD.A0b();
        if (followListData.A00 == EnumC31556Dtg.A05) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        A0b.putInt("FollowListFragment.EntryType", num.intValue());
        A0b.putParcelable("FollowListFragment.FollowListData", followListData);
        A0b.putBoolean("FollowListFragment.DisplayOnlyMutual", z);
        if (fragmentActivity != null) {
            C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
            AbstractC31412DrH.A00();
            C31535DtK c31535DtK = new C31535DtK();
            c31535DtK.setArguments(A0b);
            A0P.A0D(c31535DtK);
            return A0P;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final C140966Yy A01(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        Bundle A0C = AbstractC31177DnL.A0C(userSession);
        A0C.putString("LikesListFragment.MEDIA_ID", str);
        A0C.putInt(AbstractC111324zv.A00(653), 2131968661);
        if (fragmentActivity != null) {
            C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
            A0P.A0D(AbstractC31412DrH.A01().CsT(A0C, userSession));
            return A0P;
        }
        throw AbstractC166997dE.A0g();
    }
}
