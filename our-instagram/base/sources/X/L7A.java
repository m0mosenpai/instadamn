package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7A {
    public boolean A00;
    public final C006802i A01;
    public final UserSession A02;

    public final void A00(AbstractC46415Kgb abstractC46415Kgb) {
        C006802i c006802i;
        int i;
        short s;
        if (this.A00) {
            if (abstractC46415Kgb instanceof KOM) {
                c006802i = this.A01;
                i = 1064965959;
                s = 3;
            } else if (abstractC46415Kgb instanceof KON) {
                c006802i = this.A01;
                i = 1064965959;
                s = 4;
            } else {
                throw B4Z.A00();
            }
            c006802i.markerEnd(i, s);
            this.A00 = false;
        }
    }

    public L7A(C006802i c006802i, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, c006802i);
        this.A02 = userSession;
        this.A01 = c006802i;
    }
}
