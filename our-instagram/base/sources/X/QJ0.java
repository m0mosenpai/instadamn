package X;

import com.facebook.iabbwpextension.IABBwPExtension;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public final class QJ0 extends C0T6 {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public static boolean A00(QJ0 qj0, QJ0 qj02) {
        return C14360o3.A0K(qj0.A02, qj02.A02);
    }

    public static boolean A01(QJ0 qj0, QJ0 qj02) {
        return C14360o3.A0K(qj0.A01, qj02.A01);
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof QJ0) && ((QJ0) obj).A05 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QJ0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0C;
        String str;
        int A0K;
        int hashCode;
        String str2;
        int A0O;
        String str3;
        switch (this.A05) {
            case 0:
                Integer num = (Integer) this.A00;
                A0C = ((((AbstractC25230BEn.A0C(num, AbstractC61780Rta.A00(num)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
                str = this.A02;
                hashCode = (A0C + AbstractC167017dG.A0O(str)) * 31;
                str2 = this.A04;
                A0K = AbstractC25227BEk.A07(str2);
                break;
            case 1:
                A0K = AbstractC166997dE.A0K(this.A04, (((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A01)) * 31);
                hashCode = this.A00.hashCode();
                break;
            case 2:
                A0C = ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
                str = this.A03;
                hashCode = (A0C + AbstractC167017dG.A0O(str)) * 31;
                str2 = this.A04;
                A0K = AbstractC25227BEk.A07(str2);
                break;
            case 3:
                hashCode = ((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
                A0K = AbstractC166997dE.A0I(this.A00);
                break;
            case 4:
                A0O = ((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
                str3 = this.A04;
                hashCode = (A0O + AbstractC167017dG.A0O(str3)) * 31;
                str2 = this.A03;
                A0K = AbstractC25227BEk.A07(str2);
                break;
            case 5:
                A0K = AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A01))));
                hashCode = this.A00.hashCode();
                break;
            case 6:
                hashCode = AbstractC166997dE.A0K(this.A01, (AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A04)) * 31);
                A0K = AbstractC166997dE.A0I(this.A00);
                break;
            case 7:
                A0K = AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00))));
                hashCode = this.A02.hashCode();
                break;
            case 8:
                A0O = (AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A04)) * 31;
                str3 = this.A01;
                hashCode = (A0O + AbstractC167017dG.A0O(str3)) * 31;
                str2 = this.A03;
                A0K = AbstractC25227BEk.A07(str2);
                break;
            case 9:
                hashCode = ((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
                A0K = AbstractC166997dE.A0I(this.A00);
                break;
            case 10:
                hashCode = (((((AbstractC166987dD.A0J(this.A04) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
                A0K = AbstractC166997dE.A0I(this.A00);
                break;
            case 11:
                hashCode = (AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01))) + AbstractC167017dG.A0O(this.A04)) * 31;
                A0K = AbstractC166997dE.A0I(this.A00);
                break;
            default:
                A0K = AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A02))));
                hashCode = AbstractC167017dG.A0M(this.A00);
                break;
        }
        return hashCode + A0K;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder A1C;
        String str;
        String str2;
        String A00;
        switch (this.A05) {
            case 0:
                A1C = AbstractC166987dD.A1C();
                A1C.append("BwPAdsInfo(bwPType=");
                Integer num = (Integer) this.A00;
                if (num != null) {
                    str = AbstractC61780Rta.A00(num);
                } else {
                    str = "null";
                }
                A1C.append(str);
                A1C.append(", initialUrl=");
                A1C.append(this.A03);
                A1C.append(", apiKey=");
                A1C.append(this.A01);
                A1C.append(", bauProductUrl=");
                A1C.append(this.A02);
                A1C.append(", pageName=");
                str2 = this.A04;
                A1C.append(str2);
                return AbstractC167017dG.A0p(A1C);
            case 4:
                A1C = AbstractC166987dD.A1C();
                A1C.append("PicsPleaseResponseViewModel(prompt=");
                A1C.append(this.A02);
                A1C.append(MSV.A00(286));
                A1C.append(this.A00);
                A1C.append(", originalQuestionId=");
                A1C.append(this.A01);
                A1C.append(", questionResponseId=");
                A1C.append(this.A04);
                A1C.append(", questionResponderId=");
                str2 = this.A03;
                A1C.append(str2);
                return AbstractC167017dG.A0p(A1C);
            case 10:
                A1C = AbstractC166987dD.A1C();
                A1C.append("TokenCredentials(loginUserId=");
                A1C.append(this.A04);
                A1C.append(", accessToken=");
                A1C.append(this.A01);
                A1C.append(", deviceBasedLoginToken=");
                A1C.append(this.A02);
                A1C.append(", fbId=");
                A1C.append(this.A03);
                A00 = AbstractC111324zv.A00(52);
                A1C.append(A00);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A1C = AbstractC166987dD.A1C();
                A1C.append("IgLiveCommentShoppingLoggingInfo(mediaId=");
                A1C.append(this.A02);
                A1C.append(AbstractC43591JPw.A00(59));
                A1C.append(this.A04);
                A1C.append(MSV.A00(292));
                A1C.append(this.A03);
                A1C.append(", broadcastId=");
                A1C.append(this.A01);
                A00 = ", socialContextCount=";
                A1C.append(A00);
                A1C.append(this.A00);
                return AbstractC167017dG.A0p(A1C);
            default:
                return super.toString();
        }
    }

    public QJ0(android.net.Uri uri, String str, String str2, String str3, String str4) {
        this.A05 = 5;
        this.A01 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = uri;
    }

    public QJ0(C26085BgE c26085BgE, String str, String str2, String str3, String str4) {
        this.A05 = 7;
        this.A00 = c26085BgE;
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
    }

    public QJ0(ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        this.A05 = 1;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A00 = imageUrl;
    }

    public QJ0(Long l, String str, String str2, String str3, String str4) {
        this.A05 = 6;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = str4;
        this.A00 = l;
    }

    public QJ0(C50679MYx c50679MYx, String str, String str2, String str3, String str4) {
        this.A05 = 8;
        this.A00 = c50679MYx;
        this.A02 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public QJ0(FxcalAccountType fxcalAccountType, String str, String str2, String str3, String str4) {
        this.A05 = 10;
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = fxcalAccountType;
    }

    public QJ0(Integer num, String str, String str2, String str3, String str4) {
        this.A05 = 0;
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = str4;
    }

    public QJ0(Object obj, String str, String str2, String str3, String str4, int i) {
        this.A05 = i;
        this.A02 = str;
        this.A00 = obj;
        this.A01 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QJ0(IABBwPExtension iABBwPExtension) {
        this(iABBwPExtension.A01, iABBwPExtension.A05, iABBwPExtension.A03, iABBwPExtension.A04, iABBwPExtension.A06);
        this.A05 = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QJ0(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r7 = this;
            r5 = r10
            r2 = 0
            r0 = 10
            r1 = r7
            r7.A05 = r0
            r0 = r11 & 4
            if (r0 == 0) goto Lc
            r5 = r2
        Lc:
            r3 = r8
            r4 = r9
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QJ0.<init>(java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public QJ0(String str, String str2, String str3, String str4) {
        this.A05 = 3;
        this.A05 = 3;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str4;
        this.A04 = str3;
        this.A00 = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QJ0(int r11) {
        /*
            r10 = this;
            r3 = r10
            r10.A05 = r11
            switch(r11) {
                case 4: goto L36;
                case 9: goto L32;
                case 11: goto L1d;
                default: goto L6;
            }
        L6:
            r2 = 0
            r1 = 12
            r10.A05 = r1
            java.lang.String r0 = ""
            r10.A05 = r1
            r10.<init>()
            r10.A02 = r0
            r10.A04 = r0
            r10.A03 = r0
            r10.A01 = r0
        L1a:
            r10.A00 = r2
            return
        L1d:
            r2 = 0
            r1 = 11
            r10.A05 = r1
            java.lang.String r0 = ""
            r10.A05 = r1
            r10.<init>()
            r10.A01 = r0
            r10.A02 = r0
            r10.A03 = r0
            r10.A04 = r2
            goto L1a
        L32:
            r4 = 0
            r9 = 9
            goto L38
        L36:
            r4 = 0
            r9 = 4
        L38:
            r10.A05 = r9
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QJ0.<init>(int):void");
    }
}
