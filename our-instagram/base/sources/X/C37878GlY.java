package X;

import android.os.SystemClock;

/* renamed from: X.GlY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37878GlY extends C0T6 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37878GlY) {
                C37878GlY c37878GlY = (C37878GlY) obj;
                if (this.A04 != c37878GlY.A04 || this.A06 != c37878GlY.A06 || !C14360o3.A0K(this.A02, c37878GlY.A02) || !C14360o3.A0K(this.A03, c37878GlY.A03) || this.A01 != c37878GlY.A01 || this.A00 != c37878GlY.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A01, (((AbstractC167007dF.A0D(this.A06, AbstractC25225BEi.A08(this.A04)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31) + this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37878GlY(java.lang.String r2, java.lang.String r3, int r4, long r5, boolean r7, boolean r8) {
        /*
            r1 = this;
            r1.<init>()
            r1.A04 = r7
            r1.A06 = r8
            r1.A02 = r2
            r1.A03 = r3
            r1.A01 = r5
            r1.A00 = r4
            if (r7 == 0) goto L14
            r0 = 1
            if (r3 == 0) goto L15
        L14:
            r0 = 0
        L15:
            r1.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37878GlY.<init>(java.lang.String, java.lang.String, int, long, boolean, boolean):void");
    }

    public C37878GlY() {
        this(null, null, 0, SystemClock.uptimeMillis(), false, false);
    }
}
