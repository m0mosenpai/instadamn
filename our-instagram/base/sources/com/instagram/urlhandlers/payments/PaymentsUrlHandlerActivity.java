package com.instagram.urlhandlers.payments;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public class PaymentsUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r1.getBoolean(X.AbstractC58317Pt9.A00(733)) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1923392144(0x72a4a290, float:6.5218647E30)
            int r5 = X.C0f9.A00(r0)
            super.onCreate(r10)
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r8 = "com.instagram.url.extra.BUNDLE"
            android.os.Bundle r2 = r0.getBundleExtra(r8)
            if (r2 == 0) goto Lda
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r2.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lda
            X.0vv r0 = X.AbstractC31172DnG.A0V(r2)
            r9.A00 = r0
            java.lang.String r0 = X.AbstractC31173DnH.A0j(r2, r1)
            android.net.Uri r0 = X.AbstractC08820cl.A03(r0)
            android.os.Bundle r6 = X.AbstractC31173DnH.A0A(r9)
            r6.getClass()
            android.os.Bundle r7 = X.AbstractC166987dD.A0b()
            java.lang.String r4 = r0.getHost()
            r4.getClass()
            java.lang.String r2 = "fbpay_hub"
            r3 = r2
            boolean r0 = r4.equals(r2)
            java.lang.String r1 = "PAYMENTS_URL_TYPE"
            if (r0 != 0) goto Ld5
            java.lang.String r2 = "settings_payments"
            boolean r0 = r4.equals(r2)
            if (r0 != 0) goto Ld5
            r7 = 0
        L56:
            r7.getClass()
            r6.putAll(r7)
            X.0vv r0 = r9.A00
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L75
            X.1Ur r1 = X.AbstractC35178FfV.A00()
            X.0vv r0 = r9.A00
            r0.getClass()
            r1.A00(r9, r6, r0)
        L6e:
            r0 = 366718100(0x15dbac94, float:8.8725676E-26)
        L71:
            X.C0f9.A07(r0, r5)
            return
        L75:
            java.lang.String r2 = r6.getString(r1)
            android.os.Bundle r1 = r6.getBundle(r8)
            if (r1 == 0) goto L8c
            r0 = 733(0x2dd, float:1.027E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r4 = 1
            if (r0 != 0) goto L8d
        L8c:
            r4 = 0
        L8d:
            X.0vv r0 = r9.A00
            X.AbstractC31175DnJ.A0r(r6, r0)
            r2.getClass()
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto Lc0
            java.lang.String r0 = "settings_payments"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6e
            X.0vv r3 = r9.A00
            r2 = 0
            com.instagram.settings.common.PaymentOptionsFragment r1 = new com.instagram.settings.common.PaymentOptionsFragment
            r1.<init>()
            r1.setArguments(r6)
        Lae:
            X.6Yy r0 = X.AbstractC25225BEi.A0r(r9, r3)
            X.C14360o3.A0A(r1)
            r0.A0D(r1)
            if (r4 == 0) goto Lbc
            r0.A0D = r2
        Lbc:
            r0.A04()
            goto L6e
        Lc0:
            X.0vv r3 = r9.A00
            r2 = 0
            java.lang.String r1 = "referrer"
            java.lang.String r0 = r6.getString(r1)
            if (r0 != 0) goto Ld0
            java.lang.String r0 = "deeplink"
            r6.putString(r1, r0)
        Ld0:
            androidx.fragment.app.Fragment r1 = X.AbstractC62818SSq.A00(r6)
            goto Lae
        Ld5:
            r7.putString(r1, r2)
            goto L56
        Lda:
            r9.finish()
            r0 = 499709393(0x1dc8f5d1, float:5.3193727E-21)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.payments.PaymentsUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
