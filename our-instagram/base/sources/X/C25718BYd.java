package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.BYd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25718BYd extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC145536hC A02;

    public C25718BYd(C41181vS c41181vS, InterfaceC145536hC interfaceC145536hC, int i) {
        this.A02 = interfaceC145536hC;
        this.A01 = c41181vS;
        this.A00 = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A02.CvF(this.A01);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setColor(this.A00);
    }
}
