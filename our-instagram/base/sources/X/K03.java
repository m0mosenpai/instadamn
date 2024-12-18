package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class K03 extends C0T6 implements InterfaceC66482zP {
    public final C51737MtK A00;
    public final C148286ly A01;
    public final EnumC150226pU A02;
    public final InterfaceC16620sF A03;
    public final boolean A04;

    public K03(C51737MtK c51737MtK, C148286ly c148286ly, EnumC150226pU enumC150226pU, InterfaceC16620sF interfaceC16620sF, boolean z) {
        C14360o3.A0B(interfaceC16620sF, 5);
        this.A01 = c148286ly;
        this.A02 = enumC150226pU;
        this.A00 = c51737MtK;
        this.A04 = z;
        this.A03 = interfaceC16620sF;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K03) {
                K03 k03 = (K03) obj;
                if (!C14360o3.A0K(this.A01, k03.A01) || this.A02 != k03.A02 || !C14360o3.A0K(this.A00, k03.A00) || this.A04 != k03.A04 || !C14360o3.A0K(this.A03, k03.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A01.A0S;
        C14360o3.A07(str);
        return str;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ImageUrl imageUrl;
        C148286ly c148286ly;
        K03 k03 = (K03) obj;
        ImageUrl imageUrl2 = this.A01.A0H;
        if (k03 != null && (c148286ly = k03.A01) != null) {
            imageUrl = c148286ly.A0H;
        } else {
            imageUrl = null;
        }
        return C14360o3.A0K(imageUrl2, imageUrl);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AvatarStickerItemViewModel(sticker=");
        A1C.append(this.A01);
        A1C.append(", stickerType=");
        A1C.append(this.A02);
        A1C.append(", rankingInfo=");
        A1C.append(this.A00);
        A1C.append(", isRestrictedLogging=");
        A1C.append(this.A04);
        A1C.append(", onAvatarStickerSelected=");
        A1C.append(this.A03);
        A1C.append(", directStickerTrayAvatarStaticStickerItem=");
        return AbstractC167017dG.A0o(null, A1C);
    }
}
