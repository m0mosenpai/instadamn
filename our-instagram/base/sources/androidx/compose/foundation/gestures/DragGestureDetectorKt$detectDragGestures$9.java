package androidx.compose.foundation.gestures;

import X.AbstractC105074oN;
import X.AbstractC166987dD;
import X.C0eB;
import X.C15130pT;
import X.C6M3;
import X.InterfaceC16610sE;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {247, 253, 972, 1014, 1025}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
/* loaded from: classes5.dex */
public final class DragGestureDetectorKt$detectDragGestures$9 extends AbstractC105074oN implements InterfaceC16620sF {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ C6M3 A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;
    public final /* synthetic */ InterfaceC16820sZ A0C;
    public final /* synthetic */ InterfaceC16660sJ A0D;
    public final /* synthetic */ InterfaceC16620sF A0E;
    public final /* synthetic */ InterfaceC16610sE A0F;
    public final /* synthetic */ C15130pT A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$9(C6M3 c6m3, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE, C15130pT c15130pT) {
        super(2, interfaceC23621Ds);
        this.A0C = interfaceC16820sZ;
        this.A0G = c15130pT;
        this.A0A = c6m3;
        this.A0F = interfaceC16610sE;
        this.A0E = interfaceC16620sF;
        this.A0B = interfaceC16820sZ2;
        this.A0D = interfaceC16660sJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC16820sZ interfaceC16820sZ = this.A0C;
        C15130pT c15130pT = this.A0G;
        C6M3 c6m3 = this.A0A;
        InterfaceC16610sE interfaceC16610sE = this.A0F;
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(c6m3, interfaceC23621Ds, interfaceC16820sZ, this.A0B, this.A0D, this.A0E, interfaceC16610sE, c15130pT);
        dragGestureDetectorKt$detectDragGestures$9.A09 = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0205, code lost:
    
        if (r12 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r1 == 0.0f) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0202, code lost:
    
        if (r12.A02() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0230, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.A09(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r4).A04.A01, r0) != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0278 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0276 -> B:10:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01a1 -> B:54:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01bc -> B:54:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01dc -> B:52:0x01fe). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGestures$9) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
