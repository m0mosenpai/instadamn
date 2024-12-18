package androidx.compose.foundation.gestures;

import X.AbstractC119395aw;
import X.C0eB;
import X.C119365at;
import X.C1JX;
import X.C206929Dx;
import X.C6M3;
import X.C6M4;
import X.C6MC;
import X.C6MZ;
import X.C6NY;
import X.C9DH;
import X.EnumC27348C5d;
import X.InterfaceC137936Mt;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;

/* loaded from: classes3.dex */
public final class ScrollingLogic {
    public InterfaceC137936Mt A01;
    public C6MZ A02;
    public C6M3 A03;
    public C6M4 A05;
    public NestedScrollDispatcher A06;
    public boolean A07;
    public int A00 = 1;
    public C6MC A04 = ScrollableKt.A00;
    public final C6NY A08 = new C6NY(this);
    public final InterfaceC16660sJ A09 = new C206929Dx(this, 11);

    public final long A02(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.A03 == C6M3.Horizontal) {
            return AbstractC119395aw.A00(f, 0.0f);
        }
        return AbstractC119395aw.A00(0.0f, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0pT, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r12, long r13) {
        /*
            r11 = this;
            r4 = 1
            boolean r0 = X.C9CY.A00(r12, r4)
            r6 = r11
            if (r0 == 0) goto L4d
            r3 = r12
            X.9CY r3 = (X.C9CY) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L53
            java.lang.Object r8 = r3.A01
            X.0pT r8 = (X.C15130pT) r8
            X.AbstractC09560e7.A00(r1)
        L27:
            long r0 = r8.A00
            X.BFb r2 = new X.BFb
            r2.<init>(r0)
            return r2
        L2f:
            X.AbstractC09560e7.A00(r1)
            X.0pT r8 = new X.0pT
            r8.<init>()
            r9 = r13
            r8.A00 = r13
            X.C5d r0 = X.EnumC27348C5d.Default
            r7 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r5.<init>(r6, r7, r8, r9)
            r3.A01 = r8
            r3.A00 = r4
            java.lang.Object r0 = r11.A03(r0, r3, r5)
            if (r0 != r2) goto L27
            return r2
        L4d:
            X.9CY r3 = new X.9CY
            r3.<init>(r11, r12, r4)
            goto L16
        L53:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A04(X.1Ds, long):java.lang.Object");
    }

    public static final long A00(C6MC c6mc, ScrollingLogic scrollingLogic, int i, long j) {
        long j2;
        long j3;
        NestedScrollNode A00 = scrollingLogic.A06.A00();
        if (A00 != null) {
            j2 = A00.DaA(j, i);
        } else {
            j2 = 0;
        }
        long A06 = C119365at.A06(j, j2);
        int i2 = 2;
        if (scrollingLogic.A03 == C6M3.Horizontal) {
            i2 = 1;
        }
        long A03 = C119365at.A03(0.0f, i2, A06);
        if (scrollingLogic.A07) {
            A03 = C119365at.A05(-1.0f, A03);
        }
        long A02 = scrollingLogic.A02(c6mc.EMD(scrollingLogic.A01(A03)));
        if (scrollingLogic.A07) {
            A02 = C119365at.A05(-1.0f, A02);
        }
        long A062 = C119365at.A06(A06, A02);
        NestedScrollNode A002 = scrollingLogic.A06.A00();
        if (A002 != null) {
            j3 = A002.Da2(A02, A062, i);
        } else {
            j3 = 0;
        }
        return C119365at.A07(C119365at.A07(j2, A02), j3);
    }

    public final float A01(long j) {
        if (this.A03 == C6M3.Horizontal) {
            return C119365at.A01(j);
        }
        return C119365at.A02(j);
    }

    public final Object A03(EnumC27348C5d enumC27348C5d, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object EMA = this.A05.EMA(enumC27348C5d, interfaceC23621Ds, new C9DH(interfaceC16620sF, (InterfaceC23621Ds) null, this, 3));
        if (EMA != C1JX.A02) {
            return C0eB.A00;
        }
        return EMA;
    }

    public ScrollingLogic(InterfaceC137936Mt interfaceC137936Mt, C6MZ c6mz, C6M3 c6m3, C6M4 c6m4, NestedScrollDispatcher nestedScrollDispatcher, boolean z) {
        this.A05 = c6m4;
        this.A01 = interfaceC137936Mt;
        this.A02 = c6mz;
        this.A03 = c6m3;
        this.A07 = z;
        this.A06 = nestedScrollDispatcher;
    }
}
