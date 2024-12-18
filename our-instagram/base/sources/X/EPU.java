package X;

import android.text.TextPaint;

/* loaded from: classes6.dex */
public abstract class EPU extends AbstractC85223rD {
    public final Integer A00;

    public EPU(C012804r c012804r, Integer num, String str, int i) {
        this.A02 = str;
        this.A01 = num;
        super.A00 = c012804r;
        this.A00 = Integer.valueOf(i);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer num = this.A00;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}
