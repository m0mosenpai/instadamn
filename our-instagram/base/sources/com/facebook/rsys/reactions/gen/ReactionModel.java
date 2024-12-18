package com.facebook.rsys.reactions.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25228BEl;
import X.AbstractC72049XLp;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class ReactionModel {
    public static C2N9 CONVERTER = YAM.A00(40);
    public static long sMcfTypeId;
    public final long reactionExpiryTime;
    public final EmojiModel selectedReaction;

    public static native ReactionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionModel)) {
            return false;
        }
        ReactionModel reactionModel = (ReactionModel) obj;
        return this.selectedReaction.equals(reactionModel.selectedReaction) && this.reactionExpiryTime == reactionModel.reactionExpiryTime;
    }

    public int hashCode() {
        return AbstractC72049XLp.A02(this.selectedReaction) + AbstractC25228BEl.A03(this.reactionExpiryTime);
    }

    public ReactionModel(EmojiModel emojiModel, long j) {
        emojiModel.getClass();
        this.selectedReaction = emojiModel;
        this.reactionExpiryTime = j;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ReactionModel{selectedReaction=");
        A1C.append(this.selectedReaction);
        A1C.append(",reactionExpiryTime=");
        A1C.append(this.reactionExpiryTime);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
