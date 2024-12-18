package X;

import java.util.ArrayList;

/* renamed from: X.Eke, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33192Eke extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BreakScreenBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "break_screen_menu_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1537343550);
        super.onResume();
        ArrayList A1E = AbstractC166987dD.A1E();
        GHY.A01(requireContext(), new ViewOnClickListenerC35678FpD(this, 1), AbstractC166997dE.A0N(this).getString(2131975198), A1E);
        GHY.A01(requireContext(), new ViewOnClickListenerC35678FpD(this, 2), AbstractC166997dE.A0N(this).getString(2131954754), A1E);
        setItems(A1E);
        C0f9.A09(-127138111, A02);
    }
}
