package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Dx1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31748Dx1 extends ClickableSpan {
    public final int A00;
    public final android.net.Uri A01;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        C12260kU.A0G(view.getContext(), this.A01);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A00);
        textPaint.setUnderlineText(true);
    }

    public C31748Dx1(android.net.Uri uri, int i) {
        this.A01 = uri;
        this.A00 = i;
    }
}
