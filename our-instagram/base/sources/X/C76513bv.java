package X;

import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76513bv {
    public final ArrayList A03(C38321qM c38321qM, User user, int i) {
        C38321qM A1e;
        if (c38321qM.A5M()) {
            ArrayList arrayList = new ArrayList();
            C38321qM A1e2 = c38321qM.A1e(i);
            if (A1e2 != null) {
                arrayList.addAll(A01(A1e2, user));
            }
            Iterator it = C17s.A0C(0, c38321qM.A0p()).iterator();
            while (it.hasNext()) {
                int A00 = ((AbstractC16880sg) it).A00();
                Integer valueOf = Integer.valueOf(A00);
                if (i != A00 && valueOf != null && (A1e = c38321qM.A1e(A00)) != null) {
                    arrayList.addAll(A01(A1e, user));
                }
            }
            return arrayList;
        }
        return A01(c38321qM, user);
    }

    public final List A04(C38321qM c38321qM) {
        C225117n A05 = AbstractC224517h.A05(AbstractC224517h.A09(C57715Pj4.A00, AbstractC001800i.A0o(A00(c38321qM))));
        BA3 ba3 = BA3.A00;
        C14360o3.A0B(ba3, 1);
        return AbstractC224517h.A02(new C37488Gf6(ba3, A05));
    }

    public static final ArrayList A01(C38321qM c38321qM, User user) {
        ClipsShoppingInfoIntf Buh;
        List A00;
        ArrayList arrayList = new ArrayList();
        C9E2 c9e2 = new C9E2(user, 5);
        ArrayList A3O = c38321qM.A3O();
        if (A3O != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = A3O.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                ProductTag productTag = (ProductTag) next;
                if (user == null || ((Boolean) c9e2.invoke(AbstractC38048Gob.A01(productTag.A02))).booleanValue()) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((com.instagram.tagging.model.Tag) it2.next()).getId());
            }
            arrayList.addAll(arrayList3);
        }
        IGTVShoppingInfoIntf BGP = c38321qM.A0C.BGP();
        if (BGP != null) {
            ArrayList A002 = I3S.A00(BGP);
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = A002.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (((Boolean) c9e2.invoke(next2)).booleanValue()) {
                    arrayList4.add(next2);
                }
            }
            ArrayList arrayList5 = new ArrayList(AbstractC06950Ym.A1E(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(((Product) it4.next()).A0H);
            }
            arrayList.addAll(arrayList5);
        }
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata != null && (Buh = clipsMetadata.Buh()) != null && (A00 = I3Q.A00(Buh)) != null) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : A00) {
                if (((Boolean) c9e2.invoke(obj)).booleanValue()) {
                    arrayList6.add(obj);
                }
            }
            ArrayList arrayList7 = new ArrayList(AbstractC06950Ym.A1E(arrayList6, 10));
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(((Product) it5.next()).A0H);
            }
            arrayList.addAll(arrayList7);
        }
        return arrayList;
    }

    public static final ArrayList A00(C38321qM c38321qM) {
        Iterable iterable;
        Iterable iterable2;
        ClipsShoppingInfoIntf Buh;
        List A0a = AbstractC001800i.A0a(c38321qM.A3J());
        IGTVShoppingInfoIntf BGP = c38321qM.A0C.BGP();
        if (BGP != null) {
            iterable = AbstractC001800i.A0a(I3S.A00(BGP));
        } else {
            iterable = C16930sl.A00;
        }
        ArrayList A0S = AbstractC001800i.A0S(iterable, A0a);
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata == null || (Buh = clipsMetadata.Buh()) == null || (iterable2 = I3Q.A00(Buh)) == null) {
            iterable2 = C16930sl.A00;
        }
        return AbstractC001800i.A0S(iterable2, A0S);
    }

    public static final boolean A02(C38321qM c38321qM) {
        IGTVShoppingInfoIntf BGP;
        C3x9 clipsMetadata;
        ClipsShoppingInfoIntf Buh;
        List A00;
        if ((c38321qM.A3I() == null || !(!r0.isEmpty())) && (((BGP = c38321qM.A0C.BGP()) == null || !(!I3S.A00(BGP).isEmpty())) && ((clipsMetadata = c38321qM.A0C.getClipsMetadata()) == null || (Buh = clipsMetadata.Buh()) == null || (A00 = I3Q.A00(Buh)) == null || !(!A00.isEmpty())))) {
            return false;
        }
        return true;
    }
}
