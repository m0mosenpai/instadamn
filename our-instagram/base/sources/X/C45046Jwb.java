package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Jwb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45046Jwb extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02 = 603995461;
    public final int A03;
    public final QuickPerformanceLogger A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45046Jwb) {
                C45046Jwb c45046Jwb = (C45046Jwb) obj;
                if (!C14360o3.A0K(this.A04, c45046Jwb.A04) || this.A02 != c45046Jwb.A02 || this.A03 != c45046Jwb.A03 || this.A00 != c45046Jwb.A00 || this.A01 != c45046Jwb.A01 || this.A05 != c45046Jwb.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (((((((AbstractC166987dD.A0G(this.A04) + this.A02) * 31) + this.A03) * 31) + this.A00) * 31) + this.A01) * 31);
    }

    public C45046Jwb(QuickPerformanceLogger quickPerformanceLogger, int i, int i2, int i3, boolean z) {
        this.A04 = quickPerformanceLogger;
        this.A03 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A05 = z;
    }
}
