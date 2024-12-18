package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0Ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06100Ua {
    public final int A00;
    public final long A01;

    public C06100Ua(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public static File A00(Context context, boolean z) {
        String str;
        String str2 = context.getApplicationInfo().dataDir;
        if (z) {
            str = "insta_crash_remedy_log";
        } else {
            str = "remedy_log";
        }
        return new File(str2, str);
    }

    public static void A01(Context context, boolean z) {
        if (!A00(context, z).delete()) {
            android.util.Log.w("CrashLoopRemedyLog", AnonymousClass001.A1D("unable to delete remedy log, instaCrash: ", z));
        }
    }
}
