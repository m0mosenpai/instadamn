package com.facebook.traffic.knob;

import X.AbstractC62228S2z;
import X.AnonymousClass001;
import X.C71473Il;
import X.RRj;
import X.RRk;
import X.RRw;
import X.S30;
import X.T81;
import X.T84;
import com.google.common.collect.Maps$EntryFunction;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class InbandTelemetryBweEstimate {
    public static final String COMPACT_DEBUG_STR_DELIMITER_LEVEL_1 = ",";
    public static final String HTTP_HEADER_INBAND_ESTIMATE_PREFIX = "inbandbwe-estimate";
    public static final String KEY_VALUE_SEPARATOR = "=";
    public static final int PRIME = 31;
    public final List alternateEstimates;
    public final Map debugInfo;
    public final long httpBytesMultiplexed;
    public final long httpDelaysMs;
    public final String httpLastRequestAppMarker;
    public final String httpRequestTypeId;
    public final long transportDelaysMs;
    public final Map transportGfrKbps;

    /* loaded from: classes.dex */
    public final class Builder {
        public Map transportGfrKbps = new HashMap();
        public long transportDelaysMs = -1;
        public long httpBytesMultiplexed = -1;
        public long httpDelaysMs = -1;
        public String httpRequestTypeId = "";
        public String httpLastRequestAppMarker = "";
        public Map debugInfo = new HashMap();
        public List alternateEstimates = new ArrayList();

        public Builder alternateEstimates(List list) {
            this.alternateEstimates = list;
            return this;
        }

        public InbandTelemetryBweEstimate build() {
            return new InbandTelemetryBweEstimate(this);
        }

        public Builder debugInfo(Map map) {
            this.debugInfo = map;
            return this;
        }

        public Builder httpBytesMultiplexed(long j) {
            this.httpBytesMultiplexed = j;
            return this;
        }

        public Builder httpDelaysMs(long j) {
            this.httpDelaysMs = j;
            return this;
        }

        public Builder httpLastRequestAppMarker(String str) {
            this.httpLastRequestAppMarker = str;
            return this;
        }

        public Builder httpRequestTypeId(String str) {
            this.httpRequestTypeId = str;
            return this;
        }

        public Builder transportDelaysMs(long j) {
            this.transportDelaysMs = j;
            return this;
        }

        public Builder transportGfrKbps(Map map) {
            this.transportGfrKbps = map;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InbandTelemetryBweEstimate inbandTelemetryBweEstimate = (InbandTelemetryBweEstimate) obj;
        return this.transportGfrKbps.equals(inbandTelemetryBweEstimate.transportGfrKbps) && this.transportDelaysMs == inbandTelemetryBweEstimate.transportDelaysMs && this.httpBytesMultiplexed == inbandTelemetryBweEstimate.httpBytesMultiplexed && this.httpDelaysMs == inbandTelemetryBweEstimate.httpDelaysMs && this.httpRequestTypeId.equals(inbandTelemetryBweEstimate.httpRequestTypeId) && this.httpLastRequestAppMarker.equals(inbandTelemetryBweEstimate.httpLastRequestAppMarker) && this.debugInfo.equals(inbandTelemetryBweEstimate.debugInfo) && this.alternateEstimates.equals(inbandTelemetryBweEstimate.alternateEstimates);
    }

    public List getAlternateEstimates() {
        return this.alternateEstimates;
    }

    public long getBandwidthBps(double d) {
        Number number = (Number) this.transportGfrKbps.get(Double.valueOf(d));
        if (number == null) {
            return -1L;
        }
        return number.longValue() * 1000;
    }

    public Map getDebugInfo() {
        return this.debugInfo;
    }

    public String getDebugStr(DebugStrOptions debugStrOptions) {
        Map map;
        C71473Il c71473Il = new C71473Il(COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        if (debugStrOptions.allowListByFieldId.size() > 0) {
            Map map2 = this.debugInfo;
            T81 t81 = new T81(debugStrOptions.allowListByFieldId);
            T84 t84 = new T84(Maps$EntryFunction.A00, t81);
            if (map2 instanceof RRw) {
                RRw rRw = (RRw) map2;
                map = new RRj(S30.A00(rRw.A00, t84), rRw.A01);
            } else {
                map2.getClass();
                map = new RRk(t81, t84, map2);
            }
        } else {
            map = this.debugInfo;
        }
        Iterator it = map.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        try {
            AbstractC62228S2z.A00(c71473Il, sb, KEY_VALUE_SEPARATOR, it);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public long getHttpBytesMultiplexed() {
        return this.httpBytesMultiplexed;
    }

    public long getHttpDelaysMs() {
        return this.httpDelaysMs;
    }

    public Map getHttpHeaders(HttpHeaderOptions httpHeaderOptions) {
        HashMap hashMap = new HashMap();
        hashMap.put(AnonymousClass001.A0R(httpHeaderOptions.prependStr, HTTP_HEADER_INBAND_ESTIMATE_PREFIX), getDebugStr(new DebugStrOptions(httpHeaderOptions.allowListByFieldId)));
        return hashMap;
    }

    public String getHttpLastRequestAppMarker() {
        return this.httpLastRequestAppMarker;
    }

    public String getHttpRequestIdType() {
        return this.httpRequestTypeId;
    }

    public long getTransportDelaysMs() {
        return this.transportDelaysMs;
    }

    public Map getTransportGfrKbps() {
        return this.transportGfrKbps;
    }

    public long getTtfbMs() {
        long j = this.httpDelaysMs;
        if (j <= 0) {
            j = 0;
        }
        long j2 = this.transportDelaysMs;
        if (j2 > 0) {
            return j + j2;
        }
        return j;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.transportGfrKbps.hashCode() + 31) * 31) + Long.valueOf(this.transportDelaysMs).hashCode()) * 31) + Long.valueOf(this.httpBytesMultiplexed).hashCode()) * 31) + Long.valueOf(this.httpDelaysMs).hashCode()) * 31;
        String str = this.httpRequestTypeId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.httpLastRequestAppMarker;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((i2 + i) * 31) + this.debugInfo.hashCode()) * 31) + this.alternateEstimates.hashCode();
    }

    public InbandTelemetryBweEstimate(Builder builder) {
        this.transportGfrKbps = builder.transportGfrKbps;
        this.transportDelaysMs = builder.transportDelaysMs;
        this.httpBytesMultiplexed = builder.httpBytesMultiplexed;
        this.httpDelaysMs = builder.httpDelaysMs;
        this.httpRequestTypeId = builder.httpRequestTypeId;
        this.httpLastRequestAppMarker = builder.httpLastRequestAppMarker;
        this.debugInfo = builder.debugInfo;
        this.alternateEstimates = builder.alternateEstimates;
    }
}
