package X;

import java.util.List;

/* renamed from: X.4hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101734hi extends C0T6 {
    public final int A00;
    public final C75113Zb A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101734hi) {
                C101734hi c101734hi = (C101734hi) obj;
                if (this.A00 != c101734hi.A00 || !C14360o3.A0K(this.A02, c101734hi.A02) || !C14360o3.A0K(this.A01, c101734hi.A01) || this.A03 != c101734hi.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }

    public C101734hi(C75113Zb c75113Zb, List list, int i, boolean z) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = c75113Zb;
        this.A03 = z;
    }
}
