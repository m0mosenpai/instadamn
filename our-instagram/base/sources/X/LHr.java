package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public abstract class LHr {
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static List A00 = C16930sl.A00;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if (r0.booleanValue() == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(X.K49 r77) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LHr.A00(X.K49):java.util.List");
    }

    public static final List A01(String str) {
        List A0m;
        ArrayList arrayList = null;
        if (str != null && (A0m = AbstractC167007dF.A0m(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null && !A0m.isEmpty()) {
            arrayList = AbstractC167017dG.A0q(A0m);
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                JQ1.A0o(arrayList, it);
            }
        }
        return arrayList;
    }
}
