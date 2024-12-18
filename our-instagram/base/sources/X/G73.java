package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class G73 implements C77U {
    public final /* synthetic */ C159277Cn A00;
    public final /* synthetic */ C159267Cm A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public G73(C159277Cn c159277Cn, C159267Cm c159267Cm, User user, String str) {
        this.A01 = c159267Cm;
        this.A02 = user;
        this.A03 = str;
        this.A00 = c159277Cn;
    }

    @Override // X.C77U
    public final void DNA(boolean z) {
        ViewStub A07;
        if (z) {
            UserSession userSession = this.A01.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 36319772463341233L)) {
                try {
                    AnonymousClass189.A00(userSession).A01(this.A02, true, false);
                } catch (C90093zq unused) {
                    C0w9.A03("userId_missing_exception", AnonymousClass001.A0g("Received user ", this.A02.getUsername(), " is missing a userId"));
                }
            }
            String str = this.A03;
            ArrayList A1N = AbstractC16960so.A1N(this.A02.getId());
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "direct_kindness_reminder");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1F(A0f, str);
                A0f.AAk("recipient_ids", A1N);
                A0f.Cht();
            }
            C159277Cn c159277Cn = this.A00;
            View view = c159277Cn.A01;
            if (view.findViewById(R.id.nux_banner) == null && (A07 = AbstractC31171DnF.A07(view, R.id.nux_banner_viewstub)) != null) {
                View inflate = A07.inflate();
                TextView A0e = AbstractC166987dD.A0e(inflate, R.id.title);
                TextView A0e2 = AbstractC166987dD.A0e(inflate, R.id.message);
                Context context = c159277Cn.A00;
                AbstractC31173DnH.A12(context, A0e, 2131960670);
                A0e.setFocusableInTouchMode(true);
                AbstractC25227BEk.A11(A0e2);
                A0e2.setText(F7B.A00(context, c159277Cn.A02));
                View findViewById = inflate.findViewById(R.id.dismiss_button);
                InterfaceC148366m6 interfaceC148366m6 = c159277Cn.A03;
                FpQ.A01(findViewById, 9, interfaceC148366m6, inflate);
                inflate.setBackgroundColor(c159277Cn.A05.A02);
                AbstractC31176DnK.A1E(inflate, R.id.bottom_divider, 8);
                c159277Cn.A04.A00.A00 = C05F.A0u;
                interfaceC148366m6.DWN();
            } else {
                return;
            }
        }
        C006802i.A0p.markerEnd(190451680, (short) 2);
    }
}
