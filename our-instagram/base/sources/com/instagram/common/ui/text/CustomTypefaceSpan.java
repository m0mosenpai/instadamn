package com.instagram.common.ui.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* loaded from: classes11.dex */
public class CustomTypefaceSpan extends TypefaceSpan {
    public final Typeface A00;

    public CustomTypefaceSpan(Typeface typeface) {
        super("");
        this.A00 = typeface;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }

    public static void A00(Paint paint, Typeface typeface) {
        int style;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            style = 0;
        } else {
            style = typeface2.getStyle();
        }
        int style2 = style & (typeface.getStyle() ^ (-1));
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
