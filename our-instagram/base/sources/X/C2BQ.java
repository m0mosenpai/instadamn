package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.2BQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BQ {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(this.A04);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append("bw=");
        sb.append(this.A00);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append("ttfb=");
        sb.append(this.A03);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append("ts=");
        sb.append(this.A02);
        sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        sb.append("bwt=");
        sb.append(this.A01);
        return sb.toString();
    }

    public C2BQ(String str, long j, long j2, long j3, long j4) {
        this.A04 = str;
        this.A00 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = j4;
    }
}
