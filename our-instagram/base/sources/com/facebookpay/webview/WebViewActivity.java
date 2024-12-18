package com.facebookpay.webview;

import X.AbstractC08800ci;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC62316S6l;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C62732SNx;
import X.R7N;
import X.S1I;
import X.SKX;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class WebViewActivity extends FragmentActivity {
    public SecureWebView A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bW, java.lang.Object] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int A00 = C0f9.A00(-2146071051);
        super.onCreate(bundle);
        setContentView(R.layout.web_view_activity);
        this.A00 = (SecureWebView) findViewById(R.id.web_view);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        AbstractC08800ci abstractC08800ci = AbstractC62316S6l.A00;
        C14360o3.A07(abstractC08800ci);
        A1E2.add(abstractC08800ci);
        C62732SNx c62732SNx = new C62732SNx(new Object(), new S1I(), A1E, A1E2);
        R7N r7n = new R7N();
        SecureWebView secureWebView = this.A00;
        if (secureWebView != null) {
            secureWebView.A01 = c62732SNx;
            secureWebView.A02(r7n);
            SecureWebView secureWebView2 = this.A00;
            if (secureWebView2 != null) {
                secureWebView2.A01(new SKX());
                Intent intent = getIntent();
                if (intent != null && (stringExtra = intent.getStringExtra("WEB_VIEW_URL")) != null) {
                    SecureWebView secureWebView3 = this.A00;
                    if (secureWebView3 != null) {
                        secureWebView3.loadUrl(stringExtra);
                        C0f9.A07(307843907, A00);
                        return;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C14360o3.A0F("webView");
        throw C00O.createAndThrow();
    }
}
