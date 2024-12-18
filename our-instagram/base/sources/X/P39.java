package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes9.dex */
public final class P39 implements GZD {
    public final int A00;
    public final Object A01;

    public P39(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        String str2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(str, 0);
                AbstractC52114N4m abstractC52114N4m = (AbstractC52114N4m) this.A01;
                abstractC52114N4m.A07().A04();
                abstractC52114N4m.A06().A00 = 0;
                abstractC52114N4m.A06().A01();
                if (abstractC52114N4m.A08.CZT()) {
                    return;
                }
                C54701OEd c54701OEd = abstractC52114N4m.A04;
                if (c54701OEd == null) {
                    str2 = "searchRequestController";
                } else {
                    if (str.length() <= 0 || !c54701OEd.A02.A06(str)) {
                        return;
                    }
                    AbstractC52114N4m abstractC52114N4m2 = c54701OEd.A01.A00;
                    IgdsInlineSearchBox igdsInlineSearchBox = abstractC52114N4m2.A02;
                    if (igdsInlineSearchBox != null) {
                        if (!C14360o3.A0K(igdsInlineSearchBox.getSearchString(), str)) {
                            return;
                        }
                        abstractC52114N4m2.A06().A00 = 10;
                        abstractC52114N4m2.A06().A01();
                        return;
                    }
                    str2 = "inlineSearchBox";
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 1:
                C14360o3.A0B(str, 0);
                ((C50931Mf0) ((N42) this.A01).A02.getValue()).A03.Egh(str);
                return;
            default:
                C14360o3.A0B(str, 0);
                C50962MfV c50962MfV = (C50962MfV) ((C52147N5w) this.A01).A05.getValue();
                String A01 = AbstractC13670mt.A01(str);
                c50962MfV.A00 = A01;
                if (A01 != null && !AbstractC001900j.A0T(A01)) {
                    C65974TxR c65974TxR = c50962MfV.A05;
                    if (c65974TxR.A06.BjP(A01).A06 != null) {
                        PZW.A01(c50962MfV, AbstractC141776au.A00(c50962MfV), 34, true);
                        return;
                    } else {
                        c65974TxR.A06(A01);
                        return;
                    }
                }
                c50962MfV.A05.A02();
                return;
        }
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
    }
}
