package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Gsm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38303Gsm extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38681GzM A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C77143d0 A03;
    public final /* synthetic */ InterfaceC75453aC A04;
    public final /* synthetic */ C75113Zb A05;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(this.A03.A04);
    }

    public C38303Gsm(C38681GzM c38681GzM, UserSession userSession, C77143d0 c77143d0, InterfaceC75453aC interfaceC75453aC, C75113Zb c75113Zb, int i) {
        this.A01 = c38681GzM;
        this.A04 = interfaceC75453aC;
        this.A05 = c75113Zb;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = c77143d0;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C38321qM A00 = ((C76733cL) this.A01.A03).A00();
        InterfaceC75453aC interfaceC75453aC = this.A04;
        C75113Zb c75113Zb = this.A05;
        UserSession userSession = this.A02;
        int i = this.A00;
        User A2E = A00.A2E(userSession);
        if (A2E != null) {
            interfaceC75453aC.D4g(A00, c75113Zb, A2E.getId(), i, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
