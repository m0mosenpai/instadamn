package com.instagram.urlhandlers.directmetaaithread;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C65911TwI;
import X.EZ4;
import X.InterfaceC11380iw;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class DirectMetaAiThreadUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_meta_ai_thread_url_handler";
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
        int A00 = C0f9.A00(-1130232558);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1831998638;
        } else {
            super.onCreate(bundle);
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a != null && A0a.length() != 0) {
                if (!AbstractC31172DnG.A1Y(this)) {
                    AbstractC35178FfV.A03(A07, this);
                } else {
                    Object A002 = AbstractC54852fj.A00();
                    AbstractC31171DnF.A1P(A002);
                    AbstractC18680vv session = getSession();
                    AbstractC31171DnF.A1Q(session);
                    UserSession userSession = (UserSession) session;
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    String A0X = AbstractC31175DnJ.A0X(A0B, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    C65911TwI.A04.A00(userSession, new EZ4((FragmentActivity) A002, this, userSession, A0B.getQueryParameter("prompt"), A0X, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())), null, 2);
                }
            }
            finish();
            i = -1436240291;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
