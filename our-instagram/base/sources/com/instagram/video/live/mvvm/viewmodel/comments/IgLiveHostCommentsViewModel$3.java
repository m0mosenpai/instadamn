package com.instagram.video.live.mvvm.viewmodel.comments;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C52864NaL;
import X.C52871NaS;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.comments.IgLiveHostCommentsViewModel$3", f = "IgLiveHostCommentsViewModel.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveHostCommentsViewModel$3 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C52864NaL A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveHostCommentsViewModel$3(C52864NaL c52864NaL, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A03 = c52864NaL;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            boolean z = this.A01;
            boolean z2 = this.A02;
            if (!z || z2) {
                InterfaceC24731Iq interfaceC24731Iq = this.A03.A03;
                C52871NaS c52871NaS = C52871NaS.A00;
                this.A00 = 1;
                if (interfaceC24731Iq.EMz(c52871NaS, this) == c1jx) {
                    return c1jx;
                }
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        IgLiveHostCommentsViewModel$3 igLiveHostCommentsViewModel$3 = new IgLiveHostCommentsViewModel$3(this.A03, (InterfaceC23621Ds) obj3);
        igLiveHostCommentsViewModel$3.A01 = A1a;
        igLiveHostCommentsViewModel$3.A02 = A1a2;
        return igLiveHostCommentsViewModel$3.invokeSuspend(C0eB.A00);
    }
}
