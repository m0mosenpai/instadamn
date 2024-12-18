package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lu6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49493Lu6 implements InterfaceC58152PqH {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C49493Lu6(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        String str;
        String str2;
        int i = this.A00;
        Object obj = this.A03;
        if (i != 0) {
            C37716Gir c37716Gir = (C37716Gir) obj;
            c37716Gir.A03.onBackPressed();
            InterfaceC60442pS interfaceC60442pS = c37716Gir.A08;
            UserSession userSession = c37716Gir.A06;
            C38321qM c38321qM = ((C120985dq) this.A02).A02;
            C37604Ggz c37604Ggz = c37716Gir.A09;
            int i2 = this.A01;
            AbstractC167017dG.A1N(interfaceC60442pS, userSession);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, c37604Ggz, 3), "instagram_clips_end_of_feed_toast_tap");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                A0f.A9K("media_index", AbstractC31171DnF.A0V(i2));
                A0f.AAP("viewer_session_id", c37604Ggz.CGJ());
                String str3 = null;
                if (c38321qM != null) {
                    str = c38321qM.getId();
                } else {
                    str = null;
                }
                A0f.AAP("media_compound_key", str);
                if (c38321qM != null) {
                    str2 = c38321qM.A0C.getMezqlToken();
                } else {
                    str2 = null;
                }
                A0f.AAP(AbstractC111324zv.A00(125), str2);
                if (c38321qM != null) {
                    str3 = c38321qM.A0C.getLoggingInfoToken();
                }
                A0f.AAP("ranking_info_token", str3);
                AbstractC25233BEq.A17(A0f, AbstractC111324zv.A00(183), c37604Ggz.Amq());
                A0f.Cht();
                return;
            }
            return;
        }
        LF1 lf1 = (LF1) obj;
        KPH kph = lf1.A03;
        kph.A05("RESTORE_REENGAGE_CTA_TAP");
        kph.A01();
        lf1.A04.A02((Activity) this.A02, AbstractC166987dD.A0b(), EnumC46149Kbn.A02, C05F.A01, Integer.valueOf(this.A01));
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        if (this.A00 == 0) {
            ((LF1) this.A03).A03.A01();
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        if (this.A00 == 0) {
            KPH kph = ((LF1) this.A03).A03;
            kph.A03();
            kph.A05("RESTORE_REENGAGE_TOAST_IMPRESSION");
            kph.A06("INTERVAL", this.A01);
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
