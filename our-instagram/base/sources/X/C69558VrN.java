package X;

import android.graphics.Rect;
import android.text.TextPaint;

/* renamed from: X.VrN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69558VrN {
    public final Rect A00 = new Rect();
    public final TextPaint A01;

    public final float A00(String str, float f) {
        C14360o3.A0B(str, 0);
        TextPaint textPaint = this.A01;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f);
        float measureText = textPaint.measureText(str);
        textPaint.setTextSize(textSize);
        return measureText;
    }

    public C69558VrN(TextPaint textPaint) {
        this.A01 = textPaint;
    }
}
