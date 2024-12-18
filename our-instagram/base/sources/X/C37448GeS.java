package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GeS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37448GeS implements InterfaceC671231d {
    public int A00;
    public InterfaceC42381xS A01;
    public final UserSession A02;
    public final HY4 A03;
    public final HashSet A04;
    public final java.util.Set A05;
    public final String A06;

    public C37448GeS(UserSession userSession, HY4 hy4, String str) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = hy4;
        this.A06 = str;
        this.A04 = AbstractC166987dD.A1H();
        this.A00 = -1;
        this.A05 = AbstractC166987dD.A1H();
    }

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
        C14360o3.A0B(interfaceC42381xS, 0);
        if (i >= 0) {
            HY4 hy4 = this.A03;
            if (i <= hy4.BRE().size()) {
                Object BUM = interfaceC42381xS.BUM();
                C40971v4 c40971v4 = (C40971v4) BUM;
                if (!C14360o3.A0K(c40971v4.A0c, this.A06)) {
                    return C05F.A1I;
                }
                UserSession userSession = this.A02;
                if (C32V.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36319742398963327L)) {
                    return C05F.A03;
                }
                this.A04.add(c40971v4.A0S);
                int i2 = this.A00;
                if (i2 < i) {
                    i2 = i;
                }
                this.A00 = i2;
                this.A01 = interfaceC42381xS;
                this.A05.add(BUM);
                hy4.A0C(AbstractC16960so.A1N(c40971v4.A0K), i);
                return C05F.A00;
            }
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
        if (C18U.A06(C06090Tz.A05, this.A02, 36315808211275348L)) {
        } else {
            throw AbstractC166987dD.A1D("Ad Pod is not supported for Profile Ads.");
        }
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        HY4 hy4 = this.A03;
        if (hy4.BRE().size() > i) {
            for (Object obj : this.A05) {
                if (C14360o3.A0K(((C40971v4) obj).A0K, hy4.BRE().get(i))) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        List BRE = this.A03.BRE();
        ArrayList A10 = AbstractC31174DnI.A10(BRE);
        Iterator it = BRE.iterator();
        while (it.hasNext()) {
            String id = ((C38321qM) it.next()).getId();
            if (id != null) {
                A10.add(id);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return A10;
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        List BRE = this.A03.BRE();
        ArrayList A10 = AbstractC31174DnI.A10(BRE);
        for (Object obj : BRE) {
            AbstractC25228BEl.A1Q(obj, A10, ((C38321qM) obj).CdW() ? 1 : 0);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            String A0g = AbstractC37302Gc3.A0g(it);
            if (A0g != null) {
                A1E.add(A0g);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return A1E;
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return this.A01;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        C37469Gen c37469Gen = (C37469Gen) obj;
        C14360o3.A0B(c37469Gen, 0);
        if (C18U.A06(C06090Tz.A05, this.A02, 36315808211668567L)) {
            C40861ut c40861ut = c37469Gen.A00;
            if (c40861ut != null) {
                c40861ut.A0C(false);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A1D("HP Push-Up is not supported for Profile Feed Ads");
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        return this.A04.contains(AbstractC37301Gc2.A0J(obj).A0S);
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        return false;
    }
}
