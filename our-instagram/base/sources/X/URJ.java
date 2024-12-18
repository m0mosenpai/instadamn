package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;

/* loaded from: classes11.dex */
public final class URJ extends C0T6 implements XGF {
    public final ChatStickerChannelType A00;
    public final ChatStickerStickerType A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // X.XGF
    public final URJ F08() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URJ) {
                URJ urj = (URJ) obj;
                if (!C14360o3.A0K(this.A02, urj.A02) || !C14360o3.A0K(this.A03, urj.A03) || this.A00 != urj.A00 || this.A01 != urj.A01 || !C14360o3.A0K(this.A04, urj.A04) || !C14360o3.A0K(this.A05, urj.A05) || !C14360o3.A0K(this.A06, urj.A06) || !C14360o3.A0K(this.A07, urj.A07) || !C14360o3.A0K(this.A08, urj.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGF
    public final Integer Ada() {
        return this.A02;
    }

    @Override // X.XGF
    public final String Amu() {
        return this.A03;
    }

    @Override // X.XGF
    public final ChatStickerChannelType AnL() {
        return this.A00;
    }

    @Override // X.XGF
    public final ChatStickerStickerType C0m() {
        return this.A01;
    }

    @Override // X.XGF
    public final String C1J() {
        return this.A04;
    }

    @Override // X.XGF
    public final String C7J() {
        return this.A06;
    }

    @Override // X.XGF
    public final String C7K() {
        return this.A07;
    }

    @Override // X.XGF
    public final String C7l() {
        return this.A08;
    }

    @Override // X.XGF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryChallengeChatDict", VP0.A00(this));
    }

    @Override // X.XGF
    public final String getText() {
        return this.A05;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31;
        String str = this.A08;
        if (str != null) {
            i = str.hashCode();
        }
        return A0M + i;
    }

    public URJ(ChatStickerChannelType chatStickerChannelType, ChatStickerStickerType chatStickerStickerType, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = num;
        this.A03 = str;
        this.A00 = chatStickerChannelType;
        this.A01 = chatStickerStickerType;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
    }
}
