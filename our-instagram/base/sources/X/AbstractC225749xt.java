package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225749xt {
    public static List A00(C23031Ai c23031Ai) {
        try {
            String str = (String) c23031Ai.A0R.CES(c23031Ai, C23031Ai.A8c[46]);
            if (str != null) {
                List A0R = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                ArrayList A0q = AbstractC167017dG.A0q(A0R);
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1X(A0q, Long.parseLong(AbstractC166987dD.A1B(it)));
                }
                return A0q;
            }
            return C16930sl.A00;
        } catch (Exception unused) {
            return C16930sl.A00;
        }
    }
}
