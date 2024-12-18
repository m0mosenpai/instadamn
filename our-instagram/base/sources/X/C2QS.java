package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2QS */
/* loaded from: classes.dex */
public final class C2QS extends C2QT implements InterfaceC24871Jm {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(C2QS.class, Object.class, "state$volatile");
    public Object A00;
    public final C12W A04;
    public volatile /* synthetic */ Object state$volatile = C3EC.A05;
    public List A02 = new ArrayList(2);
    public int A03 = -1;
    public Object A01 = C3EC.A01;

    public static final int A00(Object obj, Object obj2, C2QS c2qs) {
        Object A0T;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
            Object obj3 = atomicReferenceFieldUpdater.get(c2qs);
            if (obj3 instanceof InterfaceC24901Jp) {
                C3EM A04 = c2qs.A04(obj);
                if (A04 != null && C1E0.A00(c2qs, obj3, A04, atomicReferenceFieldUpdater)) {
                    InterfaceC24901Jp interfaceC24901Jp = (InterfaceC24901Jp) obj3;
                    c2qs.A01 = obj2;
                    Object F8r = interfaceC24901Jp.F8r(C0eB.A00, null, null);
                    if (F8r == null) {
                        c2qs.A01 = C3EC.A01;
                    } else {
                        interfaceC24901Jp.AIl(F8r);
                        return 0;
                    }
                }
            } else if (!C14360o3.A0K(obj3, C3EC.A04) && !(obj3 instanceof C3EM)) {
                if (C14360o3.A0K(obj3, C3EC.A03)) {
                    break;
                }
                if (C14360o3.A0K(obj3, C3EC.A05)) {
                    A0T = Collections.singletonList(obj);
                    C14360o3.A07(A0T);
                } else if (obj3 instanceof List) {
                    A0T = AbstractC001800i.A0T(obj, (Collection) obj3);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected state: ");
                    sb.append(obj3);
                    throw new IllegalStateException(sb.toString());
                }
                if (C1E0.A00(c2qs, obj3, A0T, atomicReferenceFieldUpdater)) {
                    return 1;
                }
            } else {
                return 3;
            }
        }
        return 2;
    }

    private final Object A01(InterfaceC23621Ds interfaceC23621Ds) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        Object obj = atomicReferenceFieldUpdater.get(this);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C3EM c3em = (C3EM) obj;
        Object obj2 = this.A01;
        List<C3EM> list = this.A02;
        if (list != null) {
            for (C3EM c3em2 : list) {
                if (c3em2 != c3em) {
                    c3em2.A00();
                }
            }
            atomicReferenceFieldUpdater.set(this, C3EC.A04);
            this.A01 = C3EC.A01;
            this.A02 = null;
        }
        InterfaceC16610sE interfaceC16610sE = c3em.A05;
        Object obj3 = c3em.A03;
        Object obj4 = c3em.A04;
        Object invoke = interfaceC16610sE.invoke(obj3, obj4, obj2);
        Object obj5 = c3em.A02;
        if (obj4 == C3EC.A02) {
            C14360o3.A0C(obj5, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((InterfaceC16660sJ) obj5).invoke(interfaceC23621Ds);
        }
        C14360o3.A0C(obj5, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((InterfaceC16620sF) obj5).invoke(invoke, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v0 java.lang.Object) binds: [B:17:0x009d, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.InterfaceC23621Ds r8, X.C2QS r9) {
        /*
            r3 = 11
            boolean r0 = X.C9CZ.A00(r8, r3)
            if (r0 == 0) goto La0
            r4 = r8
            X.9CZ r4 = (X.C9CZ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L28
            if (r0 == r8) goto L8d
            if (r0 != r3) goto La7
            X.AbstractC09560e7.A00(r1)
        L27:
            return r1
        L28:
            X.AbstractC09560e7.A00(r1)
            r4.A01 = r9
            r4.A00 = r8
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C24891Jo.A02
            X.1Ds r0 = X.C1E2.A02(r4)
            X.1Jo r6 = new X.1Jo
            r6.<init>(r8, r0)
            r6.A0I()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = X.C2QS.A05
        L3f:
            java.lang.Object r2 = r7.get(r9)
            X.0zt r1 = X.C3EC.A05
            if (r2 != r1) goto L57
            boolean r0 = X.C1E0.A00(r9, r2, r6, r7)
            if (r0 == 0) goto L3f
            r6.CPA(r9)
        L50:
            java.lang.Object r0 = r6.A0E()
            if (r0 != r5) goto L94
            return r5
        L57:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L82
            boolean r0 = X.C1E0.A00(r9, r2, r1, r7)
            if (r0 == 0) goto L3f
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L67:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r2.next()
            X.3EM r1 = r9.A04(r0)
            X.C14360o3.A0A(r1)
            r0 = 0
            r1.A01 = r0
            r0 = -1
            r1.A00 = r0
            r9.A07(r1, r8)
            goto L67
        L82:
            boolean r0 = r2 instanceof X.C3EM
            if (r0 == 0) goto Laf
            X.0eB r1 = X.C0eB.A00
            r0 = 0
            r6.EKh(r0, r1)
            goto L50
        L8d:
            java.lang.Object r9 = r4.A01
            X.2QS r9 = (X.C2QS) r9
            X.AbstractC09560e7.A00(r1)
        L94:
            r0 = 0
            r4.A01 = r0
            r4.A00 = r3
            java.lang.Object r1 = r9.A01(r4)
            if (r1 != r5) goto L27
            return r5
        La0:
            X.9CZ r4 = new X.9CZ
            r4.<init>(r9, r8, r3)
            goto L16
        La7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Laf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unexpected state: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2QS.A02(X.1Ds, X.2QS):java.lang.Object");
    }

    public static /* synthetic */ Object A03(InterfaceC23621Ds interfaceC23621Ds, C2QS c2qs) {
        if (A05.get(c2qs) instanceof C3EM) {
            return c2qs.A01(interfaceC23621Ds);
        }
        return A02(interfaceC23621Ds, c2qs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C3EM A04(Object obj) {
        List list = this.A02;
        C3EM c3em = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C3EM) next).A03 == obj) {
                    c3em = next;
                    break;
                }
            }
            c3em = c3em;
            if (c3em == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Clause with object ");
                sb.append(obj);
                sb.append(" is not found");
                throw new IllegalStateException(sb.toString());
            }
        }
        return c3em;
    }

    @Override // X.C2QU
    public final void A05(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C3EC.A04) {
                return;
            }
        } while (!C1E0.A00(this, obj, C3EC.A03, atomicReferenceFieldUpdater));
        List list = this.A02;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C3EM) it.next()).A00();
            }
            this.A01 = C3EC.A01;
            this.A02 = null;
        }
    }

    public final void A06(InterfaceC16620sF interfaceC16620sF, C3EL c3el) {
        A07(new C3EM(c3el.A00, null, interfaceC16620sF, c3el.A02, c3el.A01, this), false);
    }

    public final void A07(C3EM c3em, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        if (!(atomicReferenceFieldUpdater.get(this) instanceof C3EM)) {
            if (!z) {
                Object obj = c3em.A03;
                List list = this.A02;
                C14360o3.A0A(list);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((C3EM) it.next()).A03 == obj) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cannot use select clauses on the same object: ");
                            sb.append(obj);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
            }
            c3em.A06.invoke(c3em.A03, this, c3em.A04);
            if (this.A01 == C3EC.A01) {
                if (!z) {
                    List list2 = this.A02;
                    C14360o3.A0A(list2);
                    list2.add(c3em);
                }
                c3em.A01 = this.A00;
                c3em.A00 = this.A03;
                this.A00 = null;
                this.A03 = -1;
                return;
            }
            atomicReferenceFieldUpdater.set(this, c3em);
        }
    }

    @Override // X.InterfaceC24871Jm
    public final void CPB(C13C c13c, int i) {
        this.A00 = c13c;
        this.A03 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C0eB.A00;
    }

    public C2QS(C12W c12w) {
        this.A04 = c12w;
    }
}
