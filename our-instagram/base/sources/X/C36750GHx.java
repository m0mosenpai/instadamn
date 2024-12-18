package X;

import android.text.TextUtils;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.GHx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36750GHx implements C88U {
    public final /* synthetic */ EHO A00;

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    public C36750GHx(EHO eho) {
        this.A00 = eho;
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String A01 = AbstractC13670mt.A01(charSequence);
        C31764DxL c31764DxL = this.A00.A02;
        String lowerCase = A01.toLowerCase(Locale.getDefault());
        List list = c31764DxL.A01;
        list.clear();
        boolean isEmpty = TextUtils.isEmpty(lowerCase);
        ArrayList arrayList = c31764DxL.A00;
        if (isEmpty) {
            list.addAll(arrayList);
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CountryCodeData countryCodeData = (CountryCodeData) it.next();
                if (AbstractC13670mt.A0I(countryCodeData.A01(), lowerCase, 0) || AbstractC13670mt.A0I(countryCodeData.A01, lowerCase, 0) || AbstractC13670mt.A0I(countryCodeData.A00(), lowerCase, 0)) {
                    list.add(countryCodeData);
                }
            }
        }
        C0fA.A00(c31764DxL, -1075342464);
    }
}
