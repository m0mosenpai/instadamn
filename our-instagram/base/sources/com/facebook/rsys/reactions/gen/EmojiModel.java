package com.facebook.rsys.reactions.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC50523MSb;
import X.AbstractC72049XLp;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class EmojiModel {
    public static C2N9 CONVERTER = YAM.A00(36);
    public static long sMcfTypeId;
    public final String emojiClickId;
    public final String emojiId;
    public final int type;

    public static native EmojiModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiModel)) {
            return false;
        }
        EmojiModel emojiModel = (EmojiModel) obj;
        return this.emojiId.equals(emojiModel.emojiId) && this.emojiClickId.equals(emojiModel.emojiClickId) && this.type == emojiModel.type;
    }

    public int hashCode() {
        return AbstractC166997dE.A0K(this.emojiClickId, AbstractC50523MSb.A02(this.emojiId)) + this.type;
    }

    public EmojiModel(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.emojiId = str;
        this.emojiClickId = str2;
        this.type = i;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EmojiModel{emojiId=");
        A1C.append(this.emojiId);
        A1C.append(",emojiClickId=");
        A1C.append(this.emojiClickId);
        A1C.append(",type=");
        return AbstractC72049XLp.A0B(A1C, this.type);
    }
}
