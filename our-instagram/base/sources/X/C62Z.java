package X;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import java.util.function.DoubleUnaryOperator;

/* renamed from: X.62Z, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C62Z {
    public static final Bitmap A00(InterfaceC137546La interfaceC137546La) {
        if (interfaceC137546La instanceof C6LZ) {
            return ((C6LZ) interfaceC137546La).A00;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final C6LZ A01(AbstractC1132959r abstractC1132959r, int i, int i2, int i3) {
        Bitmap.Config config;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        if (i3 == 0) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ALPHA_8;
        }
        if (!C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A0G)) {
            if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A03)) {
                named = ColorSpace.Named.ACES;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A04)) {
                named = ColorSpace.Named.ACESCG;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A05)) {
                named = ColorSpace.Named.ADOBE_RGB;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A06)) {
                named = ColorSpace.Named.BT2020;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A07)) {
                named = ColorSpace.Named.BT709;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A00)) {
                named = ColorSpace.Named.CIE_LAB;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A01)) {
                named = ColorSpace.Named.CIE_XYZ;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A08)) {
                named = ColorSpace.Named.DCI_P3;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A09)) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A0A)) {
                named = ColorSpace.Named.EXTENDED_SRGB;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A0B)) {
                named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A0C)) {
                named = ColorSpace.Named.LINEAR_SRGB;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A0D)) {
                named = ColorSpace.Named.NTSC_1953;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A0E)) {
                named = ColorSpace.Named.PRO_PHOTO_RGB;
            } else if (C14360o3.A0K(abstractC1132959r, AbstractC1132459m.A0F)) {
                named = ColorSpace.Named.SMPTE_C;
            } else if (abstractC1132959r instanceof C1132859q) {
                C1132859q c1132859q = (C1132859q) abstractC1132959r;
                float[] A00 = c1132859q.A07.A00();
                C1132559n c1132559n = c1132859q.A06;
                if (c1132559n != null) {
                    colorSpace = new ColorSpace.Rgb(abstractC1132959r.A02, c1132859q.A0C, A00, new ColorSpace.Rgb.TransferParameters(c1132559n.A00, c1132559n.A01, c1132559n.A02, c1132559n.A03, 0.0d, 0.0d, c1132559n.A04));
                } else {
                    String str = abstractC1132959r.A02;
                    float[] fArr = c1132859q.A0C;
                    final InterfaceC16660sJ interfaceC16660sJ = c1132859q.A09;
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: X.D2r
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            return ((Number) InterfaceC16660sJ.this.invoke(Double.valueOf(d))).doubleValue();
                        }
                    };
                    final InterfaceC16660sJ interfaceC16660sJ2 = c1132859q.A08;
                    colorSpace = new ColorSpace.Rgb(str, fArr, A00, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: X.D2s
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            return ((Number) InterfaceC16660sJ.this.invoke(Double.valueOf(d))).doubleValue();
                        }
                    }, abstractC1132959r.A01(0), abstractC1132959r.A00(0));
                }
                return new C6LZ(Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace));
            }
            colorSpace = ColorSpace.get(named);
            return new C6LZ(Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace));
        }
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        return new C6LZ(Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace));
    }
}
