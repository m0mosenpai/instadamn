package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.31b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C671031b implements InterfaceC671131c {
    public int A00;
    public int A01;
    public InterfaceC42381xS A02;
    public final UserSession A03;
    public final C114725Gc A04;
    public final C65192xH A05;
    public final InterfaceC62242sP A06;
    public final C31I A07;
    public final java.util.Set A08;
    public final InterfaceC670931a A09;
    public final boolean A0A;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (X.C18U.A06(r2, r4, 36319347261709506L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C671031b(com.instagram.common.session.UserSession r4, X.C114725Gc r5, X.C65192xH r6, X.InterfaceC670931a r7, X.InterfaceC62242sP r8, X.C31I r9) {
        /*
            r3 = this;
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            r3.<init>()
            r3.A05 = r6
            r3.A06 = r8
            r3.A07 = r9
            r3.A03 = r4
            r3.A09 = r7
            r3.A04 = r5
            r0 = -1
            r3.A00 = r0
            r3.A01 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A08 = r0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319347261578433(0x81084100001cc1, double:3.0318396822705253E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L38
            r0 = 36319347261709506(0x81084100021cc2, double:3.0318396823534164E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
            r0 = 0
            if (r1 == 0) goto L39
        L38:
            r0 = 1
        L39:
            r3.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C671031b.<init>(com.instagram.common.session.UserSession, X.5Gc, X.2xH, X.31a, X.2sP, X.31I):void");
    }

    @Override // X.InterfaceC671231d
    public final float Aug() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final void DrH() {
        this.A02 = null;
        this.A00 = -1;
        this.A01 = -1;
        this.A08.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0203, code lost:
    
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021b  */
    @Override // X.InterfaceC671231d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E6u(java.lang.String r39, java.util.List r40, int r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C671031b.E6u(java.lang.String, java.util.List, int, int, int, int):void");
    }

    private final String A00() {
        StringBuilder sb;
        char c;
        int i = 0;
        String str = "";
        for (C3XG c3xg : this.A05.A07()) {
            if (i >= 50) {
                break;
            }
            if (C3YW.A00(c3xg)) {
                sb = new StringBuilder();
                sb.append(str);
                c = 'A';
            } else {
                boolean A03 = C3YW.A03(c3xg);
                sb = new StringBuilder();
                if (A03) {
                    sb.append(str);
                    c = 'N';
                } else {
                    sb.append(str);
                    c = 'O';
                }
            }
            sb.append(c);
            str = sb.toString();
            i++;
        }
        return str;
    }

    public static final boolean A01(C671031b c671031b) {
        UserSession userSession = c671031b.A03;
        if (!AbstractC61652rS.A08(userSession, AbstractC23021Ah.A00(userSession)) && !C18U.A06(C06090Tz.A06, userSession, 36312866155922778L)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC671231d
    public final List AGp() {
        EnumC26291Pk enumC26291Pk;
        C65192xH c65192xH = this.A05;
        c65192xH.A0A(-1);
        List A07 = c65192xH.A07();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A07, 10));
        for (Object obj : A07) {
            InterfaceC62242sP interfaceC62242sP = this.A06;
            if (interfaceC62242sP.CX6(obj)) {
                enumC26291Pk = EnumC26291Pk.A02;
            } else if (!interfaceC62242sP.CX8(obj) && !interfaceC62242sP.CX7(obj)) {
                enumC26291Pk = EnumC26291Pk.A03;
            } else {
                enumC26291Pk = EnumC26291Pk.A04;
            }
            arrayList.add(enumC26291Pk);
        }
        return arrayList;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void AHZ(Object obj) {
        throw new UnsupportedOperationException("Ad Pod is not supported for Feed.");
    }

    @Override // X.InterfaceC671131c
    public final List ANb() {
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36330767579759630L)) {
            List singletonList = Collections.singletonList(new C41134IIz(userSession, this.A05));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC671131c
    public final boolean ARW() {
        return C18U.A06(C06090Tz.A05, this.A03, 36330767579694093L);
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        C65192xH c65192xH = this.A05;
        if (c65192xH.B5m() > i) {
            for (Object obj : this.A08) {
                if (C14360o3.A0K(((C82373m0) obj).A01, c65192xH.A03(i))) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        return AbstractC001800i.A0U(this.A05.A06());
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        return C16930sl.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r12.A03() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r13 == X.EnumC73363Qm.A04) goto L7;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x014b: INVOKE (r0 I:java.lang.String) = (r0v2 ?? I:java.lang.String), (r5 I:int) STATIC call: X.001.A0O(java.lang.String, int):java.lang.String A[MD:(java.lang.String, int):java.lang.String (m)] (LINE:331), block:B:70:0x0149 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // X.InterfaceC671231d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer COV(X.InterfaceC42381xS r32, X.C1PZ r33, int r34) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C671031b.COV(X.1xS, X.1PZ, int):java.lang.Integer");
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        List A07 = this.A05.A07();
        if (!(A07 instanceof Collection) || !A07.isEmpty()) {
            Iterator it = A07.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C3XG) it.next()).A09, c82373m0.A01.A09)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return this.A02;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        throw new UnsupportedOperationException("HP Push-Up is not supported for Feed.");
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        boolean z;
        String str2;
        C38321qM A02;
        String str3;
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        C65192xH c65192xH = this.A05;
        C3XG c3xg = c82373m0.A01;
        int BK6 = c65192xH.BK6(c3xg.A09);
        if (c65192xH.EFR(BK6) != null) {
            this.A08.remove(c82373m0);
            z = true;
            if (C14360o3.A0K(str, AbstractC111324zv.A00(686)) && (A02 = C3XH.A02(c3xg.A05)) != null) {
                C75113Zb BRZ = c65192xH.A0T.BRZ(A02);
                if (map != null) {
                    str3 = (String) map.get(AbstractC111324zv.A00(3015));
                } else {
                    str3 = null;
                }
                BRZ.A1T = str3;
            }
        } else {
            z = false;
        }
        C114725Gc c114725Gc = this.A04;
        if (c114725Gc != null) {
            C3Z9 c3z9 = c114725Gc.A04;
            if (z) {
                str2 = "Success";
            } else {
                str2 = "Failure";
            }
            if (str == null) {
                str = "";
            }
            List singletonList = Collections.singletonList(str);
            C14360o3.A07(singletonList);
            String A0O = AnonymousClass001.A0O("Position ", BK6);
            List list = c3z9.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Uninject ");
            sb.append(str2);
            sb.append(": ");
            sb.append(A0O);
            sb.append(' ');
            sb.append(singletonList);
            list.add(sb.toString());
            W5F w5f = c3z9.A00;
            if (w5f != null) {
                w5f.A01();
            }
        }
        return z;
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS F9D() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC671231d
    public final int Bef() {
        throw C00O.createAndThrow();
    }
}
