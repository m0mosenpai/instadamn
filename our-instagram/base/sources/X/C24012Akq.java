package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Akq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24012Akq implements C5NL {
    public C66645URj A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public final int A00() {
        return AbstractC167017dG.A0K(this.A00.A09);
    }

    public final int A01() {
        return AbstractC167017dG.A0K(this.A00.A0B);
    }

    public final String A02() {
        String str = this.A00.A0K;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String A03(Context context, UserSession userSession) {
        Resources resources;
        int i;
        StoryJoinChatStatus storyJoinChatStatus = this.A00.A02;
        if (storyJoinChatStatus == null) {
            storyJoinChatStatus = StoryJoinChatStatus.A07;
        }
        switch (storyJoinChatStatus.ordinal()) {
            case 0:
                return "";
            case 1:
                resources = context.getResources();
                i = 2131955120;
                break;
            case 2:
                resources = context.getResources();
                i = 2131955121;
                break;
            case 3:
                resources = context.getResources();
                i = AbstractC22740A1k.A00(userSession);
                break;
            case 4:
                resources = context.getResources();
                i = 2131955128;
                break;
            case 5:
                resources = context.getResources();
                i = 2131955130;
                break;
            default:
                throw B4Z.A00();
        }
        return AbstractC166997dE.A0q(resources, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A04(android.content.Context r9, com.instagram.common.session.UserSession r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24012Akq.A04(android.content.Context, com.instagram.common.session.UserSession):java.lang.String");
    }

    public final void A05(int i) {
        C66645URj c66645URj = this.A00;
        C14360o3.A0B(c66645URj, 1);
        Integer num = c66645URj.A08;
        AiAgentMetadataDict aiAgentMetadataDict = c66645URj.A00;
        String str = c66645URj.A0D;
        Integer num2 = c66645URj.A09;
        ChatStickerChannelType chatStickerChannelType = c66645URj.A03;
        Integer num3 = c66645URj.A0A;
        String str2 = c66645URj.A0E;
        Long l = c66645URj.A0C;
        String str3 = c66645URj.A0F;
        String str4 = c66645URj.A0G;
        Boolean bool = c66645URj.A06;
        Boolean bool2 = c66645URj.A07;
        String str5 = c66645URj.A0H;
        StoryJoinChatStatus storyJoinChatStatus = c66645URj.A02;
        XGG xgg = c66645URj.A01;
        User user = c66645URj.A05;
        String str6 = c66645URj.A0I;
        List list = c66645URj.A0N;
        this.A00 = VW4.A00(aiAgentMetadataDict, xgg, storyJoinChatStatus, chatStickerChannelType, c66645URj.A04, user, bool, bool2, num, num2, num3, Integer.valueOf(i), l, str, str2, str3, str4, str5, str6, c66645URj.A0J, c66645URj.A0K, c66645URj.A0L, c66645URj.A0M, list);
    }

    public final void A06(StoryJoinChatStatus storyJoinChatStatus) {
        C66645URj c66645URj = this.A00;
        C14360o3.A0B(c66645URj, 1);
        Integer num = c66645URj.A08;
        AiAgentMetadataDict aiAgentMetadataDict = c66645URj.A00;
        String str = c66645URj.A0D;
        Integer num2 = c66645URj.A09;
        ChatStickerChannelType chatStickerChannelType = c66645URj.A03;
        Integer num3 = c66645URj.A0A;
        String str2 = c66645URj.A0E;
        Long l = c66645URj.A0C;
        String str3 = c66645URj.A0F;
        String str4 = c66645URj.A0G;
        Boolean bool = c66645URj.A06;
        Boolean bool2 = c66645URj.A07;
        String str5 = c66645URj.A0H;
        Integer num4 = c66645URj.A0B;
        this.A00 = VW4.A00(aiAgentMetadataDict, c66645URj.A01, storyJoinChatStatus, chatStickerChannelType, c66645URj.A04, c66645URj.A05, bool, bool2, num, num2, num3, num4, l, str, str2, str3, str4, str5, c66645URj.A0I, c66645URj.A0J, c66645URj.A0K, c66645URj.A0L, c66645URj.A0M, c66645URj.A0N);
    }

    public final boolean A07() {
        ChatStickerChannelType chatStickerChannelType = this.A00.A03;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = ChatStickerChannelType.A07;
        }
        return AbstractC167007dF.A1X(chatStickerChannelType, ChatStickerChannelType.A05);
    }

    public final boolean A08() {
        ChatStickerChannelType chatStickerChannelType = this.A00.A03;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = ChatStickerChannelType.A07;
        }
        if (chatStickerChannelType == ChatStickerChannelType.A05 && A00() == 2) {
            return true;
        }
        return false;
    }

    public final boolean A09() {
        ChatStickerChannelType chatStickerChannelType = this.A00.A03;
        if (chatStickerChannelType == null) {
            chatStickerChannelType = ChatStickerChannelType.A07;
        }
        return AbstractC167007dF.A1X(chatStickerChannelType, ChatStickerChannelType.A09);
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C148276lx c148276lx;
        C5NG A0V = AbstractC167007dF.A0V();
        if (A09()) {
            c148276lx = C148276lx.A1U;
        } else {
            c148276lx = C148276lx.A12;
        }
        AbstractC166987dD.A1V(c148276lx, A0V);
        return A0V;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        if (A09()) {
            return C05F.A0N;
        }
        return C05F.A0C;
    }
}
