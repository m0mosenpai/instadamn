package X;

/* renamed from: X.7hJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169437hJ extends C0T6 implements InterfaceC169447hK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169437hJ) {
                C169437hJ c169437hJ = (C169437hJ) obj;
                if (!C14360o3.A0K(this.A00, c169437hJ.A00) || !C14360o3.A0K(this.A01, c169437hJ.A01) || this.A04 != c169437hJ.A04 || !C14360o3.A0K(this.A02, c169437hJ.A02) || !C14360o3.A0K(this.A03, c169437hJ.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC169447hK
    public final String B8E() {
        return this.A01;
    }

    @Override // X.InterfaceC169447hK
    public final boolean BQD() {
        return this.A04;
    }

    @Override // X.InterfaceC169447hK
    public final String BXb() {
        return this.A02;
    }

    @Override // X.InterfaceC169447hK
    public final String BY3() {
        return this.A03;
    }

    @Override // X.InterfaceC169447hK
    public final String getFormattedAmountRaised() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.A00;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A01;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str4 = this.A03;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i6 + i;
    }

    public C169437hJ(String str, String str2, String str3, String str4, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A02 = str3;
        this.A03 = str4;
    }
}
