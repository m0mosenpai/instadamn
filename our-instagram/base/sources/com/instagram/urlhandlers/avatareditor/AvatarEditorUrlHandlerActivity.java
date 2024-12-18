package com.instagram.urlhandlers.avatareditor;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC47193KtS;
import X.C0f9;
import X.C35909FtT;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class AvatarEditorUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String A0a;
        int A00 = C0f9.A00(-1554328575);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (A0F instanceof UserSession) {
                AbstractC47193KtS.A01.A02(this, new C35909FtT(this, 7), (UserSession) A0F, "ig_deeplink", "ig_deeplink", A0a);
            } else {
                AbstractC35178FfV.A01(this, A07, A0F);
            }
        } else {
            finish();
        }
        C0f9.A07(-1772292641, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
