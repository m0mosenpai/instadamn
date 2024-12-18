package X;

import android.content.Context;

/* renamed from: X.3U2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3U2 {
    public static final C3U2 A01 = new C3U2();
    public C3U3 A00 = null;

    public static C3U3 A00(Context context) {
        C3U3 c3u3;
        C3U2 c3u2 = A01;
        synchronized (c3u2) {
            c3u3 = c3u2.A00;
            if (c3u3 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                c3u3 = new C3U3(context);
                c3u2.A00 = c3u3;
            }
        }
        return c3u3;
    }
}
