package com.instagram.urlhandlers.clipsaudio;

import X.AbstractC12990ll;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C172077lc;
import X.C35221FgE;
import X.C3K8;
import X.C71313Hs;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public class ClipsAudioUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity
    public final C172077lc getGnvGestureHandler() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (C3K8.A02(abstractC18680vv)) {
            C172077lc A00 = C172077lc.A00(abstractC18680vv);
            C71313Hs A002 = C71313Hs.A00(abstractC18680vv);
            A00.A03(A002);
            A00.A02(A002);
            return A00;
        }
        return null;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1658449567);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -644313518;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            if (!(A0V instanceof UserSession)) {
                AbstractC35178FfV.A00().A00(this, A07, this.A00);
                finish();
                i = 253425519;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (TextUtils.isEmpty(A0a)) {
                    finish();
                    i = 1415340967;
                } else {
                    UserSession userSession = (UserSession) this.A00;
                    AbstractC167007dF.A1D(userSession, 0, A0a);
                    if (!C35221FgE.A02(C35221FgE.A00(userSession, A0a, null, false), this, userSession, null, false)) {
                        finish();
                    }
                    i = 797943933;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
