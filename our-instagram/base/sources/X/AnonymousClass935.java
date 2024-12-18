package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.935, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass935 extends C1P1 {
    public final UserSession A00;

    public AnonymousClass935(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public void A01(UserSession userSession) {
        C0f9.A0A(1190544719, C0f9.A03(-1015985287));
    }

    public void A02(UserSession userSession) {
        C0f9.A0A(-1247899293, C0f9.A03(314532127));
    }

    public void A03(UserSession userSession, Object obj) {
        C0f9.A0A(-1568807957, C0f9.A03(1228629006));
    }

    public void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        C0f9.A0A(-2143557801, C0f9.A03(1977259225));
    }

    public void A05(UserSession userSession, Object obj) {
        C0f9.A0A(498613034, C0f9.A03(856296959));
    }

    public void A06(UserSession userSession, Object obj) {
        C0f9.A0A(1169863108, C0f9.A03(-156659521));
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(-1745027284);
        C14360o3.A0B(abstractC115105If, 0);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = -1152209004;
        } else {
            A04(abstractC115105If, userSession);
            i = -2084011131;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public void onFailInBackground(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(1925650774);
        C14360o3.A0B(abstractC115105If, 0);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = -1380868499;
        } else {
            A03(userSession, abstractC115105If.A00());
            i = 159352682;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int i;
        int A03 = C0f9.A03(2005090589);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = -984666500;
        } else {
            A01(userSession);
            i = 300026860;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public void onStart() {
        int i;
        int A03 = C0f9.A03(302650433);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 1498363507;
        } else {
            A02(userSession);
            i = 137713425;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-1026555058);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 277279523;
        } else {
            A05(userSession, obj);
            i = -1767048004;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onSuccessInBackground(Object obj) {
        int i;
        int A03 = C0f9.A03(945073946);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 507181731;
        } else {
            A06(userSession, obj);
            i = -361366864;
        }
        C0f9.A0A(i, A03);
    }
}
