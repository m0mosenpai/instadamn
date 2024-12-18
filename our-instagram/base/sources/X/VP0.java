package X;

import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VP0 {
    public static Map A00(XGF xgf) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xgf.Ada() != null) {
            linkedHashMap.put("audience_type", xgf.Ada());
        }
        if (xgf.Amu() != null) {
            linkedHashMap.put("challenge_id", xgf.Amu());
        }
        String str2 = null;
        if (xgf.AnL() != null) {
            ChatStickerChannelType AnL = xgf.AnL();
            if (AnL != null) {
                str = AnL.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("chat_type", str);
        }
        if (xgf.C0m() != null) {
            ChatStickerStickerType C0m = xgf.C0m();
            if (C0m != null) {
                str2 = C0m.A00;
            }
            linkedHashMap.put("sticker_type", str2);
        }
        if (xgf.C1J() != null) {
            linkedHashMap.put("story_chat_id", xgf.C1J());
        }
        if (xgf.getText() != null) {
            linkedHashMap.put("text", xgf.getText());
        }
        if (xgf.C7J() != null) {
            linkedHashMap.put("thread_id_v2", xgf.C7J());
        }
        if (xgf.C7K() != null) {
            linkedHashMap.put("thread_igid", xgf.C7K());
        }
        if (xgf.C7l() != null) {
            linkedHashMap.put("thread_title", xgf.C7l());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
