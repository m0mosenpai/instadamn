package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1E3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1E3 extends C1E4 implements InterfaceC23621Ds, InterfaceC23631Dt {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(C1E3.class, Object.class, "_reusableCancellableContinuation$volatile");
    public Object A00;
    public final Object A01;
    public final InterfaceC23621Ds A02;
    public final C12T A03;
    public volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public C1E3(InterfaceC23621Ds interfaceC23621Ds, C12T c12t) {
        ((C1E4) this).A00 = -1;
        this.A03 = c12t;
        this.A02 = interfaceC23621Ds;
        this.A00 = C1E6.A01;
        Object fold = interfaceC23621Ds.getContext().fold(0, C1E8.A00);
        C14360o3.A0A(fold);
        this.A01 = fold;
    }

    @Override // X.C1E4
    public final InterfaceC23621Ds A0C() {
        return this;
    }

    @Override // X.C1E4
    public final void A0D(Object obj, Throwable th) {
    }

    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        return this.A02.getContext();
    }

    @Override // X.C1E4
    public final Object A09() {
        Object obj = this.A00;
        this.A00 = C1E6.A01;
        return obj;
    }

    @Override // X.InterfaceC23631Dt
    public final InterfaceC23631Dt getCallerFrame() {
        InterfaceC23621Ds interfaceC23621Ds = this.A02;
        if (interfaceC23621Ds instanceof InterfaceC23631Dt) {
            return (InterfaceC23631Dt) interfaceC23621Ds;
        }
        return null;
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        InterfaceC23621Ds interfaceC23621Ds = this.A02;
        C12W context = interfaceC23621Ds.getContext();
        Object obj2 = obj;
        Throwable A00 = C09550e6.A00(obj);
        if (A00 != null) {
            obj2 = new C1JW(false, A00);
        }
        C12T c12t = this.A03;
        if (c12t.A02(context)) {
            this.A00 = obj2;
            ((C1E4) this).A00 = 0;
            c12t.A05(this, context);
            return;
        }
        AnonymousClass130 A002 = C2SU.A00();
        long j = A002.A00;
        if (j >= 4294967296L) {
            this.A00 = obj2;
            ((C1E4) this).A00 = 0;
            A002.A08(this);
            return;
        }
        A002.A00 = j + 4294967296L;
        try {
            C12W context2 = interfaceC23621Ds.getContext();
            Object A003 = C1E8.A00(this.A01, context2);
            try {
                interfaceC23621Ds.resumeWith(obj);
                do {
                } while (A002.A0A());
            } finally {
                C1E8.A01(A003, context2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(CLY.A00(this.A02));
        sb.append(']');
        return sb.toString();
    }
}
