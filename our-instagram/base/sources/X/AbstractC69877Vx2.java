package X;

import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import java.io.IOException;

/* renamed from: X.Vx2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69877Vx2 {
    public static URJ parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            ChatStickerChannelType chatStickerChannelType = null;
            ChatStickerStickerType chatStickerStickerType = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audience_type".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("challenge_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("chat_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    chatStickerChannelType = VW2.A00(A1P2);
                } else if ("sticker_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    chatStickerStickerType = (ChatStickerStickerType) ChatStickerStickerType.A01.get(A1P);
                    if (chatStickerStickerType == null) {
                        chatStickerStickerType = ChatStickerStickerType.A0A;
                    }
                } else if ("story_chat_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("thread_id_v2".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("thread_igid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("thread_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new URJ(chatStickerChannelType, chatStickerStickerType, num, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, URJ urj, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        Integer num = urj.A02;
        if (num != null) {
            anonymousClass182.A0Q("audience_type", num.intValue());
        }
        String str = urj.A03;
        if (str != null) {
            anonymousClass182.A0S("challenge_id", str);
        }
        ChatStickerChannelType chatStickerChannelType = urj.A00;
        if (chatStickerChannelType != null) {
            anonymousClass182.A0S("chat_type", chatStickerChannelType.A00);
        }
        ChatStickerStickerType chatStickerStickerType = urj.A01;
        if (chatStickerStickerType != null) {
            anonymousClass182.A0S("sticker_type", chatStickerStickerType.A00);
        }
        String str2 = urj.A04;
        if (str2 != null) {
            anonymousClass182.A0S("story_chat_id", str2);
        }
        AbstractC37301Gc2.A1E(anonymousClass182, urj.A05);
        String str3 = urj.A06;
        if (str3 != null) {
            anonymousClass182.A0S("thread_id_v2", str3);
        }
        String str4 = urj.A07;
        if (str4 != null) {
            anonymousClass182.A0S("thread_igid", str4);
        }
        String str5 = urj.A08;
        if (str5 != null) {
            anonymousClass182.A0S("thread_title", str5);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
