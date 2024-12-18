package net.trustly.android.sdk.views;

import X.C05F;
import X.InterfaceC65460TkW;
import X.Q4e;
import X.Q4r;
import X.SNR;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Map;
import java.util.Random;

/* loaded from: classes10.dex */
public class TrustlyView extends LinearLayout {
    public static int A08 = -1;
    public static boolean A09;
    public Integer A00;
    public String A01;
    public String A02;
    public Map A03;
    public InterfaceC65460TkW A04;
    public InterfaceC65460TkW A05;
    public final WebView A06;
    public final String A07;

    public TrustlyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null);
    }

    public TrustlyView(Context context, AttributeSet attributeSet, String str) {
        this(context, attributeSet, 0, str);
    }

    public TrustlyView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public TrustlyView(Context context, AttributeSet attributeSet, int i, String str) {
        super(context, attributeSet, i);
        SharedPreferences sharedPreferences;
        this.A00 = C05F.A00;
        this.A02 = "msg://return";
        this.A01 = "msg://cancel";
        this.A07 = str != null ? str.toLowerCase() : str;
        try {
            if (A08 < 0 && (sharedPreferences = context.getSharedPreferences("PayWithMyBank", 0)) != null) {
                int i2 = sharedPreferences.getInt("grp", -1);
                A08 = i2;
                if (i2 < 0) {
                    A08 = new Random().nextInt(100);
                    sharedPreferences.edit().putInt("grp", A08).commit();
                }
            }
        } catch (Exception unused) {
            A08 = 1;
        }
        WebView webView = new WebView(context);
        this.A06 = webView;
        webView.setScrollContainer(false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        webView.setLayoutParams(layoutParams);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.addJavascriptInterface(new SNR(this), "TrustlyNativeSDK");
        webView.setWebChromeClient(new Q4e(this, this));
        webView.setWebViewClient(new Q4r(2, this, this));
        addView(webView);
    }

    public TrustlyView(Context context, String str) {
        this(context, null, 0, null);
    }

    public TrustlyView(Context context) {
        this(context, null, 0, null);
    }
}
