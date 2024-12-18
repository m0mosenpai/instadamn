package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.MbY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50767MbY extends ClickableSpan {
    public final Context A00;
    public final android.net.Uri A01;
    public final UserSession A02;
    public final boolean A03;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        if (this.A03) {
            C12260kU.A0G(this.A00, this.A01);
            return;
        }
        Context context = view.getContext();
        AbstractC31171DnF.A1O(context);
        new C63397SjR(context, this.A02, C2Fb.A2D, this.A01.toString(), false).A0A();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(textPaint.linkColor);
    }

    public C50767MbY(Context context, android.net.Uri uri, UserSession userSession, boolean z) {
        AbstractC167027dH.A13(uri, userSession, context);
        this.A01 = uri;
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = z;
    }
}
