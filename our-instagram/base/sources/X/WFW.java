package X;

import com.facebook.android.maps.model.LatLng;

/* loaded from: classes11.dex */
public final class WFW {
    public final C70394WTw A00;
    public final float[] A02 = new float[2];
    public final C2TB A01 = new Object();

    public static double A01(double d) {
        return (d + 180.0d) / 360.0d;
    }

    public static double A02(double d) {
        return (d * 360.0d) - 180.0d;
    }

    public static double A03(double d) {
        return ((Math.atan(Math.exp((1.0d - (d * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d;
    }

    public final LatLng A04(float f, float f2) {
        A08(this.A02, f, f2);
        return new LatLng(A03(r2[1]), A02(r2[0]));
    }

    public final void A05(C2TB c2tb) {
        C66356UBx c66356UBx = this.A00.A0I;
        double d = c66356UBx.A03;
        double d2 = c66356UBx.A01;
        c2tb.A03 = d - d2;
        c2tb.A00 = d + d2;
        double d3 = c66356UBx.A02;
        double d4 = c66356UBx.A00;
        double d5 = d3 - d4;
        c2tb.A01 = d5;
        double d6 = d3 + d4;
        c2tb.A02 = d6;
        if (d5 < 0.0d) {
            double ceil = (int) Math.ceil(-d5);
            c2tb.A01 = d5 + ceil;
            c2tb.A02 = d6 + ceil;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if ((r4 - r12) < (r2 - r8)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(float[] r11, double r12, double r14) {
        /*
            r10 = this;
            X.2TB r6 = r10.A01
            r10.A05(r6)
            double r4 = r6.A01
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L11
            double r1 = r6.A02
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
        L11:
            double r0 = r4 - r12
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            double r2 = (double) r0
            double r2 = r2 + r12
            double r8 = r6.A02
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L2f
            double r6 = r2 - r8
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r2 - r0
            double r4 = r4 - r12
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L2f
        L2b:
            r10.A07(r11, r12, r14)
            return
        L2f:
            r12 = r2
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFW.A06(float[], double, double):void");
    }

    public final void A07(float[] fArr, double d, double d2) {
        C66356UBx c66356UBx = this.A00.A0I;
        double d3 = c66356UBx.A02;
        C2TB c2tb = this.A01;
        A05(c2tb);
        if (c2tb.A01 > d3 || d3 > c2tb.A02) {
            d3 += (int) Math.ceil(r0 - d3);
        }
        float f = (float) (d2 - c66356UBx.A03);
        float f2 = (float) c66356UBx.A0K;
        fArr[0] = ((float) (d - d3)) * f2;
        fArr[1] = f * f2;
        c66356UBx.A0g.mapVectors(fArr);
        fArr[0] = fArr[0] + c66356UBx.A04;
        fArr[1] = fArr[1] + c66356UBx.A05;
    }

    public final void A08(float[] fArr, float f, float f2) {
        C66356UBx c66356UBx = this.A00.A0I;
        fArr[0] = f - c66356UBx.A04;
        fArr[1] = f2 - c66356UBx.A05;
        c66356UBx.A0h.mapVectors(fArr);
        double d = c66356UBx.A02;
        double d2 = fArr[0];
        double d3 = c66356UBx.A0K;
        double d4 = d + (d2 / d3);
        double d5 = c66356UBx.A03 + (fArr[1] / d3);
        if (d4 > 1.0d) {
            d4 -= 1.0d;
        } else if (d4 < 0.0d) {
            d4 += 1.0d;
        }
        fArr[0] = (float) d4;
        fArr[1] = (float) d5;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2TB, java.lang.Object] */
    public WFW(C70394WTw c70394WTw) {
        this.A00 = c70394WTw;
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
    }
}
