package X;

import java.util.Map;

/* renamed from: X.AFe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23072AFe {
    public static final Map A00 = new C25020B4x(7);

    public static final double A00(double d, double d2, double d3) {
        int abs = (int) ((Math.abs(d3 - d) / d2) * 10.0d);
        if (abs < 0) {
            abs = 0;
        } else if (abs > 20) {
            abs = 20;
        }
        Number number = (Number) AbstractC166997dE.A0m(A00, abs);
        if (number != null) {
            return number.doubleValue();
        }
        return 0.5d;
    }
}
