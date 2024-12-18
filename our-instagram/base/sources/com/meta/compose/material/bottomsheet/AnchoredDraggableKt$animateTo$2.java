package com.meta.compose.material.bottomsheet;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.AbstractC25236BEt;
import X.C0eB;
import X.C1JX;
import X.C28003CWa;
import X.C30486DbV;
import X.C5Y6;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.compose.material.bottomsheet.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {664}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class AnchoredDraggableKt$animateTo$2 extends AbstractC23611Dp implements InterfaceC16600sD {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ AnchoredDraggableState A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, InterfaceC23621Ds interfaceC23621Ds, float f) {
        super(4, interfaceC23621Ds);
        this.A05 = anchoredDraggableState;
        this.A04 = f;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.A05, (InterfaceC23621Ds) obj4, this.A04);
        anchoredDraggableKt$animateTo$2.A01 = obj;
        anchoredDraggableKt$animateTo$2.A02 = obj2;
        anchoredDraggableKt$animateTo$2.A03 = obj3;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0pO, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            Object obj2 = this.A01;
            float A00 = ((C28003CWa) this.A02).A00(this.A03);
            if (!Float.isNaN(A00)) {
                ?? obj3 = new Object();
                AnchoredDraggableState anchoredDraggableState = this.A05;
                float A002 = AbstractC25236BEt.A00(anchoredDraggableState.A03);
                obj3.A00 = A002;
                float f = this.A04;
                C5Y6 c5y6 = anchoredDraggableState.A00;
                C30486DbV c30486DbV = new C30486DbV(6, obj2, obj3);
                this.A01 = null;
                this.A02 = null;
                this.A00 = 1;
                if (SuspendAnimationKt.A03(c5y6, this, c30486DbV, A002, A00, f) == c1jx) {
                    return c1jx;
                }
            }
        }
        return C0eB.A00;
    }
}
