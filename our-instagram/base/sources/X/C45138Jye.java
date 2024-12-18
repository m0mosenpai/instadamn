package X;

import java.util.List;

/* renamed from: X.Jye, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45138Jye extends C0T6 implements MRY {
    public final List A00;
    public final List A01;
    public final Boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45138Jye) {
                C45138Jye c45138Jye = (C45138Jye) obj;
                if (!C14360o3.A0K(this.A00, c45138Jye.A00) || !C14360o3.A0K(this.A02, c45138Jye.A02) || !C14360o3.A0K(this.A01, c45138Jye.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C45138Jye(Boolean bool, List list, List list2) {
        this.A00 = list;
        this.A02 = bool;
        this.A01 = list2;
    }
}
