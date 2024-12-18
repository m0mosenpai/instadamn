package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.GHy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36751GHy implements C88U {
    public final /* synthetic */ E15 A00;
    public final /* synthetic */ FMU A01;

    public C36751GHy(E15 e15, FMU fmu) {
        this.A00 = e15;
        this.A01 = fmu;
    }

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        GZS gzs = this.A00.A01;
        if (gzs != null) {
            gzs.searchTextChanged(AbstractC13670mt.A01(str));
        }
        searchEditText.A04();
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        E15 e15 = this.A00;
        if (e15.A01 != null) {
            FMU fmu = this.A01;
            String charSequence2 = charSequence.toString();
            SearchEditText searchEditText2 = fmu.A00;
            if (searchEditText2 != null) {
                searchEditText2.setText(charSequence2);
            }
            e15.A01.searchTextChanged(AbstractC13670mt.A01(searchEditText.getSearchString()));
        }
    }
}
