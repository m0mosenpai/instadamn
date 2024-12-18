package com.fbpay.common;

import X.C14360o3;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* loaded from: classes6.dex */
public abstract class URLSpanNoUnderline extends URLSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
