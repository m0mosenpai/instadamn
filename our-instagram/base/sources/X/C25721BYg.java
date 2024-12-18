package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.BYg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25721BYg extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C141596ac A02;
    public final /* synthetic */ InterfaceC145536hC A03;

    public C25721BYg(C41181vS c41181vS, C141596ac c141596ac, InterfaceC145536hC interfaceC145536hC, int i) {
        this.A03 = interfaceC145536hC;
        this.A01 = c41181vS;
        this.A02 = c141596ac;
        this.A00 = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C6UV.A04(this.A01, this.A02, this.A03);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setColor(this.A00);
    }
}
