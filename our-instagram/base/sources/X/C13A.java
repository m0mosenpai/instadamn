package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.13A, reason: invalid class name */
/* loaded from: classes.dex */
public class C13A {
    public final int A00;
    public final InterfaceC16660sJ A01;
    public volatile /* synthetic */ int _availablePermits$volatile;
    public volatile /* synthetic */ long deqIdx$volatile;
    public volatile /* synthetic */ long enqIdx$volatile;
    public volatile /* synthetic */ Object head$volatile;
    public volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(C13A.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A03 = AtomicLongFieldUpdater.newUpdater(C13A.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A06 = AtomicReferenceFieldUpdater.newUpdater(C13A.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A04 = AtomicLongFieldUpdater.newUpdater(C13A.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C13A.class, "_availablePermits$volatile");

    public static final boolean A01(InterfaceC24871Jm interfaceC24871Jm, C13A c13a) {
        Object A00;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A06;
        C13C c13c = (C13C) atomicReferenceFieldUpdater.get(c13a);
        long andIncrement = A04.getAndIncrement(c13a);
        C124745kf c124745kf = C124745kf.A00;
        long j = C13F.A01;
        long j2 = andIncrement / j;
        loop0: while (true) {
            A00 = C3JN.A00(c124745kf, c13c, j2);
            if (A00 == C3JN.A00) {
                break;
            }
            C13C A002 = AbstractC96484Vh.A00(A00);
            while (true) {
                C13C c13c2 = (C13C) atomicReferenceFieldUpdater.get(c13a);
                if (c13c2.A00 >= A002.A00) {
                    break loop0;
                }
                if (A002.A08()) {
                    if (C1E0.A00(c13a, c13c2, A002, atomicReferenceFieldUpdater)) {
                        if (c13c2.A07()) {
                            c13c2.A02();
                        }
                    } else if (A002.A07()) {
                        A002.A02();
                    }
                }
            }
        }
        C13B c13b = (C13B) AbstractC96484Vh.A00(A00);
        int i = (int) (andIncrement % j);
        AtomicReferenceArray atomicReferenceArray = c13b.A00;
        if (C1AM.A00(null, interfaceC24871Jm, atomicReferenceArray, i)) {
            interfaceC24871Jm.CPB(c13b, i);
            return true;
        }
        if (C1AM.A00(C13F.A04, C13F.A05, atomicReferenceArray, i)) {
            if (interfaceC24871Jm instanceof InterfaceC24901Jp) {
                C14360o3.A0C(interfaceC24871Jm, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                ((InterfaceC24901Jp) interfaceC24871Jm).EKh(c13a.A01, C0eB.A00);
                return true;
            }
            if (interfaceC24871Jm instanceof C2QS) {
                ((C2QS) interfaceC24871Jm).A01 = C0eB.A00;
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected: ");
            sb.append(interfaceC24871Jm);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    public final void A02() {
        int i;
        Object A00;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.A00;
            if (andIncrement < i2) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
                    C13C c13c = (C13C) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = A03.getAndIncrement(this);
                    long j = C13F.A01;
                    long j2 = andIncrement2 / j;
                    C123405iF c123405iF = C123405iF.A00;
                    while (true) {
                        A00 = C3JN.A00(c123405iF, c13c, j2);
                        if (A00 == C3JN.A00) {
                            break;
                        }
                        C13C A002 = AbstractC96484Vh.A00(A00);
                        while (true) {
                            C13C c13c2 = (C13C) atomicReferenceFieldUpdater.get(this);
                            if (c13c2.A00 >= A002.A00) {
                                break;
                            }
                            if (A002.A08()) {
                                if (C1E0.A00(this, c13c2, A002, atomicReferenceFieldUpdater)) {
                                    if (c13c2.A07()) {
                                        c13c2.A02();
                                    }
                                } else if (A002.A07()) {
                                    A002.A02();
                                }
                            }
                        }
                    }
                    C13B c13b = (C13B) AbstractC96484Vh.A00(A00);
                    c13b.A01();
                    if (((C13C) c13b).A00 <= j2) {
                        int i3 = (int) (andIncrement2 % j);
                        C20730zt c20730zt = C13F.A04;
                        AtomicReferenceArray atomicReferenceArray = c13b.A00;
                        Object andSet = atomicReferenceArray.getAndSet(i3, c20730zt);
                        if (andSet == null) {
                            int i4 = C13F.A00;
                            for (int i5 = 0; i5 < i4; i5++) {
                                if (atomicReferenceArray.get(i3) == C13F.A05) {
                                    return;
                                }
                            }
                            if (!C1AM.A00(c20730zt, C13F.A02, atomicReferenceArray, i3)) {
                                return;
                            }
                        } else if (andSet == C13F.A03) {
                            continue;
                        } else if (andSet instanceof InterfaceC24901Jp) {
                            InterfaceC24901Jp interfaceC24901Jp = (InterfaceC24901Jp) andSet;
                            Object F8r = interfaceC24901Jp.F8r(C0eB.A00, null, this.A01);
                            if (F8r != null) {
                                interfaceC24901Jp.AIl(F8r);
                                return;
                            }
                        } else if (andSet instanceof C2QS) {
                            if (C2QS.A00(this, C0eB.A00, (C2QS) andSet) == 0) {
                                return;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unexpected: ");
                            sb.append(andSet);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(AnonymousClass001.A0O("The number of released permits cannot be greater than ", i2));
            }
        }
    }

    public final void A03(InterfaceC24901Jp interfaceC24901Jp) {
        while (true) {
            int andDecrement = A02.getAndDecrement(this);
            if (andDecrement <= this.A00) {
                if (andDecrement > 0) {
                    interfaceC24901Jp.EKh(this.A01, C0eB.A00);
                    return;
                } else {
                    C14360o3.A0C(interfaceC24901Jp, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
                    if (A01((InterfaceC24871Jm) interfaceC24901Jp, this)) {
                        return;
                    }
                }
            }
        }
    }

    public C13A(int i) {
        this.A00 = i;
        if (i > 0) {
            C13B c13b = new C13B(null, 2, 0L);
            this.head$volatile = c13b;
            this.tail$volatile = c13b;
            this._availablePermits$volatile = i;
            this.A01 = new C9E2(this, 38);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Semaphore should have at least 1 permit, but had ", i));
    }
}
