package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HaB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39371HaB extends C32I implements C32K {
    public final UserSession A00;

    public C39371HaB(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31F c31f, C1PY c1py, C1PK c1pk) {
        super(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk, false);
        this.A00 = userSession;
    }

    @Override // X.C32J
    public final boolean A0C() {
        UserSession userSession = this.A00;
        if (AbstractC61652rS.A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36312866157233511L)) {
            return true;
        }
        return false;
    }

    @Override // X.C32J
    public final boolean A0D() {
        UserSession userSession = this.A00;
        if (AbstractC61652rS.A05(userSession) && C18U.A06(C06090Tz.A05, userSession, 36312866157233511L)) {
            return true;
        }
        return false;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0G(Object obj, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        if (C32V.A01(userSession) && z && C18U.A06(C06090Tz.A05, userSession, 36319742399291012L)) {
            return true;
        }
        return false;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
        return AbstractC16960so.A1N(AbstractC37301Gc2.A0J(obj).A0K);
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0F(Object obj) {
        return C3YS.A00(this.A00).A05(AbstractC37301Gc2.A0J(obj).A0K);
    }

    @Override // X.C32I
    public final /* bridge */ /* synthetic */ C671831j A0H(Object obj) {
        return (C671831j) C37469Gen.A00(obj);
    }
}
