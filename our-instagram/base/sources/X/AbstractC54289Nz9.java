package X;

import com.instagram.wellbeing.livechat.LiveChatNonce;
import com.instagram.wellbeing.livechat.LiveChatNonceList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Nz9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54289Nz9 {
    public static void A00(Map map) {
        String string = AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("live_chat_nonce", null);
        if (string != null && string.length() != 0) {
            C73773Sh c73773Sh = AbstractC73763Sg.A03;
            C3R9[] c3r9Arr = LiveChatNonceList.A01;
            Iterator it = ((LiveChatNonceList) c73773Sh.A00(string, C57121PVk.A00)).A00.iterator();
            while (it.hasNext()) {
                LiveChatNonce liveChatNonce = (LiveChatNonce) it.next();
                map.put(liveChatNonce.A02, liveChatNonce);
            }
        }
    }
}
