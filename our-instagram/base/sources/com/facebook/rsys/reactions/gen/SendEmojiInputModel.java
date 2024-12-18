package com.facebook.rsys.reactions.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.AbstractC72049XLp;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class SendEmojiInputModel {
    public static C2N9 CONVERTER = YAM.A00(42);
    public static long sMcfTypeId;
    public final String emojiId;
    public final int source;
    public final int type;

    public static native SendEmojiInputModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendEmojiInputModel)) {
            return false;
        }
        SendEmojiInputModel sendEmojiInputModel = (SendEmojiInputModel) obj;
        return this.emojiId.equals(sendEmojiInputModel.emojiId) && this.type == sendEmojiInputModel.type && this.source == sendEmojiInputModel.source;
    }

    public int hashCode() {
        return ((AbstractC50523MSb.A02(this.emojiId) + this.type) * 31) + this.source;
    }

    public SendEmojiInputModel(String str, int i, int i2) {
        str.getClass();
        this.emojiId = str;
        this.type = i;
        this.source = i2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SendEmojiInputModel{emojiId=");
        A1C.append(this.emojiId);
        A1C.append(",type=");
        A1C.append(this.type);
        A1C.append(",source=");
        return AbstractC72049XLp.A0B(A1C, this.source);
    }
}
