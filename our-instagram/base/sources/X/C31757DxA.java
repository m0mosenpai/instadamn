package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DxA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31757DxA extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C72q A03;
    public final /* synthetic */ User A04;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A06(context));
    }

    public C31757DxA(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C72q c72q, User user) {
        this.A03 = c72q;
        this.A04 = user;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C72q c72q = this.A03;
        if (c72q != null) {
            GBV A02 = c72q.A02();
            User user = this.A04;
            A02.A0E(user, false);
            UserSession userSession = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            String str = userSession.userId;
            String pkId = user.A03.getPkId();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, str, 2), "instagram_open_to_collab_surface_profile_badge_tap");
            if (A0f.isSampled()) {
                A0f.A9K(AbstractC111324zv.A00(343), AbstractC003100w.A0k(10, str));
                A0f.A9K(AbstractC111324zv.A00(1327), AbstractC31177DnL.A0Z(pkId));
                A0f.Cht();
            }
        }
    }
}
