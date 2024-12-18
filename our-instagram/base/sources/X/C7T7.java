package X;

/* renamed from: X.7T7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7T7 extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final C25312BIh A01;
    public final C25312BIh A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C7T7(C25312BIh c25312BIh, C25312BIh c25312BIh2, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A02 = c25312BIh;
        this.A01 = c25312BIh2;
        this.A00 = i;
        this.A09 = z;
        this.A08 = z2;
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = z3;
        this.A07 = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7T7) {
                C7T7 c7t7 = (C7T7) obj;
                if (!C14360o3.A0K(this.A05, c7t7.A05) || !C14360o3.A0K(this.A02, c7t7.A02) || !C14360o3.A0K(this.A01, c7t7.A01) || this.A00 != c7t7.A00 || this.A09 != c7t7.A09 || this.A08 != c7t7.A08 || !C14360o3.A0K(this.A03, c7t7.A03) || !C14360o3.A0K(this.A04, c7t7.A04) || this.A06 != c7t7.A06 || this.A07 != c7t7.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int hashCode3 = (((i2 + i3) * 31) + this.A03.hashCode()) * 31;
        String str = this.A04;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode3 + hashCode) * 31;
        int i5 = 1237;
        if (this.A06) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
