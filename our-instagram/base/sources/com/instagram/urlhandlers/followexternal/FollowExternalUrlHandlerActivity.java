package com.instagram.urlhandlers.followexternal;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35275FhA;
import X.C0f9;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.List;

/* loaded from: classes6.dex */
public final class FollowExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(1011774531);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                i = -924608750;
            } else {
                A07.putString("short_url", A0a);
                List<String> pathSegments = AbstractC25227BEk.A0B(A0a).getPathSegments();
                if (pathSegments.size() < 2) {
                    i = -1487049383;
                } else {
                    A07.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", (String) AbstractC25227BEk.A0t(pathSegments));
                    AbstractC35275FhA.A0A(A07, this, A0V);
                    i = 696437493;
                }
            }
            C0f9.A07(i, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(315873242, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
