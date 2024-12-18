package com.instagram.rtc.rsys.models;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55647OnY;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class RingNotification {
    public static C2N9 CONVERTER = new C55647OnY(12);
    public static long sMcfTypeId;
    public final String avatarUrl;
    public final String displayName;
    public final String groupCallerName;
    public final String igThreadId;
    public final boolean isE2eeMandated;
    public final boolean isE2eeOverInstamadillo;
    public final ArrayList otherCallParticipants;
    public final int ringType;
    public final String roomUrl;
    public final String serverInfoData;
    public final String transactionId;

    public static native RingNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RingNotification)) {
                return false;
            }
            RingNotification ringNotification = (RingNotification) obj;
            if (this.transactionId.equals(ringNotification.transactionId) && this.serverInfoData.equals(ringNotification.serverInfoData) && this.displayName.equals(ringNotification.displayName) && this.igThreadId.equals(ringNotification.igThreadId)) {
                String str = this.groupCallerName;
                String str2 = ringNotification.groupCallerName;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (!this.avatarUrl.equals(ringNotification.avatarUrl) || this.ringType != ringNotification.ringType) {
                    return false;
                }
                String str3 = this.roomUrl;
                String str4 = ringNotification.roomUrl;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                if (this.isE2eeMandated != ringNotification.isE2eeMandated || this.isE2eeOverInstamadillo != ringNotification.isE2eeOverInstamadillo) {
                    return false;
                }
                ArrayList arrayList = this.otherCallParticipants;
                ArrayList arrayList2 = ringNotification.otherCallParticipants;
                if (arrayList != null) {
                    if (!arrayList.equals(arrayList2)) {
                        return false;
                    }
                } else if (arrayList2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.avatarUrl, (AbstractC166997dE.A0K(this.igThreadId, AbstractC166997dE.A0K(this.displayName, AbstractC166997dE.A0K(this.serverInfoData, AbstractC50523MSb.A02(this.transactionId)))) + AbstractC167017dG.A0O(this.groupCallerName)) * 31) + this.ringType) * 31) + AbstractC167017dG.A0O(this.roomUrl)) * 31) + (this.isE2eeMandated ? 1 : 0)) * 31) + (this.isE2eeOverInstamadillo ? 1 : 0)) * 31) + AbstractC166997dE.A0I(this.otherCallParticipants);
    }

    public RingNotification(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, boolean z, boolean z2, ArrayList arrayList) {
        AbstractC31180DnO.A1U(str, str2, str3);
        str4.getClass();
        str6.getClass();
        this.transactionId = str;
        this.serverInfoData = str2;
        this.displayName = str3;
        this.igThreadId = str4;
        this.groupCallerName = str5;
        this.avatarUrl = str6;
        this.ringType = i;
        this.roomUrl = str7;
        this.isE2eeMandated = z;
        this.isE2eeOverInstamadillo = z2;
        this.otherCallParticipants = arrayList;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RingNotification{transactionId=");
        A1C.append(this.transactionId);
        A1C.append(",serverInfoData=");
        A1C.append(this.serverInfoData);
        A1C.append(",displayName=");
        A1C.append(this.displayName);
        A1C.append(",igThreadId=");
        A1C.append(this.igThreadId);
        A1C.append(",groupCallerName=");
        A1C.append(this.groupCallerName);
        A1C.append(",avatarUrl=");
        A1C.append(this.avatarUrl);
        A1C.append(",ringType=");
        A1C.append(this.ringType);
        A1C.append(",roomUrl=");
        A1C.append(this.roomUrl);
        A1C.append(",isE2eeMandated=");
        A1C.append(this.isE2eeMandated);
        A1C.append(",isE2eeOverInstamadillo=");
        A1C.append(this.isE2eeOverInstamadillo);
        A1C.append(",otherCallParticipants=");
        return JQ0.A0l(this.otherCallParticipants, A1C);
    }
}
