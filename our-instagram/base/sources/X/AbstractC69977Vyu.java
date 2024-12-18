package X;

import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.Vyu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69977Vyu {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Akq] */
    public static final C24012Akq A01(C66645URj c66645URj) {
        ?? obj = new Object();
        obj.A00 = c66645URj;
        obj.A01 = false;
        obj.A03 = false;
        obj.A02 = false;
        return obj;
    }

    public static final ChatStickerChannelType A00(int i) {
        if (i == 29) {
            return ChatStickerChannelType.A05;
        }
        if (C4GR.A02(i)) {
            return ChatStickerChannelType.A09;
        }
        if (C4GR.A01(i)) {
            return ChatStickerChannelType.A07;
        }
        if (C4GR.A07(Integer.valueOf(i))) {
            return ChatStickerChannelType.A04;
        }
        return ChatStickerChannelType.A0A;
    }
}
