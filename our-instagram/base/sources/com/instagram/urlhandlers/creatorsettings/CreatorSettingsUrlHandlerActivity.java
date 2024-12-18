package com.instagram.urlhandlers.creatorsettings;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.C0f9;
import X.C140966Yy;
import X.C33232ElR;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class CreatorSettingsUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(1885806477);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -188040232;
        } else if (AbstractC31171DnF.A0a(A07) == null) {
            finish();
            i = -379854732;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            if (A0V != null) {
                C140966Yy A0C = AbstractC31180DnO.A0C(this, AbstractC03270Dk.A00(A0V));
                A0C.A0D(new C33232ElR());
                A0C.A04();
                i = -1909773088;
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A07(904589070, A00);
                throw A0g;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
