package com.android.webview.chromium.membrane;

import android.webkit.ValueCallback;

/* loaded from: classes10.dex */
public interface HeliumWebViewExtensions {
    void evaluateJavaScriptInWorld(String str, ValueCallback valueCallback, MembraneJSWorld membraneJSWorld);

    void evaluateJavaScriptOnAllFrames(String str, ValueCallback valueCallback);

    void evaluateJavaScriptOnAllFrames(String str, boolean z, ValueCallback valueCallback);

    void resetAutofillProvider();

    void setBottomControlsAnimatorCallback(MembraneViewAndroidDelegateBottomControlsAnimatorCallback membraneViewAndroidDelegateBottomControlsAnimatorCallback);

    void setBottomControlsHeight(int i);

    void setShareDelegate(AppHostedShareDelegate appHostedShareDelegate);
}
