package X;

import com.instagram.common.gallery.Medium;

/* loaded from: classes8.dex */
public final class KN8 extends AbstractC47286Kux {
    public final long A00;
    public final long A01;
    public final Medium A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KN8) {
                KN8 kn8 = (KN8) obj;
                if (!C14360o3.A0K(this.A02, kn8.A02) || this.A01 != kn8.A01 || this.A00 != kn8.A00 || this.A03 != kn8.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A07(this.A00, AbstractC167007dF.A07(this.A01, AbstractC166987dD.A0G(this.A02))));
    }

    public KN8(Medium medium, long j, long j2, boolean z) {
        super(medium);
        this.A02 = medium;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
    }
}
