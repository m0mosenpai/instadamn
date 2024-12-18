package com.instagram.urlhandlers.broadcastchannelcontrols;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC34088F2q;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C32328ELw;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes6.dex */
public final class BroadcastChannelControlsUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        int A00 = C0f9.A00(1060307549);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null && A0a.length() != 0) {
            C09Y c09y = C023409i.A0A;
            if (!(c09y.A05(this) instanceof UserSession)) {
                finish();
                i = 953010238;
            } else {
                AbstractC18680vv A05 = c09y.A05(this);
                AbstractC31171DnF.A1Q(A05);
                UserSession userSession = (UserSession) A05;
                String queryParameter = AbstractC25227BEk.A0B(A0a).getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                if (queryParameter != null && queryParameter.length() != 0) {
                    C32328ELw A002 = AbstractC34088F2q.A00(userSession, AbstractC31171DnF.A0N(queryParameter), "qp_deeplink");
                    C140966Yy A0C = AbstractC31180DnO.A0C(this, c09y.A05(this));
                    A0C.A0D(A002);
                    A0C.A04();
                }
                i = 287290709;
            }
        } else {
            finish();
            i = 1527633395;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
