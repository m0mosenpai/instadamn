package com.facebook.rsys.reactions.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25236BEt;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class EmojiReactionsParticipantModel {
    public static C2N9 CONVERTER = YAM.A00(38);
    public static long sMcfTypeId;
    public final EmojiModel emoji;
    public final long emojiExpiryTime;
    public final String participantId;
    public final ArrayList reactions;

    public static native EmojiReactionsParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiReactionsParticipantModel)) {
            return false;
        }
        EmojiReactionsParticipantModel emojiReactionsParticipantModel = (EmojiReactionsParticipantModel) obj;
        return this.participantId.equals(emojiReactionsParticipantModel.participantId) && this.emoji.equals(emojiReactionsParticipantModel.emoji) && this.emojiExpiryTime == emojiReactionsParticipantModel.emojiExpiryTime && this.reactions.equals(emojiReactionsParticipantModel.reactions);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.reactions, AbstractC25236BEt.A01(this.emojiExpiryTime, AbstractC166997dE.A0J(this.emoji, AbstractC50523MSb.A02(this.participantId))));
    }

    public EmojiReactionsParticipantModel(String str, EmojiModel emojiModel, long j, ArrayList arrayList) {
        AbstractC31180DnO.A1U(str, emojiModel, arrayList);
        this.participantId = str;
        this.emoji = emojiModel;
        this.emojiExpiryTime = j;
        this.reactions = arrayList;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EmojiReactionsParticipantModel{participantId=");
        A1C.append(this.participantId);
        A1C.append(",emoji=");
        A1C.append(this.emoji);
        A1C.append(",emojiExpiryTime=");
        A1C.append(this.emojiExpiryTime);
        A1C.append(",reactions=");
        return JQ0.A0l(this.reactions, A1C);
    }
}
