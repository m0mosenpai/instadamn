package com.instagram.urlhandlers.bloksnativehybridshell;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC60672pq;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C27391Ur;
import android.os.Bundle;
import com.facebook.endtoend.EndToEnd;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class BloksNativeHybridShellUrlHandlerActivity extends BaseFragmentActivity {
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
        String A0a;
        int A00 = C0f9.A00(815493102);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null && A0a.length() != 0 && EndToEnd.isRunningEndToEndTest()) {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            if (!(A0V instanceof UserSession)) {
                C27391Ur A002 = AbstractC35178FfV.A00();
                AbstractC18680vv abstractC18680vv = this.A00;
                C14360o3.A0A(abstractC18680vv);
                A002.A00(this, A07, abstractC18680vv);
                i = -1293062968;
            } else {
                C140966Yy A0r = AbstractC25225BEi.A0r(this, A0V);
                A0r.A0D(new AbstractC60672pq());
                A0r.A04();
                i = 2053595211;
            }
        } else {
            finish();
            i = -1412012386;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
