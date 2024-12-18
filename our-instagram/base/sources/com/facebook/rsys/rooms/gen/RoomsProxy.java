package com.facebook.rsys.rooms.gen;

import X.C00O;

/* loaded from: classes12.dex */
public abstract class RoomsProxy {
    public abstract RoomsApi getApi();

    public abstract String getFunnelSessionId();

    public abstract void setApi(RoomsApi roomsApi);

    public abstract void startRoomCall(String str, Boolean bool, Boolean bool2);

    public RoomsProxy() {
        throw C00O.createAndThrow();
    }
}
