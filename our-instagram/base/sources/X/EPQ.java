package X;

import android.text.TextPaint;

/* loaded from: classes6.dex */
public abstract class EPQ extends AbstractC85223rD {
    public final Integer A00;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        Integer num = this.A00;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public EPQ(C012804r c012804r, Integer num, Integer num2, String str) {
        this.A02 = str;
        this.A01 = num2;
        super.A00 = c012804r;
        this.A00 = num;
    }
}
