package androidx.compose.foundation.lazy.layout;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C6M8;
import X.InterfaceC1128957x;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {174, 272}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
/* loaded from: classes5.dex */
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ int A09;
    public final /* synthetic */ int A0A;
    public final /* synthetic */ int A0B;
    public final /* synthetic */ C6M8 A0C;
    public final /* synthetic */ InterfaceC1128957x A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(C6M8 c6m8, InterfaceC1128957x interfaceC1128957x, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A09 = i;
        this.A0D = interfaceC1128957x;
        this.A0C = c6m8;
        this.A0B = i2;
        this.A0A = i3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i = this.A09;
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.A0C, this.A0D, interfaceC23621Ds, i, this.A0B, this.A0A);
        lazyAnimateScrollKt$animateScrollToItem$2.A08 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0183: INVOKE (r0v7 ?? I:X.DHY), (r2 I:java.lang.Object), (r1 I:java.lang.Object), (r3 I:float), (r15 I:int) DIRECT call: X.DHY.<init>(java.lang.Object, java.lang.Object, float, int):void A[MD:(java.lang.Object, java.lang.Object, float, int):void (m)] (LINE:387), block:B:51:0x0159 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[Catch: D3Y -> 0x0158, TryCatch #0 {D3Y -> 0x0158, blocks: (B:11:0x013b, B:12:0x013e, B:13:0x0094, B:15:0x0098, B:17:0x00a2, B:19:0x00ba, B:22:0x00c6, B:27:0x00fd, B:38:0x004c, B:43:0x0085, B:45:0x008d, B:46:0x0146, B:47:0x0157), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.0pO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.6MC] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.6M8] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0pQ, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0138 -> B:12:0x013e). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
