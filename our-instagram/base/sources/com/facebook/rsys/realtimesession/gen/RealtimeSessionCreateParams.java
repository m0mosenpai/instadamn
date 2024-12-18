package com.facebook.rsys.realtimesession.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25236BEt;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class RealtimeSessionCreateParams {
    public static C2N9 CONVERTER = new LSW(15);
    public static long sMcfTypeId;
    public final boolean e2ee;
    public final int peerMode;
    public final long peerTimeoutMs;
    public final String topic;

    public static native RealtimeSessionCreateParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeSessionCreateParams)) {
            return false;
        }
        RealtimeSessionCreateParams realtimeSessionCreateParams = (RealtimeSessionCreateParams) obj;
        return this.topic.equals(realtimeSessionCreateParams.topic) && this.peerMode == realtimeSessionCreateParams.peerMode && this.peerTimeoutMs == realtimeSessionCreateParams.peerTimeoutMs && this.e2ee == realtimeSessionCreateParams.e2ee;
    }

    public int hashCode() {
        return AbstractC25236BEt.A01(this.peerTimeoutMs, (JQ0.A01(this.topic.hashCode()) + this.peerMode) * 31) + (this.e2ee ? 1 : 0);
    }

    public RealtimeSessionCreateParams(String str, int i, long j, boolean z) {
        str.getClass();
        this.topic = str;
        this.peerMode = i;
        this.peerTimeoutMs = j;
        this.e2ee = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RealtimeSessionCreateParams{topic=");
        A1C.append(this.topic);
        A1C.append(",peerMode=");
        A1C.append(this.peerMode);
        A1C.append(",peerTimeoutMs=");
        A1C.append(this.peerTimeoutMs);
        A1C.append(",e2ee=");
        A1C.append(this.e2ee);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
