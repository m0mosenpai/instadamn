package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.G8n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36515G8n implements InterfaceC58152PqH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36515G8n(Activity activity, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = abstractC59962oe;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        LinkedHashMap A0p = AbstractC25233BEq.A0p("module", "", AbstractC166987dD.A1L("media_id", "0"));
        UserSession userSession = this.A02;
        AbstractC192798gL A05 = C192108fB.A05(userSession, "com.instagram.sensitivity.see_why_sheets.publisher_news_sheet_action", A0p);
        C32393EOu.A00(A05, this.A00, this.A01, userSession, 20);
        C1GJ.A03(A05);
    }
}
