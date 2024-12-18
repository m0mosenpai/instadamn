package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kt0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47165Kt0 {
    public static DirectThreadThemeInfo A00;

    public static final List A00(String str) {
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
