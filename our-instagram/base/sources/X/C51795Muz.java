package X;

import java.util.List;

/* renamed from: X.Muz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51795Muz extends C0T6 implements XFM {
    public final List A00;
    public final boolean A01;
    public final int A02;
    public final int A03;

    public C51795Muz(List list, int i, int i2, boolean z) {
        C14360o3.A0B(list, 4);
        this.A02 = i;
        this.A01 = z;
        this.A03 = i2;
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51795Muz) {
                C51795Muz c51795Muz = (C51795Muz) obj;
                if (this.A02 != c51795Muz.A02 || this.A01 != c51795Muz.A01 || this.A03 != c51795Muz.A03 || !C14360o3.A0K(this.A00, c51795Muz.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC167007dF.A0D(this.A01, this.A02 * 31) + this.A03) * 31);
    }
}
