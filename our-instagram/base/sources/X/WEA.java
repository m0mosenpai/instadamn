package X;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;

/* loaded from: classes11.dex */
public final class WEA {
    public static final WEA A00 = new Object();

    public static final float A00(RectF rectF, Layout layout, Spannable spannable, TextPaint textPaint, float f, float f2, float f3, float f4, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        Object absoluteSizeSpan;
        float f5;
        boolean z4;
        boolean z5;
        float f6 = f;
        while (f <= f2) {
            float f7 = (f + f2) / 2.0f;
            if (z3) {
                absoluteSizeSpan = new RelativeSizeSpan(f7);
            } else {
                absoluteSizeSpan = new AbsoluteSizeSpan(C1H4.A01(f7));
            }
            boolean z6 = false;
            spannable.setSpan(absoluteSizeSpan, i2, i3, 0);
            Layout.Alignment alignment = layout.getAlignment();
            C14360o3.A07(alignment);
            int i4 = i;
            StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, C1H4.A01(rectF.right)).setAlignment(alignment);
            if (i == -1) {
                i4 = Integer.MAX_VALUE;
            }
            StaticLayout build = alignment2.setMaxLines(i4).build();
            C14360o3.A0A(build);
            int i5 = 0;
            if (build != null) {
                i5 = build.getHeight();
            }
            if (z3) {
                f5 = f3 * f7;
            } else {
                f5 = f7;
            }
            boolean A1S = AbstractC31175DnJ.A1S((f5 > build.getWidth() ? 1 : (f5 == build.getWidth() ? 0 : -1)));
            float f8 = i5;
            boolean A1S2 = AbstractC31175DnJ.A1S((f5 > f8 ? 1 : (f5 == f8 ? 0 : -1)));
            if (z || (build.getWidth() <= rectF.right && A1S)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2 || (f8 <= rectF.bottom && A1S2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i <= 0 || build.getLineCount() <= i) {
                z6 = true;
            }
            if (z4 && z5 && z6) {
                f = f7 + f4;
                f6 = f7;
            } else {
                f2 = f7 - f4;
            }
            spannable.removeSpan(absoluteSizeSpan);
        }
        return f6;
    }

    public static final int A01(C6FG c6fg, String str, int i) {
        try {
            i = (int) TypedValue.applyDimension(2, C6BE.A02(str), AbstractC167007dF.A0K(c6fg.A00));
            return i;
        } catch (C41M e) {
            AbstractC25241Le.A00(c6fg, "ResizeToFitSpanStyle", "Error parsing text size value", e);
            return i;
        }
    }
}
