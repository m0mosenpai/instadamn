package com.instagram.urlhandlers.followandinvitefriends;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C27391Ur;
import X.C33209Ekx;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FollowAndInviteFriendsUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-1447095756);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = 904730028;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(bundleExtra);
            this.A00 = A0V;
            if (A0V == null) {
                i = -1995130025;
            } else {
                if (!(A0V instanceof UserSession)) {
                    C27391Ur A002 = AbstractC35178FfV.A00();
                    AbstractC18680vv abstractC18680vv = this.A00;
                    C14360o3.A0A(abstractC18680vv);
                    A002.A00(this, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"), abstractC18680vv);
                } else {
                    C140966Yy A0D = AbstractC31180DnO.A0D(this, AbstractC03270Dk.A00(A0V));
                    A0D.A0D(new C33209Ekx());
                    A0D.A04();
                }
                i = 1327169534;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
