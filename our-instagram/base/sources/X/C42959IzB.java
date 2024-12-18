package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.IzB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42959IzB implements InterfaceC671231d {
    public InterfaceC42381xS A01;
    public final UserSession A02;
    public final C62832tM A05;
    public final C37546Gg2 A06;
    public final AbstractC39459Hbl A07;
    public final String A08;
    public final HashSet A03 = AbstractC166987dD.A1H();
    public int A00 = -1;
    public final Map A04 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC671231d
    public final float Aug() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final int Bef() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final Integer COV(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, int i) {
        AbstractC167007dF.A1D(interfaceC42381xS, 0, c1pz);
        Object BUM = interfaceC42381xS.BUM();
        C120985dq c120985dq = (C120985dq) ((C206239Bg) BUM).A03;
        if (i >= 0 && i <= this.A07.A0B()) {
            if (c1pz.A02 >= i) {
                return C05F.A0u;
            }
            if (!C14360o3.A0K(c120985dq.A06().A0c, this.A08)) {
                return C05F.A02;
            }
            UserSession userSession = this.A02;
            boolean CdW = c120985dq.CdW();
            if (C32V.A01(userSession) && CdW && C18U.A06(C06090Tz.A05, userSession, 36319742399684232L)) {
                return C05F.A03;
            }
            this.A06.A09(c120985dq, null, i, false);
            this.A03.add(AbstractC25226BEj.A1E(c120985dq));
            int i2 = this.A00;
            if (i2 < i) {
                i2 = i;
            }
            this.A00 = i2;
            this.A04.put(Integer.valueOf(i), BUM);
            this.A01 = interfaceC42381xS;
            return C05F.A00;
        }
        return C05F.A0j;
    }

    @Override // X.InterfaceC671231d
    public final void DrH() {
    }

    @Override // X.InterfaceC671231d
    public final void E6u(String str, List list, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS F9D() {
        return null;
    }

    @Override // X.InterfaceC671231d
    public final List AGp() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void AHZ(Object obj) {
        if (C18U.A06(C06090Tz.A05, this.A02, 36320695881507640L)) {
        } else {
            throw AbstractC166987dD.A1D("Ad Pod is not supported for Profile Reels Ads");
        }
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        return AbstractC166997dE.A0m(this.A04, i);
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        List A0J = this.A07.A0J();
        ArrayList A0q = AbstractC167017dG.A0q(A0J);
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC37300Gc1.A0A(it).getId());
        }
        return A0q;
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        List A0L = this.A07.A0L(EnumC129395t1.A0G);
        ArrayList A0q = AbstractC167017dG.A0q(A0L);
        Iterator it = A0L.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC37300Gc1.A0A(it).getId());
        }
        return A0q;
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return this.A01;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        throw AbstractC166987dD.A1D("HP Push-Up is not supported for Profile Reels Ads");
    }

    public C42959IzB(UserSession userSession, C62832tM c62832tM, C37546Gg2 c37546Gg2, AbstractC39459Hbl abstractC39459Hbl, String str) {
        this.A02 = userSession;
        this.A06 = c37546Gg2;
        this.A07 = abstractC39459Hbl;
        this.A05 = c62832tM;
        this.A08 = str;
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        C120985dq A0G = AbstractC37302Gc3.A0G(obj);
        if (AbstractC37647Ghg.A00(A0G)) {
            A0G.A06();
            return this.A03.contains(AbstractC25226BEj.A1E(A0G));
        }
        return false;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        return false;
    }
}
