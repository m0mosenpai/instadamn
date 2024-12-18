package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4YM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YM {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C4WX A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C4YM(C4WX c4wx, long j, long j2, long j3, long j4, boolean z) {
        this.A04 = c4wx;
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
        this.A07 = true;
        this.A05 = z;
        this.A06 = false;
        this.A08 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4YM c4ym = (C4YM) obj;
            if (this.A03 != c4ym.A03 || this.A02 != c4ym.A02 || this.A01 != c4ym.A01 || this.A00 != c4ym.A00 || this.A06 != c4ym.A06 || this.A07 != c4ym.A07 || this.A08 != c4ym.A08 || this.A05 != c4ym.A05 || !Util.A0I(this.A04, c4ym.A04)) {
                return false;
            }
        }
        return true;
    }

    public final C4YM A00(long j) {
        if (j == this.A02) {
            return this;
        }
        return new C4YM(this.A04, this.A03, j, this.A01, this.A00, this.A06, this.A07, this.A08, this.A05);
    }

    public final C4YM A01(long j) {
        if (j == this.A03) {
            return this;
        }
        return new C4YM(this.A04, j, this.A02, this.A01, this.A00, this.A06, this.A07, this.A08, this.A05);
    }

    public final int hashCode() {
        return ((((((((((((((((527 + this.A04.hashCode()) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + ((int) this.A00)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }

    public C4YM(C4WX c4wx, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = c4wx;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = j4;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A05 = z4;
    }
}
