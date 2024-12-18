package com.instagram.creation.publishscreen.fragment.clips;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C07S;
import X.C07T;
import X.C07X;
import X.C0eB;
import X.C1JX;
import X.C3HN;
import X.InterfaceC16620sF;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.N6J;
import X.OHs;
import X.PVU;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2", f = "ClipsPublishScreenFragment.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C07S A01;
    public final /* synthetic */ C07X A02;
    public final /* synthetic */ OHs A03;
    public final /* synthetic */ N6J A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    @DebugMetadata(c = "com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2$1", f = "ClipsPublishScreenFragment.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int A00;
        public /* synthetic */ Object A01;
        public final /* synthetic */ OHs A02;
        public final /* synthetic */ N6J A03;
        public final /* synthetic */ List A04;
        public final /* synthetic */ boolean A05;
        public final /* synthetic */ boolean A06;
        public final /* synthetic */ boolean A07;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OHs oHs, N6J n6j, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2, boolean z3) {
            super(2, interfaceC23621Ds);
            this.A03 = n6j;
            this.A07 = z;
            this.A04 = list;
            this.A02 = oHs;
            this.A06 = z2;
            this.A05 = z3;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            N6J n6j = this.A03;
            boolean z = this.A07;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.A02, n6j, this.A04, interfaceC23621Ds, z, this.A06, this.A05);
            anonymousClass1.A01 = obj;
            return anonymousClass1;
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            C1JX c1jx = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                N6J n6j = this.A03;
                InterfaceC19390xP interfaceC19390xP = N6J.A06(n6j).A0J.A01;
                boolean z = this.A07;
                PVU pvu = new PVU(this.A02, n6j, this.A04, z, this.A06, this.A05);
                this.A00 = 1;
                if (interfaceC19390xP.collect(pvu, this) == c1jx) {
                    return c1jx;
                }
            }
            return C0eB.A00;
        }

        @Override // X.InterfaceC16620sF
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2(C07S c07s, C07X c07x, OHs oHs, N6J n6j, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC23621Ds);
        this.A02 = c07x;
        this.A01 = c07s;
        this.A04 = n6j;
        this.A08 = z;
        this.A05 = list;
        this.A03 = oHs;
        this.A07 = z2;
        this.A06 = z3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C07X c07x = this.A02;
        C07S c07s = this.A01;
        N6J n6j = this.A04;
        boolean z = this.A08;
        return new ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2(c07s, c07x, this.A03, n6j, this.A05, interfaceC23621Ds, z, this.A07, this.A06);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C07T lifecycle = this.A02.getLifecycle();
            C07S c07s = this.A01;
            N6J n6j = this.A04;
            boolean z = this.A08;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.A03, n6j, this.A05, null, z, this.A07, this.A06);
            this.A00 = 1;
            if (C3HN.A00(c07s, lifecycle, this, anonymousClass1) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
