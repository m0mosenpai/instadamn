package X;

/* renamed from: X.9Cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206679Cy extends AbstractC23611Dp implements InterfaceC16610sE {
    public Object A00;
    public boolean A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206679Cy(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C206679Cy c206679Cy;
        if (this.A02 != 0) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            c206679Cy = new C206679Cy(1, (InterfaceC23621Ds) obj3);
            c206679Cy.A01 = booleanValue;
            c206679Cy.A00 = obj2;
        } else {
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            c206679Cy = new C206679Cy(0, (InterfaceC23621Ds) obj3);
            c206679Cy.A00 = obj;
            c206679Cy.A01 = booleanValue2;
        }
        return c206679Cy.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r2 == X.EnumC58212ld.A04) goto L8;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            if (r0 == 0) goto L18
            X.AbstractC09560e7.A00(r4)
            boolean r0 = r3.A01
            java.lang.Object r2 = r3.A00
            if (r0 == 0) goto L12
            X.2ld r1 = X.EnumC58212ld.A04
            r0 = 1
            if (r2 != r1) goto L13
        L12:
            r0 = 0
        L13:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L18:
            X.AbstractC09560e7.A00(r4)
            java.lang.Object r1 = r3.A00
            boolean r0 = r3.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.0e4 r2 = new X.0e4
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206679Cy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
