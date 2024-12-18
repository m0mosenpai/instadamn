package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.G8y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36526G8y implements InterfaceC58152PqH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ DirectShareTarget A03;
    public final /* synthetic */ C34567FLb A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36526G8y(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectShareTarget directShareTarget, C34567FLb c34567FLb, String str) {
        this.A04 = c34567FLb;
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = directShareTarget;
        this.A05 = str;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        AbstractC34339FCh.A00(this.A00, this.A01, this.A02, "reply_modal", this.A05, AbstractC166987dD.A1J(this.A03));
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C34567FLb c34567FLb = this.A04;
        if (c34567FLb != null) {
            C42776IwE c42776IwE = c34567FLb.A02;
            C34709FQu c34709FQu = c42776IwE.A04;
            InterfaceC60442pS interfaceC60442pS = c42776IwE.A03;
            User user = c34567FLb.A01;
            C38321qM c38321qM = c34567FLb.A00;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34709FQu.A00, "reel_viewer_dashboard_reply_sent_impression");
            if (A0f.isSampled()) {
                AbstractC31175DnJ.A14(A0f, interfaceC60442pS);
                AbstractC31178DnM.A18(A0f, user.getId());
                A0f.A9K("target_user_type", AbstractC31171DnF.A0V(user.BJ8()));
                String A38 = c38321qM.A38();
                if (A38 != null) {
                    AbstractC25236BEt.A0r(A0f, A38);
                    A0f.Cht();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
