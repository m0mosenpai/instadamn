package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.intf.SocialContextFollowListFragmentConfig;
import java.util.HashSet;

/* renamed from: X.72q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C72q implements InterfaceC1568872r {
    public boolean A00;
    public final FragmentActivity A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C155476ya A05;
    public final AnonymousClass708 A06;
    public final UserDetailFragment A07;
    public final UserDetailTabController A08;
    public final MUB A09;
    public final C37494GfC A0A;
    public final C154716xM A0B;
    public final String A0C;
    public final String A0D;
    public final java.util.Set A0E;
    public final C155636ys A0F;
    public final C70C A0G;

    public final void A05(EnumC31556Dtg enumC31556Dtg) {
        String str;
        String str2;
        MUB mub = this.A09;
        Fragment A00 = A00(AbstractC31565Dtq.A00(enumC31556Dtg, mub.A02(), null, false));
        if (A00 != null) {
            if (enumC31556Dtg == EnumC31556Dtg.A04) {
                str = "tap_followers";
            } else if (enumC31556Dtg == EnumC31556Dtg.A05) {
                str = "tap_following";
            } else {
                str = "tap_follow_details";
            }
            UserSession userSession = this.A03;
            C1571673v.A08(this.A07, userSession, A01(this), str, mub.A02(), this.A0C, this.A0D, "user_profile_header");
            User user = this.A08.A0O.A0J;
            if (user != null) {
                if (AbstractC154816xW.A03(userSession, user)) {
                    str2 = "unified_follow_list";
                } else {
                    str2 = "social_context_follow_list_fragment";
                }
                C70C c70c = this.A0G;
                c70c.A03(A00, str2, true);
                c70c.A00();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r12 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A07(android.view.MotionEvent r11, X.EnumC31556Dtg r12) {
        /*
            r10 = this;
            r5 = 0
            r4 = 1
            X.C14360o3.A0B(r11, r4)
            int r0 = r11.getAction()
            if (r0 != r4) goto L68
            com.instagram.common.session.UserSession r6 = r10.A03
            X.0Tz r8 = X.C06090Tz.A05
            r0 = 36329247161204959(0x811142000040df, double:3.0381004186580365E-306)
            boolean r0 = X.C18U.A06(r8, r6, r0)
            if (r0 == 0) goto L68
            X.Dtg r3 = X.EnumC31556Dtg.A04
            r2 = -1
            X.MUB r7 = r10.A09
            com.instagram.user.model.User r0 = r7.A03
            if (r12 != r3) goto L72
            if (r0 == 0) goto L7b
            X.17P r0 = r0.A03
            java.lang.Integer r0 = r0.B7S()
        L2b:
            if (r0 == 0) goto L7b
            int r9 = r0.intValue()
        L31:
            X.FQ7 r1 = X.FCX.A00(r6)
            java.lang.String r0 = r7.A02()
            r1.A00(r12, r0, r9, r5)
            r0 = 36329247161270496(0x811142000140e0, double:3.0381004186994823E-306)
            boolean r0 = X.C18U.A06(r8, r6, r0)
            if (r0 == 0) goto L68
            com.instagram.user.model.User r0 = r7.A03
            if (r12 != r3) goto L69
            if (r0 == 0) goto L5b
            X.17P r0 = r0.A03
            java.lang.Integer r0 = r0.B7X()
        L53:
            if (r0 == 0) goto L59
            int r2 = r0.intValue()
        L59:
            if (r12 != r3) goto L5d
        L5b:
            X.Dtg r3 = X.EnumC31556Dtg.A05
        L5d:
            X.FQ7 r1 = X.FCX.A00(r6)
            java.lang.String r0 = r7.A02()
            r1.A00(r3, r0, r2, r4)
        L68:
            return r5
        L69:
            if (r0 == 0) goto L59
            X.17P r0 = r0.A03
            java.lang.Integer r0 = r0.B7S()
            goto L53
        L72:
            if (r0 == 0) goto L7b
            X.17P r0 = r0.A03
            java.lang.Integer r0 = r0.B7X()
            goto L2b
        L7b:
            r9 = -1
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72q.A07(android.view.MotionEvent, X.Dtg):boolean");
    }

    public C72q(FragmentActivity fragmentActivity, C18920wW c18920wW, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C155636ys c155636ys, C155476ya c155476ya, AnonymousClass708 anonymousClass708, UserDetailFragment userDetailFragment, C70C c70c, UserDetailTabController userDetailTabController, MUB mub, C37494GfC c37494GfC, C154716xM c154716xM, String str, String str2) {
        C14360o3.A0B(c70c, 8);
        C14360o3.A0B(c154716xM, 13);
        this.A03 = userSession;
        this.A07 = userDetailFragment;
        this.A01 = fragmentActivity;
        this.A08 = userDetailTabController;
        this.A09 = mub;
        this.A0C = str;
        this.A0D = str2;
        this.A0G = c70c;
        this.A04 = interfaceC60442pS;
        this.A02 = c18920wW;
        this.A05 = c155476ya;
        this.A0A = c37494GfC;
        this.A0B = c154716xM;
        this.A06 = anonymousClass708;
        this.A0F = c155636ys;
        this.A0E = new HashSet();
    }

    private final Fragment A00(FollowListData followListData) {
        User user = this.A08.A0O.A0J;
        if (user != null) {
            UserSession userSession = this.A03;
            if (AbstractC154816xW.A03(userSession, user)) {
                return AbstractC31412DrH.A00().A00.Csj(userSession, user, followListData, AbstractC154816xW.A00(user), null, false);
            }
            if (followListData.A00 == EnumC31556Dtg.A0E) {
                return AbstractC31412DrH.A00().A00.CsZ(null, userSession, new SocialContextFollowListFragmentConfig(followListData, user.getId()));
            }
            return null;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final EnumC1571773w A01(C72q c72q) {
        User user = c72q.A08.A0O.A0J;
        if (user != null) {
            UserSession userSession = c72q.A03;
            if (C14360o3.A0K(userSession.userId, user.getId())) {
                return EnumC1571773w.A05;
            }
            if (C57582kX.A00(userSession).A0N(user) == FollowStatus.A05) {
                return EnumC1571773w.A03;
            }
        }
        return EnumC1571773w.A04;
    }

    public final GBV A02() {
        return (GBV) this.A06.A0X.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.53S, java.lang.Object, X.FtG] */
    public final void A03() {
        UserSession userSession = this.A03;
        UserDetailFragment userDetailFragment = this.A07;
        EnumC1571773w enumC1571773w = EnumC1571773w.A05;
        MUB mub = this.A09;
        C1571673v.A08(userDetailFragment, userSession, enumC1571773w, "edit_profile", mub.A02(), this.A0C, this.A0D, "name_and_bio_upsell");
        C31721DwQ A04 = AbstractC31364DqT.A03().A01.A04("profile");
        C70C c70c = this.A0G;
        c70c.A03(A04, "edit_profile", false);
        c70c.A01();
        c70c.A02();
        String A02 = mub.A02();
        ?? obj = new Object();
        obj.A00 = A02;
        c70c.A04(obj);
        c70c.A00();
    }

    public final void A04() {
        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A0E;
        MUB mub = this.A09;
        Fragment A00 = A00(AbstractC31565Dtq.A00(enumC31556Dtg, mub.A02(), null, false));
        if (A00 != null) {
            C1571673v.A08(this.A07, this.A03, A01(this), "tap_followed_by", mub.A02(), this.A0C, this.A0D, "user_profile_header");
            C70C c70c = this.A0G;
            c70c.A03(A00, "social_context_follow_list_fragment", true);
            c70c.A00();
        }
    }

    public final void A06(String str) {
        C1571673v.A08(this.A07, this.A03, A01(this), str, this.A09.A02(), this.A0C, this.A0D, "user_profile_header");
    }

    @Override // X.InterfaceC1568872r
    public final void ClM(User user, EnumC33371Ep4 enumC33371Ep4, String str, String str2) {
        C14360o3.A0B(enumC33371Ep4, 1);
        if (enumC33371Ep4.ordinal() != 7) {
            C75R.A0E(this.A02, "click", str2, user.getId());
        } else {
            C75R.A0C(this.A02, str2, user.getId());
        }
    }

    @Override // X.InterfaceC1568872r
    public final void F9m(User user, EnumC33371Ep4 enumC33371Ep4) {
        String id = user.getId();
        C28151Xt c28151Xt = C28151Xt.A02;
        if (c28151Xt != null) {
            c28151Xt.A02(this.A01, AbstractC018607g.A00(this.A07), this.A03, new GJ4(this, id), id, this.A04.getModuleName());
        }
    }
}
