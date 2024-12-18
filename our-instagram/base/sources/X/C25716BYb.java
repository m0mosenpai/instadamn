package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.BYb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25716BYb extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        Context context = this.A00;
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A06(context));
    }

    public C25716BYb(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y = AbstractC25228BEl.A0y(this.A00, this.A01, C2Fb.A1B, "https://help.instagram.com/517073653436611?helpref=faq_content");
        A0y.A0S = this.A02.getModuleName();
        A0y.A0A();
    }
}
