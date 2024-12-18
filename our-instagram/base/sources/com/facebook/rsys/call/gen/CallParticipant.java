package com.facebook.rsys.call.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;

/* loaded from: classes9.dex */
public class CallParticipant {
    public static C2N9 CONVERTER = C55648OnZ.A00(10);
    public static long sMcfTypeId;
    public final String aliasId;
    public final boolean isCaller;
    public final ParticipantMediaState mediaState;
    public final String representativeId;
    public final Long sctpNodeId;
    public final int state;
    public final String userId;
    public final UserProfile userProfile;
    public final String username;

    public static native CallParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallParticipant)) {
                return false;
            }
            CallParticipant callParticipant = (CallParticipant) obj;
            if (this.userId.equals(callParticipant.userId)) {
                String str = this.representativeId;
                String str2 = callParticipant.representativeId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.aliasId;
                String str4 = callParticipant.aliasId;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.username;
                String str6 = callParticipant.username;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                if (!this.userProfile.equals(callParticipant.userProfile) || this.isCaller != callParticipant.isCaller || !this.mediaState.equals(callParticipant.mediaState) || this.state != callParticipant.state) {
                    return false;
                }
                Long l = this.sctpNodeId;
                Long l2 = callParticipant.sctpNodeId;
                if (l != null) {
                    if (!l.equals(l2)) {
                        return false;
                    }
                } else if (l2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC166997dE.A0J(this.mediaState, (AbstractC166997dE.A0J(this.userProfile, (((((AbstractC50523MSb.A02(this.userId) + AbstractC167017dG.A0O(this.representativeId)) * 31) + AbstractC167017dG.A0O(this.aliasId)) * 31) + AbstractC167017dG.A0O(this.username)) * 31) + (this.isCaller ? 1 : 0)) * 31) + this.state) * 31) + AbstractC166997dE.A0I(this.sctpNodeId);
    }

    public CallParticipant(String str, String str2, String str3, String str4, UserProfile userProfile, boolean z, ParticipantMediaState participantMediaState, int i, Long l) {
        AbstractC31180DnO.A1U(str, userProfile, participantMediaState);
        this.userId = str;
        this.representativeId = str2;
        this.aliasId = str3;
        this.username = str4;
        this.userProfile = userProfile;
        this.isCaller = z;
        this.mediaState = participantMediaState;
        this.state = i;
        this.sctpNodeId = l;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CallParticipant{userId=");
        A1C.append(this.userId);
        A1C.append(",representativeId=");
        A1C.append(this.representativeId);
        A1C.append(",aliasId=");
        A1C.append(this.aliasId);
        A1C.append(",username=");
        A1C.append(this.username);
        A1C.append(",userProfile=");
        A1C.append(this.userProfile);
        A1C.append(",isCaller=");
        A1C.append(this.isCaller);
        A1C.append(",mediaState=");
        A1C.append(this.mediaState);
        A1C.append(",state=");
        A1C.append(this.state);
        A1C.append(",sctpNodeId=");
        return JQ0.A0l(this.sctpNodeId, A1C);
    }
}
