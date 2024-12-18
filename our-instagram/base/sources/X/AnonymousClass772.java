package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.772, reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass772 extends ClickableSpan {
    public final Integer A00;

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
    }

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

    public AnonymousClass772(Integer num) {
        this.A00 = num;
    }

    public AnonymousClass772() {
        this(null);
    }
}
