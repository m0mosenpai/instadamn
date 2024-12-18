package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.data.LikesListRepository;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.1XP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XP implements C1XQ {
    @Override // X.C1XQ
    public final Bundle AME(UserSession userSession, FollowListData followListData, boolean z) {
        Integer num;
        Bundle bundle = new Bundle();
        int ordinal = followListData.A00.ordinal();
        if (ordinal != 5) {
            if (ordinal != 9) {
                if (ordinal != 1 && ordinal != 2) {
                    if (ordinal != 7) {
                        num = C05F.A01;
                    } else {
                        num = C05F.A0j;
                    }
                } else {
                    num = C05F.A00;
                }
            } else {
                num = C05F.A0N;
            }
        } else {
            num = C05F.A0C;
        }
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putInt("FollowListFragment.EntryType", num.intValue());
        bundle.putParcelable("FollowListFragment.FollowListData", followListData);
        bundle.putBoolean("FollowListFragment.DisplayOnlyMutual", false);
        bundle.putBoolean("FollowListFragment.LazyLoading", z);
        return bundle;
    }

    @Override // X.C1XQ
    public final Bundle ANO(UserSession userSession, User user, FollowListData followListData, ArrayList arrayList, HashMap hashMap, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        C14360o3.A0B(userSession, 0);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("UnifiedFollowFragment.PROFILE_USER_NAME", user.getUsername());
        bundle.putParcelable("UnifiedFollowFragment.INITIAL_FOLLOW_LIST_DATA", followListData);
        Integer BVy = user.A03.BVy();
        boolean z2 = false;
        if (BVy != null) {
            i = BVy.intValue();
        } else {
            i = 0;
        }
        bundle.putInt("UnifiedFollowFragment.MUTUAL_FOLLOWERS_COUNT", i);
        Integer B7S = user.A03.B7S();
        if (B7S != null) {
            i2 = B7S.intValue();
        } else {
            i2 = 0;
        }
        bundle.putInt("UnifiedFollowFragment.FOLLOWER_COUNT", i2);
        Integer B7X = user.A03.B7X();
        if (B7X != null) {
            i3 = B7X.intValue();
        } else {
            i3 = 0;
        }
        bundle.putInt("UnifiedFollowFragment.FOLLOWING_COUNT", i3);
        Integer At8 = user.A03.At8();
        if (At8 != null) {
            i4 = At8.intValue();
        } else {
            i4 = 0;
        }
        bundle.putInt("UnifiedFollowFragment.EXTRA_SUBSCRIBED_COUNT", i4);
        bundle.putBoolean("UnifiedFollowFragment.EXTRA_SHOW_CREATOR_RECS", z);
        bundle.putInt("UnifiedFollowFragment.EXTRA_ADMINS_COUNT", 0);
        bundle.putInt("UnifiedFollowFragment.EXTRA_BLOCKED_COUNT", 0);
        bundle.putBoolean("UnifiedFollowFragment.EXTRA_USER_IS_GROUP_PROFILE", false);
        bundle.putSerializable("UnifiedFollowFragment.EXTRA_LOGGING_FOLLOW_STATUS", AbstractC50626MWn.A00(userSession, user.B7L(), user.A0M(), user.getId()));
        Boolean BBJ = user.A03.BBJ();
        bundle.putBoolean("UnifiedFollowFragment.HAS_SIMILAR_ACCOUNTS", BBJ != null ? BBJ.booleanValue() : false);
        bundle.putBoolean("UnifiedFollowFragment.EXTRA_SHOW_SUBSCRIBED_TAB_IN_FOLLOWING", C18U.A06(C06090Tz.A05, userSession, 36315670769569263L));
        if (user.A03.Byy() != null) {
            z2 = true;
        }
        bundle.putBoolean("UnifiedFollowFragment.EXTRA_SHOW_SPAM_FOLLOWERS_TAB", z2);
        bundle.putBoolean("UnifiedFollowFragment.EXTRA_SPAM_FOLLOWERS_SETTING_ENABLED", C14360o3.A0K(user.A03.Byy(), true));
        bundle.putSerializable("UnifiedFollowFragment.ID_TO_ALGORITHM_MAP", hashMap);
        bundle.putStringArrayList("SimilarAccountsFragment.ARGUMENT_CHAINED_IDS", arrayList);
        return bundle;
    }

    @Override // X.C1XQ
    public final EJX CsH(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        EJX ejx = new EJX();
        ejx.setArguments(bundle);
        return ejx;
    }

    @Override // X.C1XQ
    public final C31535DtK CsL(UserSession userSession, FollowListData followListData) {
        C14360o3.A0B(userSession, 0);
        Bundle AME = AME(userSession, followListData, false);
        C31535DtK c31535DtK = new C31535DtK();
        c31535DtK.setArguments(AME);
        return c31535DtK;
    }

    @Override // X.C1XQ
    public final V1W CsM(UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 0);
        V1W v1w = new V1W();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("FollowingHashtagsFragment.UserId", str);
        bundle.putString("FollowingHashtagsFragment.UserName", str2);
        bundle.putBoolean("FollowingHashtagsFragment.IsStandalone", true);
        v1w.setArguments(bundle);
        return v1w;
    }

    @Override // X.C1XQ
    public final C31535DtK CsO(UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        if (!"non_recip_followers".equals(str) && !"aggregated_scf".equals(str) && !"follow_request_accepted".equals(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(str);
            sb.append("] is not a supported group type. You many add the logic to support it here.");
            throw new IllegalArgumentException(sb.toString());
        }
        Bundle AME = AME(userSession, AbstractC31565Dtq.A00(EnumC31556Dtg.A08, userSession.userId, null, false), false);
        AME.putString("FollowListFragment.Group", str);
        AME.putString("FollowListFragment.GroupRankingOrder", str2);
        AME.putBoolean("FollowListFragment.AutoExpandChaining", z);
        AME.putBoolean("FollowListFragment.ShowSearchBar", false);
        AME.putBoolean("FollowListFragment.HideRemoveButton", true);
        C31535DtK c31535DtK = new C31535DtK();
        c31535DtK.setArguments(AME);
        return c31535DtK;
    }

    @Override // X.C1XQ
    public final Fragment CsT(Bundle bundle, UserSession userSession) {
        Fragment enz;
        C14360o3.A0B(userSession, 0);
        LikesListRepository likesListRepository = new LikesListRepository(userSession);
        C51757Mtg A00 = FCZ.A00(bundle, userSession);
        C19K A01 = AbstractC24771Iv.A01(2146596217, 3);
        C57166PZk c57166PZk = new C57166PZk(likesListRepository, A00, userSession, null, 40);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c57166PZk, A01);
        C34518FJe c34518FJe = (C34518FJe) userSession.A01(C34518FJe.class, new C57548PgM(userSession, 1));
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        c34518FJe.A00.put(obj, likesListRepository);
        bundle.putString("EARLY_INITIALIZED_REPOSITORY", obj);
        if (C18U.A06(C06090Tz.A05, userSession, 36316293539827940L)) {
            enz = new EN1();
        } else {
            enz = new ENZ();
        }
        Fragment fragment = enz;
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override // X.C1XQ
    public final ENH CsY(UserSession userSession, String str, String str2, ArrayList arrayList, HashMap hashMap, boolean z) {
        C14360o3.A0B(userSession, 0);
        ENH enh = new ENH();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("SimilarAccountsFragment.ARGUMENT_TARGET_ID", str);
        if (arrayList != null) {
            bundle.putStringArrayList("SimilarAccountsFragment.ARGUMENT_CHAINED_IDS", arrayList);
        }
        if (hashMap != null) {
            bundle.putSerializable("SimilarAccountsFragment.ARGUMENT_ID_TO_ALGORITHM_MAP", hashMap);
        }
        if (str2 != null) {
            bundle.putString("SimilarAccountsFragment.ARGUMENT_ENTRY_POINT", str2);
        }
        bundle.putBoolean("SimilarAccountsFragment.SHOW_CREATOR_RECS", z);
        enh.setArguments(bundle);
        return enh;
    }

    @Override // X.C1XQ
    public final ENY CsZ(Bundle bundle, UserSession userSession, SocialContextFollowListFragmentConfig socialContextFollowListFragmentConfig) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(socialContextFollowListFragmentConfig, 1);
        ENY eny = new ENY();
        Bundle bundle2 = new Bundle();
        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle2.putParcelable("SocialContextFollowListFragment.Config", socialContextFollowListFragmentConfig);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        eny.setArguments(bundle2);
        return eny;
    }

    @Override // X.C1XQ
    public final UnifiedFollowFragment Csj(UserSession userSession, User user, FollowListData followListData, ArrayList arrayList, HashMap hashMap, boolean z) {
        C14360o3.A0B(userSession, 0);
        return Csi(ANO(userSession, user, followListData, arrayList, hashMap, z));
    }

    @Override // X.C1XQ
    public final UnifiedFollowFragment Csi(Bundle bundle) {
        if (bundle.containsKey("IgSessionManager.SESSION_TOKEN_KEY") && bundle.containsKey("UnifiedFollowFragment.PROFILE_USER_NAME") && bundle.containsKey("UnifiedFollowFragment.INITIAL_FOLLOW_LIST_DATA") && bundle.containsKey("UnifiedFollowFragment.MUTUAL_FOLLOWERS_COUNT") && bundle.containsKey("UnifiedFollowFragment.FOLLOWER_COUNT") && bundle.containsKey("UnifiedFollowFragment.FOLLOWING_COUNT") && bundle.containsKey("UnifiedFollowFragment.EXTRA_LOGGING_FOLLOW_STATUS") && bundle.containsKey("UnifiedFollowFragment.HAS_SIMILAR_ACCOUNTS") && bundle.containsKey("UnifiedFollowFragment.EXTRA_USER_IS_GROUP_PROFILE") && bundle.containsKey("UnifiedFollowFragment.EXTRA_ADMINS_COUNT") && bundle.containsKey("UnifiedFollowFragment.EXTRA_BLOCKED_COUNT") && bundle.containsKey("UnifiedFollowFragment.EXTRA_SHOW_SUBSCRIBED_TAB_IN_FOLLOWING")) {
            UnifiedFollowFragment unifiedFollowFragment = new UnifiedFollowFragment();
            unifiedFollowFragment.setArguments(bundle);
            return unifiedFollowFragment;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
