package com.facebook.proxygen;

/* loaded from: classes10.dex */
public class RequestStatsObserver implements TraceEventObserver {
    public TraceEvent[] mEvents;

    public RequestStats getRequestStats() {
        TraceEvent[] traceEventArr = this.mEvents;
        if (traceEventArr != null && traceEventArr.length != 0) {
            return new RequestStats(traceEventArr);
        }
        return null;
    }

    @Override // com.facebook.proxygen.TraceEventObserver
    public void traceEventAvailable(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }
}
