package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.44P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44P extends C0T6 implements C44Q {
    public final C44O A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    @Override // X.C44Q
    public final C44P Erk() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44P) {
                C44P c44p = (C44P) obj;
                if (!C14360o3.A0K(this.A00, c44p.A00) || !C14360o3.A0K(this.A06, c44p.A06) || !C14360o3.A0K(this.A07, c44p.A07) || !C14360o3.A0K(this.A08, c44p.A08) || !C14360o3.A0K(this.A09, c44p.A09) || !C14360o3.A0K(this.A0A, c44p.A0A) || !C14360o3.A0K(this.A01, c44p.A01) || !C14360o3.A0K(this.A02, c44p.A02) || !C14360o3.A0K(this.A04, c44p.A04) || !C14360o3.A0K(this.A03, c44p.A03) || !C14360o3.A0K(this.A0B, c44p.A0B) || !C14360o3.A0K(this.A0C, c44p.A0C) || !C14360o3.A0K(this.A0D, c44p.A0D) || !C14360o3.A0K(this.A0E, c44p.A0E) || !C14360o3.A0K(this.A05, c44p.A05) || !C14360o3.A0K(this.A0F, c44p.A0F)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C44O c44o = this.A00;
        int hashCode = (c44o == null ? 0 : c44o.hashCode()) * 31;
        String str = this.A06;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0A;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.A03;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.A0B;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0C;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0D;
        int hashCode13 = (((hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.A0E.hashCode()) * 31;
        Integer num2 = this.A05;
        return ((hashCode13 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.A0F.hashCode();
    }

    public C44P(C44O c44o, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C14360o3.A0B(str9, 14);
        C14360o3.A0B(str10, 16);
        this.A00 = c44o;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A01 = bool;
        this.A02 = bool2;
        this.A04 = num;
        this.A03 = bool3;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A0E = str9;
        this.A05 = num2;
        this.A0F = str10;
    }

    @Override // X.C44Q
    public final C44O Ast() {
        return this.A00;
    }

    @Override // X.C44Q
    public final String Asw() {
        return this.A06;
    }

    @Override // X.C44Q
    public final String At6() {
        return this.A07;
    }

    @Override // X.C44Q
    public final String BAW() {
        return this.A08;
    }

    @Override // X.C44Q
    public final String BAX() {
        return this.A09;
    }

    @Override // X.C44Q
    public final String BJP() {
        return this.A0A;
    }

    @Override // X.C44Q
    public final Integer BYF() {
        return this.A04;
    }

    @Override // X.C44Q
    public final Boolean Buv() {
        return this.A03;
    }

    @Override // X.C44Q
    public final String ByH() {
        return this.A0B;
    }

    @Override // X.C44Q
    public final String ByU() {
        return this.A0C;
    }

    @Override // X.C44Q
    public final String C7K() {
        return this.A0E;
    }

    @Override // X.C44Q
    public final Integer C7h() {
        return this.A05;
    }

    @Override // X.C44Q
    public final Boolean CS4() {
        return this.A01;
    }

    @Override // X.C44Q
    public final Boolean CYK() {
        return this.A02;
    }

    @Override // X.C44Q
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTChannelsPreviewDict", AbstractC31530DtF.A00(this));
    }

    @Override // X.C44Q
    public final String getSubtitle() {
        return this.A0D;
    }

    @Override // X.C44Q
    public final String getTitle() {
        return this.A0F;
    }
}
