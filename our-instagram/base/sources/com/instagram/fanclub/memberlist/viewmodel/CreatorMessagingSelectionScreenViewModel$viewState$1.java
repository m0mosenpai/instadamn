package com.instagram.fanclub.memberlist.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC33556EsU;
import X.C0eB;
import X.C16930sl;
import X.C45122Jxr;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fanclub.memberlist.viewmodel.CreatorMessagingSelectionScreenViewModel$viewState$1", f = "CreatorMessagingSelectionScreenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CreatorMessagingSelectionScreenViewModel$viewState$1 extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;

    public CreatorMessagingSelectionScreenViewModel$viewState$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(6, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int A0H = AbstractC166987dD.A0H(obj2);
        CreatorMessagingSelectionScreenViewModel$viewState$1 creatorMessagingSelectionScreenViewModel$viewState$1 = new CreatorMessagingSelectionScreenViewModel$viewState$1((InterfaceC23621Ds) obj6);
        creatorMessagingSelectionScreenViewModel$viewState$1.A01 = obj;
        creatorMessagingSelectionScreenViewModel$viewState$1.A00 = A0H;
        creatorMessagingSelectionScreenViewModel$viewState$1.A02 = obj3;
        creatorMessagingSelectionScreenViewModel$viewState$1.A03 = obj4;
        creatorMessagingSelectionScreenViewModel$viewState$1.A04 = obj5;
        return creatorMessagingSelectionScreenViewModel$viewState$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        List list = (List) this.A01;
        int i = this.A00;
        List list2 = (List) this.A02;
        AbstractC33556EsU abstractC33556EsU = (AbstractC33556EsU) this.A03;
        Map map = (Map) this.A04;
        if (list == null) {
            list = C16930sl.A00;
        }
        return new C45122Jxr(abstractC33556EsU, list, list2, map, i);
    }
}
