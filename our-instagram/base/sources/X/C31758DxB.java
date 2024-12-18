package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.DxB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31758DxB extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EnumC33444EqG A03;
    public final /* synthetic */ String A04;

    public C31758DxB(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33444EqG enumC33444EqG, String str) {
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = enumC33444EqG;
        this.A00 = context;
        this.A04 = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC11380iw interfaceC11380iw = this.A01;
        UserSession userSession = this.A02;
        C147036jf c147036jf = new C147036jf(interfaceC11380iw, userSession);
        String obj = this.A03.toString();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147036jf.A02, "ci_modal_learn_more_tapped");
        if (obj == null) {
            obj = c147036jf.A04;
        }
        AbstractC31175DnJ.A17(A0f, obj);
        C35133Fea c35133Fea = SimpleWebViewActivity.A02;
        Context context = this.A00;
        C35133Fea.A01(context, userSession, c35133Fea, AbstractC31171DnF.A0R(AbstractC63260SgI.A01(context, "https://help.instagram.com/227486307449481")), this.A04);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
    }
}
