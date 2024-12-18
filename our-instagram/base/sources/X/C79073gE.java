package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3gE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79073gE {
    public final C79063gD A00;
    public final C2X7 A01;
    public final Object A02;
    public final java.util.Set A03 = new HashSet();

    public final void A00() {
        java.util.Set set = this.A03;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C79063gD.A00(this.A00, ((Number) it.next()).longValue());
        }
        set.clear();
    }

    public final void A01(long j, boolean z) {
        if (!(!this.A03.add(Long.valueOf(j)))) {
            C79063gD c79063gD = this.A00;
            if (z) {
                C79063gD.A01(c79063gD, j);
                C51092Wf c51092Wf = c79063gD.A06;
                if (c51092Wf.A06.A05(j) == null) {
                    C79243gV c79243gV = c51092Wf.A02;
                    if (c79243gV != null) {
                        int intValue = ((Number) c79243gV.A02.A06(j, -1)).intValue();
                        C79243gV c79243gV2 = c51092Wf.A02;
                        if (c79243gV2 != null) {
                            c51092Wf.A0G(c79243gV2.A05[intValue]);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            C79063gD.A01(c79063gD, j);
            return;
        }
        throw new IllegalStateException("Cannot acquire the same reference more than once.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r1 <= 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(long r4, boolean r6) {
        /*
            r3 = this;
            java.util.Set r1 = r3.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            boolean r0 = r1.remove(r0)
            if (r0 == 0) goto L4c
            X.3gD r2 = r3.A00
            if (r6 == 0) goto L48
            boolean r0 = r2.A03
            if (r0 != 0) goto L2f
            r0 = 1
        L15:
            X.C79063gD.A00(r2, r4)
            if (r0 == 0) goto L2e
            boolean r0 = r2.A03
            if (r0 == 0) goto L2e
            X.01a r0 = r2.A05
            java.lang.Object r0 = r0.A05(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L42
            int r0 = r0.intValue()
            if (r0 <= 0) goto L42
        L2e:
            return
        L2f:
            X.01a r0 = r2.A05
            java.lang.Object r0 = r0.A05(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L40
            int r1 = r0.intValue()
            r0 = 1
            if (r1 > 0) goto L15
        L40:
            r0 = 0
            goto L15
        L42:
            X.2Wf r0 = r2.A06
            X.C51092Wf.A05(r0, r4)
            return
        L48:
            X.C79063gD.A00(r2, r4)
            return
        L4c:
            java.lang.String r1 = "Trying to release a reference that wasn't acquired."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79073gE.A02(long, boolean):void");
    }

    public C79073gE(C79063gD c79063gD, C2X7 c2x7, Object obj) {
        this.A01 = c2x7;
        this.A00 = c79063gD;
        this.A02 = obj;
    }
}
