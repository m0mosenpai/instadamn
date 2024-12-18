package X;

import android.graphics.PointF;

/* renamed from: X.UPh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66620UPh extends C0T6 {
    public final C26675BqA A00;
    public final C26674Bq9 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66620UPh) {
                C66620UPh c66620UPh = (C66620UPh) obj;
                if (!C14360o3.A0K(this.A00, c66620UPh.A00) || !C14360o3.A0K(this.A01, c66620UPh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00(C66620UPh c66620UPh, float f) {
        Comparable comparable;
        PointF pointF;
        PointF pointF2;
        C26675BqA c26675BqA = this.A00;
        Comparable comparable2 = 1;
        if (c26675BqA != null) {
            comparable = Float.valueOf(c26675BqA.A00(f));
        } else {
            comparable = comparable2;
        }
        C26675BqA c26675BqA2 = c66620UPh.A00;
        if (c26675BqA2 != null) {
            comparable2 = Float.valueOf(c26675BqA2.A00(f));
        }
        if (C14360o3.A0K(comparable, comparable2)) {
            C26674Bq9 c26674Bq9 = this.A01;
            if (c26674Bq9 != null) {
                pointF = c26674Bq9.A00(f);
            } else {
                pointF = new PointF();
            }
            C26674Bq9 c26674Bq92 = c66620UPh.A01;
            if (c26674Bq92 != null) {
                pointF2 = c26674Bq92.A00(f);
            } else {
                pointF2 = new PointF();
            }
            if (pointF.equals(pointF2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = AbstractC167017dG.A0M(this.A00) * 31;
        C26674Bq9 c26674Bq9 = this.A01;
        if (c26674Bq9 != null) {
            i = c26674Bq9.hashCode();
        }
        return A0M + i;
    }

    public C66620UPh(C26675BqA c26675BqA, C26674Bq9 c26674Bq9) {
        this.A00 = c26675BqA;
        this.A01 = c26674Bq9;
    }
}
