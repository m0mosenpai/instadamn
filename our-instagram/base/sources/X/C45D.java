package X;

import java.io.Serializable;

/* renamed from: X.45D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45D implements Serializable {
    public transient C910644i A00 = new C910644i(20, 200);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if ((!r1.A02.isEmpty()) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C913945y A00(X.C45T r7, java.lang.Class r8) {
        /*
            r6 = this;
            X.TIj r5 = new X.TIj
            r5.<init>(r8)
            X.44i r4 = r6.A00
            java.util.concurrent.ConcurrentHashMap r0 = r4.A00
            java.lang.Object r1 = r0.get(r5)
            X.45y r1 = (X.C913945y) r1
            if (r1 != 0) goto L53
            X.45B r1 = r7.A02(r8)
            X.44W r0 = r7.A00()
            X.454 r1 = r1.A07
            boolean r0 = r0 instanceof X.C44V
            if (r0 == 0) goto L48
            java.lang.Class<com.fasterxml.jackson.annotation.JsonRootName> r0 = com.fasterxml.jackson.annotation.JsonRootName.class
            java.lang.annotation.Annotation r3 = r1.A06(r0)
            com.fasterxml.jackson.annotation.JsonRootName r3 = (com.fasterxml.jackson.annotation.JsonRootName) r3
            r2 = 0
            if (r3 == 0) goto L48
            java.lang.String r1 = r3.namespace()
            if (r1 == 0) goto L54
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L54
        L36:
            java.lang.String r0 = r3.value()
            X.45y r1 = X.C913945y.A01(r0, r2)
            java.lang.String r0 = r1.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L50
        L48:
            java.lang.String r0 = r8.getSimpleName()
            X.45y r1 = X.C913945y.A00(r0)
        L50:
            r4.A00(r5, r1)
        L53:
            return r1
        L54:
            r2 = r1
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45D.A00(X.45T, java.lang.Class):X.45y");
    }
}
