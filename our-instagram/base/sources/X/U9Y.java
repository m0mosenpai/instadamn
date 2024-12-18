package X;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes11.dex */
public final class U9Y extends CharacterStyle implements UpdateAppearance, InterfaceC71843X7b {
    public final float A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        float alpha = Color.alpha(textPaint.getColor());
        float f = this.A00;
        textPaint.setAlpha(C1H4.A01(alpha * f));
        if (textPaint.bgColor != 0) {
            textPaint.bgColor = Color.argb(C1H4.A01(Color.alpha(r0) * f), Color.red(textPaint.bgColor), Color.green(textPaint.bgColor), Color.blue(textPaint.bgColor));
        }
    }

    public U9Y(float f) {
        this.A00 = f;
    }
}
