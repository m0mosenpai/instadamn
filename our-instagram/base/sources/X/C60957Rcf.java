package X;

import com.facebook.R;

/* renamed from: X.Rcf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60957Rcf extends AbstractC60893Rb7 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IGBSCContainerFragment";
    public C69756Vur A00;
    public final InterfaceC16660sJ A01 = new DRQ(this, 3);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        C69756Vur c69756Vur = this.A00;
        interfaceC56362iU.EkF(AbstractC167007dF.A1W(c69756Vur));
        interfaceC56362iU.EkS(true);
        if (c69756Vur != null && getContext() != null) {
            interfaceC56362iU.setTitle(String.valueOf(c69756Vur.A00.C2i(requireContext())));
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(58535589);
        super.onResume();
        InterfaceC08430c6 A0O = getChildFragmentManager().A0O(R.id.container_fragment);
        if (A0O instanceof InterfaceC65379TjC) {
            C58252li C8v = ((InterfaceC65379TjC) A0O).C8v();
            InterfaceC16660sJ interfaceC16660sJ = this.A01;
            C8v.A08(new C55562Olw(24, interfaceC16660sJ));
            C8v.A06(this, new C55562Olw(24, interfaceC16660sJ));
        }
        C0f9.A09(-806954593, A02);
    }
}
