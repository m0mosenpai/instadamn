package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.6Rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139106Rr extends ClickableSpan {
    public final /* synthetic */ InterfaceC139096Rq A00;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setFakeBoldText(false);
    }

    public C139106Rr(InterfaceC139096Rq interfaceC139096Rq) {
        this.A00 = interfaceC139096Rq;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A00.DF3();
    }
}
