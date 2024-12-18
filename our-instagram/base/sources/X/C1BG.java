package X;

import com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface;

/* renamed from: X.1BG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BG implements TrafficNTSNetSeerV1ConfigInterface {
    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final boolean getEnableLogging() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final boolean getEnableLoggingOnInit() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final boolean getEnableProbeCancellation() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final boolean getEnableThriftSerializedLogs() {
        return false;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final int getMaxBackgroundTaskDurationSeconds() {
        return 0;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final int getProbingIntervalSeconds() {
        return 0;
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final String getLogVersionString() {
        return "";
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final String getLowerHttpStackProbingTargets() {
        return "";
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final String getNativeStackProbingTargets() {
        return "";
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final String getProbingCommonHeadersString() {
        return "";
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final String getProbingResponseHeadersToLogString() {
        return "";
    }

    @Override // com.facebook.traffic.nts.TrafficNTSNetSeerV1ConfigInterface
    public final String getTigonProbingTargets() {
        return "";
    }
}
