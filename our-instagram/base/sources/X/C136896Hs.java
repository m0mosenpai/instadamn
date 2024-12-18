package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136896Hs extends C0T6 implements InterfaceC132185xw {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final ImageUrl A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136896Hs) {
                C136896Hs c136896Hs = (C136896Hs) obj;
                if (!C14360o3.A0K(this.A01, c136896Hs.A01) || this.A04 != c136896Hs.A04 || this.A03 != c136896Hs.A03 || !C14360o3.A0K(this.A08, c136896Hs.A08) || !C14360o3.A0K(this.A00, c136896Hs.A00) || !C14360o3.A0K(this.A09, c136896Hs.A09) || !C14360o3.A0K(this.A02, c136896Hs.A02) || this.A05 != c136896Hs.A05 || !C14360o3.A0K(this.A0A, c136896Hs.A0A) || this.A07 != c136896Hs.A07 || !C14360o3.A0K(this.A06, c136896Hs.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public C136896Hs(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2, long j) {
        C14360o3.A0B(num, 10);
        this.A01 = str;
        this.A04 = i;
        this.A03 = i2;
        this.A08 = str2;
        this.A00 = imageUrl;
        this.A09 = str3;
        this.A02 = str4;
        this.A05 = j;
        this.A0A = str5;
        this.A07 = num;
        this.A06 = imageUrl2;
    }

    @Override // X.InterfaceC132185xw
    public final String AXw() {
        return this.A08;
    }

    @Override // X.InterfaceC132185xw
    public final int getHeight() {
        return this.A03;
    }

    @Override // X.InterfaceC132185xw
    public final String getId() {
        return this.A01;
    }

    @Override // X.InterfaceC132185xw
    public final int getWidth() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((this.A01.hashCode() * 31) + this.A04) * 31) + this.A03) * 31;
        String str = this.A08;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A00.hashCode()) * 31;
        String str2 = this.A09;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode6 + hashCode2) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.A05;
        int i3 = (((i2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str4 = this.A0A;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int A00 = (((i3 + hashCode4) * 31) + I00.A00(this.A07)) * 31;
        ImageUrl imageUrl = this.A06;
        if (imageUrl != null) {
            i = imageUrl.hashCode();
        }
        return A00 + i;
    }
}
