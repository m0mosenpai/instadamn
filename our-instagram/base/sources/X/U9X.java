package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes11.dex */
public final class U9X extends CharacterStyle implements UpdateAppearance {
    public final int A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setColor(this.A00);
    }

    public U9X(int i) {
        this.A00 = i;
    }
}
