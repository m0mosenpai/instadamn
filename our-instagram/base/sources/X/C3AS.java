package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.3AS, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3AS {
    public static final C3AT A00(String str) {
        List A0R = AbstractC001900j.A0R(str, new String[]{";"}, 0);
        return new C3AT(BF9.A00((String) A0R.get(0)), BF9.A00((String) A0R.get(1)), BF9.A00((String) A0R.get(2)), BF9.A00((String) A0R.get(3)));
    }

    public static final C3AT A01(String str) {
        List A0R = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        return new C3AT(new C9EB(A0R, 9), new C9EB(A0R, 10), new C9EB(A0R, 11), new C9EB(A0R, 12));
    }
}
