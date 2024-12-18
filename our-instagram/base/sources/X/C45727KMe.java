package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KMe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45727KMe extends AbstractC18280vF {
    public final /* synthetic */ C2FK A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45727KMe(C2FK c2fk) {
        super("DirectInboxStateStorePreload", 1919043763);
        this.A00 = c2fk;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        boolean A1Z;
        AbstractC46972Dl abstractC46972Dl;
        UserSession userSession = this.A00.A02;
        C44013Jd0 c44013Jd0 = (C44013Jd0) userSession.A01(C44013Jd0.class, new C37013GSs(userSession, 27));
        synchronized (c44013Jd0) {
            A1Z = AbstractC25229BEm.A1Z(c44013Jd0.A01);
        }
        if (A1Z) {
            c44013Jd0.A00 = EnumC44014Jd1.A03;
            UserSession userSession2 = c44013Jd0.A02;
            boolean A05 = C2E8.A05(userSession2);
            if (C2E8.A07(userSession2)) {
                if (C2E8.A00(userSession2) && !C18U.A06(C06090Tz.A05, userSession2, 36315365827021990L)) {
                    abstractC46972Dl = C47072Dv.A00;
                } else {
                    abstractC46972Dl = C47032Dr.A00;
                }
            } else {
                abstractC46972Dl = C4I1.A00;
            }
            C2054597s c2054597s = C2054597s.A00;
            C16930sl c16930sl = C16930sl.A00;
            C43929Jbe A00 = AbstractC43930Jbf.A00(userSession2, c2054597s.createWithAdditionalCapabilities(c16930sl, c16930sl));
            C41951wl A002 = C41951wl.A00(userSession2);
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            C4I3 c4i3 = C4I3.A03;
            L1R l1r = new L1R(new C43787JYa(context, AbstractC31180DnO.A0J(userSession2, C4HC.A00), userSession2, new JS8(context, userSession2, A00, A002), abstractC46972Dl, AbstractC28761aE.A00(userSession2), c4i3, C41951wl.A00(userSession2), A05, false, false), abstractC46972Dl, A05);
            synchronized (c44013Jd0) {
                c44013Jd0.A01 = l1r;
            }
            l1r.A00.A09.start();
        }
    }
}
