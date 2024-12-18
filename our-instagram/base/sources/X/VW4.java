package X;

import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.AiAgentMetadataDictImpl;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VW4 {
    public static C66645URj A00(AiAgentMetadataDict aiAgentMetadataDict, XGG xgg, StoryJoinChatStatus storyJoinChatStatus, ChatStickerChannelType chatStickerChannelType, ChatStickerStickerType chatStickerStickerType, User user, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list) {
        URK urk;
        ArrayList arrayList;
        AbstractC167017dG.A0x();
        AiAgentMetadataDictImpl Eqp = aiAgentMetadataDict != null ? aiAgentMetadataDict.Eqp() : null;
        if (xgg != null) {
            urk = xgg.F0B();
        } else {
            urk = null;
        }
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC72037XFz) it.next()).Ezg());
            }
        } else {
            arrayList = null;
        }
        return new C66645URj(Eqp, urk, storyJoinChatStatus, chatStickerChannelType, chatStickerStickerType, user, bool, bool2, num, num2, num3, num4, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList);
    }
}
