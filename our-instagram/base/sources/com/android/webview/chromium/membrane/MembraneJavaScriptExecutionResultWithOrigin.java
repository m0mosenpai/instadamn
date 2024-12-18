package com.android.webview.chromium.membrane;

/* loaded from: classes10.dex */
public class MembraneJavaScriptExecutionResultWithOrigin {
    public String mCallbackResult;
    public String mOriginName;

    public static MembraneJavaScriptExecutionResultWithOrigin create(String str, String str2) {
        return new MembraneJavaScriptExecutionResultWithOrigin(str, str2);
    }

    public String getCallbackResult() {
        return this.mCallbackResult;
    }

    public String getOriginName() {
        return this.mOriginName;
    }

    public MembraneJavaScriptExecutionResultWithOrigin(String str, String str2) {
        this.mOriginName = str;
        this.mCallbackResult = str2;
    }
}
