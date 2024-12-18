package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.MbS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50761MbS extends ClickableSpan {
    public final android.net.Uri A00;

    public C50761MbS(android.net.Uri uri) {
        C14360o3.A0B(uri, 1);
        this.A00 = uri;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        C12260kU.A0G(view.getContext(), this.A00);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(false);
    }
}
