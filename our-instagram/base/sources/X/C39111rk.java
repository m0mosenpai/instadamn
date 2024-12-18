package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.1rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39111rk {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{single=(");
        sb.append(this.A03);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(this.A01);
        sb.append("), batch=(");
        sb.append(this.A02);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append(this.A00);
        sb.append(")}");
        return sb.toString();
    }

    public C39111rk(long j, long j2, long j3, long j4) {
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
    }
}
