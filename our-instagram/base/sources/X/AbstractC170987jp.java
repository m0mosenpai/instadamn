package X;

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170987jp {
    public static final int A00(String str, long j, boolean z) {
        C14360o3.A0B(str, 0);
        C006802i c006802i = C006802i.A0p;
        int andIncrement = C170977jo.A07.getAndIncrement();
        String lowerCase = AbstractC170997jq.A02.A00(str, "$1_$2").toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        String A03 = C00Q.A03(AbstractC170997jq.A00.A00(AbstractC170997jq.A01.A00(lowerCase, "_"), "_"), 80);
        if (!AbstractC170997jq.A03.A08(A03)) {
            C0K8.A0O("QplPivotValidator", "Entity %s converts to bad pivot %s", str, A03);
        }
        c006802i.markerLinkPivot(220142130, andIncrement, A03);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c006802i.markerStart(220142130, andIncrement, j, timeUnit);
        c006802i.markerPoint(220142130, andIncrement, "marker_start", SystemClock.uptimeMillis(), timeUnit);
        if (z) {
            c006802i.markerAnnotate(220142130, andIncrement, "anticipated", 1);
        }
        return andIncrement;
    }
}
