package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class GFV implements XB8, XB6 {
    public SearchEditText A00;
    public String A01;
    public boolean A02;
    public final InterfaceC37181GZs A03;
    public final int A04;

    public GFV(InterfaceC37181GZs interfaceC37181GZs, int i) {
        C14360o3.A0B(interfaceC37181GZs, 1);
        this.A03 = interfaceC37181GZs;
        this.A04 = i;
        this.A01 = "";
    }

    public final void A00(SearchEditText searchEditText, boolean z) {
        SearchEditText searchEditText2 = this.A00;
        if (searchEditText2 != null) {
            searchEditText2.A0C = null;
        }
        this.A00 = null;
        this.A00 = searchEditText;
        searchEditText.setSearchIconEnabled(z);
        searchEditText.setText(this.A01);
        searchEditText.setSelection(this.A01.length());
        int i = this.A04;
        if (i != 0) {
            searchEditText.setHint(i);
        }
        C31703Dw8.A00(searchEditText, this, 6);
    }

    @Override // X.XB6
    public final boolean CZT() {
        return AbstractC167007dF.A1N(this.A01.length());
    }

    @Override // X.XB8
    public final String E6U() {
        return this.A01;
    }
}
