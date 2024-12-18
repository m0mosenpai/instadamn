package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bmi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26461Bmi extends AbstractC51572Yf {
    public final long A00;
    public final long A01;
    public final C37669Gi2 A02;
    public final UserSession A03;
    public final InterfaceC31159Dn3 A04;
    public final InterfaceC31019DkI A05;

    public C26461Bmi(C37669Gi2 c37669Gi2, UserSession userSession, InterfaceC31159Dn3 interfaceC31159Dn3, InterfaceC31019DkI interfaceC31019DkI, long j, long j2) {
        C14360o3.A0B(c37669Gi2, 2);
        AbstractC167017dG.A1T(interfaceC31159Dn3, interfaceC31019DkI);
        this.A03 = userSession;
        this.A02 = c37669Gi2;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = interfaceC31159Dn3;
        this.A05 = interfaceC31019DkI;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C37669Gi2 c37669Gi2 = this.A02;
        if (C37669Gi2.A00(c37669Gi2, 3)) {
            return new C26462Bmj(c37669Gi2, this.A03, this.A04, this.A05, this.A00, this.A01);
        }
        throw B4Z.A00();
    }
}
