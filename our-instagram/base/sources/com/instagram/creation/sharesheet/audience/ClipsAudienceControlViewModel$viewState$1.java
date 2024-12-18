package com.instagram.creation.sharesheet.audience;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C50991Mfy;
import X.C51611Mr4;
import X.EnumC53105NeI;
import X.EnumC53134Nen;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.sharesheet.audience.ClipsAudienceControlViewModel$viewState$1", f = "ClipsAudienceControlViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ClipsAudienceControlViewModel$viewState$1 extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ int A00;
    public /* synthetic */ int A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C50991Mfy A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsAudienceControlViewModel$viewState$1(C50991Mfy c50991Mfy, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = c50991Mfy;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int A0H = AbstractC166987dD.A0H(obj);
        int A0H2 = AbstractC166987dD.A0H(obj4);
        ClipsAudienceControlViewModel$viewState$1 clipsAudienceControlViewModel$viewState$1 = new ClipsAudienceControlViewModel$viewState$1(this.A04, (InterfaceC23621Ds) obj5);
        clipsAudienceControlViewModel$viewState$1.A00 = A0H;
        clipsAudienceControlViewModel$viewState$1.A02 = obj2;
        clipsAudienceControlViewModel$viewState$1.A03 = obj3;
        clipsAudienceControlViewModel$viewState$1.A01 = A0H2;
        return clipsAudienceControlViewModel$viewState$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        int i = this.A00;
        return new C51611Mr4((EnumC53134Nen) this.A03, (EnumC53105NeI) this.A02, i, this.A01, this.A04.A0A);
    }
}
