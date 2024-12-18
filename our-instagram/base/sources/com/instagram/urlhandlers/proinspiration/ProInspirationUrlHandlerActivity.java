package com.instagram.urlhandlers.proinspiration;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC35275FhA;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class ProInspirationUrlHandlerActivity extends BaseFragmentActivity {
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

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        int A00 = C0f9.A00(-1042626729);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
            Uri A0B = AbstractC25227BEk.A0B(A0a);
            String queryParameter = A0B.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            String queryParameter2 = A0B.getQueryParameter("media_id");
            boolean booleanQueryParameter = A0B.getBooleanQueryParameter("should_show_promotion_content", false);
            if (C14360o3.A0K(A0B.toString(), "https://www.instagram.com/linking/inspiration_hub") || C14360o3.A0K(A0B.toString(), "https://instagram.com/linking/inspiration_hub")) {
                booleanQueryParameter = true;
                queryParameter = "deep_link";
            }
            A07.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
            A07.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
            A07.putString("media_id", queryParameter2);
            A07.putBoolean("should_show_promotion_content", booleanQueryParameter);
            AbstractC31173DnH.A1A(A0B, A07, "dummy_param_random_uuid");
            AbstractC31172DnG.A1I(A0B, A07, "has_relaunched_from_main_activity");
            if (!AbstractC31172DnG.A1Y(this)) {
                AbstractC35178FfV.A03(A07, this);
            } else {
                AbstractC35275FhA.A07(A07, this, getSession());
            }
            i = 662183060;
        } else {
            finish();
            i = 588382744;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
