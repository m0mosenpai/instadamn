package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.BYi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25723BYi extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C41551w4 A03;
    public final /* synthetic */ C141596ac A04;
    public final /* synthetic */ InterfaceC145536hC A05;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        C71313Hs.A00(this.A01).A0B(view, new String[0]);
        this.A05.DXi(this.A02, this.A03, this.A04);
    }

    public C25723BYi(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, InterfaceC145536hC interfaceC145536hC, int i) {
        this.A01 = userSession;
        this.A05 = interfaceC145536hC;
        this.A03 = c41551w4;
        this.A02 = c41181vS;
        this.A04 = c141596ac;
        this.A00 = i;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setColor(this.A00);
    }
}
