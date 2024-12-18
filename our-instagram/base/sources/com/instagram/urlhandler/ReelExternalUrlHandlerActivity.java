package com.instagram.urlhandler;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC58327PtK;
import X.C0f9;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.media.ShortUrlReelLoadingFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* loaded from: classes6.dex */
public class ReelExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        int i;
        int A00 = C0f9.A00(-2058561425);
        super.onCreate(AbstractC58327PtK.A00(bundle));
        Bundle A07 = AbstractC31176DnK.A07(this);
        A07.getClass();
        this.A00 = AbstractC31172DnG.A0V(A07);
        String A0a = AbstractC31171DnF.A0a(A07);
        if (A0a == null) {
            finish();
            i = -644339325;
        } else {
            if (A0a.indexOf("applink") != -1) {
                A0a = A0a.replace("applink", "www");
            }
            A07.putString("com.instagram.url.constants.ARGUMENTS_KEY_REEL_SHORT_URL", A0a);
            AbstractC18680vv abstractC18680vv = this.A00;
            if (abstractC18680vv != null && (abstractC18680vv instanceof UserSession)) {
                IgFragmentFactoryImpl.A00();
                ShortUrlReelLoadingFragment shortUrlReelLoadingFragment = new ShortUrlReelLoadingFragment();
                AbstractC31173DnH.A1C(A07, (UserSession) abstractC18680vv);
                shortUrlReelLoadingFragment.setArguments(A07);
                AbstractC31181DnP.A0a(shortUrlReelLoadingFragment, this, abstractC18680vv);
            } else {
                AbstractC35178FfV.A00().A00(this, A07, this.A00);
            }
            i = -84694532;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
