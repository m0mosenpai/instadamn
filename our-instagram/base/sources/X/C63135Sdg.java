package X;

import android.graphics.Path;

/* renamed from: X.Sdg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63135Sdg {
    public char A00;
    public final float[] A01;

    public C63135Sdg(float[] fArr, char c) {
        this.A00 = c;
        this.A01 = fArr;
    }

    public static void A00(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = d3;
        double d5 = d3 * cos;
        double d6 = f2;
        double d7 = f5;
        double d8 = (d5 + (d6 * sin)) / d7;
        double d9 = f6;
        double d10 = (((-f) * sin) + (d6 * cos)) / d9;
        double d11 = f4;
        double d12 = ((f3 * cos) + (d11 * sin)) / d7;
        double d13 = (((-f3) * sin) + (d11 * cos)) / d9;
        double d14 = d8 - d12;
        double d15 = d10 - d13;
        double d16 = (d8 + d12) / 2.0d;
        double d17 = (d10 + d13) / 2.0d;
        double d18 = (d14 * d14) + (d15 * d15);
        if (d18 == 0.0d) {
            android.util.Log.w("PathParser", " Points are coincident");
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            android.util.Log.w("PathParser", AnonymousClass001.A0M("Points are too far apart ", d18));
            float sqrt = (float) (Math.sqrt(d18) / 1.99999d);
            A00(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d19);
        double d20 = d14 * sqrt2;
        double d21 = sqrt2 * d15;
        if (z == z2) {
            d = d16 - d21;
            d2 = d17 + d20;
        } else {
            d = d16 + d21;
            d2 = d17 - d20;
        }
        double atan2 = Math.atan2(d10 - d2, d8 - d);
        double atan22 = Math.atan2(d13 - d2, d12 - d) - atan2;
        if (z2 != MSY.A1R((atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1)))) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d22 = d * d7;
        double d23 = d2 * d9;
        double d24 = (d22 * cos) - (d23 * sin);
        double d25 = (d22 * sin) + (d23 * cos);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(atan2);
        double sin2 = Math.sin(atan2);
        double d26 = -d7;
        double d27 = d26 * cos;
        double d28 = d9 * sin;
        double d29 = (d27 * sin2) - (d28 * cos2);
        double d30 = d26 * sin;
        double d31 = d9 * cos;
        double d32 = (sin2 * d30) + (cos2 * d31);
        double d33 = atan22 / ceil;
        int i = 0;
        while (true) {
            double d34 = d6;
            if (i >= ceil) {
                return;
            }
            double d35 = atan2 + d33;
            double sin3 = Math.sin(d35);
            double cos3 = Math.cos(d35);
            double d36 = (d24 + ((d7 * cos) * cos3)) - (d28 * sin3);
            d6 = d25 + (d7 * sin * cos3) + (d31 * sin3);
            double d37 = (d27 * sin3) - (d28 * cos3);
            double d38 = (sin3 * d30) + (cos3 * d31);
            double d39 = d35 - atan2;
            double tan = Math.tan(d39 / 2.0d);
            double sin4 = (Math.sin(d39) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d4 + (d29 * sin4)), (float) (d34 + (d32 * sin4)), (float) (d36 - (sin4 * d37)), (float) (d6 - (sin4 * d38)), (float) d36, (float) d6);
            i++;
            d4 = d36;
            atan2 = d35;
            d32 = d38;
            d29 = d37;
        }
    }

    public C63135Sdg(C63135Sdg c63135Sdg) {
        this.A00 = c63135Sdg.A00;
        float[] fArr = c63135Sdg.A01;
        int length = fArr.length;
        int min = Math.min(length, length);
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        this.A01 = fArr2;
    }
}
