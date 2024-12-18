package X;

import android.content.Intent;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.video.live.mvvm.view.postlive.IgLiveExploreLiveBaseFragment;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;

/* renamed from: X.NZr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52834NZr extends IgLiveExploreLiveBaseFragment implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "IgLivePostLiveBroadcasterFragment";
    public IgdsBottomButtonLayout A00;
    public C189478aR A01;
    public C3PO A02;
    public PIy A03;
    public C54770OIj A04;
    public ExistingStandaloneFundraiserForFeedModel A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0C = AbstractC09440dt.A01(new C57555PgT(this, 35));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_broadcast_ending";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r0 = 0
            r2 = r9
            X.C14360o3.A0B(r9, r0)
            r5 = r8
            super.onViewCreated(r9, r10)
            X.07S r4 = X.C07S.STARTED
            X.07X r3 = r8.getViewLifecycleOwner()
            X.2k6 r0 = X.C07Y.A00(r3)
            r6 = 0
            r7 = 36
            X.PZn r1 = new X.PZn
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AbstractC166987dD.A1Z(r1, r0)
            X.0do r0 = r8.A0E
            java.lang.Object r0 = r0.getValue()
            X.MfT r0 = (X.C50960MfT) r0
            X.0xP r1 = r0.A09
            r0 = 24
            X.PZl r0 = X.C57167PZl.A01(r8, r6, r0)
            X.JQ0.A11(r8, r0, r1)
            boolean r0 = r8.A0B
            if (r0 == 0) goto L95
            android.content.Context r1 = r8.requireContext()
            r0 = 2131969819(0x7f13471b, float:1.9576572E38)
            java.lang.String r4 = X.AbstractC166997dE.A0p(r1, r0)
            X.3PO r1 = r8.A02
            java.lang.String r0 = "liveVisibilityMode"
            r3 = 0
            if (r1 != 0) goto L4f
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L4f:
            X.3PO r0 = X.C3PO.A0A
            if (r1 != r0) goto L96
            X.0do r0 = r8.A0D
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            boolean r0 = X.AbstractC63292u7.A00(r0)
            r1 = 2131969821(0x7f13471d, float:1.9576576E38)
            if (r0 == 0) goto L65
            r1 = 2131969822(0x7f13471e, float:1.9576578E38)
        L65:
            android.content.Context r0 = r8.requireContext()
            java.lang.String r3 = r0.getString(r1)
        L6d:
            r0 = 2131428912(0x7f0b0630, float:1.8479482E38)
            android.view.View r1 = X.AbstractC50523MSb.A07(r9, r0)
            r0 = 2131428910(0x7f0b062e, float:1.8479478E38)
            android.view.View r2 = r1.findViewById(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r2
            r2.setPrimaryActionText(r4)
            r0 = 1
            r2.setPrimaryButtonEnabled(r0)
            if (r3 == 0) goto L89
            r2.A05(r3, r0)
        L89:
            r8.A00 = r2
            r1 = 49
            X.Ok4 r0 = new X.Ok4
            r0.<init>(r8, r1)
            r2.setPrimaryActionOnClickListener(r0)
        L95:
            return
        L96:
            X.3PO r0 = X.C3PO.A04
            if (r1 == r0) goto L9e
            X.3PO r0 = X.C3PO.A05
            if (r1 != r0) goto L6d
        L9e:
            r1 = 2131969820(0x7f13471c, float:1.9576574E38)
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52834NZr.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0E);
        C57164PZi.A03(A0Z, AbstractC141776au.A00(A0Z), 41);
        return true;
    }

    public C52834NZr() {
        C57555PgT c57555PgT = new C57555PgT(this, 39);
        InterfaceC09390do A01 = C57555PgT.A01(new C57555PgT(this, 36), EnumC09460dv.A02, 37);
        this.A0E = AbstractC25225BEi.A0a(new C57555PgT(A01, 38), c57555PgT, C57530Pg4.A00(null, A01, 24), AbstractC25225BEi.A1D(C50960MfT.class));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            PIy pIy = this.A03;
            if (pIy != null) {
                pIy.A06 = true;
                PIy.A04(pIy);
            }
            C9GR.A07(requireContext(), 2131969808);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a2, code lost:
    
        if (r3 == X.C3PO.A07) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bf, code lost:
    
        if (r4.A04(r3) != false) goto L18;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52834NZr.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.video.live.mvvm.view.postlive.IgLiveExploreLiveBaseFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(237250092);
        super.onResume();
        C0f9.A09(-668354338, A02);
    }
}
