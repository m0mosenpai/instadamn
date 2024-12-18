package X;

import java.util.List;

/* renamed from: X.MtS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51743MtS extends C0T6 {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51743MtS() {
        this((Integer) null, "", "", (String) null, (String) null, (String) null);
        this.A06 = 1;
        this.A06 = 1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51743MtS.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0J;
        String str;
        int A0K;
        int hashCode;
        int A0I;
        switch (this.A06) {
            case 0:
                A0J = (AbstractC166997dE.A0K(this.A03, (AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
                A0I = AbstractC166997dE.A0I(this.A00);
                break;
            case 1:
                A0K = (((AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
                Object obj = this.A00;
                if (obj != null) {
                    hashCode = obj.hashCode();
                    A0J = (A0K + hashCode) * 31;
                    str = this.A04;
                    A0I = AbstractC25227BEk.A07(str);
                    break;
                }
                hashCode = 0;
                A0J = (A0K + hashCode) * 31;
                str = this.A04;
                A0I = AbstractC25227BEk.A07(str);
            case 2:
                A0J = (((((((AbstractC166987dD.A0J(this.A04) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
                str = this.A01;
                A0I = AbstractC25227BEk.A07(str);
                break;
            default:
                A0K = AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A05))));
                String str2 = this.A02;
                if (str2 != null) {
                    hashCode = str2.hashCode();
                    A0J = (A0K + hashCode) * 31;
                    str = this.A04;
                    A0I = AbstractC25227BEk.A07(str);
                    break;
                }
                hashCode = 0;
                A0J = (A0K + hashCode) * 31;
                str = this.A04;
                A0I = AbstractC25227BEk.A07(str);
        }
        return A0J + A0I;
    }

    public final String toString() {
        if (1 - this.A06 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ExternalClipInfo(contentType=");
        A1C.append(this.A03);
        A1C.append(", contentId=");
        A1C.append(this.A01);
        A1C.append(", username=");
        A1C.append(this.A05);
        A1C.append(", contentTitle=");
        A1C.append(this.A02);
        A1C.append(", segmentIndex=");
        A1C.append(this.A00);
        A1C.append(", thumbnailUrl=");
        return AbstractC25236BEt.A0Y(this.A04, A1C);
    }

    public C51743MtS(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A06 = 1;
        AbstractC167007dF.A1D(str, 1, str2);
        this.A03 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A00 = num;
        this.A04 = str5;
    }

    public C51743MtS(String str, String str2, String str3, String str4, String str5, List list) {
        this.A06 = 0;
        AbstractC43594JPz.A1P(str2, str4);
        this.A02 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A01 = str5;
        this.A00 = list;
    }

    public C51743MtS(EnumC27410C7n enumC27410C7n, String str, String str2, String str3, String str4, String str5) {
        this.A06 = 2;
        this.A04 = str;
        this.A00 = enumC27410C7n;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A01 = str5;
    }

    public C51743MtS(String str, String str2, String str3, String str4, String str5, C5Hb c5Hb) {
        this.A06 = 3;
        this.A05 = str;
        this.A00 = c5Hb;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A04 = str5;
    }
}
