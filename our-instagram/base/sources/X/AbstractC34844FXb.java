package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import com.instagram.shopping.model.share.ShopShareInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FXb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34844FXb {
    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C6FW c6fw, UserSession userSession) {
        Object obj;
        Object obj2;
        String str;
        int i;
        String A0L;
        Object obj3;
        Object obj4;
        boolean A1b = AbstractC25233BEq.A1b(userSession, fragmentActivity, interfaceC11380iw);
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 0);
        String A0s2 = AbstractC31173DnH.A0s(list, A1b ? 1 : 0);
        String A0l = AbstractC31180DnO.A0l(list);
        String A0s3 = AbstractC31173DnH.A0s(list, 4);
        String A0s4 = AbstractC31173DnH.A0s(list, 5);
        if (12 < list.size()) {
            obj = list.get(12);
        } else {
            obj = null;
        }
        C102884kP c102884kP = (C102884kP) obj;
        if (c102884kP != null) {
            C102884kP A08 = c102884kP.A08(35);
            String str2 = "";
            if (A08 == null || (str = A08.A0I()) == null) {
                if (9 < list.size()) {
                    obj2 = list.get(9);
                } else {
                    obj2 = null;
                }
                str = (String) obj2;
                if (str == null) {
                    str = "";
                }
            }
            int i2 = -1;
            if (A08 != null) {
                i = A08.A03(40, -1);
                i2 = A08.A03(35, -1);
            } else {
                i = -1;
            }
            String A0G = c102884kP.A0G();
            if (A0G == null) {
                if (10 < list.size()) {
                    obj4 = list.get(10);
                } else {
                    obj4 = null;
                }
                A0G = (String) obj4;
            }
            String A0J = c102884kP.A0J();
            if (A0J == null) {
                if (11 < list.size()) {
                    obj3 = list.get(11);
                } else {
                    obj3 = null;
                }
                A0J = (String) obj3;
            }
            List<C102884kP> A0O = c102884kP.A0O(38);
            ArrayList A10 = AbstractC31174DnI.A10(A0O);
            for (C102884kP c102884kP2 : A0O) {
                if (c102884kP2 != null && (A0L = c102884kP2.A0L(38)) != null) {
                    A10.add(A0L);
                }
            }
            String A0L2 = c102884kP.A0L(44);
            if (A0L2 != null) {
                str2 = A0L2;
            }
            C3DN A0r = AbstractC31172DnG.A0r(fragmentActivity);
            if (A0r != null) {
                C34726FRp A07 = C28531Zo.A04.A02.A07(interfaceC11380iw, userSession, C2EY.A1b);
                SimpleImageUrl A00 = AbstractC81033jX.A00(AbstractC25227BEk.A0B(str), i, i2);
                SimpleImageUrl A002 = AbstractC81033jX.A00(AbstractC25227BEk.A0B(str2), -1, -1);
                ArrayList A0q = AbstractC167017dG.A0q(A10);
                Iterator it = A10.iterator();
                while (it.hasNext()) {
                    A0q.add(AbstractC81033jX.A00(AbstractC25227BEk.A0B(AbstractC166987dD.A1B(it)), -1, -1));
                }
                A07.A07.putParcelable(AbstractC111324zv.A00(309), new ProductCollectionShareInfo(A00, A002, A0s4, A0s, A0l, A0s3, A0s2, A0G, A0J, A0q));
                A0r.A0K(A07.A00());
            }
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C6FW c6fw, UserSession userSession) {
        Object obj;
        String A0I;
        boolean A1b = AbstractC25233BEq.A1b(userSession, fragmentActivity, interfaceC11380iw);
        Object A03 = c6fw.A03(0);
        String A0f = AbstractC31171DnF.A0f(A03);
        String str = (String) A03;
        String A0o = AbstractC31176DnK.A0o(c6fw, A0f, A1b ? 1 : 0);
        String A0o2 = AbstractC31176DnK.A0o(c6fw, A0f, 3);
        List list = c6fw.A00;
        Object obj2 = null;
        if (7 < list.size()) {
            obj = list.get(7);
        } else {
            obj = null;
        }
        String str2 = (String) obj;
        if (8 < list.size()) {
            obj2 = list.get(8);
        }
        C102884kP c102884kP = (C102884kP) obj2;
        if (c102884kP != null) {
            boolean A0S = c102884kP.A0S(40, false);
            String str3 = "";
            String str4 = "";
            String A0I2 = c102884kP.A0I();
            if (A0I2 != null) {
                str4 = A0I2;
            }
            String A0J = c102884kP.A0J();
            if (A0J != null) {
                str3 = A0J;
            }
            List A0O = c102884kP.A0O(35);
            C14360o3.A07(A0O);
            List<C102884kP> A0O2 = c102884kP.A0O(36);
            ArrayList A10 = AbstractC31174DnI.A10(A0O2);
            for (C102884kP c102884kP2 : A0O2) {
                if (c102884kP2 != null && (A0I = c102884kP2.A0I()) != null) {
                    A10.add(A0I);
                }
            }
            C3DN A0r = AbstractC31172DnG.A0r(fragmentActivity);
            if (A0r != null) {
                C34726FRp A07 = C28531Zo.A04.A02.A07(interfaceC11380iw, userSession, C2EY.A1c);
                SimpleImageUrl A00 = AbstractC81033jX.A00(AbstractC25227BEk.A0B(str3), -1, -1);
                ArrayList A0q = AbstractC167017dG.A0q(A10);
                Iterator it = A10.iterator();
                while (it.hasNext()) {
                    A0q.add(AbstractC81033jX.A00(AbstractC25227BEk.A0B(AbstractC166987dD.A1B(it)), -1, -1));
                }
                A07.A07.putParcelable("DirectShareSheetConstants.shops_share_info", new ShopShareInfo(A00, A0o, str, str4, A0o2, str2, A0O, A0q, A0S));
                A0r.A0K(A07.A00());
            }
        }
    }
}
