package X;

import android.graphics.Color;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.0nL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13950nL {
    public static final int A04(int i) {
        float[] fArr = new float[3];
        AbstractC56842jH.A09(i, fArr);
        float A00 = (float) ((A00(Color.red(i) / 255.0d) * 0.2126d) + (A00(Color.green(i) / 255.0d) * 0.7152d) + (A00(Color.blue(i) / 255.0d) * 0.0722d));
        if (i == -16777216) {
            return -1;
        }
        if (i == -1 || i == -16122112 || i == -31744) {
            return -16777216;
        }
        if (i == -10410265) {
            return -1;
        }
        double d = A00;
        if (d > 0.45d && i != -144548 && i != -14272) {
            fArr[1] = 0.1f;
        }
        float f = 1.0f - ((1.0f - fArr[2]) / 9.0f);
        fArr[2] = f;
        if (d > 0.45d && i != -144548 && i != -14272) {
            fArr[2] = f - 0.85f;
        }
        return AbstractC56842jH.A07(fArr);
    }

    public static final int A07(int i, float f) {
        return (i & 16777215) | (((int) (f * 255.0f)) << 24);
    }

    public static final int A08(int i, float f) {
        float[] fArr = new float[3];
        if (Color.alpha(i) / 255.0f >= 0.3d && A01(i) <= 0.85f) {
            return -1;
        }
        Color.colorToHSV(i, fArr);
        if (fArr[0] == 0.0f) {
            return -16777216;
        }
        fArr[1] = f;
        fArr[2] = 0.4f;
        return Color.HSVToColor(fArr);
    }

    public static final int A09(int i, int i2) {
        float f;
        float f2 = i;
        if (f2 > 127.5f) {
            float f3 = 255.0f - f2;
            f = (i2 * (f3 / 127.5f)) + (f2 - f3);
        } else {
            f = i2 * (f2 / 127.5f);
        }
        return (int) f;
    }

    public static final int A0A(int i, int i2, int i3, int i4) {
        boolean z = false;
        if (i3 < i4) {
            z = true;
        }
        C02R.A05(z);
        float[] fArr = new float[3];
        AbstractC56842jH.A09(i, r6);
        AbstractC56842jH.A09(i2, fArr);
        float f = r6[1];
        float f2 = f - fArr[1];
        float f3 = r6[2];
        float f4 = i4 - 1;
        float f5 = f2 / f4;
        float f6 = (f3 - fArr[2]) / f4;
        float f7 = i3;
        float[] fArr2 = {0.0f, f - (f5 * f7), f3 - (f7 * f6)};
        return AbstractC56842jH.A07(fArr2);
    }

    public static final int A0B(String str, int i) {
        if (str != null && str.length() != 0) {
            String substring = str.substring(1);
            C14360o3.A07(substring);
            int parseLong = (int) Long.parseLong(substring, 16);
            return (parseLong >>> 8) | ((parseLong & 255) << 24);
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0008, code lost:
    
        if (r3.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer A0D(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 == 0) goto La
            int r2 = r3.length()     // Catch: java.lang.IllegalArgumentException -> L15
            r1 = 0
            if (r2 != 0) goto Lb
        La:
            r1 = 1
        Lb:
            if (r1 != 0) goto L15
            int r1 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.IllegalArgumentException -> L15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L15
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC13950nL.A0D(java.lang.String):java.lang.Integer");
    }

    public static final int A03(int i) {
        return Color.argb(C1H4.A01(153.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final int A06(int i, float f) {
        return A07(i, f * ((i >>> 24) / 255.0f));
    }

    public static final int A0C(String str, int i) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Color.parseColor(str);
                }
                return i;
            } catch (IllegalArgumentException unused) {
                return i;
            }
        }
        return i;
    }

    public static final float A01(int i) {
        return ((((Color.red(i) / 255.0f) * 299.0f) + ((Color.green(i) / 255.0f) * 587.0f)) + ((Color.blue(i) / 255.0f) * 114.0f)) / 1000.0f;
    }

    public static final int A02(float f, int i, int i2) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return Color.argb(Color.alpha(i) + ((int) ((Color.alpha(i2) - r1) * f)), red + ((int) ((Color.red(i2) - red) * f)), green + ((int) ((Color.green(i2) - green) * f)), blue + ((int) ((Color.blue(i2) - blue) * f)));
    }

    public static final int A05(int i) {
        if (A01(i) < 0.25d) {
            return A07(-1, 0.25f);
        }
        int red = Color.red(i) - 30;
        if (red < 0) {
            red = 0;
        }
        int green = Color.green(i) - 30;
        if (green < 0) {
            green = 0;
        }
        int blue = Color.blue(i) - 30;
        if (blue < 0) {
            blue = 0;
        }
        return Color.rgb(red, green, blue);
    }

    public static final String A0E(int i) {
        String hexString = Integer.toHexString(Color.red(i));
        C14360o3.A07(hexString);
        String A0H = A0H(hexString);
        String hexString2 = Integer.toHexString(Color.green(i));
        C14360o3.A07(hexString2);
        String A0H2 = A0H(hexString2);
        String hexString3 = Integer.toHexString(Color.blue(i));
        C14360o3.A07(hexString3);
        String A0H3 = A0H(hexString3);
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        sb.append(A0H);
        sb.append(A0H2);
        sb.append(A0H3);
        return sb.toString();
    }

    public static final String A0F(int i) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("#%06x", Integer.valueOf(i & 16777215));
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public static final String A0G(int i) {
        String hexString = Integer.toHexString(Color.red(i));
        C14360o3.A07(hexString);
        String A0H = A0H(hexString);
        String hexString2 = Integer.toHexString(Color.green(i));
        C14360o3.A07(hexString2);
        String A0H2 = A0H(hexString2);
        String hexString3 = Integer.toHexString(Color.blue(i));
        C14360o3.A07(hexString3);
        String A0H3 = A0H(hexString3);
        String hexString4 = Integer.toHexString(Color.alpha(i));
        C14360o3.A07(hexString4);
        String A0H4 = A0H(hexString4);
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        sb.append(A0H);
        sb.append(A0H2);
        sb.append(A0H3);
        sb.append(A0H4);
        return sb.toString();
    }

    public static final String A0H(String str) {
        if (str.length() < 2) {
            return AnonymousClass001.A0D(str, '0');
        }
        return str;
    }

    public static final double A00(double d) {
        if (d > 0.03928d) {
            return Math.pow((d + 0.054999999701976776d) / 1.0549999475479126d, 2.4d);
        }
        return d / 12.92d;
    }
}
