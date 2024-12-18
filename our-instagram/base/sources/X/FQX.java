package X;

import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FQX {
    public final C66362zD A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC62602sz A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.2zP] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.2zP] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.2zP] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.2zP] */
    public final void A00(C38321qM c38321qM, List list) {
        C14360o3.A0B(list, 0);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        if (this.A07) {
            A0E.A00(new Object());
            A0E.A00(new C36204FyI(null, this.A05, false, false, true));
        }
        if (this.A08) {
            A0E.A00(new Object());
        }
        Integer num = this.A04;
        Integer num2 = C05F.A01;
        boolean A1X = AbstractC167007dF.A1X(num, num2);
        InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(this.A02).A00;
        boolean A1Q = AbstractC167007dF.A1Q(interfaceC19630xq.getInt("direct_collab_collection_creation_row_impression_count", 0), 4);
        if (A1X && A1Q) {
            A0E.A00(new Object());
            AbstractC167017dG.A0g(interfaceC19630xq, "direct_collab_collection_creation_row_impression_count").apply();
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SavedCollection savedCollection = (SavedCollection) it.next();
            if (c38321qM != null) {
                savedCollection.A09 = Boolean.valueOf(c38321qM.BqL().contains(savedCollection.A0F));
            }
            A0q.add(new C36204FyI(savedCollection, this.A05, AbstractC167007dF.A1X(num, num2), this.A06, false));
        }
        A0E.A01(A0q);
        InterfaceC62602sz interfaceC62602sz = this.A03;
        A0E.A00(C37384GdQ.A00(interfaceC62602sz));
        if (A1X && !A1Q && !interfaceC62602sz.CLJ() && !interfaceC62602sz.isLoading()) {
            A0E.A00(new Object());
        }
        this.A00.A05(A0E);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2zJ, java.lang.Object] */
    public FQX(AbstractC59962oe abstractC59962oe, UserSession userSession, FG9 fg9, FGA fga, FGB fgb, InterfaceC62602sz interfaceC62602sz, Integer num, String str, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A1R(str, userSession, fgb, fga, fg9);
        AbstractC167007dF.A1J(interfaceC62602sz, 7, num);
        this.A01 = abstractC59962oe;
        this.A05 = str;
        this.A02 = userSession;
        this.A03 = interfaceC62602sz;
        this.A08 = z;
        this.A04 = num;
        this.A06 = z2;
        this.A07 = z3;
        C66392zG A0R = AbstractC31174DnI.A0R(abstractC59962oe);
        A0R.A01(new EXJ(userSession, fgb));
        A0R.A01(new EX6(fga));
        A0R.A01(new C65721Tsu(interfaceC62602sz, null, null, R.layout.save_to_collection_empty_view));
        A0R.A01(new EX5(fg9));
        this.A00 = AbstractC31173DnH.A0R(A0R, new Object());
    }
}
