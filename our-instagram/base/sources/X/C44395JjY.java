package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.JjY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44395JjY extends ClickableSpan {
    public final /* synthetic */ C77143d0 A00;
    public final /* synthetic */ C77613dl A01;
    public final /* synthetic */ C76743cM A02;
    public final /* synthetic */ C75113Zb A03;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(this.A00.A04);
    }

    public C44395JjY(C77143d0 c77143d0, C77613dl c77613dl, C76743cM c76743cM, C75113Zb c75113Zb) {
        this.A01 = c77613dl;
        this.A02 = c76743cM;
        this.A03 = c75113Zb;
        this.A00 = c77143d0;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C77613dl c77613dl = this.A01;
        C76743cM c76743cM = this.A02;
        c77613dl.A00.A03(c76743cM.A02.A01, c76743cM.A04, this.A03.getPosition());
    }
}
