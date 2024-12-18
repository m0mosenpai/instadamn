package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9CM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CM extends C0T6 implements InterfaceC132185xw {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C9CM(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, String str2, String str3, int i, int i2, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(num, 8);
        this.A08 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = str2;
        this.A04 = imageUrl;
        this.A03 = j;
        this.A09 = str3;
        this.A06 = num;
        this.A05 = imageUrl2;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9CM) && ((C9CM) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC132185xw
    public final String AXw() {
        return this.A07;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (A00(obj, 1)) {
                    C9CM c9cm = (C9CM) obj;
                    if (!C14360o3.A0K(this.A08, c9cm.A08) || this.A02 != c9cm.A02 || this.A01 != c9cm.A01 || !C14360o3.A0K(this.A07, c9cm.A07) || !C14360o3.A0K(this.A06, c9cm.A06) || !C14360o3.A0K(this.A04, c9cm.A04) || this.A03 != c9cm.A03 || !C14360o3.A0K(this.A09, c9cm.A09) || this.A05 != c9cm.A05) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!A00(obj, 0)) {
                return false;
            }
            C9CM c9cm2 = (C9CM) obj;
            if (!C14360o3.A0K(this.A08, c9cm2.A08) || this.A02 != c9cm2.A02 || this.A01 != c9cm2.A01 || !C14360o3.A0K(this.A07, c9cm2.A07) || !C14360o3.A0K(this.A04, c9cm2.A04) || this.A03 != c9cm2.A03 || !C14360o3.A0K(this.A09, c9cm2.A09) || this.A06 != c9cm2.A06 || !C14360o3.A0K(this.A05, c9cm2.A05)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC132185xw
    public final int getHeight() {
        return this.A01;
    }

    @Override // X.InterfaceC132185xw
    public final String getId() {
        return this.A08;
    }

    @Override // X.InterfaceC132185xw
    public final int getWidth() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = this.A00;
        int hashCode5 = ((((this.A08.hashCode() * 31) + this.A02) * 31) + this.A01) * 31;
        String str = this.A07;
        int i2 = 0;
        if (i != 0) {
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int hashCode6 = (((hashCode5 + hashCode3) * 31) + this.A06.hashCode()) * 31;
            Object obj = this.A04;
            if (obj == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = obj.hashCode();
            }
            long j = this.A03;
            int i3 = (((hashCode6 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            String str2 = this.A09;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((i3 + i2) * 31) + I00.A00((Integer) this.A05);
        }
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode7 = (((hashCode5 + hashCode) * 31) + this.A04.hashCode()) * 31;
        long j2 = this.A03;
        int i4 = (hashCode7 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.A09;
        if (str3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
        }
        int A00 = (((i4 + hashCode2) * 31) + I00.A00((Integer) this.A06)) * 31;
        Object obj2 = this.A05;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return A00 + i2;
    }

    public C9CM(ImageUrl imageUrl, C75363a3 c75363a3, Integer num, String str, String str2, String str3, int i, int i2, long j) {
        C14360o3.A0B(num, 9);
        this.A08 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = str2;
        this.A06 = c75363a3;
        this.A04 = imageUrl;
        this.A03 = j;
        this.A09 = str3;
        this.A05 = num;
    }
}
