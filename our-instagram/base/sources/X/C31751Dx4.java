package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dx4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31751Dx4 extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C72q A01;
    public final /* synthetic */ User A02;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A09(context));
    }

    public C31751Dx4(Context context, C72q c72q, User user) {
        this.A01 = c72q;
        this.A02 = user;
        this.A00 = context;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.1oD] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GBV A02;
        C72q c72q = this.A01;
        if (c72q != null && (A02 = c72q.A02()) != null) {
            User user = this.A02;
            if (C37161oE.A00 == null) {
                C37161oE.A00 = new Object();
            }
            InterfaceC37151oD A00 = C37161oE.A00();
            UserSession userSession = A02.A02;
            A00.Eko(A02.A04, userSession, user, "label_view", false);
            C37161oE.A00();
            OHc oHc = (OHc) userSession.A01(OHc.class, new C57517Pfr(userSession, 43));
            long parseLong = Long.parseLong(userSession.userId);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(oHc.A00, MSV.A00(476));
            A0f.A9K("ig_userid", Long.valueOf(parseLong));
            A0f.AAP("product", "profile");
            AbstractC31177DnL.A1C(A0f, "diversity_info_label");
            A0f.AAP("event_source", DexOptimization.OPT_KEY_CLIENT);
            A0f.Cht();
        }
    }
}
