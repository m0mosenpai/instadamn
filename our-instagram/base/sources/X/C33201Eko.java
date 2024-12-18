package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.Eko, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33201Eko extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CCUTestFragment";
    public EPV A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "CCU");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "dev_options_ccu_test_fragment";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        GHY.A01(requireContext(), new ViewOnClickListenerC35678FpD(this, 14), "Reset CCU Timestamps", A1E);
        GHY.A01(requireContext(), new ViewOnClickListenerC35678FpD(this, 15), "Run Actual CCU when App is Backgrounded", A1E);
        EPV epv = this.A00;
        if (epv != null) {
            epv.setItems(A1E);
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            EPV epv2 = this.A00;
            if (epv2 != null) {
                scrollingViewProxy.EPJ(epv2);
                return;
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2119709616);
        super.onCreate(bundle);
        this.A00 = new EPV(requireContext(), AbstractC166987dD.A0o(this.A01), this);
        C0f9.A09(-735932366, A02);
    }
}
