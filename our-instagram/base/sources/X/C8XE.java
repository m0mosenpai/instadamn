package X;

/* renamed from: X.8XE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XE {
    public final CW0 A00;
    public final CWB A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final int A0C;
    public final int A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8XE) {
                C8XE c8xe = (C8XE) obj;
                if (!C14360o3.A0K(this.A04, c8xe.A04) || !C14360o3.A0K(this.A06, c8xe.A06) || !C14360o3.A0K(this.A05, c8xe.A05) || !C14360o3.A0K(this.A07, c8xe.A07) || !C14360o3.A0K(this.A09, c8xe.A09) || !C14360o3.A0K(this.A0A, c8xe.A0A) || this.A03 != c8xe.A03 || this.A0D != c8xe.A0D || this.A0C != c8xe.A0C || this.A02 != c8xe.A02 || !C14360o3.A0K(this.A0E, c8xe.A0E) || !C14360o3.A0K(this.A0G, c8xe.A0G) || !C14360o3.A0K(this.A0B, c8xe.A0B) || this.A0H != c8xe.A0H || !C14360o3.A0K(this.A0F, c8xe.A0F) || !C14360o3.A0K(this.A00, c8xe.A00) || !C14360o3.A0K(this.A01, c8xe.A01) || !C14360o3.A0K(this.A08, c8xe.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = ((((((this.A04.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A07.hashCode()) * 31;
        String str = this.A09;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        String str2 = this.A0A;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        Integer num = this.A03;
        int hashCode9 = (((((((i2 + hashCode2) * 31) + AbstractC27729CKw.A00(num).hashCode() + num.intValue()) * 31) + this.A0D) * 31) + this.A0C) * 31;
        Integer num2 = this.A02;
        int hashCode10 = (((hashCode9 + CZF.A01(num2).hashCode() + num2.intValue()) * 31) + this.A0E.hashCode()) * 31;
        String str3 = this.A0G;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (hashCode10 + hashCode3) * 31;
        String str4 = this.A0B;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        int i5 = 1237;
        if (this.A0H) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        String str5 = this.A0F;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        CW0 cw0 = this.A00;
        if (cw0 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = cw0.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        CWB cwb = this.A01;
        if (cwb == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = cwb.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        String str6 = this.A08;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImagineCreateImage(imageId=");
        sb.append(this.A04);
        sb.append(AbstractC111324zv.A00(564));
        sb.append(this.A06);
        sb.append(", imageRemoteUrl=");
        sb.append(this.A05);
        sb.append(MSV.A00(294));
        sb.append(this.A07);
        sb.append(MSV.A00(69));
        sb.append(this.A09);
        sb.append(MSV.A00(296));
        sb.append(this.A0A);
        sb.append(MSV.A00(68));
        sb.append(AbstractC27729CKw.A00(this.A03));
        sb.append(AbstractC111324zv.A00(1435));
        sb.append(this.A0D);
        sb.append(AbstractC111324zv.A00(1434));
        sb.append(this.A0C);
        sb.append(AbstractC111324zv.A00(565));
        sb.append(CZF.A01(this.A02));
        sb.append(MSV.A00(616));
        sb.append(this.A0E);
        sb.append(MSV.A00(23));
        sb.append(this.A0G);
        sb.append(AbstractC111324zv.A00(1463));
        sb.append(this.A0B);
        sb.append(", hasBeenEdited=");
        sb.append(this.A0H);
        sb.append(AbstractC111324zv.A00(1443));
        sb.append(this.A0F);
        sb.append(", promptSummaryData=");
        sb.append(this.A00);
        sb.append(", storyPromptMetadata=");
        sb.append(this.A01);
        sb.append(", recipeCaption=");
        sb.append(this.A08);
        sb.append(')');
        return sb.toString();
    }

    public C8XE(CW0 cw0, CWB cwb, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, boolean z) {
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A03 = num;
        this.A0D = i;
        this.A0C = i2;
        this.A02 = num2;
        this.A0E = str7;
        this.A0G = str8;
        this.A0B = str9;
        this.A0H = z;
        this.A0F = str10;
        this.A00 = cw0;
        this.A01 = cwb;
        this.A08 = str11;
    }
}
