package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.9l7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218359l7 extends AbstractC223759uK {
    public final int A00;
    public final Medium A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C218359l7) {
                C218359l7 c218359l7 = (C218359l7) obj;
                if (!C14360o3.A0K(this.A01, c218359l7.A01) || this.A00 != c218359l7.A00 || this.A02 != c218359l7.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31);
    }

    public C218359l7(Medium medium, int i, boolean z) {
        this.A01 = medium;
        this.A00 = i;
        this.A02 = z;
    }
}
