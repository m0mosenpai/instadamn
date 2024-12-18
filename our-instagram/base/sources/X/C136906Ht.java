package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6Ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136906Ht extends C0T6 implements InterfaceC132185xw {
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final ImageUrl A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136906Ht) {
                C136906Ht c136906Ht = (C136906Ht) obj;
                if (!C14360o3.A0K(this.A03, c136906Ht.A03) || this.A06 != c136906Ht.A06 || this.A05 != c136906Ht.A05 || !C14360o3.A0K(this.A0A, c136906Ht.A0A) || !C14360o3.A0K(this.A01, c136906Ht.A01) || !C14360o3.A0K(this.A0B, c136906Ht.A0B) || this.A00 != c136906Ht.A00 || !C14360o3.A0K(this.A02, c136906Ht.A02) || this.A04 != c136906Ht.A04 || this.A07 != c136906Ht.A07 || !C14360o3.A0K(this.A0C, c136906Ht.A0C) || this.A09 != c136906Ht.A09 || !C14360o3.A0K(this.A08, c136906Ht.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public C136906Ht(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, long j, boolean z) {
        C14360o3.A0B(num, 12);
        this.A03 = str;
        this.A06 = i;
        this.A05 = i2;
        this.A0A = str2;
        this.A01 = imageUrl;
        this.A0B = str3;
        this.A00 = i3;
        this.A02 = str4;
        this.A04 = z;
        this.A07 = j;
        this.A0C = str5;
        this.A09 = num;
        this.A08 = imageUrl2;
    }

    @Override // X.InterfaceC132185xw
    public final String AXw() {
        return this.A0A;
    }

    @Override // X.InterfaceC132185xw
    public final int getHeight() {
        return this.A05;
    }

    @Override // X.InterfaceC132185xw
    public final String getId() {
        return this.A03;
    }

    @Override // X.InterfaceC132185xw
    public final int getWidth() {
        return this.A06;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((this.A03.hashCode() * 31) + this.A06) * 31) + this.A05) * 31;
        String str = this.A0A;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A0B;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (((hashCode6 + hashCode2) * 31) + this.A00) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        long j = this.A07;
        int i6 = (i5 + ((int) (j ^ (j >>> 32)))) * 31;
        String str4 = this.A0C;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int A00 = (((i6 + hashCode4) * 31) + I00.A00(this.A09)) * 31;
        ImageUrl imageUrl = this.A08;
        if (imageUrl != null) {
            i = imageUrl.hashCode();
        }
        return A00 + i;
    }
}
