package X;

import android.app.Dialog;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class EHO extends AbstractC72473Mu {
    public AbstractC12990ll A00;
    public GY8 A01;
    public C31764DxL A02;
    public SearchEditText A03;
    public List A04;

    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        super.A0F(bundle);
        C35166FfG c35166FfG = new C35166FfG(getContext());
        String upperCase = getString(2131973240).toUpperCase(Locale.getDefault());
        TextView textView = c35166FfG.A0C;
        textView.getClass();
        textView.setText(upperCase);
        View view = c35166FfG.A06;
        view.getClass();
        view.setVisibility(0);
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(getContext()), R.layout.dialog_country_codes);
        AbsListView absListView = (AbsListView) A0C.requireViewById(R.id.country_code_list);
        SearchEditText searchEditText = (SearchEditText) A0C.requireViewById(R.id.search);
        this.A03 = searchEditText;
        searchEditText.A0C = new C36750GHx(this);
        ColorFilter A09 = AbstractC31174DnI.A09(getContext(), AbstractC31180DnO.A01(this));
        AbstractC167027dH.A0d(A09, this.A03.getCompoundDrawablesRelative()[0]);
        this.A03.setClearButtonColorFilter(A09);
        C31764DxL c31764DxL = new C31764DxL(getContext(), this.A04);
        this.A02 = c31764DxL;
        absListView.setAdapter((ListAdapter) c31764DxL);
        ViewGroup viewGroup = c35166FfG.A07;
        viewGroup.getClass();
        viewGroup.addView(A0C);
        viewGroup.setVisibility(0);
        DialogC31731Dwc dialogC31731Dwc = c35166FfG.A0D;
        dialogC31731Dwc.setCancelable(true);
        dialogC31731Dwc.setCanceledOnTouchOutside(true);
        DialogC31731Dwc A00 = c35166FfG.A00();
        absListView.setOnItemClickListener(new C35728Fq2(this, 1));
        return A00;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(1913745824);
        super.onActivityCreated(bundle);
        super.A01.getWindow().setSoftInputMode(36);
        C0f9.A09(-1897744351, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1698677988);
        super.onCreate(bundle);
        this.A00 = AbstractC31172DnG.A0V(this.mArguments);
        requireContext().getSystemService("phone");
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(getContext());
        this.A04 = AbstractC166987dD.A1E();
        String language = Locale.getDefault().getLanguage();
        int i = 0;
        String[] iSOCountries = Locale.getISOCountries();
        while (i < iSOCountries.length) {
            Locale locale = new Locale(language, iSOCountries[i]);
            i++;
            int A0A = A01.A0A(locale.getCountry());
            if (A0A != 0) {
                this.A04.add(new CountryCodeData(String.valueOf(A0A), locale.getDisplayCountry(), locale.getCountry()));
            }
        }
        Collections.sort(this.A04);
        C0f9.A09(1129334271, A02);
    }
}
