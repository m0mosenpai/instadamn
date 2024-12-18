package com.instagram.fxcal.upsell.storyviewer;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC50624MWl;
import X.AbstractC59962oe;
import X.C0eB;
import X.C196068lw;
import X.C38262Gs5;
import X.C54799OJt;
import X.C55156OdK;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.MSY;
import X.OAD;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2", f = "FxShareToFbRowViewBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ OAD A03;
    public final /* synthetic */ C54799OJt A04;
    public final /* synthetic */ ReelDashboardFragment A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, OAD oad, C54799OJt c54799OJt, ReelDashboardFragment reelDashboardFragment, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A00 = context;
        this.A04 = c54799OJt;
        this.A03 = oad;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A05 = reelDashboardFragment;
        this.A06 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Context context = this.A00;
        C54799OJt c54799OJt = this.A04;
        return new FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2(context, this.A01, this.A02, this.A03, c54799OJt, this.A05, interfaceC23621Ds, this.A06);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        CallerContext callerContext = AbstractC50624MWl.A01;
        Context context = this.A00;
        C54799OJt c54799OJt = this.A04;
        OAD oad = this.A03;
        AbstractC59962oe abstractC59962oe = this.A01;
        UserSession userSession = this.A02;
        ReelDashboardFragment reelDashboardFragment = this.A05;
        boolean z = this.A06;
        oad.A01 = true;
        C55156OdK.A00(context, abstractC59962oe, userSession, C196068lw.A00(userSession).A00(AbstractC50624MWl.A01), oad, c54799OJt, reelDashboardFragment);
        C38262Gs5 c38262Gs5 = reelDashboardFragment.mListAdapter;
        if (c38262Gs5 != null) {
            c38262Gs5.A08();
        }
        MSY.A1E(c54799OJt.A00());
        C55156OdK.A01(context, abstractC59962oe, userSession, oad, c54799OJt, reelDashboardFragment, z, true);
        return C0eB.A00;
    }
}
