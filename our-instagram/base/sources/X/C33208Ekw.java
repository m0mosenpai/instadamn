package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.Ekw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33208Ekw extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "VerifiedUserCallingAllowlistTypeSelectionFragment";
    public int A00;
    public String A01 = "call_settings";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131954570);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        InterfaceC09390do interfaceC09390do = this.A02;
        C1ON A002 = FXS.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C31702Dw7.A01(A002, this, 47);
        C1GJ.A00(requireContext, A00, A002);
        AbstractC31175DnJ.A1N(AbstractC31176DnK.A0M(this, interfaceC09390do), "call_settings_page_impression");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2085719142);
        super.onCreate(bundle);
        String A0b = AbstractC31180DnO.A0b(this);
        if (A0b != null) {
            this.A01 = A0b;
        }
        C0f9.A09(-56241520, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(597955744);
        super.onResume();
        Context requireContext = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        C1ON A002 = FXS.A00(AbstractC166987dD.A0r(this.A02));
        C31702Dw7.A01(A002, this, 47);
        C1GJ.A00(requireContext, A00, A002);
        C0f9.A09(-892804855, A02);
    }
}
