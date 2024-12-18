package com.facebook.secure.webkit;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;

/* loaded from: classes.dex */
public class WebView extends android.webkit.WebView {
    public WebView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
    }

    public WebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    @Deprecated
    public WebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        A00();
    }

    public WebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }
}
