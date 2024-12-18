package com.instagram.urlhandlers.directexternal;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C27391Ur;
import X.C32324ELs;
import X.C35022Fbv;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class DirectExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-2007325575);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent);
        C09Y c09y = C023409i.A0A;
        C14360o3.A0A(A08);
        AbstractC18680vv A04 = c09y.A04(A08);
        this.A00 = A04;
        if (!(A04 instanceof UserSession)) {
            C27391Ur A002 = AbstractC35178FfV.A00();
            AbstractC18680vv abstractC18680vv = this.A00;
            C14360o3.A0A(abstractC18680vv);
            A002.A00(this, A08, abstractC18680vv);
        } else {
            AbstractC31171DnF.A1Q(A04);
            UserSession userSession = (UserSession) A04;
            Context baseContext = getBaseContext();
            C14360o3.A07(baseContext);
            C35022Fbv c35022Fbv = new C35022Fbv(userSession, baseContext);
            if (c35022Fbv.A01()) {
                c35022Fbv.A00();
            } else {
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, intent.getStringExtra(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY));
                C32324ELs c32324ELs = new C32324ELs();
                c32324ELs.setArguments(A0b);
                C140966Yy A0P = AbstractC31173DnH.A0P(this, userSession);
                A0P.A0D = false;
                A0P.A0D(c32324ELs);
                A0P.A04();
            }
        }
        C0f9.A07(-1063657406, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
