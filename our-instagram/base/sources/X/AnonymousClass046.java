package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.046, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass046 {
    public static int A00;
    public static int A01;
    public static final AnonymousClass045 A02 = new Object();
    public static final String A03;

    public static final void A00(Context context, AnonymousClass047 anonymousClass047) {
        A3B.A00(new C017606w(1, context, anonymousClass047));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.045, java.lang.Object] */
    static {
        String obj = new Uri.Builder().scheme("https").authority("i.instagram.com").path("api/v1/instacrash/log/").build().toString();
        C14360o3.A07(obj);
        A03 = obj;
    }

    public static final void A01(Context context, AnonymousClass047 anonymousClass047, long j) {
        A3B.A00(new C0AZ(context, anonymousClass047, j));
    }

    public static final void A02(Context context, AnonymousClass047 anonymousClass047, boolean z) {
        A3B.A00(new C0AC(context, anonymousClass047, z));
    }
}
