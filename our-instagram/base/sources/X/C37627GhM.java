package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GhM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37627GhM implements C38Y {
    public final C64352vu A00;
    public final C37546Gg2 A01;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.30a, java.lang.Object] */
    public C37627GhM(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C37546Gg2 c37546Gg2) {
        C30Y c30y;
        AbstractC167017dG.A1P(userSession, interfaceC60442pS);
        this.A01 = c37546Gg2;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36311985688675168L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36311985688871779L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 36311985688740705L);
        boolean A064 = C18U.A06(c06090Tz, userSession, 36311985688806242L);
        if (!A06 && !A062 && !A063 && !A064) {
            c30y = null;
        } else {
            c30y = new C30Y(userSession, new Object(), new HLH(userSession, A06, A062, A063, A064), interfaceC60442pS);
        }
        this.A00 = new C64352vu(null, c30y, null);
    }

    public final void A00(int i) {
        if (i >= 0) {
            AbstractC37552Gg8 abstractC37552Gg8 = this.A01.A0A;
            if (i < abstractC37552Gg8.A0B()) {
                this.A00.A00(null, abstractC37552Gg8.A0F(i), i, -1, false);
            }
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        A00(i);
    }
}
