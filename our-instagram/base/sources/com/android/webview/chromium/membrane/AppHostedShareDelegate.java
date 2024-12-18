package com.android.webview.chromium.membrane;

import android.net.Uri;

/* loaded from: classes10.dex */
public interface AppHostedShareDelegate {

    /* loaded from: classes10.dex */
    public interface ShareResultCallback {
        void onResult(ShareResult shareResult);
    }

    void onShare(String str, String str2, Uri uri, ShareResultCallback shareResultCallback);

    /* loaded from: classes10.dex */
    public enum ShareResult {
        OK(0),
        INTERNAL_ERROR(1),
        PERMISSION_DENIED(2),
        CANCELLED(3);

        public final int value;

        ShareResult(int i) {
            this.value = i;
        }
    }
}
