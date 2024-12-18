package X;

/* renamed from: X.3HO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HO extends C1UX {
    public final ThreadLocal A00;
    public volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3HO(X.InterfaceC23621Ds r4, X.C12W r5) {
        /*
            r3 = this;
            X.3HP r1 = X.C3HP.A00
            X.12V r0 = r5.get(r1)
            if (r0 != 0) goto L3a
            X.12W r0 = r5.plus(r1)
        Lc:
            r3.<init>(r4, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r3.A00 = r0
            X.12W r1 = r4.getContext()
            X.12c r0 = X.C12X.A00
            X.12V r0 = r1.get(r0)
            boolean r0 = r0 instanceof X.C12T
            if (r0 != 0) goto L39
            r0 = 0
            java.lang.Object r2 = X.C1E8.A00(r0, r5)
            X.C1E8.A01(r2, r5)
            r0 = 1
            r3.threadLocalIsSet = r0
            java.lang.ThreadLocal r1 = r3.A00
            X.0e4 r0 = new X.0e4
            r0.<init>(r5, r2)
            r1.set(r0)
        L39:
            return
        L3a:
            r0 = r5
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3HO.<init>(X.1Ds, X.12W):void");
    }

    @Override // X.C1UX, X.AbstractC23681Dy
    public final void A0X(Object obj) {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.A00;
            C09530e4 c09530e4 = (C09530e4) threadLocal.get();
            if (c09530e4 != null) {
                C1E8.A01(c09530e4.A01, (C12W) c09530e4.A00);
            }
            threadLocal.remove();
        }
        InterfaceC23621Ds interfaceC23621Ds = ((C1UX) this).A00;
        if (obj instanceof C1JW) {
            Throwable th = ((C1JW) obj).A00;
            C14360o3.A0B(th, 0);
            obj = new C09540e5(th);
        }
        C12W context = interfaceC23621Ds.getContext();
        C3HO c3ho = null;
        Object A00 = C1E8.A00(null, context);
        if (A00 != C1E8.A01) {
            c3ho = AbstractC23651Dv.A02(A00, interfaceC23621Ds, context);
        }
        try {
            interfaceC23621Ds.resumeWith(obj);
        } finally {
            if (c3ho == null || c3ho.A0a()) {
                C1E8.A01(A00, context);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r2.A00.get() != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0a() {
        /*
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            if (r0 == 0) goto Ld
            java.lang.ThreadLocal r0 = r2.A00
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 == 0) goto Le
        Ld:
            r1 = 0
        Le:
            java.lang.ThreadLocal r0 = r2.A00
            r0.remove()
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3HO.A0a():boolean");
    }
}
