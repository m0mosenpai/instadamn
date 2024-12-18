package com.instagram.realtimeclient.requeststream;

import X.C1Dk;
import X.C1UK;
import X.X7T;

/* loaded from: classes3.dex */
public class SubscriptionHandler {
    public final C1Dk mRequest;
    public final C1UK mStream;
    public final SubscribeExecutor mSubscribeExecutor;
    public final String mSubscriptionID;

    public SubscriptionHandler addStatusUpdateListener(X7T x7t) {
        return this;
    }

    public void cancel() {
        this.mSubscribeExecutor.unsubscribe(this);
    }

    public C1Dk getRequest() {
        return this.mRequest;
    }

    public C1UK getStream() {
        return this.mStream;
    }

    public String getSubscriptionID() {
        return this.mSubscriptionID;
    }

    public SubscriptionHandler(C1Dk c1Dk, String str, C1UK c1uk, SubscribeExecutor subscribeExecutor) {
        this.mRequest = c1Dk;
        this.mSubscriptionID = str;
        this.mStream = c1uk;
        this.mSubscribeExecutor = subscribeExecutor;
    }
}
