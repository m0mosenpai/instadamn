package com.instagram.urlhandlers.professionalsignupnuxexternal;

import X.AbstractC03240Dh;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C12260kU;
import X.F0G;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class ProfessionalSignupNuxExternalUrlHandlerActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(320878370);
        super.onCreate(bundle);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        this.A00 = A0F;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (!(this.A00 instanceof UserSession)) {
            AbstractC35178FfV.A01(this, A07, A0F);
        } else {
            AbstractC31171DnF.A1Q(A0F);
            if (A07 != null) {
                AbstractC03240Dh.A00(A07, A0F);
                String stringExtra = getIntent().getStringExtra(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (stringExtra == null) {
                    stringExtra = "deep_link";
                }
                F0G.A00();
                Intent A08 = AbstractC31173DnH.A08(this);
                A07.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, stringExtra);
                A07.putBoolean("only_show_nux_screens", true);
                AbstractC31174DnI.A1A(A08, 7, A07);
                C12260kU.A08(this, A08, 11);
                finish();
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A07(-551730173, A00);
                throw A0g;
            }
        }
        C0f9.A07(-1391051839, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
