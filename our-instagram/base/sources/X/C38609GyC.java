package X;

import java.util.List;

/* renamed from: X.GyC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38609GyC extends C0T6 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38609GyC) {
                C38609GyC c38609GyC = (C38609GyC) obj;
                if (!C14360o3.A0K(this.A00, c38609GyC.A00) || this.A02 != c38609GyC.A02 || !C14360o3.A0K(this.A01, c38609GyC.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC167017dG.A0O(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38609GyC(String str, List list, boolean z) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = list;
    }
}
