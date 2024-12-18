package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jzy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45218Jzy extends C0T6 implements InterfaceC66482zP {
    public final AA7 A00;
    public final InterfaceC16820sZ A01;

    public C45218Jzy(AA7 aa7, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(aa7, 1);
        this.A00 = aa7;
        this.A01 = interfaceC16820sZ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45218Jzy) {
                C45218Jzy c45218Jzy = (C45218Jzy) obj;
                if (!C14360o3.A0K(this.A00, c45218Jzy.A00) || !C14360o3.A0K(this.A01, c45218Jzy.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A05;
        C14360o3.A07(str);
        return str;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ImageUrl imageUrl;
        AA7 aa7;
        AA8 aa8;
        C47712L4t c47712L4t;
        C45218Jzy c45218Jzy = (C45218Jzy) obj;
        ImageUrl imageUrl2 = this.A00.A00.A00.A05;
        if (c45218Jzy != null && (aa7 = c45218Jzy.A00) != null && (aa8 = aa7.A00) != null && (c47712L4t = aa8.A00) != null) {
            imageUrl = c47712L4t.A05;
        } else {
            imageUrl = null;
        }
        return C14360o3.A0K(imageUrl2, imageUrl);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CommentGiphyStickerSuggestionItemViewModel(sticker=");
        A1C.append(this.A00);
        A1C.append(", onGifSelected=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
