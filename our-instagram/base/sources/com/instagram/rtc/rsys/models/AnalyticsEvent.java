package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.C2N9;
import X.C55647OnY;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes9.dex */
public class AnalyticsEvent {
    public static C2N9 CONVERTER = new C55647OnY(6);
    public static long sMcfTypeId;
    public final Map boolParams;
    public final boolean initiator;
    public final String localCallId;
    public final Map numberParams;
    public final String serverInfoData;
    public final int step;
    public final Map stringParams;
    public final String videoCallId;

    public static native AnalyticsEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnalyticsEvent)) {
                return false;
            }
            AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
            if (this.step == analyticsEvent.step && this.initiator == analyticsEvent.initiator && this.localCallId.equals(analyticsEvent.localCallId)) {
                String str = this.videoCallId;
                String str2 = analyticsEvent.videoCallId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.serverInfoData;
                String str4 = analyticsEvent.serverInfoData;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
                if (!this.stringParams.equals(analyticsEvent.stringParams) || !this.numberParams.equals(analyticsEvent.numberParams) || !this.boolParams.equals(analyticsEvent.boolParams)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.localCallId, (JQ0.A01(this.step) + (this.initiator ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.videoCallId)) * 31) + AbstractC25227BEk.A07(this.serverInfoData)) * 31) + this.stringParams.hashCode()) * 31) + this.numberParams.hashCode()) * 31) + this.boolParams.hashCode();
    }

    public AnalyticsEvent(int i, boolean z, String str, String str2, String str3, Map map, Map map2, Map map3) {
        AbstractC31180DnO.A1U(str, map, map2);
        map3.getClass();
        this.step = i;
        this.initiator = z;
        this.localCallId = str;
        this.videoCallId = str2;
        this.serverInfoData = str3;
        this.stringParams = map;
        this.numberParams = map2;
        this.boolParams = map3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AnalyticsEvent{step=");
        A1C.append(this.step);
        A1C.append(",initiator=");
        A1C.append(this.initiator);
        A1C.append(",localCallId=");
        A1C.append(this.localCallId);
        A1C.append(",videoCallId=");
        A1C.append(this.videoCallId);
        A1C.append(",serverInfoData=");
        A1C.append(this.serverInfoData);
        A1C.append(",stringParams=");
        A1C.append(this.stringParams);
        A1C.append(",numberParams=");
        A1C.append(this.numberParams);
        A1C.append(",boolParams=");
        return JQ0.A0l(this.boolParams, A1C);
    }
}
