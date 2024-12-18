package X;

/* renamed from: X.055, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass055 extends C0UG {
    public final InterfaceC19390xP A00;

    public abstract Object A05(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds);

    @Override // X.C0UG
    public final Object A00(InterfaceC71543Iw interfaceC71543Iw, InterfaceC23621Ds interfaceC23621Ds) {
        Object A05 = A05(new C14830ox(interfaceC71543Iw), interfaceC23621Ds);
        if (A05 != C1JX.A02) {
            return C0eB.A00;
        }
        return A05;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // X.C0UG, X.InterfaceC19390xP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(final X.InterfaceC19960yQ r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            int r1 = r6.A00
            r0 = -3
            if (r1 != r0) goto L72
            X.12W r5 = r8.getContext()
            X.12W r2 = r6.A02
            r4 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            X.1Dw r0 = X.C23661Dw.A00
            java.lang.Object r0 = r2.fold(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6d
            X.12W r3 = r5.plus(r2)
        L22:
            boolean r0 = X.C14360o3.A0K(r3, r5)
            if (r0 == 0) goto L33
            java.lang.Object r0 = r6.A05(r7, r8)
        L2c:
            X.1JX r1 = X.C1JX.A02
            if (r0 == r1) goto L32
            X.0eB r0 = X.C0eB.A00
        L32:
            return r0
        L33:
            X.12c r0 = X.C12X.A00
            X.12V r1 = r3.get(r0)
            X.12V r0 = r5.get(r0)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L72
            X.12W r1 = r8.getContext()
            boolean r0 = r7 instanceof X.C14830ox
            if (r0 != 0) goto L55
            boolean r0 = r7 instanceof X.C14860p0
            if (r0 != 0) goto L55
            X.0ow r0 = new X.0ow
            r0.<init>(r1, r7)
            r7 = r0
        L55:
            r0 = 0
            X.0UD r2 = new X.0UD
            r2.<init>(r0, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            X.0sF r0 = X.C1E8.A00
            java.lang.Object r0 = r3.fold(r1, r0)
            X.C14360o3.A0A(r0)
            java.lang.Object r0 = X.AnonymousClass108.A00(r7, r0, r8, r3, r2)
            goto L2c
        L6d:
            X.12W r3 = X.AbstractC23651Dv.A00(r5, r2, r4)
            goto L22
        L72:
            java.lang.Object r0 = super.collect(r7, r8)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass055.collect(X.0yQ, X.1Ds):java.lang.Object");
    }

    @Override // X.C0UG
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(" -> ");
        sb.append(super.toString());
        return sb.toString();
    }

    public AnonymousClass055(Integer num, C12W c12w, InterfaceC19390xP interfaceC19390xP, int i) {
        super(num, c12w, i);
        this.A00 = interfaceC19390xP;
    }
}
