package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.VAh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68091VAh extends AbstractC86353t7 {
    public final int A00;
    public final Object A01;

    public C68091VAh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DB6() {
        switch (this.A00) {
            case 0:
                C70861WiR c70861WiR = (C70861WiR) this.A01;
                UserSession userSession = c70861WiR.A0K;
                if (AbstractC2051496e.A00(userSession)) {
                    if (c70861WiR.A0L.BJg(userSession, c70861WiR.A0F)) {
                        C88W c88w = (C88W) c70861WiR.A0S.getValue();
                        c88w.A02(c88w.A01);
                        IgTextView igTextView = c70861WiR.A07;
                        if (igTextView == null) {
                            return;
                        }
                        igTextView.setVisibility(0);
                        return;
                    }
                    String str = c70861WiR.A0D;
                    if (str != null && str.length() != 0) {
                        return;
                    }
                }
                C8NX c8nx = c70861WiR.A0N;
                c8nx.Dof();
                c8nx.DBH();
                return;
            case 1:
                ((C70861WiR) this.A01).A0M.E4u(new Object());
                return;
            default:
                U79 u79 = (U79) this.A01;
                if (!u79.A01) {
                    U79.A00(XPI.FETCHING_CANCELLED, u79);
                }
                u79.A08.A00();
                return;
        }
    }
}
