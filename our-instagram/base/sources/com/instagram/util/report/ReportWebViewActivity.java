package com.instagram.util.report;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.C14240no;
import X.C60888Raw;
import X.C64834TVz;
import X.MSY;
import X.S5J;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public class ReportWebViewActivity extends BaseFragmentActivity {
    public UserSession A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        this.A00 = AbstractC31171DnF.A0G(AbstractC31173DnH.A0A(this));
        if (getSupportFragmentManager().A0O(R.id.layout_container_main) == null) {
            C60888Raw c60888Raw = new C60888Raw();
            c60888Raw.setArguments(AbstractC31173DnH.A0A(this));
            C14240no A0G = MSY.A0G(this);
            A0G.A0A(c60888Raw, R.id.layout_container_main);
            A0G.A00();
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C60888Raw c60888Raw = (C60888Raw) getSupportFragmentManager().A0O(R.id.layout_container_main);
        WebView webView = c60888Raw.A01;
        boolean z = c60888Raw.A08;
        if (webView.canGoBack() && z) {
            webView.goBack();
        } else {
            this.A00.A01(S5J.class, new C64834TVz(2));
            super.onBackPressed();
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
