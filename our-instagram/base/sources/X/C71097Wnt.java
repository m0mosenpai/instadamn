package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Wnt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71097Wnt implements XBR {
    public final /* synthetic */ C65918TwP A00;
    public final /* synthetic */ SearchEditText A01;

    public C71097Wnt(C65918TwP c65918TwP, SearchEditText searchEditText) {
        this.A00 = c65918TwP;
        this.A01 = searchEditText;
    }

    @Override // X.XBR
    public final void DTS() {
        int i;
        String str;
        C65918TwP c65918TwP = this.A00;
        C18920wW c18920wW = (C18920wW) c65918TwP.A0j.getValue();
        String A0b = AbstractC31178DnM.A0b();
        String str2 = c65918TwP.A09;
        if (str2 != null) {
            AbstractC66181U2w.A01(c18920wW, A0b, str2, c65918TwP.A0A, "");
            if (this.A01.getSearchString().length() == 0) {
                i = 2193;
            } else {
                i = 2196;
            }
            String A00 = AbstractC111324zv.A00(i);
            C66151U1s c66151U1s = (C66151U1s) c65918TwP.A0h.getValue();
            String str3 = ((AbstractC65919TwQ) c65918TwP).A01.A01;
            if ((!AbstractC001900j.A0T(str3)) && c65918TwP.A0J) {
                str = ((AbstractC65919TwQ) c65918TwP).A01.A01;
            } else {
                str = null;
            }
            c66151U1s.A05(null, A00, str3, str, null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
