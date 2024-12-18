package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.77i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1579877i extends C0T6 {
    public final int A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final EnumC910343v A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final String A0E;
    public final String A0F;

    public C1579877i(ImageUrl imageUrl, ImageUrl imageUrl2, EnumC910343v enumC910343v, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, int i) {
        C14360o3.A0B(charSequence, 1);
        this.A09 = charSequence;
        this.A04 = charSequence2;
        this.A01 = imageUrl;
        this.A03 = enumC910343v;
        this.A05 = charSequence3;
        this.A08 = charSequence4;
        this.A00 = i;
        this.A0A = num;
        this.A0D = num2;
        this.A0F = str;
        this.A0C = num3;
        this.A07 = charSequence5;
        this.A06 = charSequence6;
        this.A02 = imageUrl2;
        this.A0B = num4;
        this.A0E = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1579877i) {
                C1579877i c1579877i = (C1579877i) obj;
                if (!C14360o3.A0K(this.A09, c1579877i.A09) || !C14360o3.A0K(this.A04, c1579877i.A04) || !C14360o3.A0K(this.A01, c1579877i.A01) || this.A03 != c1579877i.A03 || !C14360o3.A0K(this.A05, c1579877i.A05) || !C14360o3.A0K(this.A08, c1579877i.A08) || this.A00 != c1579877i.A00 || !C14360o3.A0K(this.A0A, c1579877i.A0A) || !C14360o3.A0K(this.A0D, c1579877i.A0D) || !C14360o3.A0K(this.A0F, c1579877i.A0F) || !C14360o3.A0K(this.A0C, c1579877i.A0C) || !C14360o3.A0K(this.A07, c1579877i.A07) || !C14360o3.A0K(this.A06, c1579877i.A06) || !C14360o3.A0K(this.A02, c1579877i.A02) || !C14360o3.A0K(this.A0B, c1579877i.A0B) || !C14360o3.A0K(this.A0E, c1579877i.A0E)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A09.hashCode() * 31;
        CharSequence charSequence = this.A04;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ImageUrl imageUrl = this.A01;
        int hashCode3 = (hashCode2 + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        EnumC910343v enumC910343v = this.A03;
        int hashCode4 = (hashCode3 + (enumC910343v == null ? 0 : enumC910343v.hashCode())) * 31;
        CharSequence charSequence2 = this.A05;
        int hashCode5 = (hashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.A08;
        int hashCode6 = (((hashCode5 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31) + this.A00) * 31;
        Integer num = this.A0A;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0D;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A0F;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.A0C;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CharSequence charSequence4 = this.A07;
        int hashCode11 = (hashCode10 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
        CharSequence charSequence5 = this.A06;
        int hashCode12 = (hashCode11 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
        ImageUrl imageUrl2 = this.A02;
        int hashCode13 = (hashCode12 + (imageUrl2 == null ? 0 : imageUrl2.hashCode())) * 31;
        Integer num4 = this.A0B;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.A0E;
        return hashCode14 + (str2 != null ? str2.hashCode() : 0);
    }
}
