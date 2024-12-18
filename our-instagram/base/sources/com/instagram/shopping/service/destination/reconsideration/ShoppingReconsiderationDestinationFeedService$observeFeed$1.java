package com.instagram.shopping.service.destination.reconsideration;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167027dH;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C38685GzQ;
import X.C38688GzT;
import X.C41692IdL;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.shopping.service.destination.reconsideration.ShoppingReconsiderationDestinationFeedService$observeFeed$1", f = "ShoppingReconsiderationDestinationFeedService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class ShoppingReconsiderationDestinationFeedService$observeFeed$1 extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ int A00;
    public /* synthetic */ int A01;
    public /* synthetic */ int A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C41692IdL A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingReconsiderationDestinationFeedService$observeFeed$1(C41692IdL c41692IdL, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = c41692IdL;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int A0H = AbstractC166987dD.A0H(obj2);
        int A0H2 = AbstractC166987dD.A0H(obj3);
        int A0H3 = AbstractC166987dD.A0H(obj4);
        ShoppingReconsiderationDestinationFeedService$observeFeed$1 shoppingReconsiderationDestinationFeedService$observeFeed$1 = new ShoppingReconsiderationDestinationFeedService$observeFeed$1(this.A04, (InterfaceC23621Ds) obj5);
        shoppingReconsiderationDestinationFeedService$observeFeed$1.A03 = obj;
        shoppingReconsiderationDestinationFeedService$observeFeed$1.A00 = A0H;
        shoppingReconsiderationDestinationFeedService$observeFeed$1.A01 = A0H2;
        shoppingReconsiderationDestinationFeedService$observeFeed$1.A02 = A0H3;
        return shoppingReconsiderationDestinationFeedService$observeFeed$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C38685GzQ c38685GzQ;
        AbstractC09560e7.A00(obj);
        C38688GzT c38688GzT = (C38688GzT) this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        C38685GzQ c38685GzQ2 = (C38685GzQ) c38688GzT.A00;
        if (c38685GzQ2 != null) {
            c38685GzQ = C41692IdL.A00(c38685GzQ2, i);
        } else {
            c38685GzQ = null;
        }
        C38685GzQ A00 = C41692IdL.A00((C38685GzQ) c38688GzT.A03, i2);
        C38685GzQ A002 = C41692IdL.A00((C38685GzQ) c38688GzT.A01, i3);
        C38685GzQ c38685GzQ3 = (C38685GzQ) c38688GzT.A02;
        AbstractC167027dH.A13(A00, c38685GzQ3, A002);
        return new C38688GzT(c38685GzQ, A00, c38685GzQ3, A002);
    }
}
