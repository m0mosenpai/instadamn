package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.BYc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25717BYc extends ClickableSpan {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C143556du A02;

    public C25717BYc(C41181vS c41181vS, C41551w4 c41551w4, C143556du c143556du) {
        this.A02 = c143556du;
        this.A01 = c41551w4;
        this.A00 = c41181vS;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC144586fe interfaceC144586fe = this.A02.A0E;
        if (interfaceC144586fe != null) {
            interfaceC144586fe.Dxh(this.A00, this.A01, C05F.A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setColor(-1);
    }
}
