package com.instagram.video.live.mvvm.viewmodel.bottomsheet;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC43592JPx;
import X.BHS;
import X.C05F;
import X.C0eB;
import X.C50980Mfn;
import X.C51652Mrj;
import X.C51709Mse;
import X.C52843Na0;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.MSX;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.bottomsheet.IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1", f = "IgLiveBottomsheetManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ C50980Mfn A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1(C50980Mfn c50980Mfn, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = c50980Mfn;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1 igLiveBottomsheetManagerViewModel$observeViewerLiveState$1 = new IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1(this.A02, (InterfaceC23621Ds) obj3);
        igLiveBottomsheetManagerViewModel$observeViewerLiveState$1.A00 = A1a;
        igLiveBottomsheetManagerViewModel$observeViewerLiveState$1.A01 = A1a2;
        return igLiveBottomsheetManagerViewModel$observeViewerLiveState$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        Boolean bool;
        AbstractC09560e7.A00(obj);
        boolean z = this.A00;
        boolean z2 = this.A01;
        if (z && !z2) {
            C50980Mfn c50980Mfn = this.A02;
            C51709Mse A0U = MSX.A0U(c50980Mfn.A07);
            C51652Mrj A0V = MSX.A0V(c50980Mfn.A09);
            InterfaceC24731Iq interfaceC24731Iq = c50980Mfn.A0C;
            Integer num = C05F.A02;
            BHS A00 = BHS.A00(new Object[0], 2131965351);
            Boolean A0b = AbstractC166997dE.A0b();
            Float A10 = AbstractC25225BEi.A10(0.6f);
            Boolean A0s = AbstractC31172DnG.A0s(c50980Mfn.A0G);
            Float A0q = AbstractC43592JPx.A0q();
            if (A0U != null) {
                str = A0U.A08;
            } else {
                str = null;
            }
            if (A0V != null) {
                bool = Boolean.valueOf(A0V.A0E);
            } else {
                bool = null;
            }
            interfaceC24731Iq.F8s(new C52843Na0(A00, null, A0b, null, A0s, A0b, false, null, null, bool, null, null, null, null, null, null, A10, A0q, num, null, null, str, null, null, null, null, null, null, false, false));
        }
        return C0eB.A00;
    }
}
