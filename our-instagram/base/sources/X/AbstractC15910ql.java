package X;

import android.content.ContentProviderClient;
import android.content.Context;

/* renamed from: X.0ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15910ql {
    public static final ContentProviderClient A00(Context context, android.net.Uri uri) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(uri, 1);
        try {
            return C0fI.A00(context.getContentResolver(), uri, -823918576);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
