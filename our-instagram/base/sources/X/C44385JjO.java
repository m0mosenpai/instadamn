package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.JjO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44385JjO extends ClickableSpan {
    public final int A00;
    public final View.OnClickListener A01;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        this.A01.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setColor(this.A00);
    }

    public C44385JjO(View.OnClickListener onClickListener, int i) {
        this.A01 = onClickListener;
        this.A00 = i;
    }
}
