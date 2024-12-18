package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.JjV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44392JjV extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C77613dl A01;
    public final /* synthetic */ C76743cM A02;

    public C44392JjV(C77613dl c77613dl, C76743cM c76743cM, int i) {
        this.A01 = c77613dl;
        this.A02 = c76743cM;
        this.A00 = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C77613dl c77613dl = this.A01;
        C76743cM c76743cM = this.A02;
        C76683cG c76683cG = c77613dl.A00;
        c76683cG.A01.D4j(c76743cM.A02.A01);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setColor(this.A00);
    }
}
