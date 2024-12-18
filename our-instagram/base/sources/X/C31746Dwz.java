package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Dwz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31746Dwz extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        AbstractC166987dD.A1N(this.A00, textPaint, R.color.igds_secondary_text);
    }

    public C31746Dwz(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A01.invoke();
    }
}
