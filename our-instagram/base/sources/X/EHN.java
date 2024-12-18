package X;

import android.app.Dialog;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class EHN extends AbstractC72473Mu {
    public final InterfaceC09390do A00;

    public EHN() {
        C37061GUv A01 = C37061GUv.A01(this, 30);
        InterfaceC09390do A00 = C37061GUv.A00(C37061GUv.A01(this, 27), EnumC09460dv.A02, 28);
        this.A00 = AbstractC25225BEi.A0a(C37061GUv.A01(A00, 29), A01, new C57252Pba(23, null, A00), AbstractC25225BEi.A1D(C31790Dy9.class));
    }

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        super.A0F(bundle);
        View inflate = AbstractC31175DnJ.A06(this).inflate(R.layout.language_locale_menu, (ViewGroup) null);
        C31865DzX c31865DzX = new C31865DzX(new GGB(this));
        ColorFilter A09 = AbstractC31174DnI.A09(requireContext(), AbstractC31180DnO.A01(this));
        SearchEditText searchEditText = (SearchEditText) inflate.findViewById(R.id.search);
        AbstractC167027dH.A0d(A09, searchEditText.getCompoundDrawablesRelative()[0]);
        searchEditText.setClearButtonColorFilter(A09);
        C31703Dw8.A00(searchEditText, this, 10);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.language_locale_list);
        recyclerView.setAdapter(c31865DzX);
        AbstractC31174DnI.A16(requireContext(), recyclerView, 1, false);
        recyclerView.A0S = true;
        recyclerView.setFocusableInTouchMode(true);
        recyclerView.requestFocus();
        AbstractC166987dD.A1Z(new PZL(c31865DzX, this, null, 32), C07Y.A00(this));
        C35166FfG c35166FfG = new C35166FfG(requireContext());
        String A10 = AbstractC166997dE.A10(C1Q2.A03(), AbstractC25227BEk.A0v(this, 2131973241));
        TextView textView = c35166FfG.A0C;
        textView.getClass();
        textView.setText(A10);
        View view = c35166FfG.A06;
        view.getClass();
        view.setVisibility(0);
        ViewGroup viewGroup = c35166FfG.A07;
        viewGroup.getClass();
        viewGroup.addView(inflate);
        viewGroup.setVisibility(0);
        DialogC31731Dwc dialogC31731Dwc = c35166FfG.A0D;
        dialogC31731Dwc.setCancelable(true);
        dialogC31731Dwc.setCanceledOnTouchOutside(true);
        DialogC31731Dwc A00 = c35166FfG.A00();
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(1374451115);
        super.onActivityCreated(bundle);
        Window window = A06().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
            C0f9.A09(1587719995, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(1256983218, A02);
            throw A0g;
        }
    }
}
