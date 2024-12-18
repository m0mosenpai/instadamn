package com.instagram.creator.agent.settings.audience;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.BHS;
import X.C0eB;
import X.C26039BfS;
import X.C27054Bwd;
import X.C5QE;
import X.C6R;
import X.EnumC53314Nhq;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import com.facebook.R;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creator.agent.settings.audience.AudienceUseCase$uiState$1", f = "AudienceUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class AudienceUseCase$uiState$1 extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;

    public AudienceUseCase$uiState$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(6, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AbstractC166987dD.A1a(obj4);
        AudienceUseCase$uiState$1 audienceUseCase$uiState$1 = new AudienceUseCase$uiState$1((InterfaceC23621Ds) obj6);
        audienceUseCase$uiState$1.A00 = obj;
        audienceUseCase$uiState$1.A01 = obj2;
        audienceUseCase$uiState$1.A02 = obj3;
        audienceUseCase$uiState$1.A04 = A1a;
        audienceUseCase$uiState$1.A03 = obj5;
        return audienceUseCase$uiState$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C5QE A00;
        AbstractC09560e7.A00(obj);
        EnumC53314Nhq enumC53314Nhq = (EnumC53314Nhq) this.A00;
        Map map = (Map) this.A01;
        C6R c6r = (C6R) this.A02;
        boolean z = this.A04;
        Object obj2 = this.A03;
        boolean z2 = true;
        if (!map.isEmpty()) {
            A00 = new C27054Bwd(new Object[]{new Integer(map.size())}, R.plurals.accounts_selected, map.size());
        } else {
            A00 = BHS.A00(new Object[0], 2131973222);
        }
        if (enumC53314Nhq == obj2) {
            z2 = false;
        }
        int i = 2131972699;
        if (obj2 == EnumC53314Nhq.NOBODY) {
            i = 2131975805;
        }
        return new C26039BfS(A00, c6r, enumC53314Nhq, i, z, z2);
    }
}
