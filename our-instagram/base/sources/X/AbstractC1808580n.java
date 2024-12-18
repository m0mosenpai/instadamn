package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.80n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1808580n {
    public static final void A02(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(str, 0);
        }
    }

    public static final void A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection("TrackDownloader.downloadTrack", 0);
        }
    }

    public static final void A01() {
        AbstractC09790fc.A00(-808657563);
    }

    public static final void A03(String str) {
        C14360o3.A0A(str);
        AbstractC09790fc.A01(str, 802389924);
    }
}
