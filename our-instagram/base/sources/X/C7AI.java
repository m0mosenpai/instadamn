package X;

/* renamed from: X.7AI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AI extends C0T6 {
    public final CharSequence A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C7AI(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(charSequence, 1);
        this.A00 = charSequence;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A02 = z4;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7AI) {
                C7AI c7ai = (C7AI) obj;
                if (!C14360o3.A0K(this.A00, c7ai.A00) || this.A05 != c7ai.A05 || this.A03 != c7ai.A03 || this.A04 != c7ai.A04 || this.A02 != c7ai.A02 || !C14360o3.A0K(this.A01, c7ai.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A02) {
            i7 = 1231;
        }
        return ((i6 + i7) * 31) + this.A01.hashCode();
    }
}
