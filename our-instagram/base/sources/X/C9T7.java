package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.9T7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9T7 extends CharacterStyle implements UpdateAppearance {
    public Shader A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Shader.TileMode A05;
    public final Integer A06;
    public final float[] A07;
    public final int[] A08;

    public C9T7(Integer num, float[] fArr, int[] iArr, int i, int i2, int i3, int i4) {
        C14360o3.A0B(iArr, 1);
        this.A08 = iArr;
        this.A07 = fArr;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A06 = num;
        this.A05 = Shader.TileMode.CLAMP;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float f;
        float f2;
        float f3;
        int i;
        C14360o3.A0B(textPaint, 0);
        Shader shader = this.A00;
        if (shader == null) {
            int intValue = this.A06.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 0) {
                        shader = null;
                    } else {
                        shader = new LinearGradient(this.A02, 0.0f, this.A03, 0.0f, this.A08, this.A07, this.A05);
                    }
                    this.A00 = shader;
                } else {
                    f = this.A02;
                    f2 = this.A01;
                    f3 = this.A03;
                    i = this.A04;
                }
            } else {
                f = this.A02;
                f2 = this.A04;
                f3 = this.A03;
                i = this.A01;
            }
            shader = new LinearGradient(f, f2, f3, i, this.A08, this.A07, this.A05);
            this.A00 = shader;
        }
        textPaint.setShader(shader);
    }
}
