package com.facebook.rsys.polls.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.MSV;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class PollsPendingActionModel {
    public static C2N9 CONVERTER = YAM.A00(32);
    public static long sMcfTypeId;
    public final String actionId;
    public final int actionType;
    public final PollsCreateActionParams createActionParams;
    public final PollsRemoveActionParams removeActionParams;
    public final PollsRemoveVoteActionParams removeVoteActionParams;
    public final PollsVoteActionParams voteActionParams;

    public static native PollsPendingActionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollsPendingActionModel)) {
                return false;
            }
            PollsPendingActionModel pollsPendingActionModel = (PollsPendingActionModel) obj;
            if (this.actionId.equals(pollsPendingActionModel.actionId) && this.actionType == pollsPendingActionModel.actionType) {
                PollsCreateActionParams pollsCreateActionParams = this.createActionParams;
                PollsCreateActionParams pollsCreateActionParams2 = pollsPendingActionModel.createActionParams;
                if (pollsCreateActionParams == null) {
                    if (pollsCreateActionParams2 != null) {
                        return false;
                    }
                } else if (!pollsCreateActionParams.equals(pollsCreateActionParams2)) {
                    return false;
                }
                PollsRemoveActionParams pollsRemoveActionParams = this.removeActionParams;
                PollsRemoveActionParams pollsRemoveActionParams2 = pollsPendingActionModel.removeActionParams;
                if (pollsRemoveActionParams == null) {
                    if (pollsRemoveActionParams2 != null) {
                        return false;
                    }
                } else if (!pollsRemoveActionParams.equals(pollsRemoveActionParams2)) {
                    return false;
                }
                PollsVoteActionParams pollsVoteActionParams = this.voteActionParams;
                PollsVoteActionParams pollsVoteActionParams2 = pollsPendingActionModel.voteActionParams;
                if (pollsVoteActionParams == null) {
                    if (pollsVoteActionParams2 != null) {
                        return false;
                    }
                } else if (!pollsVoteActionParams.equals(pollsVoteActionParams2)) {
                    return false;
                }
                PollsRemoveVoteActionParams pollsRemoveVoteActionParams = this.removeVoteActionParams;
                PollsRemoveVoteActionParams pollsRemoveVoteActionParams2 = pollsPendingActionModel.removeVoteActionParams;
                if (pollsRemoveVoteActionParams != null) {
                    if (!pollsRemoveVoteActionParams.equals(pollsRemoveVoteActionParams2)) {
                        return false;
                    }
                } else if (pollsRemoveVoteActionParams2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC50523MSb.A02(this.actionId) + this.actionType) * 31) + AbstractC167017dG.A0M(this.createActionParams)) * 31) + AbstractC167017dG.A0M(this.removeActionParams)) * 31) + AbstractC167017dG.A0M(this.voteActionParams)) * 31) + AbstractC166997dE.A0I(this.removeVoteActionParams);
    }

    public PollsPendingActionModel(String str, int i, PollsCreateActionParams pollsCreateActionParams, PollsRemoveActionParams pollsRemoveActionParams, PollsVoteActionParams pollsVoteActionParams, PollsRemoveVoteActionParams pollsRemoveVoteActionParams) {
        str.getClass();
        this.actionId = str;
        this.actionType = i;
        this.createActionParams = pollsCreateActionParams;
        this.removeActionParams = pollsRemoveActionParams;
        this.voteActionParams = pollsVoteActionParams;
        this.removeVoteActionParams = pollsRemoveVoteActionParams;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PollsPendingActionModel{actionId=");
        A1C.append(this.actionId);
        A1C.append(MSV.A00(645));
        A1C.append(this.actionType);
        A1C.append(",createActionParams=");
        A1C.append(this.createActionParams);
        A1C.append(",removeActionParams=");
        A1C.append(this.removeActionParams);
        A1C.append(",voteActionParams=");
        A1C.append(this.voteActionParams);
        A1C.append(",removeVoteActionParams=");
        return JQ0.A0l(this.removeVoteActionParams, A1C);
    }
}
