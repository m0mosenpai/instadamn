package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dx8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31755Dx8 extends ClickableSpan {
    public final Context A00;
    public final UserSession A01;
    public final C2Fb A02;
    public final String A03;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A06(context));
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC31177DnL.A0u(this.A00, this.A01, this.A02, this.A03);
    }

    public C31755Dx8(Context context, UserSession userSession, C2Fb c2Fb, String str) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = c2Fb;
    }
}
