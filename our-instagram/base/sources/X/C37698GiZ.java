package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GiZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37698GiZ extends C32I {
    public final UserSession A00;

    public C37698GiZ(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31F c31f, C1PY c1py, C1PK c1pk) {
        super(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk, false);
        this.A00 = userSession;
    }

    @Override // X.C32I, X.C32J
    public final void A09(List list, List list2, int i) {
        if (C18U.A06(C06090Tz.A05, this.A00, 36318526923086064L)) {
            super.A09(list, list2, i);
            return;
        }
        if (this.A02.booleanValue()) {
            list2.add(AbstractC111324zv.A00(1326));
        }
        this.A02 = true;
    }

    @Override // X.C32J
    public final boolean A0C() {
        UserSession userSession = this.A00;
        if (AbstractC61652rS.A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36312866157561196L)) {
            return true;
        }
        return false;
    }

    @Override // X.C32J
    public final boolean A0D() {
        UserSession userSession = this.A00;
        if (AbstractC61652rS.A05(userSession) && C18U.A06(C06090Tz.A05, userSession, 36312866157561196L)) {
            return true;
        }
        return false;
    }

    @Override // X.C32J
    public final boolean A0E() {
        return C18U.A06(C06090Tz.A05, this.A00, 36330630140806082L);
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0G(Object obj, boolean z, boolean z2) {
        return C32V.A05(this.A00, z);
    }

    @Override // X.C32I
    public final /* bridge */ /* synthetic */ C671831j A0H(Object obj) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        C14360o3.A0B(c206239Bg, 0);
        return (C671831j) c206239Bg.A04;
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
                if (C3YS.A00(this.A00).A05(((C40971v4) it.next()).A0K)) {
                    return true;
                }
            }
        }
        C38321qM A05 = A0G.A05();
        if (A05 != null) {
            return AbstractC37301Gc2.A1Y(this.A00, A05);
        }
        return false;
    }
}
