package X;

/* renamed from: X.3qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85083qw extends C0T6 {
    public final int A00;
    public final C9BH A01;
    public final EnumC85063qu A02;
    public final EnumC85073qv A03;
    public final C38321qM A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C85083qw(C9BH c9bh, EnumC85063qu enumC85063qu, EnumC85073qv enumC85073qv, C38321qM c38321qM, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(enumC85063qu, 5);
        C14360o3.A0B(enumC85073qv, 6);
        this.A07 = z;
        this.A00 = i;
        this.A06 = z2;
        this.A04 = c38321qM;
        this.A02 = enumC85063qu;
        this.A03 = enumC85073qv;
        this.A05 = z3;
        this.A01 = c9bh;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C85083qw) {
                C85083qw c85083qw = (C85083qw) obj;
                if (this.A07 != c85083qw.A07 || this.A00 != c85083qw.A00 || this.A06 != c85083qw.A06 || !C14360o3.A0K(this.A04, c85083qw.A04) || this.A02 != c85083qw.A02 || this.A03 != c85083qw.A03 || this.A05 != c85083qw.A05 || !C14360o3.A0K(this.A01, c85083qw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = ((i * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int hashCode2 = (((((((i2 + i3) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i4 = 1237;
        if (this.A05) {
            i4 = 1231;
        }
        int i5 = (hashCode2 + i4) * 31;
        C9BH c9bh = this.A01;
        if (c9bh == null) {
            hashCode = 0;
        } else {
            hashCode = c9bh.hashCode();
        }
        return i5 + hashCode;
    }
}
