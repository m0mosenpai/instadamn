package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ETh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32507ETh extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ EnumC77213d7 A05;
    public final /* synthetic */ Product A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ C15370ps A09;

    public C32507ETh(C1P1 c1p1, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, EnumC77213d7 enumC77213d7, Product product, String str, List list, C15370ps c15370ps, int i) {
        this.A08 = list;
        this.A06 = product;
        this.A01 = c1p1;
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A03 = c38321qM;
        this.A00 = i;
        this.A05 = enumC77213d7;
        this.A07 = str;
        this.A09 = c15370ps;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(482613333);
        AbstractC35273Fh8.A03((EnumC39647Hic) this.A09.A00, this.A02, this.A04, this.A06.A0H, this.A07, false);
        C0f9.A0A(-284191919, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(-315155202);
        int A0N = AbstractC167017dG.A0N(obj, 362642431);
        Object A0J = AbstractC001800i.A0J(this.A08);
        Product product = this.A06;
        if (A0J == product) {
            C1P1 c1p1 = this.A01;
            if (c1p1 != null) {
                c1p1.onSuccess(obj);
            }
            UserSession userSession = this.A02;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            C38321qM c38321qM = this.A03;
            int i = this.A00;
            EnumC77213d7 enumC77213d7 = this.A05;
            String str2 = this.A07;
            C25531Mh A01 = C25531Mh.A01(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, enumC77213d7, 4));
            if (AbstractC25226BEj.A1Z(A01)) {
                List A012 = AbstractC35273Fh8.A01(c38321qM, i);
                ArrayList arrayList = null;
                if (A012 != null) {
                    arrayList = AbstractC166987dD.A1E();
                    Iterator it = A012.iterator();
                    while (it.hasNext()) {
                        AbstractC31179DnN.A1X(arrayList, it);
                    }
                }
                if (str2 == null) {
                    str2 = "";
                }
                EnumC39651Hig enumC39651Hig = EnumC39651Hig.A04;
                if (enumC77213d7 == EnumC77213d7.A03) {
                    enumC39651Hig = EnumC39651Hig.A05;
                    str = "wishlist_collection_bulk_unsave_button_click";
                } else {
                    str = "wishlist_collection_bulk_save_button_click";
                }
                if (arrayList != null && AbstractC25226BEj.A1b(arrayList)) {
                    A01.A0R("shopping_session_id", str2);
                    A01.A0M(enumC39651Hig, "analytics_component");
                    A01.A0M(EnumC39649Hie.A06, "analytics_page");
                    A01.A0M(EnumC39650Hif.A0C, "analytics_module");
                    AbstractC31179DnN.A1C(A01, c38321qM, str, arrayList);
                    A01.Cht();
                }
            }
        }
        UserSession userSession2 = this.A02;
        AbstractC35273Fh8.A03((EnumC39647Hic) this.A09.A00, userSession2, this.A04, product.A0H, this.A07, true);
        C57602kZ.A00(userSession2).A0M(this.A05, product, null);
        C0f9.A0A(-229533685, A0N);
        C0f9.A0A(-1530038840, A03);
    }
}
