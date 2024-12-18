package com.facebook.rsys.realtimesession.gen;

import X.AnonymousClass001;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes11.dex */
public class RealtimeSessionUserId {
    public final long nodeId;
    public final long userId;

    public static native RealtimeSessionUserId createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeSessionUserId)) {
            return false;
        }
        RealtimeSessionUserId realtimeSessionUserId = (RealtimeSessionUserId) obj;
        return this.userId == realtimeSessionUserId.userId && this.nodeId == realtimeSessionUserId.nodeId;
    }

    public final int hashCode() {
        long j = this.userId;
        int i = (527 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.nodeId;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return AnonymousClass001.A0t("RealtimeSessionUserId{userId=", ",nodeId=", "}", this.userId, this.nodeId);
    }

    public RealtimeSessionUserId(long j, long j2) {
        this.userId = j;
        this.nodeId = j2;
    }
}
