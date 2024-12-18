package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iz8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42956Iz8 implements InterfaceC671231d {
    public InterfaceC42381xS A01;
    public final UserSession A03;
    public final HY4 A04;
    public final HashSet A02 = AbstractC166987dD.A1H();
    public int A00 = -1;

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
            HY4 hy4 = this.A04;
            if (i <= hy4.BRE().size()) {
                UserSession userSession = this.A03;
                if (C32V.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36319742399291012L)) {
                    return C05F.A03;
                }
                HashSet hashSet = this.A02;
                C40971v4 c40971v4 = (C40971v4) interfaceC42381xS.BUM();
                hashSet.add(c40971v4.A0S);
                int i2 = this.A00;
                if (i2 < i) {
                    i2 = i;
                }
                this.A00 = i2;
                this.A01 = interfaceC42381xS;
                hy4.A0C(AbstractC16960so.A1N(c40971v4.A0K), i);
                return C05F.A00;
            }
        }
        return C05F.A0C;
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
        throw AbstractC166987dD.A1D("Ad Pod is not supported for for IAA.");
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        List BRE = this.A04.BRE();
        C14360o3.A07(BRE);
        ArrayList A0q = AbstractC167017dG.A0q(BRE);
        Iterator it = BRE.iterator();
        while (it.hasNext()) {
            String A0g = AbstractC37302Gc3.A0g(it);
            if (A0g != null) {
                A0q.add(A0g);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return AbstractC001800i.A0U(A0q);
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        List BRE = this.A04.BRE();
        ArrayList A10 = AbstractC31174DnI.A10(BRE);
        for (Object obj : BRE) {
            AbstractC25228BEl.A1Q(obj, A10, ((C38321qM) obj).CdW() ? 1 : 0);
        }
        ArrayList A0q = AbstractC167017dG.A0q(A10);
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            String A0g = AbstractC37302Gc3.A0g(it);
            if (A0g != null) {
                A0q.add(A0g);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return AbstractC001800i.A0U(A0q);
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return this.A01;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        throw AbstractC166987dD.A1D("HP Push-Up is not supported for IAA.");
    }

    public C42956Iz8(UserSession userSession, HY4 hy4) {
        this.A03 = userSession;
        this.A04 = hy4;
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        return this.A02.contains(AbstractC37301Gc2.A0J(obj).A0S);
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        return null;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        return false;
    }
}
