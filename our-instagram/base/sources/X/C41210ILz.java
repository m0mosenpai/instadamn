package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ILz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41210ILz {
    public final Context A00;
    public final C40991IDm A01;
    public final C1P1 A02 = new C39030HGg(this, 29);
    public final UserSession A03;

    public C41210ILz(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = new C40991IDm(interfaceC11380iw, userSession);
    }

    public final void A00() {
        long A06 = AbstractC31177DnL.A06();
        long j = 172800 + A06;
        UserSession userSession = this.A03;
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(A06);
        C1P1 c1p1 = this.A02;
        C14360o3.A0B(c1p1, 6);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B(MSV.A00(124));
        A0c.A0R(N3F.class, C54911OQi.class);
        A0c.A9s("is_enabled", "true");
        if (valueOf != null) {
            A0c.A0D(MSV.A00(556), (int) j);
        }
        if (valueOf2 != null) {
            A0c.A0D("start_date", (int) A06);
        }
        C1ON A0N = A0c.A0N();
        A0N.A00 = c1p1;
        C1GJ.A03(A0N);
    }
}
