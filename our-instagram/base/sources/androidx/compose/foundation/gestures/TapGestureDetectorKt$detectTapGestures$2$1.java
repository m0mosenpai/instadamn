package androidx.compose.foundation.gestures;

import X.AbstractC105074oN;
import X.AbstractC166987dD;
import X.C0eB;
import X.C19L;
import X.InterfaceC16610sE;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
public final class TapGestureDetectorKt$detectTapGestures$2$1 extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ PressGestureScopeImpl A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16610sE A0A;
    public final /* synthetic */ C19L A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2$1(PressGestureScopeImpl pressGestureScopeImpl, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16610sE interfaceC16610sE, C19L c19l) {
        super(2, interfaceC23621Ds);
        this.A0B = c19l;
        this.A0A = interfaceC16610sE;
        this.A08 = interfaceC16660sJ;
        this.A07 = interfaceC16660sJ2;
        this.A09 = interfaceC16660sJ3;
        this.A06 = pressGestureScopeImpl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C19L c19l = this.A0B;
        InterfaceC16610sE interfaceC16610sE = this.A0A;
        TapGestureDetectorKt$detectTapGestures$2$1 tapGestureDetectorKt$detectTapGestures$2$1 = new TapGestureDetectorKt$detectTapGestures$2$1(this.A06, interfaceC23621Ds, this.A08, this.A07, this.A09, interfaceC16610sE, c19l);
        tapGestureDetectorKt$detectTapGestures$2$1.A05 = obj;
        return tapGestureDetectorKt$detectTapGestures$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x010a, code lost:
    
        if (r0 != null) goto L47;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8 A[Catch: X2B -> 0x00cf, TryCatch #0 {X2B -> 0x00cf, blocks: (B:17:0x00b2, B:19:0x00b8, B:44:0x00c1), top: B:16:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[Catch: X2B -> 0x00cf, TRY_LEAVE, TryCatch #0 {X2B -> 0x00cf, blocks: (B:17:0x00b2, B:19:0x00b8, B:44:0x00c1), top: B:16:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0092  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$detectTapGestures$2$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
