package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.JjW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44393JjW extends ClickableSpan {
    public final /* synthetic */ C115025Hx A00;
    public final /* synthetic */ C115015Hw A01;
    public final /* synthetic */ C75113Zb A02;

    public C44393JjW(C115025Hx c115025Hx, C115015Hw c115015Hw, C75113Zb c75113Zb) {
        this.A00 = c115025Hx;
        this.A01 = c115015Hw;
        this.A02 = c75113Zb;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C115025Hx c115025Hx = this.A00;
        C115015Hw c115015Hw = this.A01;
        c115025Hx.A00.A01.D3Z(c115015Hw.A00, this.A02);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
    }
}
