package com.facebook.rsys.devxagent.gen;

import X.C2N9;
import X.C55646OnX;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class DevXAgentCallStartParams {
    public static C2N9 CONVERTER = new C55646OnX();
    public static long sMcfTypeId;
    public final String actorId;
    public final String agentCallId;
    public final boolean creatorAiCall;
    public final String doorId;
    public final boolean isVideo;
    public final boolean mandateE2ee;
    public final boolean metaAiCall;
    public final ArrayList peersToRing;
    public final String roomUrl;
    public final String threadId;
    public final String userid;

    public static native DevXAgentCallStartParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DevXAgentCallStartParams)) {
                return false;
            }
            DevXAgentCallStartParams devXAgentCallStartParams = (DevXAgentCallStartParams) obj;
            if (this.agentCallId.equals(devXAgentCallStartParams.agentCallId)) {
                String str = this.userid;
                String str2 = devXAgentCallStartParams.userid;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.roomUrl;
                String str4 = devXAgentCallStartParams.roomUrl;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.doorId;
                String str6 = devXAgentCallStartParams.doorId;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                String str7 = this.threadId;
                String str8 = devXAgentCallStartParams.threadId;
                if (str7 == null) {
                    if (str8 != null) {
                        return false;
                    }
                } else if (!str7.equals(str8)) {
                    return false;
                }
                ArrayList arrayList = this.peersToRing;
                ArrayList arrayList2 = devXAgentCallStartParams.peersToRing;
                if (arrayList == null) {
                    if (arrayList2 != null) {
                        return false;
                    }
                } else if (!arrayList.equals(arrayList2)) {
                    return false;
                }
                String str9 = this.actorId;
                String str10 = devXAgentCallStartParams.actorId;
                if (str9 != null) {
                    if (!str9.equals(str10)) {
                        return false;
                    }
                } else if (str10 != null) {
                    return false;
                }
                if (this.isVideo != devXAgentCallStartParams.isVideo || this.mandateE2ee != devXAgentCallStartParams.mandateE2ee || this.metaAiCall != devXAgentCallStartParams.metaAiCall || this.creatorAiCall != devXAgentCallStartParams.creatorAiCall) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (527 + this.agentCallId.hashCode()) * 31;
        String str = this.userid;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str2 = this.roomUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.doorId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.threadId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        ArrayList arrayList = this.peersToRing;
        if (arrayList == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = arrayList.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.actorId;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((((((i6 + i) * 31) + (this.isVideo ? 1 : 0)) * 31) + (this.mandateE2ee ? 1 : 0)) * 31) + (this.metaAiCall ? 1 : 0)) * 31) + (this.creatorAiCall ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DevXAgentCallStartParams{agentCallId=");
        sb.append(this.agentCallId);
        sb.append(",userid=");
        sb.append(this.userid);
        sb.append(",roomUrl=");
        sb.append(this.roomUrl);
        sb.append(",doorId=");
        sb.append(this.doorId);
        sb.append(",threadId=");
        sb.append(this.threadId);
        sb.append(",peersToRing=");
        sb.append(this.peersToRing);
        sb.append(",actorId=");
        sb.append(this.actorId);
        sb.append(",isVideo=");
        sb.append(this.isVideo);
        sb.append(",mandateE2ee=");
        sb.append(this.mandateE2ee);
        sb.append(",metaAiCall=");
        sb.append(this.metaAiCall);
        sb.append(",creatorAiCall=");
        sb.append(this.creatorAiCall);
        sb.append("}");
        return sb.toString();
    }

    public DevXAgentCallStartParams(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.agentCallId = str;
        this.userid = str2;
        this.roomUrl = str3;
        this.doorId = str4;
        this.threadId = str5;
        this.peersToRing = arrayList;
        this.actorId = str6;
        this.isVideo = z;
        this.mandateE2ee = z2;
        this.metaAiCall = z3;
        this.creatorAiCall = z4;
    }
}
