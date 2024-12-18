package com.facebook.proxygen;

import X.AbstractC166987dD;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes4.dex */
public class GoodputEstimate {
    public final long achievableBps;
    public final long cdfMsSinceLastUpdated;
    public final long cdfSamplesSinceInit;
    public final String cdfSrc;
    public final long ctmNumKnobFrameErrors;
    public final long ctmNumKnobFramesReceived;
    public final long ctmNumSocketObserversAttached;
    public boolean isMaximumAchievableBps;
    public final Long minRttUs;

    public long getAchievableBps() {
        return this.achievableBps;
    }

    public long getCdfMsSinceLastUpdated() {
        return this.cdfMsSinceLastUpdated;
    }

    public long getCdfSamplesSinceInit() {
        return this.cdfSamplesSinceInit;
    }

    public String getCdfSrc() {
        return this.cdfSrc;
    }

    public long getCtmNumKnobFrameErrors() {
        return this.ctmNumKnobFrameErrors;
    }

    public long getCtmNumKnobFramesReceived() {
        return this.ctmNumKnobFramesReceived;
    }

    public long getCtmNumSocketObserversAttached() {
        return this.ctmNumSocketObserversAttached;
    }

    public Long getMinRttUs() {
        return this.minRttUs;
    }

    public boolean isMaximumAchievableBps() {
        return this.isMaximumAchievableBps;
    }

    public GoodputEstimate(long j, boolean z, Long l, String str, long j2, long j3, long j4, long j5, long j6) {
        this.achievableBps = j;
        this.isMaximumAchievableBps = z;
        this.minRttUs = l;
        this.cdfSrc = str;
        this.cdfMsSinceLastUpdated = j2;
        this.cdfSamplesSinceInit = j3;
        this.ctmNumKnobFramesReceived = j4;
        this.ctmNumKnobFrameErrors = j5;
        this.ctmNumSocketObserversAttached = j6;
    }

    public String getDebugString(boolean z) {
        long longValue;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (z) {
            A1C.append("achievableBps=");
            A1C.append(this.achievableBps);
            A1C.append(",isMaximumAchievableBps=");
            A1C.append(this.isMaximumAchievableBps ? 1 : 0);
            A1C.append(",minRttUs=");
            Long l = this.minRttUs;
            if (l == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            A1C.append(longValue);
            A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        A1C.append("cdfSrc=");
        A1C.append(this.cdfSrc);
        A1C.append(",cdfMsSinceLastUpdated=");
        A1C.append(this.cdfMsSinceLastUpdated);
        A1C.append(",cdfSamplesSinceInit=");
        A1C.append(this.cdfSamplesSinceInit);
        A1C.append(",ctmNumKnobFramesReceived=");
        A1C.append(this.ctmNumKnobFramesReceived);
        A1C.append(",ctmNumKnobFrameErrors=");
        A1C.append(this.ctmNumKnobFrameErrors);
        A1C.append(",ctmNumSocketObserversAttached=");
        A1C.append(this.ctmNumSocketObserversAttached);
        return A1C.toString();
    }

    public String getMiniDebugString() {
        long longValue;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("s=");
        A1C.append(this.cdfSrc);
        A1C.append(",mrttus=");
        Long l = this.minRttUs;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        A1C.append(longValue);
        A1C.append(",mslu=");
        A1C.append(this.cdfMsSinceLastUpdated);
        A1C.append(",ssi=");
        A1C.append(this.cdfSamplesSinceInit);
        A1C.append(",nkfr=");
        A1C.append(this.ctmNumKnobFramesReceived);
        A1C.append(",nkfe=");
        A1C.append(this.ctmNumKnobFrameErrors);
        A1C.append(",nsoa=");
        A1C.append(this.ctmNumSocketObserversAttached);
        return A1C.toString();
    }

    public String getDebugString() {
        return getDebugString(false);
    }
}
