package com.facebookpay.offsite.models.message;

import X.AbstractC25227BEk;
import X.C14360o3;
import android.net.Uri;
import android.webkit.URLUtil;

/* loaded from: classes9.dex */
public final class UriUtils {
    public static final UriUtils INSTANCE = new Object();

    public final String checkUriFormat(String str) {
        C14360o3.A0B(str, 0);
        if (!URLUtil.isValidUrl(str)) {
            return null;
        }
        return str;
    }

    public final String toUriAuthorityAndPath(String str) {
        C14360o3.A0B(str, 0);
        try {
            Uri A0B = AbstractC25227BEk.A0B(str);
            return new Uri.Builder().scheme(A0B.getScheme()).authority(A0B.getAuthority()).build().toString();
        } catch (SecurityException unused) {
            return new String();
        }
    }
}
