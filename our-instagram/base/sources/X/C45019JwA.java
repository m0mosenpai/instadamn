package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.JwA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45019JwA extends C0T6 {
    public final int A00;
    public final Medium A01;
    public final C47Z A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45019JwA) {
                C45019JwA c45019JwA = (C45019JwA) obj;
                if (!C14360o3.A0K(this.A01, c45019JwA.A01) || this.A00 != c45019JwA.A00 || !C14360o3.A0K(this.A02, c45019JwA.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + this.A00) * 31) + AbstractC167017dG.A0M(this.A02);
    }

    public C45019JwA(Medium medium, C47Z c47z, int i) {
        this.A01 = medium;
        this.A00 = i;
        this.A02 = c47z;
    }
}
