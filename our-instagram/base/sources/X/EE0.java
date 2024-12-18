package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EE0 extends AnonymousClass935 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE0(C1P1 c1p1, UserSession userSession, String str, String str2, int i, int i2) {
        super(userSession);
        this.A00 = i2;
        this.A01 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = c1p1;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-456102754);
            AbstractC167017dG.A1N(userSession, abstractC115105If);
            super.A04(abstractC115105If, userSession);
            AbstractC147806l5.A00(userSession).A0D(abstractC115105If, this.A03, this.A04, this.A01);
            ((C1P1) this.A02).onFail(abstractC115105If);
            i = -649439300;
        } else {
            A03 = C0f9.A03(-1598647015);
            AbstractC167017dG.A1N(userSession, abstractC115105If);
            super.A04(abstractC115105If, userSession);
            AbstractC147806l5.A00(userSession).A0C(abstractC115105If, this.A03, this.A04, this.A01);
            ((C1P1) this.A02).onFail(abstractC115105If);
            i = 515247561;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(229050439);
            int A032 = C0f9.A03(1328784042);
            AbstractC167017dG.A1N(userSession, obj);
            super.A05(userSession, obj);
            AbstractC147806l5.A00(userSession).A0D(null, this.A03, this.A04, this.A01);
            AbstractC31171DnF.A1R(this.A02, obj);
            C0f9.A0A(-87641602, A032);
            i = 1178609202;
        } else {
            A03 = C0f9.A03(-1029131522);
            int A033 = C0f9.A03(86612377);
            AbstractC167017dG.A1N(userSession, obj);
            super.A05(userSession, obj);
            AbstractC147806l5.A00(userSession).A0C(null, this.A03, this.A04, this.A01);
            AbstractC31171DnF.A1R(this.A02, obj);
            C0f9.A0A(1506789740, A033);
            i = 937321660;
        }
        C0f9.A0A(i, A03);
    }
}
