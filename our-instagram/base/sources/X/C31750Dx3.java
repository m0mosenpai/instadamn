package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Dx3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31750Dx3 extends ClickableSpan {
    public final /* synthetic */ EnumC223459tc A00;
    public final /* synthetic */ C7Vn A01;
    public final /* synthetic */ boolean A02;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public C31750Dx3(EnumC223459tc enumC223459tc, C7Vn c7Vn, boolean z) {
        this.A01 = c7Vn;
        this.A00 = enumC223459tc;
        this.A02 = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A01.A01(this.A00, null, null, this.A02);
    }
}
