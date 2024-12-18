package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89563yw implements InterfaceC23621Ds, InterfaceC23631Dt {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C89563yw.class, Object.class, "result");
    public final InterfaceC23621Ds A00;
    public volatile Object result;

    public C89563yw(InterfaceC23621Ds interfaceC23621Ds) {
        this(C1JX.A04, interfaceC23621Ds);
    }

    public final Object A00() {
        Object obj = this.result;
        C1JX c1jx = C1JX.A04;
        if (obj == c1jx) {
            if (!C1E0.A00(this, c1jx, C1JX.A02, A01)) {
                obj = this.result;
            }
            return C1JX.A02;
        }
        if (obj != C1JX.A03) {
            if (obj instanceof C09540e5) {
                throw ((C09540e5) obj).A00;
            }
            return obj;
        }
        return C1JX.A02;
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
        return this.A00.getContext();
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C1JX c1jx = C1JX.A04;
            if (obj2 == c1jx) {
                if (C1E0.A00(this, c1jx, obj, A01)) {
                    return;
                }
            } else {
                C1JX c1jx2 = C1JX.A02;
                if (obj2 == c1jx2) {
                    if (C1E0.A00(this, c1jx2, C1JX.A03, A01)) {
                        this.A00.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SafeContinuation for ");
        sb.append(this.A00);
        return sb.toString();
    }

    public C89563yw(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        this.A00 = interfaceC23621Ds;
        this.result = obj;
    }
}
