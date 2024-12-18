package com.facebook.rsys.reactions.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC72049XLp;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class EmojiReactionsModel {
    public static C2N9 CONVERTER = YAM.A00(37);
    public static long sMcfTypeId;
    public final ArrayList allowedGifDomains;
    public final ArrayList emojiParticipants;
    public final boolean isEmojiReactionsFeatureEnabled;
    public final PendingReactionModel pendingReaction;

    public static native EmojiReactionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EmojiReactionsModel)) {
                return false;
            }
            EmojiReactionsModel emojiReactionsModel = (EmojiReactionsModel) obj;
            if (this.emojiParticipants.equals(emojiReactionsModel.emojiParticipants) && this.isEmojiReactionsFeatureEnabled == emojiReactionsModel.isEmojiReactionsFeatureEnabled) {
                PendingReactionModel pendingReactionModel = this.pendingReaction;
                PendingReactionModel pendingReactionModel2 = emojiReactionsModel.pendingReaction;
                if (pendingReactionModel == null) {
                    if (pendingReactionModel2 != null) {
                        return false;
                    }
                } else if (!pendingReactionModel.equals(pendingReactionModel2)) {
                    return false;
                }
                ArrayList arrayList = this.allowedGifDomains;
                ArrayList arrayList2 = emojiReactionsModel.allowedGifDomains;
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
        return ((((AbstractC72049XLp.A02(this.emojiParticipants) + (this.isEmojiReactionsFeatureEnabled ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.pendingReaction)) * 31) + AbstractC166997dE.A0I(this.allowedGifDomains);
    }

    public EmojiReactionsModel(ArrayList arrayList, boolean z, PendingReactionModel pendingReactionModel, ArrayList arrayList2) {
        arrayList.getClass();
        this.emojiParticipants = arrayList;
        this.isEmojiReactionsFeatureEnabled = z;
        this.pendingReaction = pendingReactionModel;
        this.allowedGifDomains = arrayList2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EmojiReactionsModel{emojiParticipants=");
        A1C.append(this.emojiParticipants);
        A1C.append(",isEmojiReactionsFeatureEnabled=");
        A1C.append(this.isEmojiReactionsFeatureEnabled);
        A1C.append(",pendingReaction=");
        A1C.append(this.pendingReaction);
        A1C.append(",allowedGifDomains=");
        return JQ0.A0l(this.allowedGifDomains, A1C);
    }
}
