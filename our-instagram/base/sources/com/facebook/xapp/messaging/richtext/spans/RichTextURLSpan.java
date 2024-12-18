package com.facebook.xapp.messaging.richtext.spans;

import X.C14360o3;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* loaded from: classes6.dex */
public final class RichTextURLSpan extends URLSpan {
    public final Integer A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextURLSpan(String str, Integer num) {
        super(str);
        C14360o3.A0B(str, 1);
        this.A00 = num;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        Integer num = this.A00;
        if (num != null) {
            textPaint.setColor(num.intValue());
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
        }
    }
}
