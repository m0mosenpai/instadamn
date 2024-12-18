package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BkL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26314BkL extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final UserSession A01;

    public C26314BkL(C51722Yv c51722Yv, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        long j;
        C14360o3.A0B(c76223bS, 0);
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36318943534848806L)) {
            return null;
        }
        if (AbstractC72723Nt.A00(AbstractC77363dM.A00(c76223bS))) {
            j = 37163368464908570L;
        } else {
            j = 37163368464843033L;
        }
        int A00 = CJ3.A00(C18U.A00(c06090Tz, userSession, j));
        C51722Yv c51722Yv = this.A00;
        Integer num = C05F.A00;
        C9CT A0m = AbstractC25225BEi.A0m(num, 100.0f, 0);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(c51722Yv, A0m);
        Integer num2 = C05F.A01;
        return AbstractC76963ci.A09(c76223bS, C9CV.A00(C9CV.A00(C9CV.A00(AbstractC25230BEn.A0d(A0h, num2, 100.0f, 0), num2, false, 4), C05F.A0u, false, 4), num, AbstractC25225BEi.A0i(A00), 4));
    }
}
