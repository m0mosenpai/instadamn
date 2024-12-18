package com.facebook.rsys.log.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class LogModel {
    public static C2N9 CONVERTER = YAN.A00(67);
    public static long sMcfTypeId;
    public final String callTrigger;
    public final boolean isConnectedEnd;
    public final Long peerId;
    public final String sharedCallId;
    public final Long startingBatteryLevel;
    public final boolean uploadConsoleLogAtEnd;
    public final boolean wasDeviceCharged;

    public static native LogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LogModel)) {
                return false;
            }
            LogModel logModel = (LogModel) obj;
            String str = this.sharedCallId;
            String str2 = logModel.sharedCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            Long l = this.peerId;
            Long l2 = logModel.peerId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (!this.callTrigger.equals(logModel.callTrigger)) {
                return false;
            }
            Long l3 = this.startingBatteryLevel;
            Long l4 = logModel.startingBatteryLevel;
            if (l3 != null) {
                if (!l3.equals(l4)) {
                    return false;
                }
            } else if (l4 != null) {
                return false;
            }
            if (this.wasDeviceCharged != logModel.wasDeviceCharged || this.isConnectedEnd != logModel.isConnectedEnd || this.uploadConsoleLogAtEnd != logModel.uploadConsoleLogAtEnd) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC166997dE.A0K(this.callTrigger, (JQ0.A01(AbstractC167017dG.A0O(this.sharedCallId)) + AbstractC167017dG.A0M(this.peerId)) * 31) + AbstractC166997dE.A0I(this.startingBatteryLevel)) * 31) + (this.wasDeviceCharged ? 1 : 0)) * 31) + (this.isConnectedEnd ? 1 : 0)) * 31) + (this.uploadConsoleLogAtEnd ? 1 : 0);
    }

    public LogModel(String str, Long l, String str2, Long l2, boolean z, boolean z2, boolean z3) {
        str2.getClass();
        this.sharedCallId = str;
        this.peerId = l;
        this.callTrigger = str2;
        this.startingBatteryLevel = l2;
        this.wasDeviceCharged = z;
        this.isConnectedEnd = z2;
        this.uploadConsoleLogAtEnd = z3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LogModel{sharedCallId=");
        A1C.append(this.sharedCallId);
        A1C.append(",peerId=");
        A1C.append(this.peerId);
        A1C.append(",callTrigger=");
        A1C.append(this.callTrigger);
        A1C.append(",startingBatteryLevel=");
        A1C.append(this.startingBatteryLevel);
        A1C.append(",wasDeviceCharged=");
        A1C.append(this.wasDeviceCharged);
        A1C.append(",isConnectedEnd=");
        A1C.append(this.isConnectedEnd);
        A1C.append(",uploadConsoleLogAtEnd=");
        return AbstractC50523MSb.A0X(A1C, this.uploadConsoleLogAtEnd);
    }
}
