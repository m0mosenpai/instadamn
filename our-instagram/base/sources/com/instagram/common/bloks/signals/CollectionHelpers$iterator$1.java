package com.instagram.common.bloks.signals;

import X.AbstractC004601l;
import X.AbstractC105074oN;
import X.AbstractC166987dD;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.common.bloks.signals.CollectionHelpers$iterator$1", f = "CollectionHelpers.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {54}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes5.dex */
public final class CollectionHelpers$iterator$1 extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ AbstractC004601l A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionHelpers$iterator$1(AbstractC004601l abstractC004601l, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0A = abstractC004601l;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        CollectionHelpers$iterator$1 collectionHelpers$iterator$1 = new CollectionHelpers$iterator$1(this.A0A, interfaceC23621Ds);
        collectionHelpers$iterator$1.A09 = obj;
        return collectionHelpers$iterator$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        if (r1 == 8) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:14:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0084 -> B:5:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0034 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005a -> B:4:0x0025). Please report as a decompilation issue!!! */
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
            if (r0 == 0) goto L5d
            int r13 = r11.A03
            int r1 = r11.A02
            long r2 = r11.A05
            int r4 = r11.A01
            int r5 = r11.A00
            java.lang.Object r9 = r11.A08
            long[] r9 = (long[]) r9
            java.lang.Object r8 = r11.A07
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.Object r7 = r11.A06
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.lang.Object r6 = r11.A09
            X.4oP r6 = (X.C105094oP) r6
            X.AbstractC09560e7.A00(r19)
        L25:
            r0 = 8
            long r2 = r2 >> r0
            int r13 = r13 + 1
        L2a:
            if (r13 >= r1) goto L8e
            r14 = 255(0xff, double:1.26E-321)
            long r16 = r2 & r14
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L25
            int r0 = r4 << 3
            int r0 = r0 + r13
            r12 = r7[r0]
            r0 = r8[r0]
            X.0e4 r12 = X.AbstractC166987dD.A1L(r12, r0)
            r11.A09 = r6
            r11.A06 = r7
            r11.A07 = r8
            r11.A08 = r9
            r11.A00 = r5
            r11.A01 = r4
            r11.A05 = r2
            r11.A02 = r1
            r11.A03 = r13
            r0 = 1
            r11.A04 = r0
            X.1JX r0 = r6.A02(r12, r11)
            if (r0 != r10) goto L25
            return r10
        L5d:
            X.AbstractC09560e7.A00(r19)
            java.lang.Object r6 = r11.A09
            X.4oP r6 = (X.C105094oP) r6
            X.01l r0 = r11.A0A
            java.lang.Object[] r7 = r0.A03
            java.lang.Object[] r8 = r0.A04
            long[] r9 = r0.A02
            int r0 = r9.length
            int r5 = r0 + (-2)
            if (r5 < 0) goto L97
            r4 = 0
        L72:
            r2 = r9[r4]
            r14 = -1
            long r14 = r14 ^ r2
            r0 = 7
            long r14 = r14 << r0
            long r14 = r14 & r2
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r12
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L92
            int r0 = r4 - r5
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            int r1 = 8 - r0
            r13 = 0
            goto L2a
        L8e:
            r0 = 8
            if (r1 != r0) goto L97
        L92:
            if (r4 == r5) goto L97
            int r4 = r4 + 1
            goto L72
        L97:
            X.0eB r10 = X.C0eB.A00
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.bloks.signals.CollectionHelpers$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CollectionHelpers$iterator$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
