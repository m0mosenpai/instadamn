package X;

import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.9T8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9T8 extends CharacterStyle implements UpdateAppearance {
    public String A03;
    public int A05;
    public Shader A06;
    public final float[] A08;
    public final int[] A09;
    public final Rect A07 = AbstractC166987dD.A0U();
    public float A04 = -1.0f;
    public float A00 = -1.0f;
    public int A01 = Integer.MAX_VALUE;
    public Shader.TileMode A02 = Shader.TileMode.CLAMP;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        LinearGradient linearGradient;
        String str = this.A03;
        int min = Math.min(this.A01, str.length());
        Rect rect = this.A07;
        textPaint.getTextBounds(str, 0, min, rect);
        int width = rect.width();
        if (width != this.A05 || this.A00 != this.A04) {
            this.A05 = width;
            float f = this.A00;
            this.A04 = f;
            if (f != -1.0f) {
                float A02 = AbstractC166987dD.A02(width);
                linearGradient = new LinearGradient(f - A02, 0.0f, f + A02, 0.0f, this.A09, this.A08, this.A02);
            } else {
                linearGradient = new LinearGradient(0.0f, 0.0f, width, 0.0f, this.A09, this.A08, this.A02);
            }
            this.A06 = linearGradient;
        }
        Shader shader = this.A06;
        if (shader != null) {
            textPaint.setShader(shader);
        }
    }

    public C9T8(CharSequence charSequence, float[] fArr, int[] iArr) {
        this.A09 = iArr;
        this.A08 = fArr;
        this.A03 = charSequence.toString();
    }
}
