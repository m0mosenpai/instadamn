package com.instagram.business.promote.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C45124Jxt;
import X.C51758Mth;
import X.C66628UPq;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import X.UQJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.business.promote.viewmodel.BoostCreateAudienceViewModel$UiMutableState$flow$3", f = "BoostCreateAudienceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class BoostCreateAudienceViewModel$UiMutableState$flow$3 extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;

    public BoostCreateAudienceViewModel$UiMutableState$flow$3(InterfaceC23621Ds interfaceC23621Ds) {
        super(6, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AbstractC166987dD.A1a(obj4);
        boolean A1a2 = AbstractC166987dD.A1a(obj5);
        BoostCreateAudienceViewModel$UiMutableState$flow$3 boostCreateAudienceViewModel$UiMutableState$flow$3 = new BoostCreateAudienceViewModel$UiMutableState$flow$3((InterfaceC23621Ds) obj6);
        boostCreateAudienceViewModel$UiMutableState$flow$3.A00 = obj;
        boostCreateAudienceViewModel$UiMutableState$flow$3.A01 = obj2;
        boostCreateAudienceViewModel$UiMutableState$flow$3.A02 = obj3;
        boostCreateAudienceViewModel$UiMutableState$flow$3.A03 = A1a;
        boostCreateAudienceViewModel$UiMutableState$flow$3.A04 = A1a2;
        return boostCreateAudienceViewModel$UiMutableState$flow$3.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        return new C45124Jxt((C51758Mth) this.A01, (UQJ) this.A00, (C66628UPq) this.A02, this.A03, this.A04);
    }
}
