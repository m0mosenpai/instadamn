package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.JjP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44386JjP extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C77613dl A01;

    public C44386JjP(C77613dl c77613dl, int i) {
        this.A01 = c77613dl;
        this.A00 = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A01.A00.A01.D4D();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setColor(this.A00);
    }
}
