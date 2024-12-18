package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.JwK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45029JwK extends C0T6 {
    public final Medium A00;
    public final C47Z A01;
    public final boolean A02;
    public final boolean A03;

    public C45029JwK(Medium medium, C47Z c47z) {
        C14360o3.A0B(medium, 1);
        this.A00 = medium;
        this.A01 = c47z;
        this.A02 = medium.A05();
        this.A03 = medium.Cff();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45029JwK) {
                C45029JwK c45029JwK = (C45029JwK) obj;
                if (!C14360o3.A0K(this.A00, c45029JwK.A00) || !C14360o3.A0K(this.A01, c45029JwK.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }
}
