package com.instagram.urlhandlers.clipstemplatebrowser;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC40914IAm;
import X.AbstractC54852fj;
import X.C0f9;
import X.C24H;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes9.dex */
public final class ClipsTemplateBrowserUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1039299021);
        super.onCreate(bundle);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C24H.DEEPLINK);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        AbstractC31171DnF.A1Q(A0F);
        AbstractC40914IAm.A00(this, getApplicationContext(), A0b, (UserSession) A0F);
        if (AbstractC54852fj.A00() != null) {
            finish();
        }
        C0f9.A07(1954609503, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
