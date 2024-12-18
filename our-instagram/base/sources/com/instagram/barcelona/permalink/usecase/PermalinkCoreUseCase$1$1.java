package com.instagram.barcelona.permalink.usecase;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C45118Jxn;
import X.C45125Jxu;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.usecase.PermalinkCoreUseCase$1$1", f = "PermalinkCoreUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class PermalinkCoreUseCase$1$1 extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;

    public PermalinkCoreUseCase$1$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AbstractC166987dD.A1a(obj3);
        PermalinkCoreUseCase$1$1 permalinkCoreUseCase$1$1 = new PermalinkCoreUseCase$1$1((InterfaceC23621Ds) obj5);
        permalinkCoreUseCase$1$1.A00 = obj;
        permalinkCoreUseCase$1$1.A01 = obj2;
        permalinkCoreUseCase$1$1.A03 = A1a;
        permalinkCoreUseCase$1$1.A02 = obj4;
        return permalinkCoreUseCase$1$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        return new C45125Jxu((C45118Jxn) this.A00, (Map) this.A01, (Set) this.A02, this.A03);
    }
}
