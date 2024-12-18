package X;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class WGL {
    public static final ThreadLocal A00 = new X1x();
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public static Layout.Alignment A01(Spannable spannable, InterfaceC72045XLb interfaceC72045XLb) {
        boolean z;
        Layout.Alignment alignment;
        if (interfaceC72045XLb.contains(2)) {
            if (A05(interfaceC72045XLb) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length())) {
                z = true;
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                z = false;
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            InterfaceC72045XLb mapBuffer = interfaceC72045XLb.getMapBuffer(2);
            if (mapBuffer.getCount() != 0) {
                InterfaceC72045XLb mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
                if (mapBuffer2.contains(12)) {
                    String string = mapBuffer2.getString(12);
                    if (string.equals("center")) {
                        return Layout.Alignment.ALIGN_CENTER;
                    }
                    if (!string.equals("right")) {
                        return alignment;
                    }
                    if (!z) {
                        return Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    return alignment;
                }
            } else {
                return alignment;
            }
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    public static boolean A05(InterfaceC72045XLb interfaceC72045XLb) {
        if (!interfaceC72045XLb.contains(2)) {
            return false;
        }
        InterfaceC72045XLb mapBuffer = interfaceC72045XLb.getMapBuffer(2);
        if (mapBuffer.getCount() == 0) {
            return false;
        }
        InterfaceC72045XLb mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
        if (!mapBuffer2.contains(23) || W6Q.A00(mapBuffer2.getString(23)) != 1) {
            return false;
        }
        return true;
    }

    public static Layout A02(BoringLayout.Metrics metrics, Layout.Alignment alignment, Spannable spannable, TextPaint textPaint, EnumC78643fW enumC78643fW, float f, int i, int i2, boolean z) {
        float f2;
        StaticLayout.Builder builder;
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2;
        int length = spannable.length();
        boolean A1P = AbstractC25230BEn.A1P((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        if (metrics == null) {
            f2 = Layout.getDesiredWidth(spannable, textPaint);
        } else {
            f2 = Float.NaN;
        }
        boolean isRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, length);
        if (metrics == null) {
            if (A1P || (!C3e2.A00(f2) && f2 <= f)) {
                if (enumC78643fW == EnumC78643fW.EXACTLY) {
                    f2 = f;
                }
                StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) Math.ceil(f2)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(i).setHyphenationFrequency(i2);
                if (isRtl) {
                    textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
                }
                builder = hyphenationFrequency.setTextDirection(textDirectionHeuristic2);
                return builder.build();
            }
        } else if (A1P || metrics.width <= f) {
            int i3 = metrics.width;
            if (enumC78643fW == EnumC78643fW.EXACTLY) {
                i3 = (int) Math.ceil(f);
            }
            if (i3 < 0) {
                ReactSoftExceptionLogger.logSoftException("TextLayoutManager", new RuntimeException(AnonymousClass001.A0O("Text width is invalid: ", i3)));
                i3 = 0;
            }
            return BoringLayout.make(spannable, textPaint, i3, alignment, 1.0f, 0.0f, metrics, z);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) Math.ceil(f)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(i).setHyphenationFrequency(i2);
        if (isRtl) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        builder = hyphenationFrequency2.setTextDirection(textDirectionHeuristic);
        builder.setUseLineSpacingFromFallbacks(true);
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:389:0x04ae, code lost:
    
        if (Float.NaN > r18) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x04c4, code lost:
    
        if (Float.NaN <= r18) goto L235;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x008d. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.X7b, android.text.style.StrikethroughSpan] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.X7b, android.text.style.UnderlineSpan] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.X7b, android.text.style.AbsoluteSizeSpan] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.X7b, android.text.style.BackgroundColorSpan] */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.X7b, android.text.style.ForegroundColorSpan] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spannable A03(android.content.Context r43, X.InterfaceC72045XLb r44) {
        /*
            Method dump skipped, instructions count: 1456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGL.A03(android.content.Context, X.XLb):android.text.Spannable");
    }

    public static void A04(Layout.Alignment alignment, Spannable spannable, TextPaint textPaint, EnumC78643fW enumC78643fW, EnumC78643fW enumC78643fW2, double d, float f, float f2, int i, int i2, int i3, boolean z) {
        double d2 = d;
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, textPaint);
        Layout A02 = A02(isBoring, alignment, spannable, textPaint, enumC78643fW, f, i2, i3, z);
        if (Double.isNaN(d2)) {
            d2 = WF1.A01(4.0f);
        }
        int i4 = (int) d2;
        int i5 = i4;
        for (ReactAbsoluteSizeSpan reactAbsoluteSizeSpan : (ReactAbsoluteSizeSpan[]) spannable.getSpans(0, spannable.length(), ReactAbsoluteSizeSpan.class)) {
            i5 = Math.max(i5, reactAbsoluteSizeSpan.getSize());
        }
        int i6 = i5;
        while (i6 > i4) {
            if ((i != -1 && i != 0 && A02.getLineCount() > i) || (enumC78643fW2 != EnumC78643fW.UNDEFINED && A02.getHeight() > f2)) {
                i6 -= Math.max(1, (int) WF1.A01(1.0f));
                float f3 = i6 / i5;
                float f4 = i4;
                textPaint.setTextSize(Math.max(textPaint.getTextSize() * f3, f4));
                for (ReactAbsoluteSizeSpan reactAbsoluteSizeSpan2 : (ReactAbsoluteSizeSpan[]) spannable.getSpans(0, spannable.length(), ReactAbsoluteSizeSpan.class)) {
                    spannable.setSpan(new AbsoluteSizeSpan((int) Math.max(reactAbsoluteSizeSpan2.getSize() * f3, f4)), spannable.getSpanStart(reactAbsoluteSizeSpan2), spannable.getSpanEnd(reactAbsoluteSizeSpan2), spannable.getSpanFlags(reactAbsoluteSizeSpan2));
                    spannable.removeSpan(reactAbsoluteSizeSpan2);
                }
                A02 = A02(isBoring, alignment, spannable, textPaint, enumC78643fW, f, i2, i3, z);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x03d9, code lost:
    
        if (r9 > r28) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x03f9, code lost:
    
        if (r15 > r29) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x04a8, code lost:
    
        if (r2 != false) goto L272;
     */
    /* JADX WARN: Removed duplicated region for block: B:374:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A00(android.content.Context r22, X.InterfaceC72045XLb r23, X.InterfaceC72045XLb r24, X.EnumC78643fW r25, X.EnumC78643fW r26, float[] r27, float r28, float r29) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGL.A00(android.content.Context, X.XLb, X.XLb, X.3fW, X.3fW, float[], float, float):long");
    }
}
