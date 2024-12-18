package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes5.dex */
public final class BYT extends CharacterStyle {
    public final /* synthetic */ int A00;

    public BYT(int i) {
        this.A00 = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(this.A00);
    }
}
