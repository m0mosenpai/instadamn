package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Dq, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Dq extends C1Dr {
    public final C12W _context;
    public transient InterfaceC23621Ds intercepted;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1Dq(X.InterfaceC23621Ds r2) {
        /*
            r1 = this;
            if (r2 == 0) goto La
            X.12W r0 = r2.getContext()
        L6:
            r1.<init>(r2, r0)
            return
        La:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Dq.<init>(X.1Ds):void");
    }

    @Override // X.InterfaceC23621Ds
    public C12W getContext() {
        C12W c12w = this._context;
        C14360o3.A0A(c12w);
        return c12w;
    }

    public final InterfaceC23621Ds intercepted() {
        InterfaceC23621Ds interfaceC23621Ds = this.intercepted;
        if (interfaceC23621Ds == null) {
            C12X c12x = (C12X) getContext().get(C12X.A00);
            if (c12x != null) {
                interfaceC23621Ds = new C1E3(this, (C12T) c12x);
            } else {
                interfaceC23621Ds = this;
            }
            this.intercepted = interfaceC23621Ds;
        }
        return interfaceC23621Ds;
    }

    @Override // X.C1Dr
    public void releaseIntercepted() {
        C24891Jo c24891Jo;
        InterfaceC23621Ds interfaceC23621Ds = this.intercepted;
        if (interfaceC23621Ds != null && interfaceC23621Ds != this) {
            C14360o3.A0A(getContext().get(C12X.A00));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1E3.A04;
            do {
            } while (atomicReferenceFieldUpdater.get(interfaceC23621Ds) == C1E6.A00);
            Object obj = atomicReferenceFieldUpdater.get(interfaceC23621Ds);
            if ((obj instanceof C24891Jo) && (c24891Jo = (C24891Jo) obj) != null) {
                c24891Jo.A0H();
            }
        }
        this.intercepted = C2Qm.A00;
    }

    public C1Dq(InterfaceC23621Ds interfaceC23621Ds, C12W c12w) {
        super(interfaceC23621Ds);
        this._context = c12w;
    }
}
