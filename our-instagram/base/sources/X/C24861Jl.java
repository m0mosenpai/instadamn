package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24861Jl implements InterfaceC24871Jm {
    public Object A00 = AbstractC24761It.A0D;
    public C24891Jo A01;
    public final /* synthetic */ C24721Ip A02;

    public C24861Jl(C24721Ip c24721Ip) {
        this.A02 = c24721Ip;
    }

    public final Object A00() {
        Object obj = this.A00;
        C20730zt c20730zt = AbstractC24761It.A0D;
        if (obj != c20730zt) {
            this.A00 = c20730zt;
            if (obj != AbstractC24761It.A04) {
                return obj;
            }
            Throwable A04 = C24721Ip.A04(this.A02);
            StackTraceElement stackTraceElement = S8E.A00;
            throw A04;
        }
        throw new IllegalStateException("`hasNext()` has not been invoked");
    }

    public final Object A01(InterfaceC23621Ds interfaceC23621Ds) {
        boolean z;
        boolean z2;
        Object c09540e5;
        C24721Ip c24721Ip = this.A02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A08;
        C1Iu c1Iu = (C1Iu) atomicReferenceFieldUpdater.get(c24721Ip);
        while (true) {
            if (c24721Ip.CRQ()) {
                this.A00 = AbstractC24761It.A04;
                Throwable th = (Throwable) C24721Ip.A05.get(c24721Ip);
                if (th == null) {
                    z = false;
                } else {
                    StackTraceElement stackTraceElement = S8E.A00;
                    throw th;
                }
            } else {
                AtomicLongFieldUpdater atomicLongFieldUpdater = C24721Ip.A03;
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(c24721Ip);
                long j = AbstractC24761It.A01;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (((C13C) c1Iu).A00 != j2) {
                    C1Iu A06 = C24721Ip.A06(c24721Ip, c1Iu, j2);
                    if (A06 != null) {
                        c1Iu = A06;
                    } else {
                        continue;
                    }
                }
                Object A01 = C24721Ip.A01(null, c24721Ip, c1Iu, i, andIncrement);
                C20730zt c20730zt = AbstractC24761It.A0H;
                if (A01 != c20730zt) {
                    C20730zt c20730zt2 = AbstractC24761It.A08;
                    if (A01 == c20730zt2) {
                        if (andIncrement < c24721Ip.A0H()) {
                            c1Iu.A01();
                        }
                    } else {
                        C20730zt c20730zt3 = AbstractC24761It.A0I;
                        if (A01 == c20730zt3) {
                            C24891Jo A00 = AbstractC24881Jn.A00(C1E2.A02(interfaceC23621Ds));
                            try {
                                this.A01 = A00;
                                Object A012 = C24721Ip.A01(this, c24721Ip, c1Iu, i, andIncrement);
                                if (A012 == c20730zt) {
                                    CPB(c1Iu, i);
                                } else {
                                    C24861Jl c24861Jl = null;
                                    if (A012 == c20730zt2) {
                                        if (andIncrement < c24721Ip.A0H()) {
                                            c1Iu.A01();
                                        }
                                        C1Iu c1Iu2 = (C1Iu) atomicReferenceFieldUpdater.get(c24721Ip);
                                        while (true) {
                                            if (c24721Ip.CRQ()) {
                                                C24891Jo c24891Jo = this.A01;
                                                C14360o3.A0A(c24891Jo);
                                                this.A01 = null;
                                                this.A00 = AbstractC24761It.A04;
                                                Throwable th2 = (Throwable) C24721Ip.A05.get(c24721Ip);
                                                if (th2 == null) {
                                                    c09540e5 = false;
                                                } else {
                                                    c09540e5 = new C09540e5(th2);
                                                }
                                                c24891Jo.resumeWith(c09540e5);
                                            } else {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c24721Ip);
                                                long j3 = andIncrement2 / j;
                                                int i2 = (int) (andIncrement2 % j);
                                                if (((C13C) c1Iu2).A00 != j3) {
                                                    C1Iu A062 = C24721Ip.A06(c24721Ip, c1Iu2, j3);
                                                    if (A062 != null) {
                                                        c1Iu2 = A062;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                Object A013 = C24721Ip.A01(this, c24721Ip, c1Iu2, i2, andIncrement2);
                                                if (A013 == c20730zt) {
                                                    if (this instanceof InterfaceC24871Jm) {
                                                        c24861Jl = this;
                                                    }
                                                    if (c24861Jl != null) {
                                                        c24861Jl.CPB(c1Iu2, i2);
                                                    }
                                                } else if (A013 == c20730zt2) {
                                                    if (andIncrement2 < c24721Ip.A0H()) {
                                                        c1Iu2.A01();
                                                    }
                                                } else if (A013 != c20730zt3) {
                                                    c1Iu2.A01();
                                                    this.A00 = A013;
                                                    this.A01 = null;
                                                    z2 = true;
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        c1Iu.A01();
                                        this.A00 = A012;
                                        this.A01 = null;
                                        z2 = true;
                                    }
                                    A00.EKh(null, z2);
                                }
                                return A00.A0E();
                            } catch (Throwable th3) {
                                A00.A0J();
                                throw th3;
                            }
                        }
                        c1Iu.A01();
                        this.A00 = A01;
                        z = true;
                    }
                } else {
                    throw new IllegalStateException("unreachable");
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC24871Jm
    public final void CPB(C13C c13c, int i) {
        C24891Jo c24891Jo = this.A01;
        if (c24891Jo != null) {
            c24891Jo.CPB(c13c, i);
        }
    }
}
