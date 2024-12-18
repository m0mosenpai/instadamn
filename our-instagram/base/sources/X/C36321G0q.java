package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Date;

/* renamed from: X.G0q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36321G0q implements InterfaceC58115Ppe {
    public final /* synthetic */ C35005Fbc A00;
    public final /* synthetic */ C189478aR A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ Integer A03;

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
    }

    public C36321G0q(C35005Fbc c35005Fbc, C189478aR c189478aR, DirectThreadKey directThreadKey, Integer num) {
        this.A00 = c35005Fbc;
        this.A02 = directThreadKey;
        this.A01 = c189478aR;
        this.A03 = num;
    }

    @Override // X.InterfaceC58115Ppe
    public final void D9K(Date date) {
        this.A01.A0Q(AbstractC167007dF.A1W(date));
    }

    @Override // X.InterfaceC58115Ppe
    public final void DBG(Date date) {
        if (date != null) {
            C35005Fbc c35005Fbc = this.A00;
            UserSession userSession = c35005Fbc.A04;
            InterfaceC11380iw interfaceC11380iw = c35005Fbc.A03;
            DirectThreadKey directThreadKey = this.A02;
            AbstractC34778FUc.A01(interfaceC11380iw, userSession, directThreadKey, "reminder_option_done_tap", AbstractC166987dD.A1G());
            this.A01.A0L(null);
            C35005Fbc.A00(c35005Fbc, directThreadKey, this.A03, date.getTime());
        }
    }
}
