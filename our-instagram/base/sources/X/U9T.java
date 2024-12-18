package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes11.dex */
public final class U9T extends CharacterStyle {
    public int A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setAlpha(this.A00);
    }

    public U9T(int i) {
        int max = Math.max(i, 0);
        this.A00 = max;
        this.A00 = Math.min(max, 255);
    }
}
