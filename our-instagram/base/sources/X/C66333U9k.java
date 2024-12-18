package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.U9k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66333U9k extends MetricAffectingSpan implements InterfaceC71843X7b {
    public final float A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        float f = this.A00;
        if (!Float.isNaN(f)) {
            textPaint.setLetterSpacing(f);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        float f = this.A00;
        if (!Float.isNaN(f)) {
            textPaint.setLetterSpacing(f);
        }
    }

    public C66333U9k(float f) {
        this.A00 = f;
    }
}
