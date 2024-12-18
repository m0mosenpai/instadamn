package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.BYj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25724BYj extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C41551w4 A03;
    public final /* synthetic */ C3G2 A04;
    public final /* synthetic */ C141596ac A05;
    public final /* synthetic */ C140436Wx A06;
    public final /* synthetic */ InterfaceC145536hC A07;
    public final /* synthetic */ C139576Tm A08;

    public C25724BYj(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C3G2 c3g2, C141596ac c141596ac, C140436Wx c140436Wx, InterfaceC145536hC interfaceC145536hC, C139576Tm c139576Tm, int i) {
        this.A01 = userSession;
        this.A08 = c139576Tm;
        this.A07 = interfaceC145536hC;
        this.A03 = c41551w4;
        this.A05 = c141596ac;
        this.A02 = c41181vS;
        this.A04 = c3g2;
        this.A06 = c140436Wx;
        this.A00 = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        UserSession userSession = this.A01;
        C139576Tm c139576Tm = this.A08;
        InterfaceC145536hC interfaceC145536hC = this.A07;
        C6UV.A02(userSession, this.A02, this.A03, this.A04, this.A05, this.A06, interfaceC145536hC, c139576Tm);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setColor(this.A00);
    }
}
