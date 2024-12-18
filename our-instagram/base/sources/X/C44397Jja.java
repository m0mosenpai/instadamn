package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jja, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44397Jja extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC75453aC A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ String A04;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        UserSession userSession = this.A01;
        C71313Hs.A00(userSession).A0B(view, new String[0]);
        C38321qM A01 = C1DX.A03.A01(userSession, "MediaHeaderHelper", this.A04);
        if (A01 != null) {
            this.A02.D3f(A01, this.A03, this.A00);
        }
    }

    public C44397Jja(UserSession userSession, InterfaceC75453aC interfaceC75453aC, C75113Zb c75113Zb, String str, int i) {
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = interfaceC75453aC;
        this.A03 = c75113Zb;
        this.A00 = i;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setFakeBoldText(true);
    }
}
