package com.facebook.tigon.tigonobserver;

import com.facebook.tigon.iface.TigonRequest;

/* loaded from: classes.dex */
public interface TigonRequestAdded {
    long creationTime();

    long requestId();

    TigonRequest submittedRequest();
}
