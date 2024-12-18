package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.U9j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66332U9j extends MetricAffectingSpan {
    public final float A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public C66332U9j(float f) {
        this.A00 = f;
    }
}
