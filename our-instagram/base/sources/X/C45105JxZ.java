package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.JxZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45105JxZ extends C0T6 {
    public final int A00;
    public final Object A01;

    public C45105JxZ(JWd jWd, int i) {
        this.A00 = i;
        this.A01 = jWd;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45105JxZ) && ((C45105JxZ) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final String A01() {
        int i = this.A00;
        Object obj = ((JWd) this.A01).A00;
        switch (i) {
            case 2:
                return ((C45026JwH) obj).A00.A05;
            case 3:
                return ((DirectStoreSticker) obj).A04;
            default:
                String str = ((C148286ly) obj).A0S;
                C14360o3.A07(str);
                return str;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C45105JxZ) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        switch (i) {
            case 0:
                str = "AiSticker(stickerItem=";
                break;
            case 1:
                str = "CutoutSticker(stickerItem=";
                break;
            case 2:
                str = "GiphySticker(stickerItem=";
                break;
            default:
                str = "StoreSticker(stickerItem=";
                break;
        }
        A1C.append(str);
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
