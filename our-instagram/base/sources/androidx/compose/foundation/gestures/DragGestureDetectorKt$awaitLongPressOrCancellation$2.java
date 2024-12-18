package androidx.compose.foundation.gestures;

import X.AbstractC105074oN;
import X.AbstractC166987dD;
import X.C0eB;
import X.C15370ps;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {901, 918}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes5.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C15370ps A04;
    public final /* synthetic */ C15370ps A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, C15370ps c15370ps2) {
        super(2, interfaceC23621Ds);
        this.A04 = c15370ps;
        this.A05 = c15370ps2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(interfaceC23621Ds, this.A04, this.A05);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.A03 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r12.A00 = r1;
        r18.A05.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r5 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0032 A[EDGE_INSN: B:62:0x0032->B:13:0x0032 BREAK  A[LOOP:0: B:7:0x0025->B:10:0x0097], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f0 -> B:6:0x001c). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
