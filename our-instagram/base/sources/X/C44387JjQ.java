package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.JjQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44387JjQ extends ClickableSpan {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C76Z A01;
    public final /* synthetic */ String A02;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.A01.A03.A04.A04);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }

    public C44387JjQ(C76Z c76z, String str, long j) {
        this.A01 = c76z;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A01.A02.CqY(this.A02, this.A00);
    }
}
