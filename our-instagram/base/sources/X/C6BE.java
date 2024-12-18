package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/* renamed from: X.6BE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BE {
    public static final ThreadLocal A00;
    public static final ThreadLocal A01;
    public static final ThreadLocal A02;
    public static final ThreadLocal A03;

    static {
        final String str = "#%";
        A01 = new ThreadLocal() { // from class: X.6BF
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Object initialValue() {
                return new DecimalFormat(str, DecimalFormatSymbols.getInstance(Locale.US));
            }
        };
        final String str2 = "#px";
        A02 = new ThreadLocal() { // from class: X.6BF
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Object initialValue() {
                return new DecimalFormat(str2, DecimalFormatSymbols.getInstance(Locale.US));
            }
        };
        final String str3 = "#dp";
        A00 = new ThreadLocal() { // from class: X.6BF
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Object initialValue() {
                return new DecimalFormat(str3, DecimalFormatSymbols.getInstance(Locale.US));
            }
        };
        final String str4 = "#sp";
        A03 = new ThreadLocal() { // from class: X.6BF
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Object initialValue() {
                return new DecimalFormat(str4, DecimalFormatSymbols.getInstance(Locale.US));
            }
        };
    }

    public static float A00(String str) {
        try {
            return ((NumberFormat) A01.get()).parse(str).floatValue() * 100.0f;
        } catch (ParseException e) {
            throw new IOException(AnonymousClass001.A0R("can't parse pixel value: ", str), e);
        }
    }

    public static float A01(String str) {
        try {
            if (str.endsWith("px")) {
                return ((NumberFormat) A02.get()).parse(str).floatValue();
            }
            if (str.endsWith("sp")) {
                return Math.round(((NumberFormat) A03.get()).parse(str).floatValue() * C1LZ.A00().A00.getResources().getDisplayMetrics().scaledDensity);
            }
            if (str.endsWith("%")) {
                return A00(str);
            }
            return Math.round(((NumberFormat) A00.get()).parse(str).floatValue() * (C1LZ.A00().A00.getResources().getDisplayMetrics().densityDpi / 160.0f));
        } catch (ParseException e) {
            throw new IOException(AnonymousClass001.A0R("can't parse pixel value: ", str), e);
        }
    }

    public static float A02(String str) {
        try {
            return ((NumberFormat) A03.get()).parse(str).floatValue();
        } catch (ParseException e) {
            throw new IOException(AnonymousClass001.A0R("can't parse scaled pixel value: ", str), e);
        }
    }

    public static C65984Txd A0B(String str) {
        float A012;
        Integer num;
        if ("auto".equalsIgnoreCase(str)) {
            return C65984Txd.A02;
        }
        if (str.endsWith("%")) {
            A012 = Float.parseFloat(str.substring(0, str.length() - 1));
            num = C05F.A01;
        } else {
            A012 = A01(str);
            num = C05F.A00;
        }
        return new C65984Txd(num, A012);
    }

    public static int A03(String str) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            throw new IOException(AnonymousClass001.A0R("can't parse color value: ", str), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public static int A04(String str) {
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals("medium")) {
                    return 2;
                }
                throw new IOException(AnonymousClass001.A0R("Can't parse unknown datetime format: ", str));
            case 3154575:
                if (str.equals("full")) {
                    return 0;
                }
                throw new IOException(AnonymousClass001.A0R("Can't parse unknown datetime format: ", str));
            case 3327612:
                if (str.equals("long")) {
                    return 1;
                }
                throw new IOException(AnonymousClass001.A0R("Can't parse unknown datetime format: ", str));
            case 109413500:
                if (str.equals("short")) {
                    return 3;
                }
                throw new IOException(AnonymousClass001.A0R("Can't parse unknown datetime format: ", str));
            default:
                throw new IOException(AnonymousClass001.A0R("Can't parse unknown datetime format: ", str));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A05(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1292790694:
                str2 = "adjust_hidden";
                break;
            case -1009740956:
                if (str.equals("adjust_resize")) {
                    return 16;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown mode: ", str));
            case 1976678381:
                str2 = "adjust_pan";
                break;
            default:
                throw new IOException(AnonymousClass001.A0R("can't parse unknown mode: ", str));
        }
        if (str.equals(str2)) {
            return 32;
        }
        throw new IOException(AnonymousClass001.A0R("can't parse unknown mode: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    public static int A06(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown textAlign: ", str));
            case 100571:
                if (str.equals("end")) {
                    return 8388613;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown textAlign: ", str));
            case 109757538:
                if (str.equals("start")) {
                    return 8388611;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown textAlign: ", str));
            default:
                throw new IOException(AnonymousClass001.A0R("can't parse unknown textAlign: ", str));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static int A07(String str) {
        switch (str.hashCode()) {
            case 3212:
                if (str.equals("dp")) {
                    return 1;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown textUniSize: ", str));
            case 3592:
                if (str.equals("px")) {
                    return 0;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown textUniSize: ", str));
            case 3677:
                if (str.equals("sp")) {
                    return 2;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown textUniSize: ", str));
            default:
                throw new IOException(AnonymousClass001.A0R("can't parse unknown textUniSize: ", str));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r8.equals("bold") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A08(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            java.lang.String r7 = "semibold"
            java.lang.String r6 = "light"
            java.lang.String r5 = "heavy"
            r4 = 3
            java.lang.String r3 = "normal"
            java.lang.String r2 = "medium"
            java.lang.String r1 = "bold"
            switch(r0) {
                case -1178781136: goto L77;
                case -1078030475: goto L64;
                case -1039745817: goto L4a;
                case 3029637: goto L43;
                case 99152071: goto L36;
                case 102970646: goto L51;
                case 1223860979: goto L20;
                case 1734741290: goto L2d;
                default: goto L14;
            }
        L14:
            java.lang.String r0 = "can't parse unknown typeface: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r8)
            X.41M r0 = new X.41M
            r0.<init>(r1)
            throw r0
        L20:
            boolean r0 = r8.equals(r7)
            if (r0 == 0) goto L14
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.AnonymousClass001.A0g(r7, r0, r1)
            goto L70
        L2d:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L76
            goto L14
        L36:
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L14
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.AnonymousClass001.A0g(r5, r0, r1)
            goto L70
        L43:
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L75
            goto L14
        L4a:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L62
            goto L14
        L51:
            boolean r0 = r8.equals(r6)
            if (r0 == 0) goto L14
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.AnonymousClass001.A0g(r6, r0, r3)
            java.lang.String r0 = "text_style_ignored"
            X.AbstractC25241Le.A02(r0, r1)
        L62:
            r4 = 0
            return r4
        L64:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L14
            java.lang.String r0 = " is not supported, defaulting to "
            java.lang.String r1 = X.AnonymousClass001.A0g(r2, r0, r1)
        L70:
            java.lang.String r0 = "text_style_ignored"
            X.AbstractC25241Le.A02(r0, r1)
        L75:
            r4 = 1
        L76:
            return r4
        L77:
            java.lang.String r0 = "italic"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L14
            r4 = 2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6BE.A08(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static GradientDrawable.Orientation A09(String str) {
        switch (str.hashCode()) {
            case -1451623918:
                if (str.equals("bottom_left_to_top_right")) {
                    return GradientDrawable.Orientation.BL_TR;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse orientation value: ", str));
            case -1118360059:
                if (str.equals("top_to_bottom")) {
                    return GradientDrawable.Orientation.TOP_BOTTOM;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse orientation value: ", str));
            case 404498110:
                if (str.equals("top_left_to_bottom_right")) {
                    return GradientDrawable.Orientation.TL_BR;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse orientation value: ", str));
            case 1553519760:
                if (str.equals("left_to_right")) {
                    return GradientDrawable.Orientation.LEFT_RIGHT;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse orientation value: ", str));
            default:
                throw new IOException(AnonymousClass001.A0R("can't parse orientation value: ", str));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static ImageView.ScaleType A0A(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    return ImageView.ScaleType.FIT_XY;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown scaleType: ", str));
            case 94852023:
                if (str.equals("cover")) {
                    return ImageView.ScaleType.CENTER_CROP;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown scaleType: ", str));
            case 951526612:
                if (str.equals("contain")) {
                    return ImageView.ScaleType.FIT_CENTER;
                }
                throw new IOException(AnonymousClass001.A0R("can't parse unknown scaleType: ", str));
            default:
                throw new IOException(AnonymousClass001.A0R("can't parse unknown scaleType: ", str));
        }
    }
}
