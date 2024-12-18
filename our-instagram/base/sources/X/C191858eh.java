package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.8eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191858eh extends AbstractC191868ei {
    public AbstractC12990ll A02;
    public String A03;
    public HashMap A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public String A04 = "";
    public long A01 = 0;
    public long A00 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C191858eh) {
                C191858eh c191858eh = (C191858eh) obj;
                if (!this.A02.equals(c191858eh.A02) || !this.A03.equals(c191858eh.A03) || !this.A04.equals(c191858eh.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A04});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IgBloksDataProps");
        sb.append(" ");
        sb.append("session");
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(this.A02.toString());
        sb.append("IgBloksDataProps");
        sb.append(" ");
        sb.append("appId");
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(this.A03);
        sb.append(" ");
        sb.append("cacheKey");
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(this.A04);
        sb.append(" ");
        sb.append("secondsUnderWhichToOnlyServeCache");
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(this.A01);
        sb.append(" ");
        sb.append("secondsCacheIsValidFor");
        sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sb.append(this.A00);
        HashMap hashMap = this.A05;
        if (hashMap != null) {
            sb.append(" ");
            sb.append("params");
            sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            sb.append(hashMap.toString());
        }
        return sb.toString();
    }
}
