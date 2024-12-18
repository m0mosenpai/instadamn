package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.concurrent.Callable;

/* renamed from: X.M7i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50045M7i implements Callable {
    public final /* synthetic */ C47495KyO A00;

    public CallableC50045M7i(C47495KyO c47495KyO) {
        this.A00 = c47495KyO;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C47495KyO c47495KyO = this.A00;
        int i = c47495KyO.A00;
        if (i <= 0 || c47495KyO.A01.nextInt(i) != 0) {
            return "";
        }
        Class[] A01 = C27171Tr.A04.A01();
        try {
            long[] A00 = C1TB.A00(A01);
            StringBuilder A1C = AbstractC166987dD.A1C();
            boolean z = false;
            for (int i2 = 0; i2 < A00.length; i2++) {
                Class cls = A01[i2];
                if (cls != null) {
                    if (z) {
                        A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    A1C.append("<cls>");
                    A1C.append(cls.getName());
                    A1C.append("</cls>:");
                    A1C.append(A00[i2]);
                    z = true;
                }
            }
            return A1C.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
