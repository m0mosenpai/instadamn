package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class K00 extends C0T6 implements InterfaceC66482zP {
    public final C148286ly A00;
    public final EnumC150226pU A01;
    public final InterfaceC16820sZ A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K00) {
                K00 k00 = (K00) obj;
                if (!C14360o3.A0K(this.A00, k00.A00) || this.A01 != k00.A01 || !C14360o3.A0K(this.A02, k00.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A0S;
        C14360o3.A07(str);
        return str;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ImageUrl imageUrl;
        C148286ly c148286ly;
        K00 k00 = (K00) obj;
        ImageUrl imageUrl2 = this.A00.A0H;
        if (k00 != null && (c148286ly = k00.A00) != null) {
            imageUrl = c148286ly.A0H;
        } else {
            imageUrl = null;
        }
        return C14360o3.A0K(imageUrl2, imageUrl);
    }

    public K00(C148286ly c148286ly, EnumC150226pU enumC150226pU, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c148286ly;
        this.A01 = enumC150226pU;
        this.A02 = interfaceC16820sZ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CommentAvatarStickerSuggestionItemViewModel(sticker=");
        A1C.append(this.A00);
        A1C.append(", stickerType=");
        A1C.append(this.A01);
        A1C.append(", onAvatarStickerSelected=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}