package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes11.dex */
public final class U9U extends CharacterStyle {
    public final boolean A00;
    public final boolean A01;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.A01);
        textPaint.setStrikeThruText(this.A00);
    }

    public U9U(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
