package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class J6N implements InterfaceC19960yQ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public J6N(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
        this.A04 = str;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        MU9 mu9;
        ProductFeedResponse productFeedResponse;
        String str;
        User user;
        if (this.A00 != 0) {
            InterfaceC57806PkY interfaceC57806PkY = (InterfaceC57806PkY) obj;
            if (MU9.A01(interfaceC57806PkY, 1) && (mu9 = (MU9) interfaceC57806PkY) != null && (productFeedResponse = (ProductFeedResponse) mu9.A01) != null) {
                C42347Ip9 c42347Ip9 = (C42347Ip9) this.A03;
                C05A c05a = (C05A) this.A01;
                EnumC39623HeX enumC39623HeX = (EnumC39623HeX) this.A02;
                String str2 = this.A04;
                C42347Ip9.A07(enumC39623HeX, str2, AbstractC31172DnG.A19(productFeedResponse.A03), c05a);
                EnumC39623HeX enumC39623HeX2 = EnumC39623HeX.A04;
                if (enumC39623HeX == enumC39623HeX2) {
                    C05A c05a2 = c42347Ip9.A06;
                    List list = (List) ((C45125Jxu) c05a2.getValue()).A00;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj2 : list) {
                        Product A02 = ((ProductFeedItem) obj2).A02();
                        if (A02 != null && (user = A02.A0B) != null) {
                            str = AbstractC76433bn.A00(user);
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(str, str2)) {
                            A1E.add(obj2);
                        }
                    }
                    List A19 = AbstractC31172DnG.A19(productFeedResponse.A03);
                    ArrayList A0S = AbstractC001800i.A0S(A19, A1E);
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    Iterator it = A0S.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String id = ((ProductFeedItem) next).getId();
                        Object obj3 = A1I.get(id);
                        if (obj3 == null) {
                            obj3 = AbstractC166987dD.A1E();
                            A1I.put(id, obj3);
                        }
                        ((List) obj3).add(next);
                    }
                    LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                    Iterator A14 = AbstractC166997dE.A14(A1I);
                    while (A14.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A14);
                        if (((List) A1K.getValue()).size() == 1) {
                            A1I2.put(A1K.getKey(), A1K.getValue());
                        }
                    }
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator A142 = AbstractC166997dE.A14(A1I2);
                    while (A142.hasNext()) {
                        AnonymousClass016.A16((Iterable) AbstractC31176DnK.A0j(A142), A1E2);
                    }
                    if (A19.containsAll(A1E2)) {
                        C42347Ip9.A0A(enumC39623HeX2, A1E2, c05a2);
                    } else {
                        List A01 = ((C45125Jxu) c05a2.getValue()).A01(enumC39623HeX2);
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        for (Object obj4 : A01) {
                            ProductFeedItem productFeedItem = (ProductFeedItem) obj4;
                            ArrayList A0q = AbstractC167017dG.A0q(A1E2);
                            Iterator it2 = A1E2.iterator();
                            while (it2.hasNext()) {
                                A0q.add(((ProductFeedItem) it2.next()).getId());
                            }
                            AbstractC25228BEl.A1Q(obj4, A1E3, A0q.contains(productFeedItem.getId()) ? 1 : 0);
                        }
                        C42347Ip9.A0B(enumC39623HeX2, A1E3, c05a2);
                    }
                }
            }
        } else {
            int A0H = AbstractC166987dD.A0H(obj);
            if (A0H != -1) {
                L3J l3j = (L3J) this.A03;
                l3j.A01 = A0H;
                ((Ld5) this.A02).A00((MessageIdentifier) this.A01, this.A04, A0H + l3j.A00);
            }
        }
        return C0eB.A00;
    }
}
