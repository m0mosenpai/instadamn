package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BYZ extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        AbstractC166987dD.A1N(this.A00, textPaint, R.color.design_dark_default_color_on_background);
    }

    public BYZ(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A01.invoke();
    }
}
