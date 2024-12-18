package X;

import android.text.TextPaint;
import android.view.View;

/* renamed from: X.K4v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45342K4v extends C6WB {
    public final InterfaceC16820sZ A00;

    public C45342K4v(InterfaceC16820sZ interfaceC16820sZ) {
        super.A00 = null;
        this.A01 = null;
        this.A00 = interfaceC16820sZ;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A00.invoke();
    }
}
