package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80143i3 extends C0T6 {
    public final InterfaceC88303wh A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final ImageUrl A03;
    public final EnumC80123i1 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80143i3) {
                C80143i3 c80143i3 = (C80143i3) obj;
                if (!C14360o3.A0K(this.A06, c80143i3.A06) || !C14360o3.A0K(this.A07, c80143i3.A07) || !C14360o3.A0K(this.A05, c80143i3.A05) || this.A09 != c80143i3.A09 || this.A0A != c80143i3.A0A || !C14360o3.A0K(this.A01, c80143i3.A01) || !C14360o3.A0K(this.A03, c80143i3.A03) || !C14360o3.A0K(this.A02, c80143i3.A02) || this.A04 != c80143i3.A04 || !C14360o3.A0K(this.A00, c80143i3.A00) || this.A08 != c80143i3.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public C80143i3(InterfaceC88303wh interfaceC88303wh, ImageUrl imageUrl, ImageUrl imageUrl2, ImageUrl imageUrl3, EnumC80123i1 enumC80123i1, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(imageUrl3, 8);
        C14360o3.A0B(enumC80123i1, 9);
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A09 = z;
        this.A0A = z2;
        this.A01 = imageUrl;
        this.A03 = imageUrl2;
        this.A02 = imageUrl3;
        this.A04 = enumC80123i1;
        this.A00 = interfaceC88303wh;
        this.A08 = z3;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.A06.hashCode() * 31;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A09) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A0A) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        ImageUrl imageUrl = this.A01;
        if (imageUrl == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = imageUrl.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        ImageUrl imageUrl2 = this.A03;
        if (imageUrl2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = imageUrl2.hashCode();
        }
        int hashCode6 = (((((i8 + hashCode4) * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31;
        InterfaceC88303wh interfaceC88303wh = this.A00;
        if (interfaceC88303wh != null) {
            i = interfaceC88303wh.hashCode();
        }
        int i9 = (hashCode6 + i) * 31;
        int i10 = 1237;
        if (this.A08) {
            i10 = 1231;
        }
        return i9 + i10;
    }
}
