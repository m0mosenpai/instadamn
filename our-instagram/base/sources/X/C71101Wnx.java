package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Wnx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71101Wnx implements C88U {
    public final /* synthetic */ V1F A00;

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String str;
        C14360o3.A0B(searchEditText, 0);
        String A01 = AbstractC13670mt.A01(searchEditText.getTextForSearch());
        if (A01 != null) {
            V1F v1f = this.A00;
            if (!A01.equals(v1f.A07)) {
                v1f.A07 = A01;
                v1f.A0B = true;
                v1f.A0C = true;
                C65960TxC c65960TxC = v1f.A03;
                if (c65960TxC == null) {
                    str = "dataSource";
                } else {
                    c65960TxC.A04();
                    if (v1f.A0J.CZT()) {
                        C52198N8n c52198N8n = v1f.A02;
                        str = "searchAdapter";
                        if (c52198N8n != null) {
                            c52198N8n.A01 = false;
                            c52198N8n.A00();
                            V1F.A01(v1f);
                            V1F.A02(v1f);
                            return;
                        }
                    } else {
                        C65974TxR c65974TxR = v1f.A04;
                        if (c65974TxR == null) {
                            str = "queuedTypeAheadManager";
                        } else {
                            c65974TxR.A06(A01);
                            V1F.A03(v1f, A01, true);
                            V1F.A02(v1f);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
    }

    public C71101Wnx(V1F v1f) {
        this.A00 = v1f;
    }
}
