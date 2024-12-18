package androidx.compose.foundation.gestures;

import X.C25242BFb;
import X.C5E5;
import X.C6M4;
import X.InterfaceC23621Ds;

/* loaded from: classes3.dex */
public final class ScrollableNestedScrollConnection implements C5E5 {
    public boolean A00;
    public final ScrollingLogic A01;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // X.C5E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DZz(X.InterfaceC23621Ds r6, long r7, long r9) {
        /*
            r5 = this;
            r3 = 0
            boolean r0 = r6 instanceof X.MA7
            if (r0 == 0) goto L4c
            r4 = r6
            X.MA7 r4 = (X.MA7) r4
            int r0 = r4.A03
            if (r0 != r3) goto L4c
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L52
            long r9 = r4.A01
            X.AbstractC09560e7.A00(r3)
        L27:
            X.BFb r3 = (X.C25242BFb) r3
            long r0 = r3.A00
            long r0 = X.C25242BFb.A02(r9, r0)
        L2f:
            X.BFb r2 = new X.BFb
            r2.<init>(r0)
            return r2
        L35:
            X.AbstractC09560e7.A00(r3)
            boolean r0 = r5.A00
            if (r0 == 0) goto L49
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r5.A01
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r4, r9)
            if (r3 != r2) goto L27
            return r2
        L49:
            r0 = 0
            goto L2f
        L4c:
            X.MA7 r4 = new X.MA7
            r4.<init>(r5, r6, r3)
            goto L17
        L52:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.DZz(X.1Ds, long, long):java.lang.Object");
    }

    @Override // X.C5E5
    public final long Da2(long j, long j2, int i) {
        if (this.A00) {
            ScrollingLogic scrollingLogic = this.A01;
            if (!scrollingLogic.A05.CcT()) {
                C6M4 c6m4 = scrollingLogic.A05;
                float A01 = scrollingLogic.A01(j2);
                if (scrollingLogic.A07) {
                    A01 *= -1.0f;
                }
                float APr = c6m4.APr(A01);
                if (scrollingLogic.A07) {
                    APr *= -1.0f;
                }
                return scrollingLogic.A02(APr);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.C5E5
    public final /* synthetic */ Object Da5(InterfaceC23621Ds interfaceC23621Ds, long j) {
        return new C25242BFb(0L);
    }

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.A01 = scrollingLogic;
        this.A00 = z;
    }

    @Override // X.C5E5
    public final /* synthetic */ long DaA(long j, int i) {
        return 0L;
    }
}
