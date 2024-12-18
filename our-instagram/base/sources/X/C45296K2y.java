package X;

import java.util.List;

/* renamed from: X.K2y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45296K2y extends C0T6 implements InterfaceC50400MNc {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public C45296K2y(String str, List list, boolean z, boolean z2) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A02 = z;
        this.A00 = str;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45296K2y) {
                C45296K2y c45296K2y = (C45296K2y) obj;
                if (!C14360o3.A0K(this.A01, c45296K2y.A01) || this.A02 != c45296K2y.A02 || !C14360o3.A0K(this.A00, c45296K2y.A00) || this.A03 != c45296K2y.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0O(this.A00)) * 31);
    }
}
