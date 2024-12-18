package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.2B8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B8 implements C2AJ {
    public final InbandTelemetryBweEstimate A00;

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C2B8) obj).A00);
    }

    @Override // X.C2AJ
    public final long getEstimatedBitrate(long j, int i, String str) {
        return -1L;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C2B8(InbandTelemetryBweEstimate inbandTelemetryBweEstimate) {
        this.A00 = inbandTelemetryBweEstimate;
    }
}
