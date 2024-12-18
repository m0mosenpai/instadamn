package com.facebook.rsys.transport.gen;

import X.AbstractC25228BEl;
import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class SignalingMessageIncomingStats {
    public static C2N9 CONVERTER = YAM.A00(65);
    public static long sMcfTypeId;
    public final long receivedBytes;

    public static native SignalingMessageIncomingStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SignalingMessageIncomingStats) && this.receivedBytes == ((SignalingMessageIncomingStats) obj).receivedBytes;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AbstractC25228BEl.A03(this.receivedBytes);
    }

    public String toString() {
        return AnonymousClass001.A0e("SignalingMessageIncomingStats{receivedBytes=", "}", this.receivedBytes);
    }

    public SignalingMessageIncomingStats(long j) {
        this.receivedBytes = j;
    }
}
