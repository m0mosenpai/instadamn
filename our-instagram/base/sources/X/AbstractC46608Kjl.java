package X;

import java.util.List;

/* renamed from: X.Kjl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46608Kjl {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static final C50627MWo A00(C45127Jxw c45127Jxw) {
        C5QE A00;
        ?? A0q;
        if (c45127Jxw == null) {
            A00 = BHS.A00(new Object[0], 2131953044);
            A0q = AbstractC16960so.A1Q(new C45127Jxw(BHS.A00(new Object[0], 2131953043), "https://help.instagram.com/491230782877226"), new C45127Jxw(BHS.A00(new Object[0], 2131953041), "https://help.instagram.com/2136147216424213"));
        } else {
            A00 = MVZ.A00(c45127Jxw.A01);
            List<C50679MYx> list = (List) c45127Jxw.A00;
            A0q = AbstractC167017dG.A0q(list);
            for (C50679MYx c50679MYx : list) {
                A0q.add(new C45127Jxw(MVZ.A00(c50679MYx.A01), c50679MYx.A00));
            }
        }
        return new C50627MWo(A00, (List) A0q);
    }
}
