package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.BYh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25722BYh extends ClickableSpan {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C77143d0 A01;
    public final /* synthetic */ InterfaceC75453aC A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ User A04;

    public C25722BYh(C38321qM c38321qM, C77143d0 c77143d0, InterfaceC75453aC interfaceC75453aC, C75113Zb c75113Zb, User user) {
        this.A02 = interfaceC75453aC;
        this.A00 = c38321qM;
        this.A03 = c75113Zb;
        this.A04 = user;
        this.A01 = c77143d0;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC75453aC interfaceC75453aC = this.A02;
        C38321qM c38321qM = this.A00;
        C75113Zb c75113Zb = this.A03;
        interfaceC75453aC.D4g(c38321qM, c75113Zb, this.A04.getId(), c75113Zb.getPosition(), false);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        textPaint.setColor(this.A01.A09);
    }
}
