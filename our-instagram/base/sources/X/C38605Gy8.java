package X;

import java.util.List;

/* renamed from: X.Gy8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38605Gy8 extends C0T6 {
    public final C111094zQ A00;
    public final List A01;

    public C38605Gy8(C111094zQ c111094zQ, List list) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = c111094zQ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38605Gy8) {
                C38605Gy8 c38605Gy8 = (C38605Gy8) obj;
                if (!C14360o3.A0K(this.A01, c38605Gy8.A01) || !C14360o3.A0K(this.A00, c38605Gy8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
