package X;

/* renamed from: X.7BV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BV extends C0T6 implements InterfaceC129555tK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
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

    public C7BV(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str4, 4);
        C14360o3.A0B(str6, 6);
        C14360o3.A0B(str8, 8);
        C14360o3.A0B(str10, 10);
        C14360o3.A0B(str12, 12);
        C14360o3.A0B(str14, 14);
        this.A07 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A02 = str5;
        this.A03 = str6;
        this.A0F = str7;
        this.A0D = str8;
        this.A0C = str9;
        this.A0B = str10;
        this.A09 = str11;
        this.A0A = str12;
        this.A00 = str13;
        this.A01 = str14;
        this.A08 = str15;
        this.A0E = str16;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7BV) {
                C7BV c7bv = (C7BV) obj;
                if (!C14360o3.A0K(this.A07, c7bv.A07) || !C14360o3.A0K(this.A06, c7bv.A06) || !C14360o3.A0K(this.A05, c7bv.A05) || !C14360o3.A0K(this.A04, c7bv.A04) || !C14360o3.A0K(this.A02, c7bv.A02) || !C14360o3.A0K(this.A03, c7bv.A03) || !C14360o3.A0K(this.A0F, c7bv.A0F) || !C14360o3.A0K(this.A0D, c7bv.A0D) || !C14360o3.A0K(this.A0C, c7bv.A0C) || !C14360o3.A0K(this.A0B, c7bv.A0B) || !C14360o3.A0K(this.A09, c7bv.A09) || !C14360o3.A0K(this.A0A, c7bv.A0A) || !C14360o3.A0K(this.A00, c7bv.A00) || !C14360o3.A0K(this.A01, c7bv.A01) || !C14360o3.A0K(this.A08, c7bv.A08) || !C14360o3.A0K(this.A0E, c7bv.A0E)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A07.hashCode() * 31) + this.A06.hashCode()) * 31;
        String str = this.A05;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A04.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A03.hashCode()) * 31;
        String str3 = this.A0F;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.A0D.hashCode()) * 31;
        String str4 = this.A0C;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.A0B.hashCode()) * 31;
        String str5 = this.A09;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.A0A.hashCode()) * 31;
        String str6 = this.A00;
        int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.A01.hashCode()) * 31;
        String str7 = this.A08;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0E;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }
}
