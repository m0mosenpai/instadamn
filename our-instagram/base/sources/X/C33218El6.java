package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.El6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33218El6 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AdsOptionsFragment";
    public E57 A00;
    public Boolean A01;
    public String A02;
    public boolean A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131952523);
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(getParentFragmentManager().A0L()));
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A06 = AbstractC31174DnI.A09(requireContext(), AbstractC31174DnI.A05(this));
        C35026Fbz.A00(interfaceC56362iU, c35026Fbz);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "settings_ads_options";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 3), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        if (r0 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C33218El6 r17) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33218El6.A00(X.El6):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C33218El6() {
        X2z x2z = new X2z(this, 37);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2z(new X2z(this, 34), 35));
        this.A05 = AbstractC25225BEi.A0a(new X2z(A00, 36), x2z, new C57252Pba(14, null, A00), AbstractC25225BEi.A1D(C50914Mej.class));
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2114286793);
        super.onCreate(bundle);
        C907442n c907442n = new C907442n(AbstractC25225BEi.A0b(), E5X.class, "BasicAdsOptInQuery", false);
        InterfaceC09390do interfaceC09390do = this.A04;
        C907542o c907542o = new C907542o(AbstractC25230BEn.A0k(interfaceC09390do, 0));
        c907542o.A08(c907442n);
        C31702Dw7.A00(this, c907542o.A06(), 40);
        C31702Dw7.A00(this, AbstractC31178DnM.A0H(new C907442n(AbstractC25225BEi.A0b(), E59.class, "FxSettingsAdsTransition", false), AbstractC25230BEn.A0k(interfaceC09390do, 0)), 39);
        C0f9.A09(-244685617, A02);
    }
}
