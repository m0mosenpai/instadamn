package com.facebook.rsys.transport.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class MetricIdentifiers {
    public static C2N9 CONVERTER = YAM.A00(61);
    public static long sMcfTypeId;
    public final Long flowId;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;

    public static native MetricIdentifiers createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetricIdentifiers)) {
                return false;
            }
            MetricIdentifiers metricIdentifiers = (MetricIdentifiers) obj;
            Long l = this.flowId;
            Long l2 = metricIdentifiers.flowId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str = this.messageId;
            String str2 = metricIdentifiers.messageId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.remoteSignalingId;
            String str4 = metricIdentifiers.remoteSignalingId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.messageType;
            String str6 = metricIdentifiers.messageType;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((JQ0.A01(AbstractC167017dG.A0M(this.flowId)) + AbstractC167017dG.A0O(this.messageId)) * 31) + AbstractC167017dG.A0O(this.remoteSignalingId)) * 31) + AbstractC25227BEk.A07(this.messageType);
    }

    public MetricIdentifiers(Long l, String str, String str2, String str3) {
        this.flowId = l;
        this.messageId = str;
        this.remoteSignalingId = str2;
        this.messageType = str3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetricIdentifiers{flowId=");
        A1C.append(this.flowId);
        A1C.append(",messageId=");
        A1C.append(this.messageId);
        A1C.append(",remoteSignalingId=");
        A1C.append(this.remoteSignalingId);
        A1C.append(",messageType=");
        return AbstractC50523MSb.A0W(this.messageType, A1C);
    }
}
