package com.facebook.rsys.transport.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class SignalingMessage {
    public static C2N9 CONVERTER = YAM.A00(64);
    public static long sMcfTypeId;
    public final boolean disableInlineProcessing;
    public final McfReference extraContext;
    public final SignalingMessageIncomingStats incomingStats;
    public final MetricIdentifiers metricIdentifiers;
    public final byte[] payload;
    public final int transportChannel;

    public static native SignalingMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SignalingMessage)) {
                return false;
            }
            SignalingMessage signalingMessage = (SignalingMessage) obj;
            if (this.transportChannel == signalingMessage.transportChannel && this.metricIdentifiers.equals(signalingMessage.metricIdentifiers) && Arrays.equals(this.payload, signalingMessage.payload)) {
                McfReference mcfReference = this.extraContext;
                McfReference mcfReference2 = signalingMessage.extraContext;
                if (mcfReference == null) {
                    if (mcfReference2 != null) {
                        return false;
                    }
                } else if (!mcfReference.equals(mcfReference2)) {
                    return false;
                }
                SignalingMessageIncomingStats signalingMessageIncomingStats = this.incomingStats;
                SignalingMessageIncomingStats signalingMessageIncomingStats2 = signalingMessage.incomingStats;
                if (signalingMessageIncomingStats != null) {
                    if (!signalingMessageIncomingStats.equals(signalingMessageIncomingStats2)) {
                        return false;
                    }
                } else if (signalingMessageIncomingStats2 != null) {
                    return false;
                }
                if (this.disableInlineProcessing != signalingMessage.disableInlineProcessing) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.metricIdentifiers, JQ0.A01(this.transportChannel)) + Arrays.hashCode(this.payload)) * 31) + AbstractC167017dG.A0M(this.extraContext)) * 31) + AbstractC166997dE.A0I(this.incomingStats)) * 31) + (this.disableInlineProcessing ? 1 : 0);
    }

    public SignalingMessage(int i, MetricIdentifiers metricIdentifiers, byte[] bArr, McfReference mcfReference, SignalingMessageIncomingStats signalingMessageIncomingStats, boolean z) {
        metricIdentifiers.getClass();
        bArr.getClass();
        this.transportChannel = i;
        this.metricIdentifiers = metricIdentifiers;
        this.payload = bArr;
        this.extraContext = mcfReference;
        this.incomingStats = signalingMessageIncomingStats;
        this.disableInlineProcessing = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SignalingMessage{transportChannel=");
        A1C.append(this.transportChannel);
        A1C.append(",metricIdentifiers=");
        A1C.append(this.metricIdentifiers);
        A1C.append(",payload=");
        A1C.append(this.payload);
        A1C.append(",extraContext=");
        A1C.append(this.extraContext);
        A1C.append(",incomingStats=");
        A1C.append(this.incomingStats);
        A1C.append(",disableInlineProcessing=");
        return AbstractC50523MSb.A0X(A1C, this.disableInlineProcessing);
    }
}
