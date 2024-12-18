package com.instagram.urlhandlers.adsconsentgrowth;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.C0f9;
import X.C70153Cz;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes6.dex */
public final class AdsConsentGrowthUrlHandlerActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-8650559);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 966993227;
        } else {
            this.A00 = AbstractC31172DnG.A0V(A07);
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                i = -1804677472;
            } else {
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                AbstractC18680vv abstractC18680vv = this.A00;
                if (abstractC18680vv != null) {
                    AbstractC25651Mw.A00(abstractC18680vv).E4s(new C70153Cz(A0B));
                }
                finish();
                i = -1220612036;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
