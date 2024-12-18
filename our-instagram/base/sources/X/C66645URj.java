package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.URj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66645URj extends C0T6 implements XGL {
    public final AiAgentMetadataDict A00;
    public final XGG A01;
    public final StoryJoinChatStatus A02;
    public final ChatStickerChannelType A03;
    public final ChatStickerStickerType A04;
    public final User A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Long A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;

    @Override // X.XGL
    public final C66645URj F6m(C1DY c1dy) {
        return this;
    }

    @Override // X.XGL
    public final C66645URj F6n(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66645URj) {
                C66645URj c66645URj = (C66645URj) obj;
                if (!C14360o3.A0K(this.A08, c66645URj.A08) || !C14360o3.A0K(this.A00, c66645URj.A00) || !C14360o3.A0K(this.A0D, c66645URj.A0D) || !C14360o3.A0K(this.A09, c66645URj.A09) || this.A03 != c66645URj.A03 || !C14360o3.A0K(this.A0A, c66645URj.A0A) || !C14360o3.A0K(this.A0E, c66645URj.A0E) || !C14360o3.A0K(this.A0C, c66645URj.A0C) || !C14360o3.A0K(this.A0F, c66645URj.A0F) || !C14360o3.A0K(this.A0G, c66645URj.A0G) || !C14360o3.A0K(this.A06, c66645URj.A06) || !C14360o3.A0K(this.A07, c66645URj.A07) || !C14360o3.A0K(this.A0H, c66645URj.A0H) || !C14360o3.A0K(this.A0B, c66645URj.A0B) || this.A02 != c66645URj.A02 || !C14360o3.A0K(this.A01, c66645URj.A01) || !C14360o3.A0K(this.A05, c66645URj.A05) || !C14360o3.A0K(this.A0I, c66645URj.A0I) || !C14360o3.A0K(this.A0N, c66645URj.A0N) || this.A04 != c66645URj.A04 || !C14360o3.A0K(this.A0J, c66645URj.A0J) || !C14360o3.A0K(this.A0K, c66645URj.A0K) || !C14360o3.A0K(this.A0L, c66645URj.A0L) || !C14360o3.A0K(this.A0M, c66645URj.A0M)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGL
    public final Integer AYq() {
        return this.A08;
    }

    @Override // X.XGL
    public final AiAgentMetadataDict AaZ() {
        return this.A00;
    }

    @Override // X.XGL
    public final String Aag() {
        return this.A0D;
    }

    @Override // X.XGL
    public final Integer Ada() {
        return this.A09;
    }

    @Override // X.XGL
    public final ChatStickerChannelType AnL() {
        return this.A03;
    }

    @Override // X.XGL
    public final Integer AqM() {
        return this.A0A;
    }

    @Override // X.XGL
    public final String Aw9() {
        return this.A0E;
    }

    @Override // X.XGL
    public final Long Azr() {
        return this.A0C;
    }

    @Override // X.XGL
    public final String B2R() {
        return this.A0F;
    }

    @Override // X.XGL
    public final String BAX() {
        return this.A0G;
    }

    @Override // X.XGL
    public final String BK5() {
        return this.A0H;
    }

    @Override // X.XGL
    public final Integer BSC() {
        return this.A0B;
    }

    @Override // X.XGL
    public final StoryJoinChatStatus BSG() {
        return this.A02;
    }

    @Override // X.XGL
    public final XGG BbV() {
        return this.A01;
    }

    @Override // X.XGL
    public final User BtH() {
        return this.A05;
    }

    @Override // X.XGL
    public final String BuE() {
        return this.A0I;
    }

    @Override // X.XGL
    public final List ByV() {
        return this.A0N;
    }

    @Override // X.XGL
    public final ChatStickerStickerType C0m() {
        return this.A04;
    }

    @Override // X.XGL
    public final String C1J() {
        return this.A0J;
    }

    @Override // X.XGL
    public final String C7I() {
        return this.A0K;
    }

    @Override // X.XGL
    public final String C7J() {
        return this.A0L;
    }

    @Override // X.XGL
    public final Boolean CRu() {
        return this.A06;
    }

    @Override // X.XGL
    public final Boolean CSu() {
        return this.A07;
    }

    @Override // X.XGL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryJoinChatDict", VW3.A00(this));
    }

    @Override // X.XGL
    public final String getTitle() {
        return this.A0M;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((((((((((((((((((((((((((((((((((((AbstractC167017dG.A0M(this.A08) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0M(this.A0N)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31;
        String str = this.A0M;
        if (str != null) {
            i = str.hashCode();
        }
        return A0M + i;
    }

    public C66645URj(AiAgentMetadataDict aiAgentMetadataDict, XGG xgg, StoryJoinChatStatus storyJoinChatStatus, ChatStickerChannelType chatStickerChannelType, ChatStickerStickerType chatStickerStickerType, User user, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list) {
        this.A08 = num;
        this.A00 = aiAgentMetadataDict;
        this.A0D = str;
        this.A09 = num2;
        this.A03 = chatStickerChannelType;
        this.A0A = num3;
        this.A0E = str2;
        this.A0C = l;
        this.A0F = str3;
        this.A0G = str4;
        this.A06 = bool;
        this.A07 = bool2;
        this.A0H = str5;
        this.A0B = num4;
        this.A02 = storyJoinChatStatus;
        this.A01 = xgg;
        this.A05 = user;
        this.A0I = str6;
        this.A0N = list;
        this.A04 = chatStickerStickerType;
        this.A0J = str7;
        this.A0K = str8;
        this.A0L = str9;
        this.A0M = str10;
    }

    @Override // X.XGL
    public final XGL EBz(C1DY c1dy) {
        return this;
    }
}
