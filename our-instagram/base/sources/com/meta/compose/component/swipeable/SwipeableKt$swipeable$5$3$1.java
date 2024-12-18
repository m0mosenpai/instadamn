package com.meta.compose.component.swipeable;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25227BEk;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C30487DbW;
import X.CV5;
import X.InterfaceC1128957x;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.compose.component.swipeable.SwipeableKt$swipeable$5$3$1", f = "Swipeable.kt", i = {}, l = {563}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SwipeableKt$swipeable$5$3$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ InterfaceC1128957x A02;
    public final /* synthetic */ CV5 A03;
    public final /* synthetic */ SwipeableState A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ InterfaceC16620sF A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$5$3$1(InterfaceC1128957x interfaceC1128957x, CV5 cv5, SwipeableState swipeableState, Map map, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF, float f) {
        super(2, interfaceC23621Ds);
        this.A04 = swipeableState;
        this.A05 = map;
        this.A03 = cv5;
        this.A02 = interfaceC1128957x;
        this.A06 = interfaceC16620sF;
        this.A01 = f;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        SwipeableState swipeableState = this.A04;
        Map map = this.A05;
        return new SwipeableKt$swipeable$5$3$1(this.A02, this.A03, swipeableState, map, interfaceC23621Ds, this.A06, this.A01);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            SwipeableState swipeableState = this.A04;
            InterfaceC74953Yl interfaceC74953Yl = swipeableState.A05;
            Map map = (Map) interfaceC74953Yl.getValue();
            Map map2 = this.A05;
            C14360o3.A0B(map2, 0);
            interfaceC74953Yl.Egh(map2);
            swipeableState.A0B.Egh(this.A03);
            InterfaceC16620sF interfaceC16620sF = this.A06;
            InterfaceC1128957x interfaceC1128957x = this.A02;
            swipeableState.A0C.Egh(C30487DbW.A00(map2, interfaceC16620sF, interfaceC1128957x, 35));
            AbstractC25227BEk.A18(swipeableState.A0D, interfaceC1128957x.EqT(this.A01));
            this.A00 = 1;
            if (swipeableState.A02(map, map2, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SwipeableKt$swipeable$5$3$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
