package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Gsl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38302Gsl extends ClickableSpan {
    public final /* synthetic */ C71313Hs A00;
    public final /* synthetic */ C89313yX A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        this.A00.A0B(view, new String[0]);
        InterfaceC89303yW interfaceC89303yW = this.A01.A01;
        C38321qM c38321qM = this.A02;
        C75113Zb c75113Zb = this.A03;
        interfaceC89303yW.D3f(c38321qM, c75113Zb, c75113Zb.getPosition());
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public C38302Gsl(C71313Hs c71313Hs, C89313yX c89313yX, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A00 = c71313Hs;
        this.A01 = c89313yX;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
    }
}
