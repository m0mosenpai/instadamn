package X;

import android.graphics.Paint;

/* renamed from: X.Jw8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45017Jw8 extends C0T6 {
    public final Paint A00;
    public final Paint A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45017Jw8) {
                C45017Jw8 c45017Jw8 = (C45017Jw8) obj;
                if (!C14360o3.A0K(this.A00, c45017Jw8.A00) || !C14360o3.A0K(this.A01, c45017Jw8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C45017Jw8(Paint paint, Paint paint2) {
        this.A00 = paint;
        this.A01 = paint2;
    }
}
