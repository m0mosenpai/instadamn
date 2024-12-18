package X;

import android.net.Uri;

/* loaded from: classes10.dex */
public abstract class S9L {
    public static final android.net.Uri A00;
    public static final android.net.Uri A01;
    public static final android.net.Uri A02;

    static {
        String A0R = AnonymousClass001.A0R("com.facebook.appmanager", ".attribution");
        A02 = android.net.Uri.parse(AnonymousClass001.A0R("content://", A0R));
        A01 = new Uri.Builder().scheme("content").authority(A0R).appendPath(AbstractC58361Pu1.A01(0, 9, 38)).build();
        A00 = new Uri.Builder().scheme("content").authority(A0R).appendPath("attribution_info").build();
    }
}
