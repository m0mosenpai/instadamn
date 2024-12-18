package X;

import android.graphics.Rect;

/* renamed from: X.2bT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52872bT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
                C52872bT c52872bT = (C52872bT) obj;
                if (this.A01 != c52872bT.A01 || this.A03 != c52872bT.A03 || this.A02 != c52872bT.A02 || this.A00 != c52872bT.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C52872bT(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        if (i <= i3) {
            if (i2 <= i4) {
                return;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A02(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A02(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bounds");
        sb.append(" { [");
        sb.append(this.A01);
        sb.append(',');
        sb.append(this.A03);
        sb.append(',');
        sb.append(this.A02);
        sb.append(',');
        sb.append(this.A00);
        sb.append("] }");
        return sb.toString();
    }
}
