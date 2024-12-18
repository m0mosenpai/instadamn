package X;

import android.graphics.Rect;
import android.text.TextPaint;

/* renamed from: X.VrK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69555VrK {
    public final Rect A00 = new Rect();
    public final TextPaint A01;

    public final float A00(String str, float f) {
        TextPaint textPaint = this.A01;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f);
        float measureText = textPaint.measureText(str);
        textPaint.setTextSize(textSize);
        return measureText;
    }

    public C69555VrK(TextPaint textPaint) {
        this.A01 = textPaint;
    }
}
