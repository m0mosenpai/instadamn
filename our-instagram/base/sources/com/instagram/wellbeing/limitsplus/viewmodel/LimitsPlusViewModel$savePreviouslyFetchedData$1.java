package com.instagram.wellbeing.limitsplus.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C50896MeR;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.limitsplus.viewmodel.LimitsPlusViewModel$savePreviouslyFetchedData$1", f = "LimitsPlusViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class LimitsPlusViewModel$savePreviouslyFetchedData$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C50896MeR A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitsPlusViewModel$savePreviouslyFetchedData$1(C50896MeR c50896MeR, InterfaceC23621Ds interfaceC23621Ds, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(2, interfaceC23621Ds);
        this.A03 = c50896MeR;
        this.A05 = z;
        this.A09 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A01 = j;
        this.A02 = j2;
        this.A0A = z5;
        this.A06 = z6;
        this.A04 = z7;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new LimitsPlusViewModel$savePreviouslyFetchedData$1(this.A03, interfaceC23621Ds, this.A01, this.A02, this.A05, this.A09, this.A07, this.A08, this.A0A, this.A06, this.A04);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            LimitsPlusRepository limitsPlusRepository = this.A03.A02;
            boolean z = this.A05;
            boolean z2 = this.A09;
            boolean z3 = this.A07;
            boolean z4 = this.A08;
            long j = this.A01;
            long j2 = this.A02;
            boolean z5 = this.A0A;
            boolean z6 = this.A06;
            boolean z7 = this.A04;
            this.A00 = 1;
            if (limitsPlusRepository.A04(this, j, j2, z, z2, z3, z4, z5, z6, z7) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LimitsPlusViewModel$savePreviouslyFetchedData$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
