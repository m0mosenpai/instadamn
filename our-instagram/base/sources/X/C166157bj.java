package X;

import java.util.List;

/* renamed from: X.7bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166157bj extends C0T6 {
    public final EnumC166147bi A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C166157bj(EnumC166147bi enumC166147bi, List list, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(enumC166147bi, 5);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = list;
        this.A02 = z3;
        this.A00 = enumC166147bi;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166157bj) {
                C166157bj c166157bj = (C166157bj) obj;
                if (this.A04 != c166157bj.A04 || this.A03 != c166157bj.A03 || !C14360o3.A0K(this.A01, c166157bj.A01) || this.A02 != c166157bj.A02 || this.A00 != c166157bj.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        List list = this.A01;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (i4 + hashCode) * 31;
        int i6 = 1237;
        if (this.A02) {
            i6 = 1231;
        }
        return ((i5 + i6) * 31) + this.A00.hashCode();
    }
}
