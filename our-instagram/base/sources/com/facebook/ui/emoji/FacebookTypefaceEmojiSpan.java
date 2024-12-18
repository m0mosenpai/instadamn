package com.facebook.ui.emoji;

import X.C2I7;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class FacebookTypefaceEmojiSpan extends TypefaceEmojiSpan {
    public final int A00;
    public final Typeface A01;

    public FacebookTypefaceEmojiSpan(Typeface typeface) {
        super("FacebookEmoji");
        this.A01 = typeface;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FacebookTypefaceEmojiSpan facebookTypefaceEmojiSpan = (FacebookTypefaceEmojiSpan) obj;
            if (this.A00 != facebookTypefaceEmojiSpan.A00 || !C2I7.A00(this.A01, facebookTypefaceEmojiSpan.A01) || !C2I7.A00(getFamily(), facebookTypefaceEmojiSpan.getFamily())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00), getFamily()});
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(this.A01);
        textPaint.setAlpha(255);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setTypeface(this.A01);
        textPaint.setAlpha(255);
    }
}
