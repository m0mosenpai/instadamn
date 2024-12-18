package com.facebook.rsys.reactions.gen;

import X.AbstractC166987dD;
import X.AbstractC72049XLp;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class PendingReactionModel {
    public static C2N9 CONVERTER = YAM.A00(39);
    public static long sMcfTypeId;
    public final EmojiModel emoji;
    public final int source;

    public static native PendingReactionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingReactionModel)) {
            return false;
        }
        PendingReactionModel pendingReactionModel = (PendingReactionModel) obj;
        return this.emoji.equals(pendingReactionModel.emoji) && this.source == pendingReactionModel.source;
    }

    public int hashCode() {
        return AbstractC72049XLp.A02(this.emoji) + this.source;
    }

    public PendingReactionModel(EmojiModel emojiModel, int i) {
        emojiModel.getClass();
        this.emoji = emojiModel;
        this.source = i;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PendingReactionModel{emoji=");
        A1C.append(this.emoji);
        A1C.append(",source=");
        return AbstractC72049XLp.A0B(A1C, this.source);
    }
}
