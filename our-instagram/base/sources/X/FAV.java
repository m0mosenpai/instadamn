package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;

/* loaded from: classes6.dex */
public abstract class FAV {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, C144296fB c144296fB, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        EnumC33373Ep6 enumC33373Ep6;
        String str4;
        AbstractC167027dH.A13(userSession, str, str2);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(c144296fB, 6);
        if (VW2.A00(str3) == ChatStickerChannelType.A05 && FU1.A01(userSession, str2, i)) {
            if (z) {
                str4 = "clips_viewer_chat_sticker";
            } else {
                str4 = "reel_viewer_chat_sticker";
            }
            C28531Zo.A04.A03(fragmentActivity, AbstractC31171DnF.A0D("ChatStickerRequestLauncher"), userSession, str2, null, null, str4, i);
            return;
        }
        ChatStickerStickerType chatStickerStickerType = ChatStickerStickerType.A07;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("GroupPreviewFragment.STORY_ID_KEY", str);
        int ordinal = chatStickerStickerType.ordinal();
        if (ordinal != 4) {
            if (ordinal != 6) {
                enumC33373Ep6 = EnumC33373Ep6.A0L;
            } else {
                enumC33373Ep6 = EnumC33373Ep6.A0C;
            }
        } else if (z) {
            enumC33373Ep6 = EnumC33373Ep6.A04;
        } else {
            enumC33373Ep6 = EnumC33373Ep6.A03;
        }
        A0b.putSerializable("GroupPreviewFragment.JOINING_SURFACE", enumC33373Ep6);
        A0b.putString("GroupPreviewFragment.CHAT_STICKER_CHANNEL_TYPE", str3);
        EN8 en8 = new EN8();
        en8.setArguments(A0b);
        en8.A0D = null;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = en8;
        C189478aR A00 = A0y.A00();
        en8.A0C = new C36375G3b(userSession, A00, A0y, c144296fB, str3, interfaceC16820sZ, z);
        A00.A02(fragmentActivity, en8);
    }
}
