package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class CowatchRankingMetadata {
    public final String callType;
    public final ArrayList connectedPeerIds;
    public final String cowatchSessionId;
    public final String localCallId;
    public final String serverInfoData;
    public final String sharedCallId;

    public static native CowatchRankingMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchRankingMetadata)) {
                return false;
            }
            CowatchRankingMetadata cowatchRankingMetadata = (CowatchRankingMetadata) obj;
            String str = this.localCallId;
            String str2 = cowatchRankingMetadata.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.sharedCallId;
            String str4 = cowatchRankingMetadata.sharedCallId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.serverInfoData;
            String str6 = cowatchRankingMetadata.serverInfoData;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.callType.equals(cowatchRankingMetadata.callType)) {
                return false;
            }
            String str7 = this.cowatchSessionId;
            String str8 = cowatchRankingMetadata.cowatchSessionId;
            if (str7 != null) {
                if (!str7.equals(str8)) {
                    return false;
                }
            } else if (str8 != null) {
                return false;
            }
            if (!this.connectedPeerIds.equals(cowatchRankingMetadata.connectedPeerIds)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.connectedPeerIds, (AbstractC166997dE.A0K(this.callType, (((JQ0.A01(AbstractC167017dG.A0O(this.localCallId)) + AbstractC167017dG.A0O(this.sharedCallId)) * 31) + AbstractC167017dG.A0O(this.serverInfoData)) * 31) + AbstractC25227BEk.A07(this.cowatchSessionId)) * 31);
    }

    public CowatchRankingMetadata(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        str4.getClass();
        arrayList.getClass();
        this.localCallId = str;
        this.sharedCallId = str2;
        this.serverInfoData = str3;
        this.callType = str4;
        this.cowatchSessionId = str5;
        this.connectedPeerIds = arrayList;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchRankingMetadata{localCallId=");
        A1C.append(this.localCallId);
        A1C.append(",sharedCallId=");
        A1C.append(this.sharedCallId);
        A1C.append(",serverInfoData=");
        A1C.append(this.serverInfoData);
        A1C.append(",callType=");
        A1C.append(this.callType);
        A1C.append(",cowatchSessionId=");
        A1C.append(this.cowatchSessionId);
        A1C.append(",connectedPeerIds=");
        return JQ0.A0l(this.connectedPeerIds, A1C);
    }
}
