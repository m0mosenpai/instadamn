package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EU4 extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ C25671My A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public EU4(Context context, C1P1 c1p1, C25671My c25671My, UserSession userSession, User user, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A04 = user;
        this.A07 = z2;
        this.A03 = userSession;
        this.A02 = c25671My;
        this.A05 = z3;
        this.A01 = c1p1;
        this.A00 = context;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1220296083);
        this.A01.onFail(abstractC115105If);
        Object A00 = abstractC115105If.A00();
        if (A00 != null) {
            C9GR.A09(this.A00, ((EDR) A00).A02);
        }
        C0f9.A0A(1090669395, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(695706840);
        int A032 = C0f9.A03(-1522834943);
        this.A01.onSuccess(obj);
        C0f9.A0A(-1824488556, A032);
        C0f9.A0A(153591867, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(1229140944);
        int A032 = C0f9.A03(5302338);
        boolean z = this.A06;
        if (z) {
            this.A04.A14(true);
        }
        boolean z2 = this.A07;
        if (z2) {
            User user = this.A04;
            user.A15(true);
            C1OU.A04(this.A03).A0b(user, true);
        }
        this.A02.E4s(new C70063Cq(this.A04, z, z2, false, this.A05));
        C0f9.A0A(-2110622232, A032);
        C0f9.A0A(30042813, A03);
    }
}
