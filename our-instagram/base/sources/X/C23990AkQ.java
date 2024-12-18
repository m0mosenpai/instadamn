package X;

import android.app.PendingIntent;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.AkQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23990AkQ implements InterfaceC37137GXy {
    public final /* synthetic */ AnonymousClass971 A00;

    @Override // X.InterfaceC37137GXy
    public final void D6V(String str) {
        C14360o3.A0B(str, 0);
        AnonymousClass971 anonymousClass971 = this.A00;
        UserSession userSession = anonymousClass971.A03;
        C14360o3.A0B(userSession, 0);
        C34457FGv c34457FGv = (C34457FGv) userSession.A01(C34457FGv.class, new C57518Pfs(userSession, 34));
        String A00 = AbstractC111324zv.A00(697);
        InterfaceC19610xo ARD = c34457FGv.A00.ARD();
        ARD.E7K(A00, str);
        ARD.apply();
        PendingIntent A002 = AnonymousClass971.A00(anonymousClass971);
        if (A002 != null) {
            anonymousClass971.A01.set(2, SystemClock.elapsedRealtime() + 86400000, A002);
        }
    }

    public C23990AkQ(AnonymousClass971 anonymousClass971) {
        this.A00 = anonymousClass971;
    }
}
