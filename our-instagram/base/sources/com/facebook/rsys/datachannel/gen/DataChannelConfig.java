package com.facebook.rsys.datachannel.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC72049XLp;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class DataChannelConfig {
    public static C2N9 CONVERTER = YAN.A00(41);
    public static long sMcfTypeId;
    public final byte[] initialStateSyncData;
    public final boolean isE2ee;
    public final Long maxRetransmitTime;
    public final Long maxRetransmits;
    public final boolean ordered;
    public final int priority;
    public final boolean sendDataOnCallStart;
    public final int transportType;

    public static native DataChannelConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DataChannelConfig)) {
                return false;
            }
            DataChannelConfig dataChannelConfig = (DataChannelConfig) obj;
            if (this.ordered == dataChannelConfig.ordered) {
                Long l = this.maxRetransmitTime;
                Long l2 = dataChannelConfig.maxRetransmitTime;
                if (l == null) {
                    if (l2 != null) {
                        return false;
                    }
                } else if (!l.equals(l2)) {
                    return false;
                }
                Long l3 = this.maxRetransmits;
                Long l4 = dataChannelConfig.maxRetransmits;
                if (l3 == null) {
                    if (l4 != null) {
                        return false;
                    }
                } else if (!l3.equals(l4)) {
                    return false;
                }
                if (this.transportType != dataChannelConfig.transportType) {
                    return false;
                }
                byte[] bArr = this.initialStateSyncData;
                byte[] bArr2 = dataChannelConfig.initialStateSyncData;
                if (bArr != null) {
                    if (!Arrays.equals(bArr, bArr2)) {
                        return false;
                    }
                } else if (bArr2 != null) {
                    return false;
                }
                if (this.sendDataOnCallStart != dataChannelConfig.sendDataOnCallStart || this.isE2ee != dataChannelConfig.isE2ee || this.priority != dataChannelConfig.priority) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((JQ0.A01(this.ordered ? 1 : 0) + AbstractC167017dG.A0M(this.maxRetransmitTime)) * 31) + AbstractC167017dG.A0M(this.maxRetransmits)) * 31) + this.transportType) * 31) + AbstractC166997dE.A0I(this.initialStateSyncData)) * 31) + (this.sendDataOnCallStart ? 1 : 0)) * 31) + (this.isE2ee ? 1 : 0)) * 31) + this.priority;
    }

    public DataChannelConfig(boolean z, Long l, Long l2, int i, byte[] bArr, boolean z2, boolean z3, int i2) {
        this.ordered = z;
        this.maxRetransmitTime = l;
        this.maxRetransmits = l2;
        this.transportType = i;
        this.initialStateSyncData = bArr;
        this.sendDataOnCallStart = z2;
        this.isE2ee = z3;
        this.priority = i2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DataChannelConfig{ordered=");
        A1C.append(this.ordered);
        A1C.append(",maxRetransmitTime=");
        A1C.append(this.maxRetransmitTime);
        A1C.append(",maxRetransmits=");
        A1C.append(this.maxRetransmits);
        A1C.append(",transportType=");
        A1C.append(this.transportType);
        A1C.append(",initialStateSyncData=");
        A1C.append(this.initialStateSyncData);
        A1C.append(",sendDataOnCallStart=");
        A1C.append(this.sendDataOnCallStart);
        A1C.append(",isE2ee=");
        A1C.append(this.isE2ee);
        A1C.append(",priority=");
        return AbstractC72049XLp.A0B(A1C, this.priority);
    }
}
