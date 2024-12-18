package X;

import android.graphics.PointF;

/* renamed from: X.Bq9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26674Bq9 extends C98 {
    public final C26675BqA A00;
    public final C26675BqA A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26674Bq9) {
                C26674Bq9 c26674Bq9 = (C26674Bq9) obj;
                if (!C14360o3.A0K(this.A00, c26674Bq9.A00) || !C14360o3.A0K(this.A01, c26674Bq9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final PointF A00(float f) {
        float f2;
        C26675BqA c26675BqA = this.A00;
        float f3 = 0.0f;
        if (c26675BqA != null) {
            f2 = c26675BqA.A00(f);
        } else {
            f2 = 0.0f;
        }
        C26675BqA c26675BqA2 = this.A01;
        if (c26675BqA2 != null) {
            f3 = c26675BqA2.A00(f);
        }
        return new PointF(f2, f3);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C26674Bq9(C26675BqA c26675BqA, C26675BqA c26675BqA2) {
        this.A00 = c26675BqA;
        this.A01 = c26675BqA2;
    }
}
