package com.facebook.rsys.moderator.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class ModeratorModel {
    public static C2N9 CONVERTER = new LSW(10);
    public static long sMcfTypeId;
    public final boolean allowsJoinRequestApproval;
    public final boolean allowsKickAndEndCall;
    public final boolean allowsRemoveUser;
    public final boolean allowsScreenShare;
    public final String allowsScreenShareActorId;
    public final ArrayList callModeratorsUuids;
    public final boolean desiredAllowsScreenShare;
    public final ArrayList softMutableUsers;

    public static native ModeratorModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorModel)) {
                return false;
            }
            ModeratorModel moderatorModel = (ModeratorModel) obj;
            if (this.allowsScreenShare == moderatorModel.allowsScreenShare) {
                String str = this.allowsScreenShareActorId;
                String str2 = moderatorModel.allowsScreenShareActorId;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
                if (this.desiredAllowsScreenShare != moderatorModel.desiredAllowsScreenShare || this.allowsJoinRequestApproval != moderatorModel.allowsJoinRequestApproval || this.allowsKickAndEndCall != moderatorModel.allowsKickAndEndCall || this.allowsRemoveUser != moderatorModel.allowsRemoveUser || !this.callModeratorsUuids.equals(moderatorModel.callModeratorsUuids) || !this.softMutableUsers.equals(moderatorModel.softMutableUsers)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.softMutableUsers, AbstractC166997dE.A0J(this.callModeratorsUuids, (((((((((JQ0.A01(this.allowsScreenShare ? 1 : 0) + AbstractC167017dG.A0O(this.allowsScreenShareActorId)) * 31) + (this.desiredAllowsScreenShare ? 1 : 0)) * 31) + (this.allowsJoinRequestApproval ? 1 : 0)) * 31) + (this.allowsKickAndEndCall ? 1 : 0)) * 31) + (this.allowsRemoveUser ? 1 : 0)) * 31));
    }

    public ModeratorModel(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.allowsScreenShare = z;
        this.allowsScreenShareActorId = str;
        this.desiredAllowsScreenShare = z2;
        this.allowsJoinRequestApproval = z3;
        this.allowsKickAndEndCall = z4;
        this.allowsRemoveUser = z5;
        this.callModeratorsUuids = arrayList;
        this.softMutableUsers = arrayList2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ModeratorModel{allowsScreenShare=");
        A1C.append(this.allowsScreenShare);
        A1C.append(",allowsScreenShareActorId=");
        A1C.append(this.allowsScreenShareActorId);
        A1C.append(",desiredAllowsScreenShare=");
        A1C.append(this.desiredAllowsScreenShare);
        A1C.append(",allowsJoinRequestApproval=");
        A1C.append(this.allowsJoinRequestApproval);
        A1C.append(",allowsKickAndEndCall=");
        A1C.append(this.allowsKickAndEndCall);
        A1C.append(",allowsRemoveUser=");
        A1C.append(this.allowsRemoveUser);
        A1C.append(",callModeratorsUuids=");
        A1C.append(this.callModeratorsUuids);
        A1C.append(",softMutableUsers=");
        return JQ0.A0l(this.softMutableUsers, A1C);
    }
}
