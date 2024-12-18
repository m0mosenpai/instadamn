package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7Aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158737Aj extends AbstractC1583778x {
    public final ImageUrl A00;
    public final Boolean A01;
    public final Float A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158737Aj) {
                C158737Aj c158737Aj = (C158737Aj) obj;
                if (!C14360o3.A0K(this.A00, c158737Aj.A00) || !C14360o3.A0K(this.A07, c158737Aj.A07) || !C14360o3.A0K(this.A04, c158737Aj.A04) || !C14360o3.A0K(this.A06, c158737Aj.A06) || !C14360o3.A0K(this.A05, c158737Aj.A05) || !C14360o3.A0K(this.A01, c158737Aj.A01) || !C14360o3.A0K(this.A03, c158737Aj.A03) || !C14360o3.A0K(this.A02, c158737Aj.A02) || !C14360o3.A0K(this.A09, c158737Aj.A09) || !C14360o3.A0K(this.A08, c158737Aj.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Integer num = this.A07;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A04;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A06;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A05;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num5 = this.A03;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f = this.A02;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.A09;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public C158737Aj(ImageUrl imageUrl, Boolean bool, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2) {
        this.A00 = imageUrl;
        this.A07 = num;
        this.A04 = num2;
        this.A06 = num3;
        this.A05 = num4;
        this.A01 = bool;
        this.A03 = num5;
        this.A02 = f;
        this.A09 = str;
        this.A08 = str2;
    }
}
