package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169397hD extends C0T6 implements InterfaceC169407hE {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final Boolean A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169397hD) {
                C169397hD c169397hD = (C169397hD) obj;
                if (!C14360o3.A0K(this.A04, c169397hD.A04) || !C14360o3.A0K(this.A00, c169397hD.A00) || !C14360o3.A0K(this.A03, c169397hD.A03) || !C14360o3.A0K(this.A02, c169397hD.A02) || !C14360o3.A0K(this.A01, c169397hD.A01) || !C14360o3.A0K(this.A05, c169397hD.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Long l = this.A04;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        ImageUrl imageUrl = this.A00;
        int hashCode2 = (hashCode + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        ImageUrl imageUrl2 = this.A01;
        int hashCode5 = (hashCode4 + (imageUrl2 == null ? 0 : imageUrl2.hashCode())) * 31;
        String str = this.A05;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC169407hE
    public final ImageUrl Bhn() {
        return this.A00;
    }

    @Override // X.InterfaceC169407hE
    public final Integer Bo5() {
        return this.A03;
    }

    public C169397hD(ImageUrl imageUrl, ImageUrl imageUrl2, Boolean bool, Integer num, Long l, String str) {
        this.A04 = l;
        this.A00 = imageUrl;
        this.A03 = num;
        this.A02 = bool;
        this.A01 = imageUrl2;
        this.A05 = str;
    }
}
