package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6Hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136876Hq extends C0T6 implements InterfaceC132185xw {
    public final int A00;
    public final int A01;
    public final C75363a3 A02;
    public final String A03;
    public final String A04;
    public final long A05;
    public final ImageUrl A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136876Hq) {
                C136876Hq c136876Hq = (C136876Hq) obj;
                if (!C14360o3.A0K(this.A03, c136876Hq.A03) || this.A01 != c136876Hq.A01 || this.A00 != c136876Hq.A00 || !C14360o3.A0K(this.A02, c136876Hq.A02) || !C14360o3.A0K(this.A06, c136876Hq.A06) || !C14360o3.A0K(this.A08, c136876Hq.A08) || !C14360o3.A0K(this.A04, c136876Hq.A04) || this.A05 != c136876Hq.A05 || !C14360o3.A0K(this.A09, c136876Hq.A09) || this.A07 != c136876Hq.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public C136876Hq(ImageUrl imageUrl, C75363a3 c75363a3, Integer num, String str, String str2, String str3, String str4, int i, int i2, long j) {
        C14360o3.A0B(num, 12);
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c75363a3;
        this.A06 = imageUrl;
        this.A08 = str2;
        this.A04 = str3;
        this.A05 = j;
        this.A09 = str4;
        this.A07 = num;
    }

    @Override // X.InterfaceC132185xw
    public final String AXw() {
        return null;
    }

    @Override // X.InterfaceC132185xw
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC132185xw
    public final String getId() {
        return this.A03;
    }

    @Override // X.InterfaceC132185xw
    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        int hashCode4 = ((((((this.A03.hashCode() * 31) + this.A01) * 31) + this.A00) * 31 * 31 * 31) + this.A02.hashCode()) * 31;
        ImageUrl imageUrl = this.A06;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str = this.A08;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        long j = this.A05;
        int i4 = (((i3 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.A09;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i4 + i) * 31) + I00.A00(this.A07);
    }
}
