package com.android.webview.chromium.membrane;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewDelegate;

/* loaded from: classes10.dex */
public interface AppHostedChromium {
    AppHostedWebViewFactoryProvider createWebViewFactoryProvider(WebViewDelegate webViewDelegate, Context context, WebViewEmbedderOptions webViewEmbedderOptions);

    HeliumWebViewExtensions getHeliumWebViewExtensions(WebView webView);
}
