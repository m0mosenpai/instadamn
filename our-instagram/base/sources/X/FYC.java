package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;

/* loaded from: classes6.dex */
public abstract class FYC {
    public static final void A00(Activity activity, UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        C14360o3.A0B(userSession, 0);
        AbstractC31177DnL.A0o(activity, AbstractC31364DqT.A02().A01(userSession, userDetailLaunchConfig), userSession, "profile");
    }

    public static final void A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1119153d interfaceC1119153d, User user, String str, boolean z, boolean z2) {
        String username;
        String str2;
        C1571673v.A05(interfaceC11380iw, userSession, AbstractC31179DnN.A0R(userSession, user), AbstractC111324zv.A00(3206), user.getId());
        C15370ps A1F = AbstractC25225BEi.A1F();
        if (z2) {
            SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig = new SocialContextFollowListFragmentConfig(AbstractC31565Dtq.A00(EnumC31556Dtg.A04, user.getId(), null, false), user.getId());
            socialContextFollowListFragmentConfig.A01 = user;
            socialContextFollowListFragmentConfig.A02 = true;
            socialContextFollowListFragmentConfig.A00 = AbstractC167017dG.A0K(user.A03.BVy());
            socialContextFollowListFragmentConfig.A03 = false;
            socialContextFollowListFragmentConfig.A05 = true;
            socialContextFollowListFragmentConfig.A04 = true;
            socialContextFollowListFragmentConfig.A06 = true;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean("FollowListFragment.IsBottomSheet", true);
            if (z && str != null) {
                A0b.putBoolean("FollowListFragment.AddAdUniversalCTAGap", true);
                A0b.putString("FollowListFragment.MediaId", str);
            }
            A1F.A00 = AbstractC31412DrH.A01().CsZ(A0b, userSession, socialContextFollowListFragmentConfig);
            username = fragmentActivity.getApplicationContext().getString(2131968105);
        } else {
            Bundle ANO = ((C1XP) AbstractC31412DrH.A01()).ANO(userSession, user, AbstractC31565Dtq.A00(EnumC31556Dtg.A0E, user.getId(), null, false), null, null, false);
            Bundle A0b2 = AbstractC166987dD.A0b();
            A0b2.putBoolean("FollowListFragment.IsBottomSheet", true);
            if (z) {
                A0b2.putBoolean("FollowListFragment.AddAdUniversalCTAGap", true);
                ANO.putBoolean("UnifiedFollowFragment.EXTRA_SHOW_SECONDARY_CTA", true);
                ANO.putString("UnifiedFollowFragment.EXTRA_MEDIA_ID", str);
            }
            ANO.putBundle("UnifiedFollowFragment.EXTRA_UNIFIED_SOCIAL_CONTEXT_OVERRIDES", A0b2);
            ANO.putBoolean("UnifiedFollowFragment.IS_BOTTOM_SHEET", true);
            ANO.putBoolean("UnifiedFollowFragment.EXTRA_SHOW_ACTION_BAR", false);
            ANO.putBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_MUTUAL", true);
            ANO.putBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_FOLLOWERS", true);
            ANO.putBoolean("UnifiedFollowFragment.EXTRA_USE_SIMPLE_TITLE_FOR_FOLLOWING", true);
            ANO.putBoolean("UnifiedFollowFragment.HAS_SIMILAR_ACCOUNTS", false);
            UnifiedFollowFragment unifiedFollowFragment = new UnifiedFollowFragment();
            unifiedFollowFragment.setArguments(ANO);
            A1F.A00 = unifiedFollowFragment;
            username = user.getUsername();
        }
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A1O = true;
        Object obj = A1F.A00;
        if (obj == null) {
            str2 = "bottomSheetContentFragment";
        } else {
            InterfaceC08430c6 interfaceC08430c6 = (Fragment) obj;
            C14360o3.A0C(interfaceC08430c6, MSV.A00(3));
            A0y.A0T = (C51D) interfaceC08430c6;
            AbstractC25225BEi.A1Q(A0y, true);
            A0y.A03 = 0.7f;
            if (username == null) {
                str2 = "bottomSheetTitle";
            } else {
                A0y.A0d = username;
                if (interfaceC1119153d != null) {
                    A0y.A0U = interfaceC1119153d;
                }
                AbstractC167007dF.A0J().post(new GQ1(fragmentActivity, A0y, A1F));
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
