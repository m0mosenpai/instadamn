package com.instagram.urlhandlers.learnfromothers;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C34404FEu;
import X.C35756Fqt;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class LearnFromOthersUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [X.FOi, java.lang.Object] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(1599082897);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            A07 = AbstractC166987dD.A0b();
        }
        if (!AbstractC31172DnG.A1Y(this)) {
            AbstractC35178FfV.A03(A07, this);
        } else {
            C35756Fqt.A00(getSupportFragmentManager(), this, 15);
            String string = A07.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (string == null) {
                string = "professional_onboarding_checklist";
            }
            String string2 = getApplicationContext().getString(2131965051);
            String string3 = getApplicationContext().getString(2131965050);
            SuggestBusinessFragment suggestBusinessFragment = new SuggestBusinessFragment();
            Bundle A0F = AbstractC31174DnI.A0F(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string);
            A0F.putString("suggested_business_fetch_entry_point", "onboarding_checklist_render");
            A0F.putString("ARG_TITLE", string2);
            A0F.putString("ARG_SUB_TITLE", string3);
            suggestBusinessFragment.setArguments(A0F);
            Bundle A0B = AbstractC31177DnL.A0B(suggestBusinessFragment);
            A0B.putAll(A07);
            suggestBusinessFragment.setArguments(A0B);
            new Object().A00(suggestBusinessFragment, this, new C34404FEu(getSession()), null, true);
        }
        C0f9.A07(1445152589, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
