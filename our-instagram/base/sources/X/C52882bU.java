package X;

import android.graphics.Rect;

/* renamed from: X.2bU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52882bU {
    public final C011504d A00;
    public final C52872bT A01;

    public C52882bU(C011504d c011504d, C52872bT c52872bT) {
        C14360o3.A0B(c011504d, 2);
        this.A01 = c52872bT;
        this.A00 = c011504d;
    }

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
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
                C52882bU c52882bU = (C52882bU) obj;
                if (!C14360o3.A0K(this.A01, c52882bU.A01) || !C14360o3.A0K(this.A00, c52882bU.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Rect A00() {
        C52872bT c52872bT = this.A01;
        return new Rect(c52872bT.A01, c52872bT.A03, c52872bT.A02, c52872bT.A00);
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WindowMetrics( bounds=");
        sb.append(this.A01);
        sb.append(", windowInsetsCompat=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
