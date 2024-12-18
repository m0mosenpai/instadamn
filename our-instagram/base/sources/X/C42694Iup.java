package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Iup, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42694Iup implements InterfaceC58152PqH {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ C3MP A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42694Iup(C38321qM c38321qM, User user, C3MP c3mp) {
        this.A02 = c3mp;
        this.A00 = c38321qM;
        this.A01 = user;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C3MP c3mp = this.A02;
        UserSession userSession = c3mp.A01;
        AbstractC59962oe abstractC59962oe = c3mp.A00;
        C38321qM c38321qM = this.A00;
        String id = c38321qM.getId();
        if (id != null) {
            String id2 = this.A01.getId();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe, userSession), "external_share_screenshot_prompt_reshare_cta_click");
            if (A0f.isSampled()) {
                A0f.AAP("media_id", id);
                A0f.A9K("media_owner_id", AbstractC166997dE.A0j(id2));
                AbstractC31175DnJ.A14(A0f, abstractC59962oe);
                A0f.Cht();
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36314837547027284L)) {
                AbstractC31510Dsu.A0V(abstractC59962oe, userSession, c38321qM, c3mp.A02, null, AbstractC111324zv.A00(412));
                return;
            } else {
                c3mp.A03.DlF(c38321qM, AbstractC111324zv.A00(412));
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C3MP c3mp = this.A02;
        UserSession userSession = c3mp.A01;
        AbstractC59962oe abstractC59962oe = c3mp.A00;
        String id = this.A00.getId();
        if (id != null) {
            String id2 = this.A01.getId();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe, userSession), "external_share_screenshot_prompt_reshare_toast_impression");
            if (A0f.isSampled()) {
                A0f.AAP("media_id", id);
                A0f.A9K("media_owner_id", AbstractC166997dE.A0j(id2));
                AbstractC31175DnJ.A14(A0f, abstractC59962oe);
                A0f.Cht();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
