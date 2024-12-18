package X;

import com.facebook.forker.Process;
import com.instagram.api.schemas.IntegrityInterstitialType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.util.List;

/* loaded from: classes9.dex */
public final class MUD extends C0T6 {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof MUD) && ((MUD) obj).A03 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUD.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0153, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0155, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUD.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        switch (this.A03) {
            case 2:
                A1C = AbstractC166987dD.A1C();
                A1C.append("GraphQLProductInfo(productId=");
                A1C.append(this.A02);
                A1C.append(", externalProductId=");
                A1C.append(this.A01);
                str = ", offers=";
                A1C.append(str);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            case 3:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ShowreelNativeBitmap(name=");
                A1C.append(this.A01);
                A1C.append(", uri=");
                A1C.append(this.A02);
                str = ", metadata=";
                A1C.append(str);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            case Process.SIGTERM /* 15 */:
                A1C = AbstractC166987dD.A1C();
                str2 = "SfxPlaylist(id=";
                A1C.append(str2);
                A1C.append(this.A01);
                A1C.append(", title=");
                A1C.append(this.A02);
                str = ", effects=";
                A1C.append(str);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            case 16:
                A1C = AbstractC166987dD.A1C();
                str2 = "SfxPlaylistInfo(id=";
                A1C.append(str2);
                A1C.append(this.A01);
                A1C.append(", title=");
                A1C.append(this.A02);
                str = ", effects=";
                A1C.append(str);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            case 26:
                A1C = AbstractC166987dD.A1C();
                A1C.append("ViolationDataViewModel(violationsData=");
                A1C.append(this.A00);
                A1C.append(", buttonState=");
                A1C.append(this.A01);
                A1C.append(", reason=");
                A1C.append(this.A02);
                return AbstractC167017dG.A0p(A1C);
            case 27:
                A1C = AbstractC166987dD.A1C();
                A1C.append("NFLoggingContext(sessionId=");
                A1C.append(this.A01);
                A1C.append(", visitationId=");
                A1C.append(this.A02);
                str = ", truncationContext=";
                A1C.append(str);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUD() {
        this((Object) null, (String) null, (String) null, 26);
        this.A03 = 26;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUD(int i) {
        this((Object) null, (String) null, (String) null, 29);
        this.A03 = i;
        if (29 - i != 0) {
            this.A03 = 32;
            ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = new ShoppingTaggingFeedHeader("", null, null, false, false, false, false);
            this.A03 = 32;
            this.A00 = shoppingTaggingFeedHeader;
            this.A02 = "";
            this.A01 = "";
            return;
        }
        this.A03 = 29;
    }

    public MUD(int i, String str, String str2, List list) {
        this.A03 = i;
        if (i != 0) {
            AbstractC167027dH.A13(str, str2, list);
        } else {
            AbstractC167017dG.A1P(str, str2);
        }
        this.A01 = str;
        this.A02 = str2;
        this.A00 = list;
    }

    public MUD(C38321qM c38321qM, String str, String str2) {
        this.A03 = 10;
        C14360o3.A0B(c38321qM, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = c38321qM;
    }

    public MUD(C4OV c4ov, String str, String str2) {
        this.A03 = 31;
        AbstractC167027dH.A13(str, c4ov, str2);
        this.A02 = str;
        this.A00 = c4ov;
        this.A01 = str2;
    }

    public MUD(EnumC117355Su enumC117355Su, String str, String str2) {
        this.A03 = 23;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = enumC117355Su;
    }

    public MUD(C148276lx c148276lx, String str, String str2) {
        this.A03 = 14;
        C14360o3.A0B(c148276lx, 1);
        this.A00 = c148276lx;
        this.A02 = str;
        this.A01 = str2;
    }

    public MUD(C45126Jxv c45126Jxv, String str, String str2) {
        this.A03 = 24;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = c45126Jxv;
    }

    public MUD(MUP mup, String str, String str2) {
        this.A03 = 27;
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = mup;
    }

    public MUD(C50679MYx c50679MYx, String str, String str2) {
        this.A03 = 20;
        AbstractC167017dG.A1R(c50679MYx, str2);
        this.A01 = str;
        this.A00 = c50679MYx;
        this.A02 = str2;
    }

    public MUD(C51756Mtf c51756Mtf, String str, String str2) {
        this.A03 = 2;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = c51756Mtf;
    }

    public MUD(EnumC53217NgF enumC53217NgF, String str, String str2) {
        this.A03 = 1;
        AbstractC167007dF.A1D(str, 1, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = enumC53217NgF;
    }

    public MUD(EnumC53286NhO enumC53286NhO, String str, String str2) {
        this.A03 = 18;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = enumC53286NhO;
    }

    public MUD(VF4 vf4, String str, String str2) {
        this.A03 = 17;
        this.A00 = vf4;
        this.A01 = str;
        this.A02 = str2;
    }

    public MUD(IntegrityInterstitialType integrityInterstitialType, String str, String str2) {
        this.A03 = 11;
        this.A01 = str;
        this.A00 = integrityInterstitialType;
        this.A02 = str2;
    }

    public MUD(ImageUrl imageUrl, String str, String str2, int i) {
        this.A03 = i;
        switch (i) {
            case 4:
            case 5:
                C14360o3.A0B(imageUrl, 1);
                break;
        }
        AbstractC167017dG.A1R(str, str2);
        this.A00 = imageUrl;
        this.A01 = str;
        this.A02 = str2;
    }

    public MUD(SimpleImageUrl simpleImageUrl, String str, String str2) {
        this.A03 = 8;
        AbstractC167017dG.A1R(str, str2);
        this.A00 = simpleImageUrl;
        this.A02 = str;
        this.A01 = str2;
    }

    public MUD(Integer num, String str, String str2, int i) {
        this.A03 = i;
        switch (i) {
            case 6:
                C14360o3.A0B(str2, 2);
                this.A01 = str;
                this.A02 = str2;
                break;
            case 22:
                C14360o3.A0B(str, 1);
            default:
                this.A02 = str;
                this.A01 = str2;
                break;
        }
        this.A00 = num;
    }

    public MUD(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    public MUD(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = 13;
        this.A03 = 13;
        C14360o3.A0B(interfaceC16820sZ, 2);
        this.A02 = str;
        this.A00 = interfaceC16820sZ;
        this.A01 = null;
    }

    public MUD(String str, String str2) {
        this.A03 = 3;
        C16920sk A0E = AbstractC06930Yk.A0E();
        this.A03 = 3;
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(A0E, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = A0E;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUD(String str, String str2, int i) {
        this((Integer) null, str, (i & 2) != 0 ? null : str2, 30);
        this.A03 = 30;
    }

    public MUD(String str, String str2, ImageUrl imageUrl, int i) {
        this.A03 = 25;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = imageUrl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUD(String str, List list) {
        this(str, list, (String) null, 19);
        this.A03 = 19;
    }

    public MUD(String str, List list, String str2, int i) {
        this.A03 = i;
        if (19 - i != 0) {
            C14360o3.A0B(list, 2);
        } else {
            C14360o3.A0B(str, 1);
        }
        this.A01 = str;
        this.A00 = list;
        this.A02 = str2;
    }
}
