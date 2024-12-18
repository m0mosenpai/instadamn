package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oc5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55137Oc5 {
    public static final C55137Oc5 A00 = new Object();

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, N43 n43, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (n43 != null) {
            Q5b q5b = n43.A00;
            if (q5b == null) {
                C14360o3.A0F("dialog");
                throw C00O.createAndThrow();
            }
            q5b.dismiss();
            return;
        }
        if (z) {
            AbstractC167017dG.A0y(fragmentActivity, C3DN.A00);
            return;
        }
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0E = true;
        A0r.A0G("lead_ad_post_click_entry_fragment_backstack", 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.os.Bundle r6, androidx.fragment.app.Fragment r7, androidx.fragment.app.Fragment r8, com.instagram.common.session.UserSession r9, java.lang.String r10, boolean r11) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            r1 = r7
            boolean r0 = r7 instanceof X.C53022Ncu
            if (r0 != 0) goto L14
            androidx.fragment.app.Fragment r1 = r7.mParentFragment
            boolean r0 = r1 instanceof X.C53022Ncu
            if (r0 == 0) goto L3b
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.leadads.fragment.LeadAdsFormContainerFragment"
            X.C14360o3.A0C(r1, r0)
        L14:
            if (r1 == 0) goto L3b
            r8.setArguments(r6)
            X.0no r4 = X.AbstractC43593JPy.A0F(r1)
            if (r11 == 0) goto L2e
            r3 = 2130772095(0x7f01007f, float:1.7147299E38)
            r2 = 2130772066(0x7f010062, float:1.714724E38)
            r1 = 2130772064(0x7f010060, float:1.7147236E38)
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            r4.A07(r3, r2, r1, r0)
        L2e:
            r0 = 2131435327(0x7f0b1f3f, float:1.8492493E38)
            r4.A0D(r8, r10, r0)
            r4.A0I(r10)
            r4.A00()
            return
        L3b:
            X.6Yy r0 = X.AbstractC31175DnJ.A0C(r7, r9)
            r0.A0B(r6, r8)
            if (r11 == 0) goto L47
            r0.A09()
        L47:
            if (r10 == 0) goto L4d
            r0.A0C = r10
            r0.A0A = r10
        L4d:
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55137Oc5.A02(android.os.Bundle, androidx.fragment.app.Fragment, androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, java.lang.String, boolean):void");
    }

    public final void A03(Fragment fragment, UserSession userSession, boolean z, boolean z2) {
        AbstractC52562NNi abstractC52562NNi;
        C14360o3.A0B(userSession, 1);
        N43 n43 = null;
        if (z2) {
            FragmentActivity requireActivity = fragment.requireActivity();
            if ((fragment instanceof AbstractC52562NNi) && (abstractC52562NNi = (AbstractC52562NNi) fragment) != null) {
                n43 = abstractC52562NNi.A02;
            }
            A01(requireActivity, userSession, n43, z);
            return;
        }
        Fragment fragment2 = fragment.mParentFragment;
        if (!(fragment2 instanceof C53022Ncu) || fragment2 == null) {
            return;
        }
        if (C14360o3.A0K(fragment.mTag, "lead_ad_post_click_initial_fragment_backstack")) {
            A01(fragment2.requireActivity(), userSession, null, z);
        } else {
            fragment2.getChildFragmentManager().A0b();
        }
    }

    public static final void A00(Fragment fragment) {
        BaseFragmentActivity baseFragmentActivity;
        Fragment fragment2 = fragment.mParentFragment;
        if (fragment2 instanceof C53022Ncu) {
            FragmentActivity activity = fragment2.getActivity();
            if ((activity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) activity) != null) {
                baseFragmentActivity.A0a();
            }
        }
    }
}
