package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62072s8 extends AbstractC62022s3 {
    public boolean A00;
    public final UserSession A01;

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgP(C1I1 c1i1, C74283Vj c74283Vj) {
        C14360o3.A0B(c74283Vj, 1);
        if (!this.A00) {
            this.A00 = true;
            if (C36971nu.A04 != null) {
                C3XB c3xb = c74283Vj.A07;
                if (c3xb == null) {
                    c3xb = C3XB.A02;
                }
                C3XD c3xd = c3xb.A01;
                if (c3xd != null) {
                    AbstractC77423dS.A00().A00 = c3xd.A00;
                }
                UserSession userSession = this.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36327516289383045L)) {
                    if (C18U.A06(c06090Tz, userSession, 36327516289514119L)) {
                        InterfaceC14020nS A00 = C14120nc.A00();
                        C14360o3.A07(A00);
                        A00.ATO(new HJI(this));
                        return;
                    }
                    AbstractC77423dS.A00().A01(userSession);
                }
            }
        }
    }

    public C62072s8(UserSession userSession) {
        this.A01 = userSession;
    }
}
