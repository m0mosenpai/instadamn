package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FMB {
    public Context A00;
    public final AbstractC59962oe A01;
    public final FRE A02;
    public final C34615FMy A03;

    public FMB(View view, AutoCompleteTextView autoCompleteTextView, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, InterfaceC37138GXz interfaceC37138GXz, EnumC31713DwI enumC31713DwI) {
        this.A01 = abstractC59962oe;
        this.A00 = abstractC59962oe.requireContext();
        Context requireContext = abstractC59962oe.requireContext();
        FRE fre = FRE.A04;
        if (fre == null) {
            AbstractC52232aO.A00(requireContext);
            fre = new FRE();
            FRE.A04 = fre;
        }
        this.A02 = fre;
        C34615FMy c34615FMy = new C34615FMy(this.A00, autoCompleteTextView, abstractC59962oe, c07270a1, new FH0(new GWo() { // from class: X.GAV
        }), interfaceC37138GXz, enumC31713DwI, AbstractC166997dE.A0N(abstractC59962oe).getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material), true);
        this.A03 = c34615FMy;
        AbstractC59962oe abstractC59962oe2 = this.A01;
        c34615FMy.A00 = new ArrayAdapter(abstractC59962oe2.requireActivity(), R.layout.row_autocomplete_email, AbstractC35100FdB.A01(abstractC59962oe2.requireActivity(), c07270a1));
        Resources A0N = AbstractC166997dE.A0N(abstractC59962oe);
        AbstractC167027dH.A12(autoCompleteTextView, view, A0N);
        autoCompleteTextView.addOnLayoutChangeListener(new LQD(3, A0N, view, autoCompleteTextView));
    }
}
