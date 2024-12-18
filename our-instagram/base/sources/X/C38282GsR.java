package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GsR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38282GsR implements InterfaceC671231d {
    public InterfaceC42381xS A01;
    public final HY4 A02;
    public final int A05;
    public final UserSession A06;
    public final C38321qM A07;
    public final HashSet A03 = AbstractC166987dD.A1H();
    public int A00 = -1;
    public final java.util.Set A04 = AbstractC166987dD.A1H();

    @Override // X.InterfaceC671231d
    public final float Aug() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final int Bef() {
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r5.A07.CdW() == false) goto L6;
     */
    @Override // X.InterfaceC671231d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer COV(X.InterfaceC42381xS r6, X.C1PZ r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            int r0 = r5.A05
            if (r8 != r0) goto L11
            X.1qM r0 = r5.A07
            boolean r0 = r0.CdW()
            r4 = 1
            if (r0 != 0) goto L23
        L11:
            r4 = 0
            if (r8 < 0) goto L20
            X.HY4 r0 = r5.A02
            java.util.List r0 = r0.BRE()
            int r0 = r0.size()
            if (r8 <= r0) goto L23
        L20:
            java.lang.Integer r0 = X.C05F.A0j
            return r0
        L23:
            com.instagram.common.session.UserSession r3 = r5.A06
            boolean r0 = X.C32V.A01(r3)
            if (r0 == 0) goto L3b
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319742398635642(0x81089d00011e7a, double:3.0320895685365935E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L3b
            java.lang.Integer r0 = X.C05F.A03
            return r0
        L3b:
            java.util.HashSet r3 = r5.A03
            java.lang.Object r1 = r6.BUM()
            r2 = r1
            X.1v4 r2 = (X.C40971v4) r2
            java.lang.String r0 = r2.A0S
            r3.add(r0)
            int r0 = r5.A00
            if (r0 >= r8) goto L4e
            r0 = r8
        L4e:
            r5.A00 = r0
            r5.A01 = r6
            java.util.Set r0 = r5.A04
            r0.add(r1)
            if (r4 != 0) goto L68
            X.HY4 r1 = r5.A02
            X.1qM r0 = r2.A0K
            X.1qM[] r0 = new X.C38321qM[]{r0}
            java.util.ArrayList r0 = X.AbstractC16960so.A1N(r0)
            r1.A0C(r0, r8)
        L68:
            java.lang.Integer r0 = X.C05F.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38282GsR.COV(X.1xS, X.1PZ, int):java.lang.Integer");
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
        throw AbstractC166987dD.A1D("Ad Pod is not supported for Search Ads.");
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        HY4 hy4 = this.A02;
        if (hy4.BRE().size() > i) {
            for (Object obj : this.A04) {
                if (C14360o3.A0K(((C40971v4) obj).A0K, hy4.BRE().get(i))) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        List BRE = this.A02.BRE();
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
        List BRE = this.A02.BRE();
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
        throw AbstractC166987dD.A1D("HP Push-Up is not supported for IAA.");
    }

    public C38282GsR(UserSession userSession, C38321qM c38321qM, HY4 hy4, int i) {
        this.A06 = userSession;
        this.A02 = hy4;
        this.A05 = i;
        this.A07 = c38321qM;
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        return this.A03.contains(AbstractC37301Gc2.A0J(obj).A0S);
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        return false;
    }
}
