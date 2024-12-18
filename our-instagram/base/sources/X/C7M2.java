package X;

/* renamed from: X.7M2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7M2 {
    public C09530e4 A00;

    public final void A00(int i) {
        C09530e4 c09530e4;
        Object obj;
        C09530e4 c09530e42 = this.A00;
        if (c09530e42 != null) {
            if (i <= ((Number) c09530e42.A00).intValue()) {
                obj = Integer.valueOf(i);
            } else if (i >= ((Number) c09530e42.A01).intValue()) {
                c09530e4 = new C09530e4(c09530e42.A00, Integer.valueOf(i));
            } else {
                obj = c09530e42.A00;
            }
            c09530e4 = new C09530e4(obj, Integer.valueOf(((Number) c09530e42.A01).intValue() + 1));
        } else {
            Integer valueOf = Integer.valueOf(i);
            c09530e4 = new C09530e4(valueOf, valueOf);
        }
        this.A00 = c09530e4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(int r4) {
        /*
            r3 = this;
            X.0e4 r1 = r3.A00
            if (r1 == 0) goto L31
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r4 > r0) goto L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.A01
        L14:
            X.0e4 r1 = new X.0e4
            r1.<init>(r2, r0)
        L19:
            r3.A00 = r1
            return
        L1c:
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r4 < r0) goto L2d
            java.lang.Object r2 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L14
        L2d:
            X.0e4 r1 = r3.A00
            if (r1 != 0) goto L19
        L31:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            X.0e4 r1 = new X.0e4
            r1.<init>(r0, r0)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7M2.A01(int):void");
    }

    public final void A02(int i) {
        C09530e4 c09530e4;
        Object obj;
        int max;
        Integer valueOf;
        C09530e4 c09530e42 = this.A00;
        if (c09530e42 != null) {
            if (i <= ((Number) c09530e42.A00).intValue()) {
                obj = Integer.valueOf(i);
                max = Math.max(i, ((Number) c09530e42.A01).intValue() - 1);
            } else {
                int intValue = ((Number) c09530e42.A01).intValue();
                obj = c09530e42.A00;
                if (i >= intValue) {
                    valueOf = Integer.valueOf(i);
                    c09530e4 = new C09530e4(obj, valueOf);
                } else {
                    max = Math.max(((Number) obj).intValue(), r2.intValue() - 1);
                }
            }
            valueOf = Integer.valueOf(max);
            c09530e4 = new C09530e4(obj, valueOf);
        } else {
            Integer valueOf2 = Integer.valueOf(i);
            c09530e4 = new C09530e4(valueOf2, valueOf2);
        }
        this.A00 = c09530e4;
    }
}
