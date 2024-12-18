package com.instagram.video.live.mvvm.viewmodel.host;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C05A;
import X.C0eB;
import X.C50938Mf7;
import X.C51697MsS;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import X.MSZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.host.IgLiveHostNuxTutorialViewModel$viewState$1", f = "IgLiveHostNuxTutorialViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveHostNuxTutorialViewModel$viewState$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ int A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ C50938Mf7 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveHostNuxTutorialViewModel$viewState$1(C50938Mf7 c50938Mf7, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = c50938Mf7;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        int A0H = AbstractC166987dD.A0H(obj2);
        IgLiveHostNuxTutorialViewModel$viewState$1 igLiveHostNuxTutorialViewModel$viewState$1 = new IgLiveHostNuxTutorialViewModel$viewState$1(this.A02, (InterfaceC23621Ds) obj3);
        igLiveHostNuxTutorialViewModel$viewState$1.A01 = A1a;
        igLiveHostNuxTutorialViewModel$viewState$1.A00 = A0H;
        return igLiveHostNuxTutorialViewModel$viewState$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i;
        AbstractC09560e7.A00(obj);
        boolean z = this.A01;
        int i2 = this.A00;
        C50938Mf7 c50938Mf7 = this.A02;
        C05A c05a = c50938Mf7.A05;
        int i3 = 2131968535;
        if (MSZ.A0A(c05a) == c50938Mf7.A00) {
            i3 = 2131961124;
        }
        int A0A = MSZ.A0A(c05a);
        if (A0A != 1) {
            if (A0A != 2) {
                if (A0A != 3) {
                    i = 2131965565;
                    if (A0A != 4) {
                        i = 0;
                    }
                } else {
                    i = 2131965567;
                }
            } else {
                i = 2131965568;
            }
        } else {
            i = 2131965566;
        }
        return new C51697MsS(z, i3, i, c50938Mf7.A00, i2);
    }
}
