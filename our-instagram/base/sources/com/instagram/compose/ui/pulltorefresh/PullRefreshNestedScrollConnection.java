package com.instagram.compose.ui.pulltorefresh;

import X.AbstractC119395aw;
import X.C119365at;
import X.C25242BFb;
import X.C5E5;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;

/* loaded from: classes8.dex */
public final class PullRefreshNestedScrollConnection implements C5E5 {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16620sF A01;

    @Override // X.C5E5
    public final long Da2(long j, long j2, int i) {
        if (i == 1) {
            float A02 = C119365at.A02(j2);
            if (A02 > 0.0f) {
                return AbstractC119395aw.A00(0.0f, ((Number) this.A00.invoke(Float.valueOf(A02))).floatValue());
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.C5E5
    public final long DaA(long j, int i) {
        if (i == 1) {
            float A02 = C119365at.A02(j);
            if (A02 < 0.0f) {
                return AbstractC119395aw.A00(0.0f, ((Number) this.A00.invoke(Float.valueOf(A02))).floatValue());
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.C5E5
    public final /* synthetic */ Object DZz(InterfaceC23621Ds interfaceC23621Ds, long j, long j2) {
        return new C25242BFb(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.C5E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Da5(X.InterfaceC23621Ds r7, long r8) {
        /*
            r6 = this;
            r3 = 32
            boolean r0 = X.MAS.A03(r7, r3)
            if (r0 == 0) goto L43
            r5 = r7
            X.MAS r5 = (X.MAS) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L48
            X.AbstractC09560e7.A00(r1)
        L24:
            r0 = 0
            X.BFb r4 = new X.BFb
            r4.<init>(r0)
            return r4
        L2c:
            X.AbstractC09560e7.A00(r1)
            X.0sF r2 = r6.A01
            float r1 = X.C25242BFb.A00(r8)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r5.A00 = r3
            java.lang.Object r0 = r2.invoke(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L43:
            X.MAS r5 = X.MAS.A00(r6, r7, r3)
            goto L16
        L48:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.ui.pulltorefresh.PullRefreshNestedScrollConnection.Da5(X.1Ds, long):java.lang.Object");
    }

    public PullRefreshNestedScrollConnection(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16660sJ;
        this.A01 = interfaceC16620sF;
    }
}
