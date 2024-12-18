package X;

import android.net.Uri;

/* renamed from: X.1TW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1TW {
    public static final android.net.Uri A00;
    public static final String A01;

    static {
        String A0R = AnonymousClass001.A0R("com.facebook.appmanager", ".modules");
        A01 = A0R;
        A00 = new Uri.Builder().scheme("content").authority(A0R).build();
    }
}
