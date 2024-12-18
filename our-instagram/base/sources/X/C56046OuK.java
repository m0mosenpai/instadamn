package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.OuK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56046OuK implements InterfaceC60602pj {
    public int A00;
    public AbstractC187378Sf A01;
    public InterfaceC16660sJ A02;
    public InterfaceC16660sJ A03;
    public boolean A04;
    public final ClipsCreationViewModel A05;
    public final C187358Sd A06;
    public final C87H A07;
    public final AbstractC59962oe A08;
    public final UserSession A09;
    public final InterfaceC58281PsZ A0A;

    public C56046OuK(AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC222689s9 enumC222689s9, InterfaceC58281PsZ interfaceC58281PsZ, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C87H c87h) {
        AbstractC25229BEm.A1I(userSession, 2, enumC222689s9);
        this.A08 = abstractC59962oe;
        this.A09 = userSession;
        this.A06 = c187358Sd;
        this.A05 = clipsCreationViewModel;
        this.A07 = c87h;
        this.A0A = interfaceC58281PsZ;
        this.A03 = null;
        AbstractC31180DnO.A1F(abstractC59962oe, clipsCreationViewModel.A0C, C57747Pja.A00(this, 26), 59);
        AbstractC31180DnO.A1F(abstractC59962oe, c187358Sd.A05, C57747Pja.A00(this, 27), 59);
        AbstractC31180DnO.A1F(abstractC59962oe, c87h.A0G, C57747Pja.A00(this, 28), 59);
        this.A02 = MSW.A1E(this, 9);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        AbstractC59962oe abstractC59962oe = this.A08;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 22), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final C84B A00(C56046OuK c56046OuK) {
        C84B A0N;
        ClipsCreationViewModel clipsCreationViewModel = c56046OuK.A05;
        if (clipsCreationViewModel.A0s() || (A0N = MSY.A0N(clipsCreationViewModel)) == null) {
            return new C84B(C16930sl.A00, false);
        }
        return A0N;
    }

    public static final void A01(C56046OuK c56046OuK) {
        AbstractC193598he abstractC193598he;
        C187358Sd c187358Sd = c56046OuK.A06;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if (!c187358Sd.A0I() && !(A0E instanceof C187538Sv) && (abstractC193598he = (AbstractC193598he) c56046OuK.A05.A0C.A02()) != null && abstractC193598he.A00 == 3 && A03(c56046OuK)) {
            c56046OuK.A07.A06(A00(c56046OuK).A01(c56046OuK.A00));
            A00(c56046OuK).A01(c56046OuK.A00);
            A00(c56046OuK);
        }
    }

    public static final void A02(C56046OuK c56046OuK) {
        C187358Sd c187358Sd = c56046OuK.A06;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if (c187358Sd.A0I() && (A0E instanceof AbstractC187488Sq)) {
            AbstractC193598he abstractC193598he = (AbstractC193598he) c187358Sd.A05.A02();
            int i = 0;
            if (abstractC193598he != null && abstractC193598he.A00 == 3) {
                C115475Kh A0V = MSW.A0V(A00(c56046OuK), ((AbstractC187488Sq) A0E).getSegmentIndex());
                C87H c87h = c56046OuK.A07;
                if (A0V != null) {
                    i = A0V.A09;
                }
                c87h.A06(i);
            }
        }
    }

    public final void A04() {
        C87H c87h = this.A07;
        this.A04 = AbstractC167007dF.A1X(c87h.A0A.A02(), EnumC189218Zt.A05);
        c87h.A01();
    }

    public static final boolean A03(C56046OuK c56046OuK) {
        int i;
        if (!A00(c56046OuK).A01.isEmpty() && (i = c56046OuK.A00) >= 0 && i < MSW.A06(A00(c56046OuK))) {
            return true;
        }
        return false;
    }
}
