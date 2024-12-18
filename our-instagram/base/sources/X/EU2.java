package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EU2 extends C1P1 {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ C25671My A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public EU2(C1P1 c1p1, C25671My c25671My, UserSession userSession, User user, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = user;
        this.A05 = z2;
        this.A02 = userSession;
        this.A01 = c25671My;
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-154058152);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(-367739987, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1078675065);
        int A032 = C0f9.A03(-2118254998);
        this.A00.onSuccess(obj);
        C0f9.A0A(-908905883, A032);
        C0f9.A0A(1077100547, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-84272435);
        int A032 = C0f9.A03(-794947327);
        boolean z = this.A04;
        if (z) {
            this.A03.A14(false);
        }
        boolean z2 = this.A05;
        if (z2) {
            User user = this.A03;
            user.A15(false);
            C1OU.A04(this.A02).A0b(user, false);
        }
        this.A01.E4s(new C70063Cq(this.A03, z, z2, false, false));
        C0f9.A0A(1546081850, A032);
        C0f9.A0A(448065224, A03);
    }
}
