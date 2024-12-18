package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class RBc extends RBd implements Serializable {
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.C16L r7, X.AnonymousClass469 r8) {
        /*
            r6 = this;
            boolean r0 = r7.A0b()
            if (r0 == 0) goto L20
            java.lang.Object r1 = r7.A0X()
            if (r1 == 0) goto L20
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L1b
            java.lang.String r1 = (java.lang.String) r1
        L12:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r6.A08(r8, r1)
            java.lang.Object r1 = r0.A0D(r7, r8)
        L1a:
            return r1
        L1b:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L12
        L20:
            X.16R r1 = r7.A10()
            X.16R r5 = X.C16R.A0D
            r3 = 0
            if (r1 != r5) goto L4b
            X.16R r0 = r7.A1J()
            X.16R r4 = X.C16R.A0A
            if (r0 == r4) goto L5f
            X.44l r0 = r6.A02
            java.lang.String r2 = "need JSON String that contains type id (for subtype of "
            java.lang.Class r0 = r0.A00
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ")"
            java.lang.String r1 = X.AnonymousClass001.A0g(r2, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r8.A0U(r4, r1, r0)
        L46:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L4b:
            X.16R r0 = X.C16R.A0A
            if (r1 == r0) goto L5f
            X.44l r0 = r6.A02
            java.lang.String r1 = "need JSON Object to contain As.WRAPPER_OBJECT type information for class "
            java.lang.Class r0 = r0.A00
            java.lang.String r1 = X.AbstractC58319PtB.A0t(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r8.A0U(r5, r1, r0)
            goto L46
        L5f:
            java.lang.String r2 = r7.A1P()
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r6.A08(r8, r2)
            r7.A1J()
            boolean r0 = r6.A07
            if (r0 == 0) goto L72
            X.16L r7 = X.RBd.A00(r7, r5, r8, r6, r2)
        L72:
            java.lang.Object r1 = r1.A0D(r7, r8)
            X.16R r0 = r7.A1J()
            X.16R r2 = X.C16R.A09
            if (r0 == r2) goto L1a
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "expected closing END_OBJECT after type information and deserialized value"
            r8.A0U(r2, r0, r1)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RBc.A09(X.16L, X.469):java.lang.Object");
    }
}
