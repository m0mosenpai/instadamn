package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.1CY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CY {
    public static C23441Cg A00;

    public static synchronized C23441Cg A00() {
        C23441Cg c23441Cg;
        synchronized (C1CY.class) {
            c23441Cg = A00;
            if (c23441Cg == null) {
                Context context = AbstractC12290kX.A00;
                long A01 = C20150ym.A01(AbstractC20100yh.A00(36591893001469999L));
                boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36314283495524872L));
                long A012 = C20150ym.A01(AbstractC20100yh.A00(36591893001535536L));
                String A03 = C20150ym.A03(AbstractC20100yh.A00(36873367978311684L));
                boolean A072 = C20150ym.A07(AbstractC20100yh.A00(36310418025021494L));
                boolean A073 = C20150ym.A07(AbstractC20100yh.A00(36310418025087031L));
                HashSet hashSet = new HashSet();
                if (A03 != null && !A03.isEmpty()) {
                    hashSet = new HashSet(Arrays.asList(A03.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
                }
                c23441Cg = new C23441Cg(context, C1CZ.A00(context, null), new C23421Ce(hashSet, A01, A012, A073, A072, A07), new C23431Cf(context, new Handler(C1CG.A00())));
                A00 = c23441Cg;
            }
        }
        return c23441Cg;
    }
}
