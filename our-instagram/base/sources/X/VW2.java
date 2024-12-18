package X;

import com.instagram.reels.chat.model.ChatStickerChannelType;

/* loaded from: classes11.dex */
public abstract class VW2 {
    public static final ChatStickerChannelType A00(String str) {
        ChatStickerChannelType chatStickerChannelType = (ChatStickerChannelType) ChatStickerChannelType.A01.get(str);
        if (chatStickerChannelType == null) {
            return ChatStickerChannelType.A0A;
        }
        return chatStickerChannelType;
    }
}
