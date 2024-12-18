package com.instagram.urlhandlers.accounts;

import X.AbstractC09440dt;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC58327PtK;
import X.C06090Tz;
import X.C0f9;
import X.C12260kU;
import X.C18U;
import X.C43204J8b;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.SUK;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class AccountLoginUrlHandlerActivity extends BaseFragmentActivity {
    public final InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43204J8b(this, 20));

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        int A00 = C0f9.A00(-398088457);
        super.onCreate(AbstractC58327PtK.A00(bundle));
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null && AbstractC31172DnG.A1Y(this)) {
            if (!C18U.A06(C06090Tz.A05, getSession(), 36318591348185421L) && SUK.A00(this, AbstractC25227BEk.A0B(A0a), getSession())) {
                finishAffinity();
                i = 84587491;
                C0f9.A07(i, A00);
            }
        }
        C12260kU.A0C(this, AbstractC31172DnG.A0l().A03(this, 268566528));
        finish();
        i = 1072558707;
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
