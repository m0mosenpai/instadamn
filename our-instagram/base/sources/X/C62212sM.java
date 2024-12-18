package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2sM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62212sM {
    public boolean A00;
    public final UserSession A01;
    public final C62232sO A02;
    public final C1PC A03 = C62222sN.A00;
    public final C1PK A04 = new C1PK() { // from class: X.2sQ
        @Override // X.C1PK
        public final /* bridge */ /* synthetic */ InterfaceC38221qC ATz(Object obj) {
            C82373m0 c82373m0 = (C82373m0) obj;
            C14360o3.A0B(c82373m0, 0);
            C38321qM A02 = C3XH.A02(c82373m0.A01.A05);
            if (A02 != null) {
                return A02.A26();
            }
            return null;
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2sO] */
    public C62212sM(final UserSession userSession) {
        this.A01 = userSession;
        this.A02 = new InterfaceC62242sP(userSession) { // from class: X.2sO
            public final UserSession A00;

            @Override // X.InterfaceC62242sP
            public final /* synthetic */ int AZN(Object obj) {
                return -1;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ boolean CdY(Object obj) {
                return false;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ C5I4 AMc(Object obj) {
                final C82373m0 c82373m0 = (C82373m0) obj;
                C14360o3.A0B(c82373m0, 0);
                return new C5I3() { // from class: X.5I2
                    public final String A00;

                    {
                        this.A00 = C82373m0.this.A01.A09;
                    }

                    @Override // X.C5I4
                    public final String AZM() {
                        return "";
                    }

                    @Override // X.C5I4
                    public final Integer BKD() {
                        C3XG c3xg = C82373m0.this.A01;
                        if (C3YW.A00(c3xg)) {
                            return C05F.A0C;
                        }
                        if (C3YW.A03(c3xg)) {
                            return C05F.A0N;
                        }
                        return C05F.A00;
                    }

                    @Override // X.C5I4
                    public final List BVA() {
                        return null;
                    }

                    @Override // X.C5I4
                    public final int BgX() {
                        return 0;
                    }

                    @Override // X.C5I4
                    public final String getId() {
                        return this.A00;
                    }
                };
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
            
                if (r2 == X.C1XV.A0l) goto L10;
             */
            @Override // X.InterfaceC62242sP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ int Aa7(java.lang.Object r5) {
                /*
                    r4 = this;
                    X.3m0 r5 = (X.C82373m0) r5
                    if (r5 == 0) goto L3c
                    X.3XG r0 = r5.A01
                    if (r0 == 0) goto L3c
                    X.1XV r2 = r0.A06
                    X.1XV r0 = X.C1XV.A0T
                    if (r2 == r0) goto L13
                    X.1XV r1 = X.C1XV.A0l
                    r0 = 0
                    if (r2 != r1) goto L14
                L13:
                    r0 = 1
                L14:
                    r1 = 1
                    r3 = 41
                    if (r0 == 0) goto L51
                    if (r5 == 0) goto L5e
                    X.3XG r2 = r5.A01
                    if (r2 == 0) goto L5e
                    X.1XV r0 = r2.A06
                    int r1 = r0.ordinal()
                    if (r1 == r3) goto L46
                    r0 = 43
                    if (r1 != r0) goto L3e
                    X.1qS r0 = r2.A05
                    X.1qM r0 = X.C3XH.A02(r0)
                    if (r0 == 0) goto L5e
                    com.google.common.collect.ImmutableList r0 = r0.A1E()
                    int r1 = r0.size()
                    return r1
                L3c:
                    r0 = 0
                    goto L14
                L3e:
                    java.lang.String r1 = "Unsupported multi ad type"
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>(r1)
                    throw r0
                L46:
                    X.HBC r0 = r2.A01()
                    java.util.List r0 = r0.A0B
                    int r1 = r0.size()
                    return r1
                L51:
                    if (r5 == 0) goto L5c
                    X.3XG r0 = r5.A01
                L55:
                    boolean r0 = X.C3YW.A00(r0)
                    if (r0 == 0) goto L5e
                    return r1
                L5c:
                    r0 = 0
                    goto L55
                L5e:
                    r1 = 0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C62232sO.Aa7(java.lang.Object):int");
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ Integer Ahy(Object obj) {
                C3XG c3xg = (C3XG) obj;
                C14360o3.A0B(c3xg, 0);
                return c3xg.A02();
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ Integer Ai1(Object obj) {
                C3XG c3xg = (C3XG) obj;
                C14360o3.A0B(c3xg, 0);
                C38321qM A02 = C3XH.A02(c3xg.A05);
                if (A02 != null) {
                    return A02.A2N();
                }
                return null;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ String BF8(Object obj) {
                C82373m0 c82373m0 = (C82373m0) obj;
                C14360o3.A0B(c82373m0, 0);
                return c82373m0.A01.A09;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ String BFA(Object obj) {
                C3XG c3xg = (C3XG) obj;
                C14360o3.A0B(c3xg, 0);
                return c3xg.A09;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ String BK4(Object obj) {
                C3XG c3xg = (C3XG) obj;
                C14360o3.A0B(c3xg, 0);
                return c3xg.A09;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [X.IL5, java.lang.Object] */
            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ List BV9(Object obj) {
                C1XV c1xv;
                C1XV c1xv2;
                C82373m0 c82373m0 = (C82373m0) obj;
                C14360o3.A0B(c82373m0, 0);
                C3XG c3xg = c82373m0.A01;
                if (c3xg != null && ((c1xv = c3xg.A06) == (c1xv2 = C1XV.A0T) || c1xv == C1XV.A0l)) {
                    if (C18U.A06(C06090Tz.A05, this.A00, 36327855591865264L)) {
                        int ordinal = c1xv.ordinal();
                        if (ordinal != 41) {
                            if (ordinal == 43) {
                                C38321qM A02 = C3XH.A02(c3xg.A05);
                                if (A02 != null) {
                                    ImmutableList A1E = A02.A1E();
                                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A1E, 10));
                                    Iterator<E> it = A1E.iterator();
                                    while (it.hasNext()) {
                                        C38321qM c38321qM = (C38321qM) it.next();
                                        C14360o3.A0A(c38321qM);
                                        C3XG A01 = C3XH.A01(c38321qM);
                                        JMJ BVD = c38321qM.A0C.BVD();
                                        if (BVD != null) {
                                            InterfaceC38381qS interfaceC38381qS = A01.A05;
                                            C38321qM A022 = C3XH.A02(interfaceC38381qS);
                                            if (A022 != null) {
                                                ImmutableList of = ImmutableList.of();
                                                C14360o3.A07(of);
                                                A022.A0C.EVr(of);
                                            }
                                            C38321qM A023 = C3XH.A02(interfaceC38381qS);
                                            if (A023 != null) {
                                                A023.A0C.EZI(BVD);
                                            }
                                        }
                                        arrayList.add(new C82373m0(c82373m0.A00, A01, EnumC73363Qm.A05, c82373m0.A03));
                                    }
                                    return arrayList;
                                }
                            } else {
                                throw new IllegalStateException("Unsupported multi ad type");
                            }
                        } else {
                            List<IL5> list = c3xg.A01().A0B;
                            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                            for (IL5 il5 : list) {
                                HBC hbc = new HBC();
                                hbc.A03 = c3xg.A01().A03;
                                ?? obj2 = new Object();
                                obj2.A00 = il5.A00();
                                List singletonList = Collections.singletonList(obj2);
                                C14360o3.A07(singletonList);
                                hbc.A0B = singletonList;
                                hbc.A01 = c3xg.A01().A00();
                                hbc.A06 = c3xg.A01().A01();
                                String id = il5.A00().getId();
                                if (id != null) {
                                    arrayList2.add(new C82373m0(c82373m0.A00, new C3XG(hbc, c1xv2, id), EnumC73363Qm.A05, c82373m0.A03));
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            return arrayList2;
                        }
                    }
                }
                return C16930sl.A00;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ Integer BVE(Object obj) {
                C3XG c3xg;
                HBC A01;
                C82373m0 c82373m0 = (C82373m0) obj;
                if (c82373m0 == null || (c3xg = c82373m0.A01) == null) {
                    return null;
                }
                C1XV c1xv = c3xg.A06;
                if ((c1xv != C1XV.A0T && c1xv != C1XV.A0l) || (A01 = c3xg.A01()) == null) {
                    return null;
                }
                return A01.A02();
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ EnumC26291Pk BYX(Object obj) {
                C82373m0 c82373m0 = (C82373m0) obj;
                C14360o3.A0B(c82373m0, 0);
                C3XG c3xg = c82373m0.A01;
                C14360o3.A0B(c3xg, 0);
                C1XV c1xv = c3xg.A06;
                if (c1xv != C1XV.A0T && c1xv != C1XV.A0l) {
                    if (!C3YW.A00(c3xg) && !C3YW.A03(c3xg)) {
                        return EnumC26291Pk.A03;
                    }
                    return EnumC26291Pk.A04;
                }
                return EnumC26291Pk.A02;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ boolean CX6(Object obj) {
                C3XG c3xg = (C3XG) obj;
                C14360o3.A0B(c3xg, 0);
                C1XV c1xv = c3xg.A06;
                if (c1xv != C1XV.A0T && c1xv != C1XV.A0l) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ boolean CX7(Object obj) {
                C3XG c3xg = (C3XG) obj;
                C14360o3.A0B(c3xg, 0);
                return C3YW.A03(c3xg);
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ boolean CX8(Object obj) {
                C3XG c3xg = (C3XG) obj;
                C14360o3.A0B(c3xg, 0);
                return C3YW.A00(c3xg);
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ boolean CYw(Object obj) {
                C3XG c3xg;
                C82373m0 c82373m0 = (C82373m0) obj;
                if (c82373m0 != null && (c3xg = c82373m0.A01) != null) {
                    C1XV c1xv = c3xg.A06;
                    if (c1xv != C1XV.A0T && c1xv != C1XV.A0l) {
                        return false;
                    }
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ boolean CZK(Object obj) {
                C3XG c3xg;
                C82373m0 c82373m0 = (C82373m0) obj;
                if (c82373m0 != null) {
                    c3xg = c82373m0.A01;
                } else {
                    c3xg = null;
                }
                return C3YW.A03(c3xg);
            }

            @Override // X.InterfaceC62242sP
            public final /* bridge */ /* synthetic */ boolean CdX(Object obj) {
                C3XG c3xg;
                C82373m0 c82373m0 = (C82373m0) obj;
                if (c82373m0 != null) {
                    c3xg = c82373m0.A01;
                } else {
                    c3xg = null;
                }
                return C3YW.A00(c3xg);
            }

            {
                this.A00 = userSession;
            }

            @Override // X.InterfaceC62242sP
            public final /* synthetic */ boolean ACQ(Object obj, Object obj2) {
                return false;
            }

            @Override // X.InterfaceC62242sP
            public final /* synthetic */ boolean ACU(Object obj, Object obj2) {
                return false;
            }
        };
    }
}
