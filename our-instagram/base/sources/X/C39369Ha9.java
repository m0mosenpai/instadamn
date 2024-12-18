package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Ha9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39369Ha9 extends C32J {
    public final UserSession A00;
    public final C3YT A01;

    @Override // X.C32J
    public final boolean A0C() {
        UserSession userSession = this.A00;
        if (AbstractC61652rS.A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36312866158019955L)) {
            return true;
        }
        return false;
    }

    @Override // X.C32J
    public final boolean A0D() {
        UserSession userSession = this.A00;
        if (AbstractC61652rS.A05(userSession) && C18U.A06(C06090Tz.A05, userSession, 36312866158019955L)) {
            return true;
        }
        return false;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0G(Object obj, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        if (C32V.A01(userSession) && z && C18U.A06(C06090Tz.A05, userSession, 36319742399684232L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39369Ha9(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31F c31f, C1PY c1py, C1PK c1pk) {
        super(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk);
        C3YT A00 = C3YS.A00(userSession);
        AbstractC167017dG.A1U(c1pk, A00);
        this.A00 = userSession;
        this.A01 = A00;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
        return AbstractC166987dD.A1J(AbstractC37302Gc3.A0G(obj).A05());
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0F(Object obj) {
        C120985dq A0G = AbstractC37302Gc3.A0G(obj);
        if (A0G.A0G()) {
            Iterator it = C42159Im7.A01(A0G).iterator();
            while (it.hasNext()) {
                if (this.A01.A05(((C40971v4) it.next()).A0K)) {
                    return true;
                }
            }
        }
        C38321qM A05 = A0G.A05();
        if (A05 != null) {
            return this.A01.A05(A05);
        }
        return false;
    }
}
