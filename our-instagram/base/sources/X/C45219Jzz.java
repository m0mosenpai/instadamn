package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jzz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45219Jzz extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final JWd A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45219Jzz) {
                C45219Jzz c45219Jzz = (C45219Jzz) obj;
                if (!C14360o3.A0K(this.A01, c45219Jzz.A01) || this.A00 != c45219Jzz.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        C148286ly c148286ly;
        String str;
        JWd jWd = this.A01;
        if (jWd == null || (c148286ly = (C148286ly) jWd.A00) == null || (str = c148286ly.A0S) == null) {
            return "Shimmer";
        }
        return str;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ImageUrl imageUrl;
        JWd jWd;
        C148286ly c148286ly;
        C148286ly c148286ly2;
        C45219Jzz c45219Jzz = (C45219Jzz) obj;
        JWd jWd2 = this.A01;
        ImageUrl imageUrl2 = null;
        if (jWd2 != null && (c148286ly2 = (C148286ly) jWd2.A00) != null) {
            imageUrl = c148286ly2.A0H;
        } else {
            imageUrl = null;
        }
        if (c45219Jzz != null && (jWd = c45219Jzz.A01) != null && (c148286ly = (C148286ly) jWd.A00) != null) {
            imageUrl2 = c148286ly.A0H;
        }
        return C14360o3.A0K(imageUrl, imageUrl2);
    }

    public C45219Jzz(JWd jWd, int i) {
        this.A01 = jWd;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DirectAIStickerItemViewModel(stickerModel=");
        A1C.append(this.A01);
        A1C.append(", positionIndex=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
