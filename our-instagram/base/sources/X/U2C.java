package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class U2C implements XDv {
    public final /* synthetic */ AbstractC65919TwQ A00;

    @Override // X.XDv
    public final void DyB() {
    }

    public U2C(AbstractC65919TwQ abstractC65919TwQ) {
        this.A00 = abstractC65919TwQ;
    }

    @Override // X.XDv
    public final void CMc() {
        SearchEditText searchEditText = ((C65918TwP) this.A00).A0b.A06;
        if (searchEditText != null) {
            searchEditText.A04();
        }
    }

    @Override // X.XDv
    public final void Chg() {
        int i;
        AbstractC65919TwQ abstractC65919TwQ = this.A00;
        C65974TxR c65974TxR = abstractC65919TwQ.A0A;
        String str = "queuedTypeaheadManager";
        if (c65974TxR != null) {
            if (c65974TxR.A08 && c65974TxR.A05.A00 && !abstractC65919TwQ.A0H && !c65974TxR.A04()) {
                XB6 xb6 = abstractC65919TwQ.A0h;
                if (!xb6.CZT()) {
                    String str2 = abstractC65919TwQ.A01.A01;
                    Pattern pattern = AbstractC13670mt.A00;
                    if (str2 != null && str2.length() > 0) {
                        C65974TxR c65974TxR2 = abstractC65919TwQ.A0A;
                        if (c65974TxR2 != null) {
                            c65974TxR2.A03(str2);
                            C65963TxG c65963TxG = abstractC65919TwQ.A0H().A01;
                            c65963TxG.A04 = false;
                            c65963TxG.A01();
                            abstractC65919TwQ.A0K(abstractC65919TwQ.A01.A01, true);
                            C65973TxQ c65973TxQ = abstractC65919TwQ.A0D;
                            if (c65973TxQ == null) {
                                str = "searchQueryPerfLogger";
                            } else {
                                String str3 = abstractC65919TwQ.A01.A01;
                                C65918TwP c65918TwP = (C65918TwP) abstractC65919TwQ;
                                String str4 = c65918TwP.A09;
                                if (str4 != null) {
                                    String A00 = AbstractC66135U1c.A00(c65918TwP.A0d);
                                    boolean CZT = xb6.CZT();
                                    C65974TxR c65974TxR3 = abstractC65919TwQ.A0A;
                                    if (c65974TxR3 != null) {
                                        UQE uqe = abstractC65919TwQ.A01;
                                        if (c65974TxR3.A08) {
                                            C65978TxX c65978TxX = c65974TxR3.A05;
                                            if (uqe != null) {
                                                Number number = (Number) c65978TxX.A01.get(uqe);
                                                if (number != null) {
                                                    i = number.intValue();
                                                    C14360o3.A0B(str3, 0);
                                                    C65973TxQ.A01(c65973TxQ, str3, "SEARCH_PAGINATION", str4, A00, i, CZT);
                                                    return;
                                                }
                                            } else {
                                                throw AbstractC166997dE.A0g();
                                            }
                                        }
                                        i = 0;
                                        C14360o3.A0B(str3, 0);
                                        C65973TxQ.A01(c65973TxQ, str3, "SEARCH_PAGINATION", str4, A00, i, CZT);
                                        return;
                                    }
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.XDv
    public final void El2() {
        ((C65918TwP) this.A00).A0b.A0P = true;
    }
}
