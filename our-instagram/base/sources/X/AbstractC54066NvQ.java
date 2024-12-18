package X;

import android.net.Uri;

/* renamed from: X.NvQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54066NvQ {
    public static final android.net.Uri A00(String str, String str2) {
        C14360o3.A0B(str2, 1);
        android.net.Uri build = new Uri.Builder().scheme("ig").authority("notif").appendPath(str).appendPath(str2).build();
        C14360o3.A07(build);
        return build;
    }
}
