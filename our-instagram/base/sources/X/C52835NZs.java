package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.video.live.mvvm.view.postlive.IgLiveExploreLiveBaseFragment;

/* renamed from: X.NZs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52835NZs extends IgLiveExploreLiveBaseFragment implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "IgLiveExploreLiveViewerFragment";
    public C105824pt A00;
    public C56807PIz A01;
    public String A02;
    public String A04;
    public MTU A05;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public String A03 = "suggested_live_unspecified";
    public boolean A06 = true;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A07;
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C50961MfU) interfaceC09390do.getValue()).A02, new C57751Pje(26, view, this), 32);
        JQ0.A11(this, C57167PZl.A01(this, null, 23), ((C50961MfU) interfaceC09390do.getValue()).A0C);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    public C52835NZs() {
        C57555PgT c57555PgT = new C57555PgT(this, 30);
        InterfaceC09390do A01 = C57555PgT.A01(new C57555PgT(this, 32), EnumC09460dv.A02, 33);
        this.A07 = AbstractC25225BEi.A0a(new C57555PgT(A01, 34), c57555PgT, C57530Pg4.A00(null, A01, 23), AbstractC25225BEi.A1D(C50961MfU.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = 486974069(0x1d06a275, float:1.781874E-21)
            int r2 = X.C0f9.A02(r0)
            r9 = r16
            r0 = r17
            super.onCreate(r0)
            android.os.Bundle r4 = r9.requireArguments()
            java.lang.String r0 = "ARG_SOURCE_BROADCAST_ID"
            java.lang.String r3 = r4.getString(r0)
            if (r3 == 0) goto Ld7
            X.0do r0 = r9.A08
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r0)
            com.instagram.model.reels.Reel r0 = r0.A0M(r3)
            if (r0 == 0) goto Ld7
            X.4pt r0 = r0.A0H
        L2c:
            r9.A00 = r0
            r1 = 1
            java.lang.String r0 = "ARG_IS_POST_LIVE"
            boolean r0 = r4.getBoolean(r0, r1)
            r9.A06 = r0
            if (r0 == 0) goto Ld3
            java.lang.String r0 = "post_live"
        L3b:
            r9.A02 = r0
            X.6l8 r6 = X.AbstractC147826l7.A0K
            X.0do r5 = r9.A08
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r5)
            X.6cg r0 = X.EnumC142806cg.A05
            X.6l7 r0 = r6.A00(r1, r0)
            X.MTU r0 = r0.A03()
            r9.A05 = r0
            X.4pt r0 = r9.A00
            if (r0 == 0) goto La6
            android.content.Context r6 = r9.requireContext()
            com.instagram.common.session.UserSession r8 = X.AbstractC166987dD.A0r(r5)
            com.instagram.user.model.User r10 = r0.A09
            r10.getClass()
            X.4xB r0 = r0.A03
            if (r0 == 0) goto Ld0
            com.instagram.api.schemas.LiveUserPaySupportTier r7 = r0.A01
            java.lang.Integer r0 = r0.A04
            if (r0 == 0) goto Ld1
            int r13 = r0.intValue()
        L70:
            boolean r14 = r9.A06
            X.0do r1 = r9.A07
            java.lang.Object r0 = r1.getValue()
            X.MfU r0 = (X.C50961MfU) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository r0 = r0.A08
            X.21C r0 = r0.A02
            X.0xq r5 = r0.A00
            java.lang.String r0 = "key_ig_live_upsell_number_times"
            int r5 = X.AbstractC31172DnG.A01(r5, r0)
            r0 = 5
            r15 = 0
            if (r5 > r0) goto L8b
            r15 = 1
        L8b:
            r0 = 31
            X.PgT r12 = new X.PgT
            r12.<init>(r9, r0)
            X.PIz r5 = new X.PIz
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r9.A01 = r5
            X.2bZ r5 = X.AbstractC25225BEi.A0Z(r1)
            X.6aw r1 = X.AbstractC141776au.A00(r5)
            r0 = 6
            X.C57164PZi.A03(r5, r1, r0)
        La6:
            java.lang.String r1 = "ARG_VIEWER_SESSION_ID"
            java.lang.String r0 = ""
            java.lang.String r0 = r4.getString(r1, r0)
            r9.A04 = r0
            java.lang.String r1 = r9.A03
            java.lang.String r0 = "ARG_MODULE_NAME"
            java.lang.String r0 = r4.getString(r0, r1)
            r9.A03 = r0
            X.0do r0 = r9.A07
            java.lang.Object r1 = r0.getValue()
            X.MfU r1 = (X.C50961MfU) r1
            java.lang.String r0 = r9.A04
            if (r0 != 0) goto Lda
            java.lang.String r0 = "viewerSessionId"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Ld0:
            r7 = 0
        Ld1:
            r13 = 0
            goto L70
        Ld3:
            java.lang.String r0 = "explore_live"
            goto L3b
        Ld7:
            r0 = 0
            goto L2c
        Lda:
            r1.A00 = r0
            X.4pt r0 = r9.A00
            if (r0 != 0) goto Le7
            java.lang.String r1 = r9.A03
            java.lang.String r0 = "Broadcast is null for id: "
            X.AbstractC31173DnH.A1Z(r0, r3, r1)
        Le7:
            r0 = 153628081(0x9282db1, float:2.0243748E-33)
            X.C0f9.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52835NZs.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.video.live.mvvm.view.postlive.IgLiveExploreLiveBaseFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(588488114);
        ((C50961MfU) this.A07.getValue()).A02.A05(getViewLifecycleOwner());
        super.onDestroyView();
        C0f9.A09(-1702705470, A02);
    }
}
