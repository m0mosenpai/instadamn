package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* renamed from: X.0U7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0U7 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16610sE A07;
    public final /* synthetic */ InterfaceC19960yQ A08;
    public final /* synthetic */ InterfaceC19390xP[] A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U7(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16610sE interfaceC16610sE, InterfaceC19960yQ interfaceC19960yQ, InterfaceC19390xP[] interfaceC19390xPArr) {
        super(2, interfaceC23621Ds);
        this.A09 = interfaceC19390xPArr;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16610sE;
        this.A08 = interfaceC19960yQ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C0U7 c0u7 = new C0U7(interfaceC23621Ds, this.A06, this.A07, this.A08, this.A09);
        c0u7.A05 = obj;
        return c0u7;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0U7) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r3 = r1.A00;
        r4 = r6[r3];
        r6[r3] = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r4 != X.AbstractC20780zy.A02) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r2[r3] == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        r2[r3] = (byte) r5;
        r1 = r7.F8q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if ((r1 instanceof X.C2QW) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        r1 = (X.C0eP) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        if (r1 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (r8 != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        r3 = r20.A06.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r1 = r20.A07;
        r0 = r20.A08;
        r20.A05 = r6;
        r20.A03 = r7;
        r20.A04 = r2;
        r20.A00 = r8;
        r20.A01 = r5;
        r20.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r1.invoke(r0, r6, r20) == r11) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        java.lang.System.arraycopy(r6, 0, r3, 0, r6.length);
        r1 = r20.A07;
        r0 = r20.A08;
        r20.A05 = r6;
        r20.A03 = r7;
        r20.A04 = r2;
        r20.A00 = r8;
        r20.A01 = r5;
        r20.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        if (r1.invoke(r0, r3, r20) != r11) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0023, code lost:
    
        if (r8 != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (r1 == r11) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.1Iq, X.1Ip] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.1Is, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.1Is, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.1Is] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c6 -> B:6:0x0023). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e2 -> B:6:0x0023). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
