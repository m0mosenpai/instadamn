package X;

import com.instagram.api.schemas.MediaType;

/* renamed from: X.6rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151486rs extends C0T6 implements InterfaceC151496rt {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final int A06;
    public final MediaType A07;
    public final String A08;

    public C151486rs(MediaType mediaType, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, int i, int i2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        this.A05 = str;
        this.A00 = i;
        this.A08 = str2;
        this.A01 = num;
        this.A02 = num2;
        this.A03 = num3;
        this.A04 = num4;
        this.A07 = mediaType;
        this.A06 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C151486rs) {
                C151486rs c151486rs = (C151486rs) obj;
                if (!C14360o3.A0K(this.A05, c151486rs.A05) || this.A00 != c151486rs.A00 || !C14360o3.A0K(this.A08, c151486rs.A08) || !C14360o3.A0K(this.A01, c151486rs.A01) || !C14360o3.A0K(this.A02, c151486rs.A02) || !C14360o3.A0K(this.A03, c151486rs.A03) || !C14360o3.A0K(this.A04, c151486rs.A04) || this.A07 != c151486rs.A07 || this.A06 != c151486rs.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A05.hashCode() * 31) + this.A00) * 31) + this.A08.hashCode()) * 31;
        Integer num = this.A01;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A02;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A03;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A04;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MediaType mediaType = this.A07;
        return ((hashCode5 + (mediaType != null ? mediaType.hashCode() : 0)) * 31) + this.A06;
    }
}
