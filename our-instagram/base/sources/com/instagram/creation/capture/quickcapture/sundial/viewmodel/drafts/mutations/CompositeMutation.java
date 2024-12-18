package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.mutations;

import X.BC2;

/* loaded from: classes9.dex */
public final class CompositeMutation implements BC2 {
    public final BC2[] A00;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004a -> B:12:0x002d). Please report as a decompilation issue!!! */
    @Override // X.BC2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Cq7(X.C128175qm r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 0
            boolean r0 = r10 instanceof X.PWP
            if (r0 == 0) goto L4d
            r7 = r10
            X.PWP r7 = (X.PWP) r7
            int r0 = r7.A05
            if (r0 != r3) goto L4d
            int r2 = r7.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r7.A02 = r2
        L17:
            java.lang.Object r6 = r7.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r7.A02
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L53
            int r3 = r7.A01
            int r2 = r7.A00
            java.lang.Object r1 = r7.A03
            X.BC2[] r1 = (X.BC2[]) r1
            X.AbstractC09560e7.A00(r6)
        L2d:
            X.5qm r6 = (X.C128175qm) r6
            int r2 = r2 + 1
            if (r2 < r3) goto L3c
            return r6
        L34:
            X.AbstractC09560e7.A00(r6)
            X.BC2[] r1 = r8.A00
            r2 = 0
            r6 = r9
            r3 = 2
        L3c:
            r0 = r1[r2]
            r7.A03 = r1
            r7.A00 = r2
            r7.A01 = r3
            r7.A02 = r4
            java.lang.Object r6 = r0.Cq7(r6, r7)
            if (r6 != r5) goto L2d
            return r5
        L4d:
            X.PWP r7 = new X.PWP
            r7.<init>(r8, r10, r3)
            goto L17
        L53:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.mutations.CompositeMutation.Cq7(X.5qm, X.1Ds):java.lang.Object");
    }

    public CompositeMutation(BC2... bc2Arr) {
        this.A00 = bc2Arr;
    }
}
