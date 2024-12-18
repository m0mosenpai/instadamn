package com.instagram.urlhandlers.professionalonboardingchecklistexternal;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C00O;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class ProfessionalOnboardingChecklistExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(245879421);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        C09Y c09y = C023409i.A0A;
        C14360o3.A0A(A07);
        AbstractC18680vv A04 = c09y.A04(A07);
        C14360o3.A0B(A04, 0);
        this.A00 = A04;
        if (!(A04 instanceof UserSession)) {
            AbstractC35178FfV.A01(this, A07, A04);
        } else {
            UserSession userSession = (UserSession) A04;
            AbstractC31177DnL.A0m();
            AbstractC31171DnF.A1Q(userSession);
            AbstractC31173DnH.A1C(A07, userSession);
            A07.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "deep_link");
            AbstractC31173DnH.A0u();
            OnboardingCheckListFragment onboardingCheckListFragment = new OnboardingCheckListFragment();
            onboardingCheckListFragment.setArguments(A07);
            onboardingCheckListFragment.setArguments(A07);
            AbstractC31180DnO.A1C(onboardingCheckListFragment, this, userSession);
        }
        C0f9.A07(-1651149157, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
