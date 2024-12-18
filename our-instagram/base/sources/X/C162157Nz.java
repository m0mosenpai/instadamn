package X;

/* renamed from: X.7Nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162157Nz extends AbstractC160207Gg {
    public final int A00;
    public final AbstractC160207Gg A01;
    public final AbstractC160207Gg A02;
    public final C7FZ A03;
    public final C7FY A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public C162157Nz(AbstractC160207Gg abstractC160207Gg, AbstractC160207Gg abstractC160207Gg2, C7FZ c7fz, C7FY c7fy, Integer num, String str, String str2, int i, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7fz, 4);
        C14360o3.A0B(c7fy, 5);
        C14360o3.A0B(abstractC160207Gg, 7);
        C14360o3.A0B(abstractC160207Gg2, 8);
        this.A07 = str;
        this.A06 = str2;
        this.A00 = i;
        this.A03 = c7fz;
        this.A04 = c7fy;
        this.A05 = num;
        this.A01 = abstractC160207Gg;
        this.A02 = abstractC160207Gg2;
        this.A08 = z;
        this.A09 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C162157Nz) {
                C162157Nz c162157Nz = (C162157Nz) obj;
                if (!C14360o3.A0K(this.A07, c162157Nz.A07) || !C14360o3.A0K(this.A06, c162157Nz.A06) || this.A00 != c162157Nz.A00 || this.A03 != c162157Nz.A03 || this.A04 != c162157Nz.A04 || !C14360o3.A0K(this.A05, c162157Nz.A05) || !C14360o3.A0K(this.A01, c162157Nz.A01) || !C14360o3.A0K(this.A02, c162157Nz.A02) || this.A08 != c162157Nz.A08 || this.A09 != c162157Nz.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A07.hashCode() * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
        Integer num = this.A05;
        if (num != null) {
            i = num.hashCode();
        }
        int hashCode4 = (((((hashCode3 + i) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int i3 = (hashCode4 + i2) * 31;
        int i4 = 1237;
        if (this.A09) {
            i4 = 1231;
        }
        return i3 + i4;
    }
}
