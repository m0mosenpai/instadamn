package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.8yB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202938yB extends MetricAffectingSpan implements C6S2 {
    public float A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setTextSize(this.A00);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setTextSize(this.A00);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.WiT, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        float f = this.A00;
        ?? obj = new Object();
        obj.A00 = f;
        return obj;
    }
}
