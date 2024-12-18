package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Gsj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38300Gsj extends ClickableSpan {
    public final /* synthetic */ C37986GnW A00;
    public final /* synthetic */ boolean A01;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public C38300Gsj(C37986GnW c37986GnW, boolean z) {
        this.A00 = c37986GnW;
        this.A01 = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C37986GnW.A03(this.A00, this.A01);
    }
}
