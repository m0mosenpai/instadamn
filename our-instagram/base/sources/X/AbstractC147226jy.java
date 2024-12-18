package X;

import android.os.Bundle;

/* renamed from: X.6jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC147226jy {
    public static final Boolean A00(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        return null;
    }
}
