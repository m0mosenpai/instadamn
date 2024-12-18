package androidx.compose.runtime;

import X.AnonymousClass190;
import X.AnonymousClass577;
import X.C12V;
import X.C12W;
import X.C14360o3;
import X.C57A;
import X.InterfaceC16620sF;
import X.InterfaceC212412b;

/* loaded from: classes3.dex */
public final class PausableMonotonicFrameClock implements AnonymousClass577 {
    public final C57A A00 = new C57A();
    public final AnonymousClass577 A01;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r0 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r1
      0x0025: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v0 java.lang.Object) binds: [B:17:0x007d, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.AnonymousClass577
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FE9(X.InterfaceC23621Ds r9, X.InterfaceC16660sJ r10) {
        /*
            r8 = this;
            r4 = 2
            boolean r0 = X.C206459Cc.A00(r9, r4)
            if (r0 == 0) goto L80
            r3 = r9
            X.9Cc r3 = (X.C206459Cc) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r1 = r3.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r3.A00
            r7 = 1
            if (r0 == 0) goto L32
            if (r0 == r7) goto L26
            if (r0 != r4) goto L86
            X.AbstractC09560e7.A00(r1)
        L25:
            return r1
        L26:
            java.lang.Object r10 = r3.A02
            X.0sJ r10 = (X.InterfaceC16660sJ) r10
            java.lang.Object r0 = r3.A01
            androidx.compose.runtime.PausableMonotonicFrameClock r0 = (androidx.compose.runtime.PausableMonotonicFrameClock) r0
            X.AbstractC09560e7.A00(r1)
            goto L70
        L32:
            X.AbstractC09560e7.A00(r1)
            X.57A r6 = r8.A00
            r3.A01 = r8
            r3.A02 = r10
            r3.A00 = r7
            java.lang.Object r1 = r6.A03
            monitor-enter(r1)
            boolean r0 = r6.A02     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r1)
            if (r0 != 0) goto L5a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C24891Jo.A02
            X.1Ds r0 = X.C1E2.A02(r3)
            X.1Jo r2 = new X.1Jo
            r2.<init>(r7, r0)
            r2.A0I()
            monitor-enter(r1)
            java.util.List r0 = r6.A00     // Catch: java.lang.Throwable -> L8e
            r0.add(r2)     // Catch: java.lang.Throwable -> L8e
            goto L5d
        L5a:
            X.0eB r0 = X.C0eB.A00
            goto L6d
        L5d:
            monitor-exit(r1)
            r1 = 5
            X.9F3 r0 = new X.9F3
            r0.<init>(r1, r6, r2)
            r2.CPA(r0)
            java.lang.Object r0 = r2.A0E()
            if (r0 != r5) goto L5a
        L6d:
            if (r0 == r5) goto L7f
            r0 = r8
        L70:
            X.577 r1 = r0.A01
            r0 = 0
            r3.A01 = r0
            r3.A02 = r0
            r3.A00 = r4
            java.lang.Object r1 = r1.FE9(r3, r10)
            if (r1 != r5) goto L25
        L7f:
            return r5
        L80:
            X.9Cc r3 = new X.9Cc
            r3.<init>(r8, r9, r4)
            goto L15
        L86:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L8e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.FE9(X.1Ds, X.0sJ):java.lang.Object");
    }

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.C12V
    public final /* synthetic */ InterfaceC212412b getKey() {
        return AnonymousClass577.A00;
    }

    public PausableMonotonicFrameClock(AnonymousClass577 anonymousClass577) {
        this.A01 = anonymousClass577;
    }

    @Override // X.C12V, X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A00(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A01(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        return AnonymousClass190.A02(this, c12w);
    }
}
