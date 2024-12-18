package com.facebook.rsys.rooms.gen;

import X.AnonymousClass001;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class RoomPollingOptions {
    public final int incallPollingIntervalMs;
    public final int lobbyPollingIntervalMs;

    public static native RoomPollingOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomPollingOptions)) {
            return false;
        }
        RoomPollingOptions roomPollingOptions = (RoomPollingOptions) obj;
        return this.lobbyPollingIntervalMs == roomPollingOptions.lobbyPollingIntervalMs && this.incallPollingIntervalMs == roomPollingOptions.incallPollingIntervalMs;
    }

    public final int hashCode() {
        return JQ0.A01(this.lobbyPollingIntervalMs) + this.incallPollingIntervalMs;
    }

    public final String toString() {
        return AnonymousClass001.A0n("RoomPollingOptions{lobbyPollingIntervalMs=", ",incallPollingIntervalMs=", "}", this.lobbyPollingIntervalMs, this.incallPollingIntervalMs);
    }

    public RoomPollingOptions(int i, int i2) {
        this.lobbyPollingIntervalMs = i;
        this.incallPollingIntervalMs = i2;
    }
}
