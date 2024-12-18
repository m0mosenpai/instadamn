package X;

import android.text.TextPaint;

/* loaded from: classes10.dex */
public final class Q69 extends AbstractC63584Spr {
    public final TextPaint A00;
    public final CharSequence A01;

    @Override // X.AbstractC63584Spr
    public final int A00(int i) {
        TextPaint textPaint = this.A00;
        CharSequence charSequence = this.A01;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // X.AbstractC63584Spr
    public final int A01(int i) {
        TextPaint textPaint = this.A00;
        CharSequence charSequence = this.A01;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    public Q69(CharSequence charSequence, TextPaint textPaint) {
        this.A01 = charSequence;
        this.A00 = textPaint;
    }
}
