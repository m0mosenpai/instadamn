package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5Oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116355Oo extends C0T6 {
    public final int A00;
    public final C9BW A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C116355Oo) {
                C116355Oo c116355Oo = (C116355Oo) obj;
                if (!C14360o3.A0K(this.A02, c116355Oo.A02) || this.A00 != c116355Oo.A00 || !C14360o3.A0K(this.A05, c116355Oo.A05) || this.A07 != c116355Oo.A07 || this.A06 != c116355Oo.A06 || !C14360o3.A0K(this.A04, c116355Oo.A04) || !C14360o3.A0K(this.A01, c116355Oo.A01) || this.A08 != c116355Oo.A08 || !C14360o3.A0K(this.A03, c116355Oo.A03)) {
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
        ImageUrl imageUrl = this.A02;
        int i = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i2 = ((hashCode * 31) + this.A00) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A07) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode4 = (((i7 + hashCode3) * 31) + this.A01.hashCode()) * 31;
        int i8 = 1237;
        if (this.A08) {
            i8 = 1231;
        }
        int i9 = (hashCode4 + i8) * 31;
        ImageUrl imageUrl2 = this.A03;
        if (imageUrl2 != null) {
            i = imageUrl2.hashCode();
        }
        return i9 + i;
    }

    public C116355Oo(C9BW c9bw, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = imageUrl;
        this.A00 = i;
        this.A05 = str;
        this.A07 = z;
        this.A06 = z2;
        this.A04 = str2;
        this.A01 = c9bw;
        this.A08 = z3;
        this.A03 = imageUrl2;
    }
}
