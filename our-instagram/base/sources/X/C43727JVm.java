package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JVm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43727JVm implements MQ0 {
    public final /* synthetic */ C43731JVq A00;

    @Override // X.MQ0
    public final String AUq(UserSession userSession) {
        return "thread is not friends and family";
    }

    public C43727JVm(C43731JVq c43731JVq) {
        this.A00 = c43731JVq;
    }

    @Override // X.MQ0
    public final /* bridge */ /* synthetic */ boolean AT8(UserSession userSession, Object obj) {
        String str;
        C43732JVr c43732JVr = (C43732JVr) obj;
        boolean A1a = AbstractC167017dG.A1a(c43732JVr, userSession);
        if (!C18U.A06(C06090Tz.A05, userSession, 36320326514844022L) && c43732JVr.A03 != C05F.A01) {
            C2ED c2ed = c43732JVr.A01;
            if (c2ed != null || ((str = c43732JVr.A06) != null && (c2ed = (C2ED) this.A00.A02.invoke(userSession, str)) != null)) {
                if (c2ed.CZe() || (c2ed.CVQ() && c2ed.C7g() == 47)) {
                    return true;
                }
                return false;
            }
            return A1a;
        }
        return A1a;
    }
}
