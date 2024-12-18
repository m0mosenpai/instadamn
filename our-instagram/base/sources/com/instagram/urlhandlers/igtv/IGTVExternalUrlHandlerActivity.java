package com.instagram.urlhandlers.igtv;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public class IGTVExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r1 != false) goto L25;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -2027743217(0xffffffff8723180f, float:-1.2269827E-34)
            int r5 = X.C0f9.A00(r0)
            super.onCreate(r9)
            android.os.Bundle r6 = X.AbstractC31176DnK.A07(r8)
            if (r6 == 0) goto Lc7
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r6.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc7
            X.0vv r0 = X.AbstractC31172DnG.A0V(r6)
            r8.A00 = r0
            java.lang.String r1 = r6.getString(r1)
            android.os.Bundle r4 = X.AbstractC166987dD.A0b()
            if (r1 == 0) goto L56
            X.0bW r0 = X.FE5.A00
            r7 = 1
            android.net.Uri r3 = X.AbstractC08820cl.A01(r0, r1)
            if (r3 == 0) goto L56
            java.util.List r2 = r3.getPathSegments()
            int r0 = X.AbstractC31172DnG.A03(r2, r7)
            java.lang.String r0 = X.AbstractC25226BEj.A1I(r2, r0)
            int r1 = r0.length()
            r0 = 28
            if (r1 > r0) goto Lb8
            int r0 = X.AbstractC31172DnG.A03(r2, r7)
            java.lang.String r1 = X.AbstractC25226BEj.A1I(r2, r0)
            java.lang.String r0 = "igtv_deeplink_short_url_arg"
            r4.putString(r0, r1)
        L56:
            r6.putAll(r4)
            java.lang.String r0 = "igtv_deeplink_short_url_arg"
            java.lang.String r3 = r6.getString(r0)
            java.lang.String r0 = "igtv_deeplink_should_open_in_browser"
            boolean r1 = r6.getBoolean(r0)
            X.0vv r0 = r8.A00
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L7b
            X.1Ur r1 = X.AbstractC35178FfV.A00()
            X.0vv r0 = r8.A00
            r1.A00(r8, r6, r0)
        L74:
            r0 = -1343150069(0xffffffffaff1280b, float:-4.3866097E-10)
        L77:
            X.C0f9.A07(r0, r5)
            return
        L7b:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L9e
            if (r1 != 0) goto La0
            X.14H r0 = X.C14H.A00()
            android.content.Intent r2 = r0.A01(r8)
            java.lang.String r0 = "instagram://tv_viewer"
            android.net.Uri$Builder r1 = X.AbstractC31175DnJ.A04(r0)
            java.lang.String r0 = "short_url"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r3)
            X.AbstractC31180DnO.A0z(r8, r2, r0)
        L9a:
            r8.finish()
            goto L74
        L9e:
            if (r1 == 0) goto L74
        La0:
            X.0vv r3 = r8.A00
            java.lang.String r0 = "igtv_deeplink_full_url_arg"
            java.lang.String r2 = r6.getString(r0)
            r0 = 373(0x175, float:5.23E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r1 = r6.getString(r0)
            X.2Fb r0 = X.C2Fb.A24
            X.AbstractC35275FhA.A04(r8, r3, r0, r2, r1)
            goto L9a
        Lb8:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "igtv_deeplink_full_url_arg"
            r4.putString(r0, r1)
            java.lang.String r0 = "igtv_deeplink_should_open_in_browser"
            r4.putBoolean(r0, r7)
            goto L56
        Lc7:
            r8.finish()
            r0 = 532921218(0x1fc3bb82, float:8.289592E-20)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.igtv.IGTVExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
