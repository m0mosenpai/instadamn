package X;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.49n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC918549n {
    public static final Object A02(InterfaceC23621Ds interfaceC23621Ds, InterfaceC50122Sb[] interfaceC50122SbArr) {
        if (interfaceC50122SbArr.length == 0) {
            return C16930sl.A00;
        }
        return new C918649o(interfaceC50122SbArr).A00(interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(java.util.Collection r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 39
            boolean r0 = X.C29631D3m.A03(r7, r3)
            if (r0 == 0) goto L47
            r5 = r7
            X.D3m r5 = (X.C29631D3m) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L3f
            if (r0 != r2) goto L50
            java.lang.Object r1 = r5.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.AbstractC09560e7.A00(r4)
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r1.next()
            X.195 r0 = (X.AnonymousClass195) r0
            r5.A01 = r1
            r5.A00 = r2
            java.lang.Object r0 = r0.CgU(r5)
            if (r0 != r3) goto L28
            return r3
        L3f:
            X.AbstractC09560e7.A00(r4)
            java.util.Iterator r1 = r6.iterator()
            goto L28
        L47:
            X.D3m r5 = new X.D3m
            r5.<init>(r3, r7)
            goto L16
        L4d:
            X.0eB r3 = X.C0eB.A00
            return r3
        L50:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC918549n.A01(java.util.Collection, X.1Ds):java.lang.Object");
    }

    public static final Object A00(Collection collection, InterfaceC23621Ds interfaceC23621Ds) {
        if (collection.isEmpty()) {
            return C16930sl.A00;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C918649o.A01;
        return new C918649o((InterfaceC50122Sb[]) collection.toArray(new InterfaceC50122Sb[0])).A00(interfaceC23621Ds);
    }
}
