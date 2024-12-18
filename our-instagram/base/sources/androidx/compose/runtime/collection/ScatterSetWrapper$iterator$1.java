package androidx.compose.runtime.collection;

import X.AbstractC105074oN;
import X.AbstractC166987dD;
import X.C0eB;
import X.C1127457f;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes5.dex */
public final class ScatterSetWrapper$iterator$1 extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ C1127457f A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSetWrapper$iterator$1(C1127457f c1127457f, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A09 = c1127457f;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ScatterSetWrapper$iterator$1 scatterSetWrapper$iterator$1 = new ScatterSetWrapper$iterator$1(this.A09, interfaceC23621Ds);
        scatterSetWrapper$iterator$1.A08 = obj;
        return scatterSetWrapper$iterator$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        if (r0 == 8) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:13:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:5:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0031 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x004e -> B:4:0x0024). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            X.1JX r10 = X.C1JX.A02
            r11 = r18
            int r0 = r11.A04
            r9 = 8
            r8 = 1
            if (r0 == 0) goto L51
            int r13 = r11.A03
            int r0 = r11.A02
            long r1 = r11.A05
            int r7 = r11.A01
            int r3 = r11.A00
            java.lang.Object r6 = r11.A07
            long[] r6 = (long[]) r6
            java.lang.Object r5 = r11.A06
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r4 = r11.A08
            X.4oP r4 = (X.C105094oP) r4
            X.AbstractC09560e7.A00(r19)
        L24:
            long r1 = r1 >> r9
            int r13 = r13 + 1
        L27:
            if (r13 >= r0) goto L82
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r1
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r12 >= 0) goto L24
            int r12 = r7 << 3
            int r12 = r12 + r13
            r12 = r5[r12]
            r11.A08 = r4
            r11.A06 = r5
            r11.A07 = r6
            r11.A00 = r3
            r11.A01 = r7
            r11.A05 = r1
            r11.A02 = r0
            r11.A03 = r13
            r11.A04 = r8
            X.1JX r12 = r4.A02(r12, r11)
            if (r12 != r10) goto L24
            return r10
        L51:
            X.AbstractC09560e7.A00(r19)
            java.lang.Object r4 = r11.A08
            X.4oP r4 = (X.C105094oP) r4
            X.57f r0 = r11.A09
            X.01n r0 = r0.A00
            java.lang.Object[] r5 = r0.A03
            long[] r6 = r0.A02
            int r0 = r6.length
            int r3 = r0 + (-2)
            if (r3 < 0) goto L89
            r7 = 0
        L66:
            r1 = r6[r7]
            r14 = -1
            long r14 = r14 ^ r1
            r0 = 7
            long r14 = r14 << r0
            long r14 = r14 & r1
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r12
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L84
            int r0 = r7 - r3
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r13 = 0
            goto L27
        L82:
            if (r0 != r9) goto L89
        L84:
            if (r7 == r3) goto L89
            int r7 = r7 + 1
            goto L66
        L89:
            X.0eB r10 = X.C0eB.A00
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScatterSetWrapper$iterator$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
