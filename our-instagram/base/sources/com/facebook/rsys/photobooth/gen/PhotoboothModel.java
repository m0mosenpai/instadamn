package com.facebook.rsys.photobooth.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class PhotoboothModel {
    public static C2N9 CONVERTER = C55648OnZ.A00(64);
    public static long sMcfTypeId;
    public final long actionTimeMs;
    public final int actionType;
    public final String actorId;
    public final short captureIntervalMs;
    public final long delayMs;
    public final boolean isStarted;
    public final long localClockOffsetMs;
    public final short totalCaptures;
    public final String username;

    public static native PhotoboothModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PhotoboothModel)) {
                return false;
            }
            PhotoboothModel photoboothModel = (PhotoboothModel) obj;
            if (this.isStarted == photoboothModel.isStarted && this.totalCaptures == photoboothModel.totalCaptures && this.captureIntervalMs == photoboothModel.captureIntervalMs && this.actionTimeMs == photoboothModel.actionTimeMs && this.localClockOffsetMs == photoboothModel.localClockOffsetMs && this.delayMs == photoboothModel.delayMs) {
                String str = this.username;
                String str2 = photoboothModel.username;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.actorId;
                String str4 = photoboothModel.actorId;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
                if (this.actionType != photoboothModel.actionType) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC167007dF.A07(this.delayMs, AbstractC167007dF.A07(this.localClockOffsetMs, AbstractC167007dF.A07(this.actionTimeMs, (((JQ0.A01(this.isStarted ? 1 : 0) + this.totalCaptures) * 31) + this.captureIntervalMs) * 31))) + AbstractC167017dG.A0O(this.username)) * 31) + AbstractC25227BEk.A07(this.actorId)) * 31) + this.actionType;
    }

    public PhotoboothModel(boolean z, short s, short s2, long j, long j2, long j3, String str, String str2, int i) {
        Short.valueOf(s).getClass();
        Short.valueOf(s2).getClass();
        this.isStarted = z;
        this.totalCaptures = s;
        this.captureIntervalMs = s2;
        this.actionTimeMs = j;
        this.localClockOffsetMs = j2;
        this.delayMs = j3;
        this.username = str;
        this.actorId = str2;
        this.actionType = i;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PhotoboothModel{isStarted=");
        A1C.append(this.isStarted);
        A1C.append(",totalCaptures=");
        A1C.append((int) this.totalCaptures);
        A1C.append(",captureIntervalMs=");
        A1C.append((int) this.captureIntervalMs);
        A1C.append(",actionTimeMs=");
        A1C.append(this.actionTimeMs);
        A1C.append(",localClockOffsetMs=");
        A1C.append(this.localClockOffsetMs);
        A1C.append(",delayMs=");
        A1C.append(this.delayMs);
        A1C.append(",username=");
        A1C.append(this.username);
        A1C.append(",actorId=");
        A1C.append(this.actorId);
        A1C.append(",actionType=");
        A1C.append(this.actionType);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
