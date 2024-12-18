package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchAdminMessageModel {
    public static C2N9 CONVERTER = YAN.A00(33);
    public static long sMcfTypeId;
    public final String adminMessage;
    public final String adminMessageActorUserId;
    public final int localAdminMessageType;

    public static native CowatchAdminMessageModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAdminMessageModel)) {
                return false;
            }
            CowatchAdminMessageModel cowatchAdminMessageModel = (CowatchAdminMessageModel) obj;
            String str = this.adminMessage;
            String str2 = cowatchAdminMessageModel.adminMessage;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.localAdminMessageType != cowatchAdminMessageModel.localAdminMessageType) {
                return false;
            }
            String str3 = this.adminMessageActorUserId;
            String str4 = cowatchAdminMessageModel.adminMessageActorUserId;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((JQ0.A01(AbstractC167017dG.A0O(this.adminMessage)) + this.localAdminMessageType) * 31) + AbstractC25227BEk.A07(this.adminMessageActorUserId);
    }

    public CowatchAdminMessageModel(String str, int i, String str2) {
        this.adminMessage = str;
        this.localAdminMessageType = i;
        this.adminMessageActorUserId = str2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchAdminMessageModel{adminMessage=");
        A1C.append(this.adminMessage);
        A1C.append(",localAdminMessageType=");
        A1C.append(this.localAdminMessageType);
        A1C.append(",adminMessageActorUserId=");
        return AbstractC50523MSb.A0W(this.adminMessageActorUserId, A1C);
    }
}
