package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;

/* renamed from: X.9zT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC226719zT {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static void A00() {
        ?? arrayList;
        if (!C2B0.A02) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            C14360o3.A07(stackTrace);
            int length = stackTrace.length;
            if (2 >= length) {
                arrayList = AbstractC009903n.A0J(stackTrace);
            } else {
                arrayList = new ArrayList(2);
                for (int i = length - 2; i < length; i++) {
                    arrayList.add(stackTrace[i]);
                }
            }
            C18950wb.A00(AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", arrayList, null), 17640711, false).report();
            return;
        }
        throw AbstractC167027dH.A0W();
    }
}
