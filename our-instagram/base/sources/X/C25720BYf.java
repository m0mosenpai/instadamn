package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.BYf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25720BYf extends ClickableSpan {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C1NB A02;
    public final /* synthetic */ C143556du A03;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        boolean z = false;
        textPaint.setUnderlineText(false);
        textPaint.setColor(-1);
        if (this.A02.CBs() == C05F.A1F) {
            z = true;
        }
        textPaint.setFakeBoldText(z);
    }

    public C25720BYf(C41181vS c41181vS, C41551w4 c41551w4, C1NB c1nb, C143556du c143556du) {
        this.A03 = c143556du;
        this.A01 = c41551w4;
        this.A00 = c41181vS;
        this.A02 = c1nb;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC144586fe interfaceC144586fe = this.A03.A0E;
        if (interfaceC144586fe != null) {
            interfaceC144586fe.Ddw(null, this.A00, this.A01, C05F.A00, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
