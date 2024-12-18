package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.U9i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66331U9i extends MetricAffectingSpan {
    public final String A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    public C66331U9i(String str) {
        this.A00 = str;
    }
}
