package com.facebook.proxygen;

import java.util.Random;

/* loaded from: classes10.dex */
public class TraceEventContext {
    public static final Random RAND = new Random();
    public TraceEventObserver[] mObservers;
    public int mParentID;
    public final SamplePolicy mSamplePolicy;

    public int getParentID() {
        return this.mParentID;
    }

    public void informAllObservers(TraceEvent[] traceEventArr) {
        for (TraceEventObserver traceEventObserver : this.mObservers) {
            traceEventObserver.traceEventAvailable(traceEventArr);
        }
    }

    public boolean needPublishEvent() {
        return this.mSamplePolicy.isSampled();
    }

    public TraceEventContext(TraceEventObserver[] traceEventObserverArr, SamplePolicy samplePolicy) {
        this.mParentID = RAND.nextInt(Integer.MAX_VALUE);
        this.mObservers = traceEventObserverArr;
        this.mSamplePolicy = samplePolicy;
    }

    public TraceEventContext(TraceEventObserver[] traceEventObserverArr) {
        this(traceEventObserverArr, new SamplePolicy() { // from class: com.facebook.proxygen.TraceEventContext.1
            @Override // com.facebook.proxygen.SamplePolicy
            public boolean isSampled() {
                return true;
            }
        });
    }

    public TraceEventContext(SamplePolicy samplePolicy) {
        this(new TraceEventObserver[0], samplePolicy);
    }
}
