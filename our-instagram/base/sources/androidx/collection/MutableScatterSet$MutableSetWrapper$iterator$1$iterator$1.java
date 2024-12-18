package androidx.collection;

import X.AbstractC105074oN;
import X.C0eB;
import X.C12570l1;
import X.C18570vk;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1057}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* loaded from: classes.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 extends AbstractC105074oN implements InterfaceC16620sF {
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
    public final /* synthetic */ C12570l1 A0A;
    public final /* synthetic */ C18570vk A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(C12570l1 c12570l1, C18570vk c18570vk, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0B = c18570vk;
        this.A0A = c12570l1;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this.A0A, this.A0B, interfaceC23621Ds);
        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.A09 = obj;
        return mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        if (r0 == 8) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007e -> B:13:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:5:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0035 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0058 -> B:4:0x0028). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.1JX r11 = X.C1JX.A02
            r12 = r19
            int r0 = r12.A04
            r10 = 8
            r9 = 1
            if (r0 == 0) goto L5b
            int r14 = r12.A03
            int r0 = r12.A02
            long r1 = r12.A05
            int r3 = r12.A01
            int r4 = r12.A00
            java.lang.Object r8 = r12.A08
            long[] r8 = (long[]) r8
            java.lang.Object r7 = r12.A07
            X.01n r7 = (X.AbstractC004801n) r7
            java.lang.Object r6 = r12.A06
            X.0l1 r6 = (X.C12570l1) r6
            java.lang.Object r5 = r12.A09
            X.4oP r5 = (X.C105094oP) r5
            X.AbstractC09560e7.A00(r20)
        L28:
            long r1 = r1 >> r10
            int r14 = r14 + 1
        L2b:
            if (r14 >= r0) goto L8a
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r1 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r13 >= 0) goto L28
            int r15 = r3 << 3
            int r15 = r15 + r14
            r6.A00 = r15
            java.lang.Object[] r13 = r7.A03
            r13 = r13[r15]
            r12.A09 = r5
            r12.A06 = r6
            r12.A07 = r7
            r12.A08 = r8
            r12.A00 = r4
            r12.A01 = r3
            r12.A05 = r1
            r12.A02 = r0
            r12.A03 = r14
            r12.A04 = r9
            X.1JX r13 = r5.A02(r13, r12)
            if (r13 != r11) goto L28
            return r11
        L5b:
            X.AbstractC09560e7.A00(r20)
            java.lang.Object r5 = r12.A09
            X.4oP r5 = (X.C105094oP) r5
            X.0vk r7 = r12.A0B
            X.0l1 r6 = r12.A0A
            long[] r8 = r7.A02
            int r0 = r8.length
            int r4 = r0 + (-2)
            if (r4 < 0) goto L91
            r3 = 0
        L6e:
            r1 = r8[r3]
            r15 = -1
            long r15 = r15 ^ r1
            r0 = 7
            long r15 = r15 << r0
            long r15 = r15 & r1
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r15 = r15 & r13
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L8c
            int r0 = r3 - r4
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r14 = 0
            goto L2b
        L8a:
            if (r0 != r10) goto L91
        L8c:
            if (r3 == r4) goto L91
            int r3 = r3 + 1
            goto L6e
        L91:
            X.0eB r11 = X.C0eB.A00
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
