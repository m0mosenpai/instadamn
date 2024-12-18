package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dx9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31756Dx9 extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A09(context));
    }

    public C31756Dx9(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = user;
        this.A00 = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        User user = this.A03;
        C1571673v.A06(interfaceC11380iw, userSession, AbstractC31179DnN.A0R(userSession, user), "tap_business_social_proof_badge", userSession.userId, "user_profile_header");
        AbstractC34021F0a.A00(this.A00, user.A1x());
    }
}
