package com.instagram.creator.agent.settings.audience;

import X.AbstractC09560e7;
import X.AbstractC133095zb;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C14360o3;
import X.C26082BgB;
import X.C45126Jxv;
import X.C51758Mth;
import X.C5Hc;
import X.C6R;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creator.agent.settings.audience.SelectAccountsUseCase$uiState$1", f = "SelectAccountsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class SelectAccountsUseCase$uiState$1 extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;

    public SelectAccountsUseCase$uiState$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(6, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        SelectAccountsUseCase$uiState$1 selectAccountsUseCase$uiState$1 = new SelectAccountsUseCase$uiState$1((InterfaceC23621Ds) obj6);
        selectAccountsUseCase$uiState$1.A00 = obj;
        selectAccountsUseCase$uiState$1.A01 = obj2;
        selectAccountsUseCase$uiState$1.A02 = obj3;
        selectAccountsUseCase$uiState$1.A03 = obj4;
        selectAccountsUseCase$uiState$1.A04 = obj5;
        return selectAccountsUseCase$uiState$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        Map map = (Map) this.A00;
        List list = (List) this.A01;
        List<C45126Jxv> list2 = (List) this.A02;
        C6R c6r = (C6R) this.A03;
        C6R c6r2 = (C6R) this.A04;
        Collection<C45126Jxv> values = map.values();
        ArrayList A0i = AbstractC167007dF.A0i(values);
        for (C45126Jxv c45126Jxv : values) {
            C14360o3.A0B(c45126Jxv, 0);
            A0i.add(new C51758Mth(c45126Jxv, true));
        }
        C5Hc A00 = AbstractC133095zb.A00(A0i);
        ArrayList<C45126Jxv> A1E = AbstractC166987dD.A1E();
        for (Object obj2 : list) {
            if (!map.containsKey(((C45126Jxv) obj2).A02)) {
                A1E.add(obj2);
            }
        }
        ArrayList A0i2 = AbstractC167007dF.A0i(A1E);
        for (C45126Jxv c45126Jxv2 : A1E) {
            C14360o3.A0B(c45126Jxv2, 0);
            A0i2.add(new C51758Mth(c45126Jxv2, false));
        }
        C5Hc A002 = AbstractC133095zb.A00(A0i2);
        ArrayList A0i3 = AbstractC167007dF.A0i(list2);
        for (C45126Jxv c45126Jxv3 : list2) {
            A0i3.add(new C51758Mth(c45126Jxv3, map.containsKey(c45126Jxv3.A02)));
        }
        return new C26082BgB(c6r, c6r2, A00, A002, AbstractC133095zb.A00(A0i3));
    }
}
