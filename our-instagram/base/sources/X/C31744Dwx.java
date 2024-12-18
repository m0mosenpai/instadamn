package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Dwx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31744Dwx extends ClickableSpan {
    public final /* synthetic */ View.OnClickListener A00;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        this.A00.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setColor(-1);
        textPaint.setUnderlineText(false);
    }

    public C31744Dwx(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }
}
