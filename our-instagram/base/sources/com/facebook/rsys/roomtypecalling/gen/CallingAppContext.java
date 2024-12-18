package com.facebook.rsys.roomtypecalling.gen;

import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.MSV;
import X.WV3;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

/* loaded from: classes11.dex */
public class CallingAppContext {
    public static C2N9 CONVERTER = new WV3(2);
    public static long sMcfTypeId;
    public final String callablePostId;
    public final HashSet callingTags;
    public final String horizonVoipZoneId;
    public final String horizonWorldId;
    public final String immersiveModeDoorId;
    public final boolean isMetaAiCall;
    public final String linkUrl;
    public final String liveBroadcastId;
    public final String phoneNumber;
    public final String pstnUserId;
    public final String rtcDoorId;
    public final String serverInfoData;
    public final String threadID;
    public final int threadType;

    public static native CallingAppContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallingAppContext)) {
                return false;
            }
            CallingAppContext callingAppContext = (CallingAppContext) obj;
            String str = this.threadID;
            String str2 = callingAppContext.threadID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.threadType != callingAppContext.threadType) {
                return false;
            }
            HashSet hashSet = this.callingTags;
            HashSet hashSet2 = callingAppContext.callingTags;
            if (hashSet == null) {
                if (hashSet2 != null) {
                    return false;
                }
            } else if (!hashSet.equals(hashSet2)) {
                return false;
            }
            String str3 = this.serverInfoData;
            String str4 = callingAppContext.serverInfoData;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.linkUrl;
            String str6 = callingAppContext.linkUrl;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.liveBroadcastId;
            String str8 = callingAppContext.liveBroadcastId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.callablePostId;
            String str10 = callingAppContext.callablePostId;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.immersiveModeDoorId;
            String str12 = callingAppContext.immersiveModeDoorId;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.rtcDoorId;
            String str14 = callingAppContext.rtcDoorId;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.phoneNumber;
            String str16 = callingAppContext.phoneNumber;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            if (this.isMetaAiCall != callingAppContext.isMetaAiCall) {
                return false;
            }
            String str17 = this.pstnUserId;
            String str18 = callingAppContext.pstnUserId;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            String str19 = this.horizonWorldId;
            String str20 = callingAppContext.horizonWorldId;
            if (str19 == null) {
                if (str20 != null) {
                    return false;
                }
            } else if (!str19.equals(str20)) {
                return false;
            }
            String str21 = this.horizonVoipZoneId;
            String str22 = callingAppContext.horizonVoipZoneId;
            if (str21 != null) {
                if (!str21.equals(str22)) {
                    return false;
                }
            } else if (str22 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0O = (((((((((((((((((((((((((527 + AbstractC167017dG.A0O(this.threadID)) * 31) + this.threadType) * 31) + AbstractC167017dG.A0M(this.callingTags)) * 31) + AbstractC167017dG.A0O(this.serverInfoData)) * 31) + AbstractC167017dG.A0O(this.linkUrl)) * 31) + AbstractC167017dG.A0O(this.liveBroadcastId)) * 31) + AbstractC167017dG.A0O(this.callablePostId)) * 31) + AbstractC167017dG.A0O(this.immersiveModeDoorId)) * 31) + AbstractC167017dG.A0O(this.rtcDoorId)) * 31) + AbstractC167017dG.A0O(this.phoneNumber)) * 31) + (this.isMetaAiCall ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.pstnUserId)) * 31) + AbstractC167017dG.A0O(this.horizonWorldId)) * 31;
        String str = this.horizonVoipZoneId;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallingAppContext{threadID=");
        sb.append(this.threadID);
        sb.append(",threadType=");
        sb.append(this.threadType);
        sb.append(",callingTags=");
        sb.append(this.callingTags);
        sb.append(MSV.A00(650));
        sb.append(this.serverInfoData);
        sb.append(",linkUrl=");
        sb.append(this.linkUrl);
        sb.append(",liveBroadcastId=");
        sb.append(this.liveBroadcastId);
        sb.append(",callablePostId=");
        sb.append(this.callablePostId);
        sb.append(",immersiveModeDoorId=");
        sb.append(this.immersiveModeDoorId);
        sb.append(",rtcDoorId=");
        sb.append(this.rtcDoorId);
        sb.append(",phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(",isMetaAiCall=");
        sb.append(this.isMetaAiCall);
        sb.append(",pstnUserId=");
        sb.append(this.pstnUserId);
        sb.append(",horizonWorldId=");
        sb.append(this.horizonWorldId);
        sb.append(",horizonVoipZoneId=");
        return AbstractC50523MSb.A0W(this.horizonVoipZoneId, sb);
    }

    public CallingAppContext(String str, int i, HashSet hashSet, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11) {
        this.threadID = str;
        this.threadType = i;
        this.callingTags = hashSet;
        this.serverInfoData = str2;
        this.linkUrl = str3;
        this.liveBroadcastId = str4;
        this.callablePostId = str5;
        this.immersiveModeDoorId = str6;
        this.rtcDoorId = str7;
        this.phoneNumber = str8;
        this.isMetaAiCall = z;
        this.pstnUserId = str9;
        this.horizonWorldId = str10;
        this.horizonVoipZoneId = str11;
    }
}
