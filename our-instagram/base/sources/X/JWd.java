package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class JWd extends C0T6 {
    public Object A00;
    public String A01;
    public boolean A02;
    public final int A03;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof JWd) && ((JWd) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWd.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWd.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        String A00;
        String str3;
        switch (this.A03) {
            case 5:
                A1C = AbstractC166987dD.A1C();
                A1C.append("GiphyClipsQuery(query=");
                A1C.append(this.A01);
                A1C.append(", origin=");
                Number number = (Number) this.A00;
                if (number != null) {
                    switch (number.intValue()) {
                        case 1:
                            str = "CATEGORY_SELECTION";
                            break;
                        case 2:
                            str = "SEARCH_BAR";
                            break;
                        default:
                            str = "ON_LOAD";
                            break;
                    }
                } else {
                    str = "null";
                }
                A1C.append(str);
                str2 = ", isFromFragmentCache=";
                A1C.append(str2);
                return AbstractC25236BEt.A0a(A1C, this.A02);
            case 7:
                A1C = AbstractC166987dD.A1C();
                A1C.append("DirectStickerTrayAiStaticStickerItem(sticker=");
                A1C.append(this.A00);
                A00 = MSV.A00(69);
                A1C.append(A00);
                A1C.append(this.A01);
                str2 = ", hasLoggedFirstImpression=";
                A1C.append(str2);
                return AbstractC25236BEt.A0a(A1C, this.A02);
            case 8:
                A1C = AbstractC166987dD.A1C();
                str3 = "DirectStickerTrayCutoutStaticStickerItem(sticker=";
                A1C.append(str3);
                A1C.append(this.A00);
                A00 = ", searchTerm=";
                A1C.append(A00);
                A1C.append(this.A01);
                str2 = ", hasLoggedFirstImpression=";
                A1C.append(str2);
                return AbstractC25236BEt.A0a(A1C, this.A02);
            case 9:
                A1C = AbstractC166987dD.A1C();
                str3 = "DirectStickerTrayGiphySearchItem(sticker=";
                A1C.append(str3);
                A1C.append(this.A00);
                A00 = ", searchTerm=";
                A1C.append(A00);
                A1C.append(this.A01);
                str2 = ", hasLoggedFirstImpression=";
                A1C.append(str2);
                return AbstractC25236BEt.A0a(A1C, this.A02);
            case 10:
                A1C = AbstractC166987dD.A1C();
                str3 = "DirectStickerTrayStoreStickerItem(sticker=";
                A1C.append(str3);
                A1C.append(this.A00);
                A00 = ", searchTerm=";
                A1C.append(A00);
                A1C.append(this.A01);
                str2 = ", hasLoggedFirstImpression=";
                A1C.append(str2);
                return AbstractC25236BEt.A0a(A1C, this.A02);
            case 21:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ViewState(formattedMediaCount=");
                A1C.append(this.A01);
                A1C.append(", clipsGridItems=");
                A1C.append(this.A00);
                str2 = ", hasMoreClips=";
                A1C.append(str2);
                return AbstractC25236BEt.A0a(A1C, this.A02);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWd() {
        this("", false, (List) C16930sl.A00, 4);
        this.A03 = 4;
        this.A03 = 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWd(C38321qM c38321qM, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this((Object) null, (String) null, 13, false);
        this.A03 = 13;
    }

    public JWd(C2E4 c2e4, String str, boolean z) {
        this.A03 = 11;
        this.A01 = str;
        this.A00 = c2e4;
        this.A02 = z;
    }

    public JWd(C148286ly c148286ly, String str, int i) {
        int i2;
        this.A03 = i;
        if (7 - i != 0) {
            i2 = 8;
        } else {
            i2 = 7;
        }
        this.A03 = i2;
        C14360o3.A0B(c148286ly, 1);
        this.A00 = c148286ly;
        this.A01 = str;
        this.A02 = false;
    }

    public JWd(C45026JwH c45026JwH, String str) {
        this.A03 = 9;
        this.A03 = 9;
        C14360o3.A0B(c45026JwH, 1);
        this.A00 = c45026JwH;
        this.A01 = str;
        this.A02 = false;
    }

    public JWd(C45079Jx9 c45079Jx9, String str, boolean z) {
        this.A03 = 3;
        C14360o3.A0B(c45079Jx9, 1);
        this.A00 = c45079Jx9;
        this.A02 = z;
        this.A01 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWd(ImageUrl imageUrl, String str) {
        this(imageUrl, str, false);
        this.A03 = 12;
    }

    public JWd(ImageUrl imageUrl, String str, boolean z) {
        this.A03 = 12;
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = z;
    }

    public JWd(DirectStoreSticker directStoreSticker, String str) {
        this.A03 = 10;
        this.A03 = 10;
        this.A00 = directStoreSticker;
        this.A01 = str;
        this.A02 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWd(Integer num, String str) {
        this(str, num, false, 5);
        this.A03 = 5;
    }

    public JWd(Integer num, String str, int i, boolean z) {
        this.A03 = 14;
        this.A00 = num;
        this.A02 = z;
        this.A01 = str;
    }

    public JWd(Integer num, String str, boolean z) {
        this.A03 = 18;
        C14360o3.A0B(str, 2);
        this.A00 = num;
        this.A01 = str;
        this.A02 = z;
    }

    public JWd(Object obj, String str, int i, boolean z) {
        this.A03 = i;
        this.A01 = str;
        this.A00 = obj;
        this.A02 = z;
    }

    public JWd(String str, C5Hc c5Hc, boolean z) {
        this.A03 = 15;
        C14360o3.A0B(c5Hc, 1);
        this.A00 = c5Hc;
        this.A01 = str;
        this.A02 = z;
    }

    public JWd(String str, Integer num, boolean z, int i) {
        this.A03 = 5;
        AbstractC167017dG.A1P(str, num);
        this.A01 = str;
        this.A00 = num;
        this.A02 = z;
    }

    public JWd(String str, List list, int i, boolean z) {
        this.A03 = i;
        if (i == 0) {
            AbstractC167017dG.A1P(str, list);
        }
        this.A01 = str;
        this.A00 = list;
        this.A02 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWd(String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this("", false, (List) C16930sl.A00, 4);
        this.A03 = 4;
    }

    public JWd(String str, Map map, boolean z) {
        this.A03 = 2;
        this.A02 = z;
        this.A01 = str;
        this.A00 = map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWd(String str, DefaultConstructorMarker defaultConstructorMarker, C5Hc c5Hc, int i, int i2, boolean z) {
        this("", (C5Hc) C5HZ.A01, false);
        this.A03 = 15;
    }

    public JWd(String str, boolean z, List list, int i) {
        this.A03 = i;
        switch (i) {
            case 1:
                C14360o3.A0B(str, 1);
                break;
            case 4:
                C14360o3.A0B(str, 1);
            case 2:
            case 3:
            default:
                C14360o3.A0B(list, 3);
                break;
        }
        this.A01 = str;
        this.A02 = z;
        this.A00 = list;
    }

    public JWd(List list, String str, boolean z, int i) {
        this.A03 = 16;
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A01 = str;
        this.A02 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWd(List list, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker, int i2) {
        this((i & 1) != 0 ? C16930sl.A00 : list, (String) null, false, 16);
        this.A03 = 16;
    }

    public JWd(List list, boolean z, String str, int i) {
        this.A03 = i;
        if (19 - i != 0) {
            C14360o3.A0B(str, 3);
        }
        this.A00 = list;
        this.A02 = z;
        this.A01 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JWd(List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker, int i2) {
        this(list, true, (String) null, 19);
        this.A03 = 19;
    }

    public JWd(boolean z) {
        this.A03 = 22;
        Float valueOf = Float.valueOf(0.0f);
        this.A03 = 22;
        this.A02 = z;
        this.A00 = valueOf;
        this.A01 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
    }
}
