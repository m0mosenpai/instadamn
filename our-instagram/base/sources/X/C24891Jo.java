package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24891Jo extends C1E4 implements InterfaceC24901Jp, InterfaceC24871Jm, InterfaceC23631Dt {
    public final InterfaceC23621Ds A00;
    public final C12W A01;
    public volatile /* synthetic */ int _decisionAndIndex$volatile;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C24891Jo.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(C24891Jo.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(C24891Jo.class, Object.class, "_parentHandle$volatile");

    public static final Object A00(Object obj, InterfaceC16660sJ interfaceC16660sJ, C13E c13e, int i) {
        C2QT c2qt;
        if ((obj instanceof C1JW) || (!(i == 1 || i == 2) || (interfaceC16660sJ == null && !(c13e instanceof C2QT)))) {
            return obj;
        }
        if (c13e instanceof C2QT) {
            c2qt = (C2QT) c13e;
        } else {
            c2qt = null;
        }
        return new C53212c3(obj, null, null, interfaceC16660sJ, c2qt);
    }

    public String A0F() {
        return "CancellableContinuation";
    }

    private final C19D A01() {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) this.A01.get(AnonymousClass195.A00);
        if (anonymousClass195 == null) {
            return null;
        }
        C19D CPE = anonymousClass195.CPE(new C19G(this) { // from class: X.1Jx
            public final C24891Jo A00;

            @Override // X.C19I
            public final void A05(Throwable th) {
                C24891Jo c24891Jo = this.A00;
                Throwable A0G = c24891Jo.A0G(A06());
                if (C24891Jo.A07(c24891Jo)) {
                    InterfaceC23621Ds interfaceC23621Ds = c24891Jo.A00;
                    C14360o3.A0C(interfaceC23621Ds, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1E3.A04;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(interfaceC23621Ds);
                        C20730zt c20730zt = C1E6.A00;
                        if (C14360o3.A0K(obj, c20730zt)) {
                            if (C1E0.A00(interfaceC23621Ds, c20730zt, A0G, atomicReferenceFieldUpdater)) {
                                return;
                            }
                        } else {
                            if (obj instanceof Throwable) {
                                return;
                            }
                            if (C1E0.A00(interfaceC23621Ds, obj, null, atomicReferenceFieldUpdater)) {
                                break;
                            }
                        }
                    }
                }
                c24891Jo.AGJ(A0G);
                if (C24891Jo.A07(c24891Jo)) {
                    return;
                }
                c24891Jo.A0H();
            }

            @Override // X.InterfaceC16660sJ
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                A05((Throwable) obj);
                return C0eB.A00;
            }

            {
                this.A00 = this;
            }
        }, true, true);
        C1E0.A00(this, null, CPE, A03);
        return CPE;
    }

    public static final C20730zt A02(Object obj, InterfaceC16660sJ interfaceC16660sJ, C24891Jo c24891Jo) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(c24891Jo);
            if (!(obj2 instanceof C13E)) {
                return null;
            }
        } while (!C1E0.A00(c24891Jo, obj2, A00(obj, interfaceC16660sJ, (C13E) obj2, ((C1E4) c24891Jo).A00), atomicReferenceFieldUpdater));
        if (!A07(c24891Jo)) {
            c24891Jo.A0H();
        }
        return C2QX.A00;
    }

    private final void A03(int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z = true;
                    InterfaceC23621Ds A0C = A0C();
                    if (i != 4) {
                        z = false;
                        if (A0C instanceof C1E3) {
                            boolean z2 = true;
                            if (i != 1 && i != 2) {
                                z2 = false;
                            }
                            int i4 = ((C1E4) this).A00;
                            boolean z3 = true;
                            if (i4 != 1 && i4 != 2) {
                                z3 = false;
                            }
                            if (z2 == z3) {
                                C12T c12t = ((C1E3) A0C).A03;
                                C12W context = A0C.getContext();
                                if (c12t.A02(context)) {
                                    c12t.A05(this, context);
                                    return;
                                }
                                AnonymousClass130 A00 = C2SU.A00();
                                long j = A00.A00;
                                if (j >= 4294967296L) {
                                    A00.A08(this);
                                    return;
                                }
                                A00.A00 = j + 4294967296L;
                                try {
                                    AbstractC89943za.A00(A0C, this, true);
                                    do {
                                    } while (A00.A0A());
                                } finally {
                                    try {
                                        return;
                                    } finally {
                                    }
                                }
                                return;
                            }
                        }
                    }
                    AbstractC89943za.A00(A0C, this, z);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO + (536870911 & i2)));
    }

    private final void A04(int i, Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C13E)) {
                if (obj2 instanceof C107164sM) {
                    C1JW c1jw = (C1JW) obj2;
                    if (C107164sM.A00.compareAndSet(c1jw, 0, 1)) {
                        if (interfaceC16660sJ == null) {
                            return;
                        }
                        A0K(c1jw.A00, interfaceC16660sJ);
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Already resumed, but proposed with update ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
        } while (!C1E0.A00(this, obj2, A00(obj, interfaceC16660sJ, (C13E) obj2, i), atomicReferenceFieldUpdater));
        if (!A07(this)) {
            A0H();
        }
        A03(i);
    }

    private final void A05(Object obj) {
        C53212c3 c53212c3;
        boolean A00;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C24931Ju) {
                A00 = C1E0.A00(this, obj2, obj, atomicReferenceFieldUpdater);
            } else {
                if (!(obj2 instanceof C2QT) && !(obj2 instanceof C13C)) {
                    if (obj2 instanceof C1JW) {
                        C1JW c1jw = (C1JW) obj2;
                        if (C1JW.A01.compareAndSet(c1jw, 0, 1)) {
                            if (!(obj2 instanceof C107164sM)) {
                                return;
                            }
                            Throwable th = c1jw.A00;
                            if (obj instanceof C2QT) {
                                A0L(th, (C2QT) obj);
                                return;
                            } else {
                                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                A06(th, (C13C) obj);
                                return;
                            }
                        }
                    } else {
                        if (obj2 instanceof C53212c3) {
                            C53212c3 c53212c32 = (C53212c3) obj2;
                            if (c53212c32.A04 == null) {
                                if (obj instanceof C13C) {
                                    return;
                                }
                                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                                C2QT c2qt = (C2QT) obj;
                                Throwable th2 = c53212c32.A02;
                                if (th2 != null) {
                                    A0L(th2, c2qt);
                                    return;
                                } else {
                                    c53212c3 = new C53212c3(c53212c32.A01, c53212c32.A00, th2, c53212c32.A03, c2qt);
                                }
                            }
                        } else {
                            if (obj instanceof C13C) {
                                return;
                            }
                            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            c53212c3 = new C53212c3(obj2, null, null, null, (C2QT) obj);
                        }
                        A00 = C1E0.A00(this, obj2, c53212c3, atomicReferenceFieldUpdater);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("It's prohibited to register multiple handlers, tried to register ");
                sb.append(obj);
                sb.append(", already has ");
                sb.append(obj2);
                throw new IllegalStateException(sb.toString());
            }
        } while (!A00);
    }

    private final void A06(Throwable th, C13C c13c) {
        int i = A02.get(this) & 536870911;
        if (i != 536870911) {
            try {
                c13c.A06(th, this.A01, i);
                return;
            } catch (Throwable th2) {
                C12W c12w = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in invokeOnCancellation handler for ");
                sb.append(this);
                CLX.A00(c12w, new RuntimeException(sb.toString(), th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public static final boolean A07(C24891Jo c24891Jo) {
        if (((C1E4) c24891Jo).A00 == 2) {
            InterfaceC23621Ds interfaceC23621Ds = c24891Jo.A00;
            C14360o3.A0C(interfaceC23621Ds, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (C1E3.A04.get(interfaceC23621Ds) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C1E4
    public final Object A09() {
        return A04.get(this);
    }

    @Override // X.C1E4
    public final Object A0A(Object obj) {
        if (obj instanceof C53212c3) {
            return ((C53212c3) obj).A01;
        }
        return obj;
    }

    @Override // X.C1E4
    public final InterfaceC23621Ds A0C() {
        return this.A00;
    }

    @Override // X.C1E4
    public final void A0D(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C13E)) {
                if (!(obj2 instanceof C1JW)) {
                    if (obj2 instanceof C53212c3) {
                        C53212c3 c53212c3 = (C53212c3) obj2;
                        if (c53212c3.A02 != null) {
                            throw new IllegalStateException("Must be called at most once");
                        }
                        Object obj3 = c53212c3.A01;
                        C2QT c2qt = c53212c3.A04;
                        InterfaceC16660sJ interfaceC16660sJ = c53212c3.A03;
                        if (C1E0.A00(this, obj2, new C53212c3(obj3, c53212c3.A00, th, interfaceC16660sJ, c2qt), atomicReferenceFieldUpdater)) {
                            if (c2qt != null) {
                                A0L(th, c2qt);
                            }
                            if (interfaceC16660sJ != null) {
                                A0K(th, interfaceC16660sJ);
                                return;
                            }
                            return;
                        }
                    } else if (C1E0.A00(this, obj2, new C53212c3(obj2, null, th, null, null), atomicReferenceFieldUpdater)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    public final void A0H() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        C19D c19d = (C19D) atomicReferenceFieldUpdater.get(this);
        if (c19d != null) {
            c19d.dispose();
            atomicReferenceFieldUpdater.set(this, C19C.A00);
        }
    }

    public final void A0J() {
        C20730zt c20730zt;
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        if ((interfaceC23621Ds instanceof C1E3) && interfaceC23621Ds != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1E3.A04;
            do {
                Object obj = atomicReferenceFieldUpdater.get(interfaceC23621Ds);
                c20730zt = C1E6.A00;
                if (obj != c20730zt) {
                    if (obj instanceof Throwable) {
                        if (C1E0.A00(interfaceC23621Ds, obj, null, atomicReferenceFieldUpdater)) {
                            Throwable th = (Throwable) obj;
                            if (th == null) {
                                return;
                            }
                            A0H();
                            AGJ(th);
                            return;
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            } while (!C1E0.A00(interfaceC23621Ds, c20730zt, this, atomicReferenceFieldUpdater));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1JW, X.4sM, java.lang.Object] */
    @Override // X.InterfaceC24901Jp
    public final boolean AGJ(Throwable th) {
        Object obj;
        boolean z;
        ?? c1jw;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            boolean z2 = false;
            if (!(obj instanceof C13E)) {
                return false;
            }
            z = obj instanceof C2QT;
            if (z || (obj instanceof C13C)) {
                z2 = true;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C107164sM.A00;
            Throwable th2 = th;
            if (th == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Continuation ");
                sb.append(this);
                sb.append(" was cancelled normally");
                th2 = new CancellationException(sb.toString());
            }
            c1jw = new C1JW(z2, th2);
            c1jw._resumed$volatile = 0;
        } while (!C1E0.A00(this, obj, c1jw, atomicReferenceFieldUpdater));
        if (z) {
            A0L(th, (C2QT) obj);
        } else if (obj instanceof C13C) {
            A06(th, (C13C) obj);
        }
        if (!A07(this)) {
            A0H();
        }
        A03(((C1E4) this).A00);
        return true;
    }

    @Override // X.InterfaceC24901Jp
    public final void AIl(Object obj) {
        A03(((C1E4) this).A00);
    }

    @Override // X.InterfaceC24901Jp
    public final void CPA(final InterfaceC16660sJ interfaceC16660sJ) {
        if (!(interfaceC16660sJ instanceof C2QT)) {
            interfaceC16660sJ = new C2QT(interfaceC16660sJ) { // from class: X.3Iq
                public final InterfaceC16660sJ A00;

                @Override // X.C2QU
                public final void A05(Throwable th) {
                    this.A00.invoke(th);
                }

                @Override // X.InterfaceC16660sJ
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    A05((Throwable) obj);
                    return C0eB.A00;
                }

                public final String toString() {
                    return AnonymousClass001.A0k("InvokeOnCancel[", this.A00.getClass().getSimpleName(), Integer.toHexString(System.identityHashCode(this)), '@', ']');
                }

                {
                    this.A00 = interfaceC16660sJ;
                }
            };
        }
        A05(interfaceC16660sJ);
    }

    @Override // X.InterfaceC24871Jm
    public final void CPB(C13C c13c, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A05(c13c);
    }

    @Override // X.InterfaceC24901Jp
    public final void EKh(InterfaceC16660sJ interfaceC16660sJ, Object obj) {
        A04(((C1E4) this).A00, obj, interfaceC16660sJ);
    }

    @Override // X.InterfaceC24901Jp
    public final void EKp(Object obj, C12T c12t) {
        int i;
        C1E3 c1e3;
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        C12T c12t2 = null;
        if ((interfaceC23621Ds instanceof C1E3) && (c1e3 = (C1E3) interfaceC23621Ds) != null) {
            c12t2 = c1e3.A03;
        }
        if (c12t2 == c12t) {
            i = 4;
        } else {
            i = ((C1E4) this).A00;
        }
        A04(i, obj, null);
    }

    @Override // X.InterfaceC23631Dt
    public final InterfaceC23631Dt getCallerFrame() {
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        if (interfaceC23621Ds instanceof InterfaceC23631Dt) {
            return (InterfaceC23631Dt) interfaceC23621Ds;
        }
        return null;
    }

    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        return this.A01;
    }

    @Override // X.InterfaceC24901Jp
    public final boolean isActive() {
        return A04.get(this) instanceof C13E;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A0F());
        sb.append('(');
        sb.append(CLY.A00(this.A00));
        sb.append("){");
        Object obj = A04.get(this);
        if (obj instanceof C13E) {
            str = "Active";
        } else if (obj instanceof C107164sM) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public C24891Jo(int i, InterfaceC23621Ds interfaceC23621Ds) {
        ((C1E4) this).A00 = i;
        this.A00 = interfaceC23621Ds;
        this.A01 = interfaceC23621Ds.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C24931Ju.A00;
    }

    @Override // X.C1E4
    public final Throwable A0B(Object obj) {
        Throwable A0B = super.A0B(obj);
        if (A0B == null) {
            return null;
        }
        return A0B;
    }

    public final Object A0E() {
        int i;
        AnonymousClass195 anonymousClass195;
        boolean A07 = A07(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (A07) {
                        A0J();
                    }
                    Object obj = A04.get(this);
                    if (obj instanceof C1JW) {
                        throw ((C1JW) obj).A00;
                    }
                    int i3 = ((C1E4) this).A00;
                    if ((i3 == 1 || i3 == 2) && (anonymousClass195 = (AnonymousClass195) this.A01.get(AnonymousClass195.A00)) != null && !anonymousClass195.isActive()) {
                        CancellationException AlP = anonymousClass195.AlP();
                        A0D(obj, AlP);
                        throw AlP;
                    }
                    return A0A(obj);
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (A03.get(this) == null) {
            A01();
        }
        if (A07) {
            A0J();
        }
        return C1JX.A02;
    }

    public Throwable A0G(AnonymousClass195 anonymousClass195) {
        return anonymousClass195.AlP();
    }

    public final void A0I() {
        C19D A01 = A01();
        if (A01 != null && (!(A04.get(this) instanceof C13E))) {
            A01.dispose();
            A03.set(this, C19C.A00);
        }
    }

    public final void A0K(Throwable th, InterfaceC16660sJ interfaceC16660sJ) {
        try {
            interfaceC16660sJ.invoke(th);
        } catch (Throwable th2) {
            C12W c12w = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in resume onCancellation handler for ");
            sb.append(this);
            CLX.A00(c12w, new RuntimeException(sb.toString(), th2));
        }
    }

    public final void A0L(Throwable th, C2QT c2qt) {
        try {
            c2qt.A05(th);
        } catch (Throwable th2) {
            C12W c12w = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            CLX.A00(c12w, new RuntimeException(sb.toString(), th2));
        }
    }

    @Override // X.InterfaceC24901Jp
    public final Object F8r(Object obj, Object obj2, InterfaceC16660sJ interfaceC16660sJ) {
        return A02(obj, interfaceC16660sJ, this);
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        Throwable A00 = C09550e6.A00(obj);
        if (A00 != null) {
            obj = new C1JW(false, A00);
        }
        A04(((C1E4) this).A00, obj, null);
    }
}
