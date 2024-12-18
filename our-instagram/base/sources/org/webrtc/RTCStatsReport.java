package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class RTCStatsReport {
    public final Map stats;
    public final long timestampUs;

    public static RTCStatsReport create(long j, Map map) {
        return new RTCStatsReport(j, map);
    }

    public Map getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public RTCStatsReport(long j, Map map) {
        this.timestampUs = j;
        this.stats = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{ timestampUs: ");
        A1C.append(this.timestampUs);
        A1C.append(", stats: [\n");
        Iterator A16 = AbstractC166997dE.A16(this.stats);
        boolean z = true;
        while (A16.hasNext()) {
            Object next = A16.next();
            if (!z) {
                A1C.append(",\n");
            }
            A1C.append(next);
            z = false;
        }
        return AbstractC166997dE.A0x(" ] }", A1C);
    }
}
