package X;

import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82403m3 {
    public static final java.util.Set A00 = AbstractC16830sb.A07(FeaturedProductPermissionStatus.A0E, FeaturedProductPermissionStatus.A04, FeaturedProductPermissionStatus.A09);

    public static final int A00(C38321qM c38321qM, String str) {
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        if (!c38321qM.A5M()) {
            return 0;
        }
        int A0p = c38321qM.A0p();
        int i = -1;
        for (int i2 = 0; i2 < A0p; i2++) {
            C38321qM A1e = c38321qM.A1e(i2);
            C14360o3.A0A(A1e);
            List<InterfaceC43546JLg> B5P = A1e.A0C.B5P();
            if (B5P != null && (!(B5P instanceof Collection) || !B5P.isEmpty())) {
                for (InterfaceC43546JLg interfaceC43546JLg : B5P) {
                    java.util.Set set = A00;
                    JLH BcS = interfaceC43546JLg.BcS();
                    String str2 = null;
                    if (BcS != null) {
                        featuredProductPermissionStatus = BcS.C0K();
                    } else {
                        featuredProductPermissionStatus = null;
                    }
                    if (AbstractC001800i.A0u(set, featuredProductPermissionStatus)) {
                        ProductDetailsProductItemDictIntf Bgl = interfaceC43546JLg.Bgl();
                        if (Bgl != null) {
                            str2 = Bgl.getProductId();
                        }
                        if (C14360o3.A0K(str2, str)) {
                            return i2;
                        }
                    }
                }
            }
            List B5P2 = A1e.A0C.B5P();
            if (B5P2 != null && !B5P2.isEmpty() && i == -1) {
                i = i2;
            }
        }
        int i3 = i;
        if (i < 0) {
            return 0;
        }
        return i3;
    }

    public static final C38321qM A02(C38321qM c38321qM, String str) {
        Long l;
        Long l2;
        C14360o3.A0B(str, 1);
        Object obj = null;
        if (c38321qM.A5M()) {
            List AmB = c38321qM.A0C.AmB();
            C14360o3.A0A(AmB);
            Iterator it = AmB.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List B5P = ((C38321qM) next).A0C.B5P();
                if (B5P != null && (!(B5P instanceof Collection) || !B5P.isEmpty())) {
                    Iterator it2 = B5P.iterator();
                    while (it2.hasNext()) {
                        JLH BcS = ((InterfaceC43546JLg) it2.next()).BcS();
                        if (BcS != null) {
                            l2 = BcS.BF7();
                        } else {
                            l2 = null;
                        }
                        if (C14360o3.A0K(String.valueOf(l2), str)) {
                            obj = next;
                            break loop0;
                        }
                    }
                }
            }
            return (C38321qM) obj;
        }
        List B5P2 = c38321qM.A0C.B5P();
        if (B5P2 != null && (!(B5P2 instanceof Collection) || !B5P2.isEmpty())) {
            Iterator it3 = B5P2.iterator();
            while (it3.hasNext()) {
                JLH BcS2 = ((InterfaceC43546JLg) it3.next()).BcS();
                if (BcS2 != null) {
                    l = BcS2.BF7();
                } else {
                    l = null;
                }
                if (C14360o3.A0K(String.valueOf(l), str)) {
                    return c38321qM;
                }
            }
        }
        return null;
    }

    public static final InterfaceC43546JLg A03(C38321qM c38321qM) {
        List B5P;
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A5M()) {
            C38321qM A1e = c38321qM.A1e(A00(c38321qM, null));
            C14360o3.A0A(A1e);
            B5P = A1e.A0C.B5P();
            if (B5P == null) {
                return null;
            }
        } else {
            B5P = c38321qM.A0C.B5P();
            if (B5P == null) {
                return null;
            }
        }
        return (InterfaceC43546JLg) AbstractC001800i.A0J(B5P);
    }

    public static final LinkedHashMap A07(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c38321qM.A5M()) {
            List<C38321qM> AmB = c38321qM.A0C.AmB();
            if (AmB != null) {
                for (C38321qM c38321qM2 : AmB) {
                    List B5P = c38321qM2.A0C.B5P();
                    if (B5P != null) {
                        linkedHashMap.put(c38321qM2, B5P);
                    }
                }
            }
        } else {
            List B5P2 = c38321qM.A0C.B5P();
            if (B5P2 != null) {
                linkedHashMap.put(c38321qM, B5P2);
            }
        }
        return linkedHashMap;
    }

    public static final boolean A08(C38321qM c38321qM) {
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        FeaturedProductPermissionStatus featuredProductPermissionStatus2;
        if (c38321qM.A5M()) {
            int A0p = c38321qM.A0p();
            for (int i = 0; i < A0p; i++) {
                C38321qM A1e = c38321qM.A1e(i);
                C14360o3.A0A(A1e);
                List B5P = A1e.A0C.B5P();
                if (B5P != null && (!(B5P instanceof Collection) || !B5P.isEmpty())) {
                    Iterator it = B5P.iterator();
                    while (it.hasNext()) {
                        JLH BcS = ((InterfaceC43546JLg) it.next()).BcS();
                        if (BcS != null) {
                            featuredProductPermissionStatus2 = BcS.C0K();
                        } else {
                            featuredProductPermissionStatus2 = null;
                        }
                        if (featuredProductPermissionStatus2 == FeaturedProductPermissionStatus.A04) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        List B5P2 = c38321qM.A0C.B5P();
        if (B5P2 != null) {
            if ((B5P2 instanceof Collection) && B5P2.isEmpty()) {
                return false;
            }
            Iterator it2 = B5P2.iterator();
            while (it2.hasNext()) {
                JLH BcS2 = ((InterfaceC43546JLg) it2.next()).BcS();
                if (BcS2 != null) {
                    featuredProductPermissionStatus = BcS2.C0K();
                } else {
                    featuredProductPermissionStatus = null;
                }
                if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.A04) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final ArrayList A05(C38321qM c38321qM) {
        ArrayList arrayList = new ArrayList();
        if (c38321qM.A5M()) {
            List AmB = c38321qM.A0C.AmB();
            C14360o3.A0A(AmB);
            Iterator it = AmB.iterator();
            while (it.hasNext()) {
                List B5P = ((C38321qM) it.next()).A0C.B5P();
                if (B5P != null) {
                    arrayList.addAll(B5P);
                }
            }
        } else {
            List B5P2 = c38321qM.A0C.B5P();
            if (B5P2 != null) {
                arrayList.addAll(B5P2);
            }
        }
        return arrayList;
    }

    public static final ArrayList A06(C38321qM c38321qM) {
        ArrayList arrayList = new ArrayList();
        if (c38321qM.A5M()) {
            List AmB = c38321qM.A0C.AmB();
            C14360o3.A0A(AmB);
            Iterator it = AmB.iterator();
            while (it.hasNext()) {
                ArrayList A3M = ((C38321qM) it.next()).A3M();
                if (A3M != null) {
                    arrayList.addAll(A3M);
                }
            }
        } else {
            ArrayList A3M2 = c38321qM.A3M();
            if (A3M2 != null) {
                arrayList.addAll(A3M2);
            }
        }
        return arrayList;
    }

    public static final C38321qM A01(C38321qM c38321qM, FeaturedProductPermissionStatus featuredProductPermissionStatus) {
        Object obj = null;
        if (c38321qM.A5M()) {
            List AmB = c38321qM.A0C.AmB();
            C14360o3.A0A(AmB);
            Iterator it = AmB.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                List B5P = ((C38321qM) next).A0C.B5P();
                if (B5P != null && (!(B5P instanceof Collection) || !B5P.isEmpty())) {
                    Iterator it2 = B5P.iterator();
                    while (it2.hasNext()) {
                        JLH BcS = ((InterfaceC43546JLg) it2.next()).BcS();
                        if (BcS != null && BcS.C0K() == featuredProductPermissionStatus) {
                            obj = next;
                            break loop0;
                        }
                    }
                }
            }
            return (C38321qM) obj;
        }
        List B5P2 = c38321qM.A0C.B5P();
        if (B5P2 != null && (!(B5P2 instanceof Collection) || !B5P2.isEmpty())) {
            Iterator it3 = B5P2.iterator();
            while (it3.hasNext()) {
                JLH BcS2 = ((InterfaceC43546JLg) it3.next()).BcS();
                if (BcS2 != null && BcS2.C0K() == featuredProductPermissionStatus) {
                    return c38321qM;
                }
            }
        }
        return null;
    }

    public static final InterfaceC43546JLg A04(C38321qM c38321qM, String str) {
        Long l;
        List B5P;
        Long l2;
        Object obj = null;
        if (c38321qM.A5M()) {
            int A0p = c38321qM.A0p();
            for (int i = 0; i < A0p; i++) {
                C38321qM A1e = c38321qM.A1e(i);
                if (A1e != null && (B5P = A1e.A0C.B5P()) != null && !B5P.isEmpty()) {
                    List B5P2 = A1e.A0C.B5P();
                    if (B5P2 == null) {
                        return null;
                    }
                    for (Object obj2 : B5P2) {
                        JLH BcS = ((InterfaceC43546JLg) obj2).BcS();
                        if (BcS != null) {
                            l2 = BcS.BF7();
                        } else {
                            l2 = null;
                        }
                        if (C14360o3.A0K(String.valueOf(l2), str)) {
                            obj = obj2;
                            break;
                        }
                    }
                    return (InterfaceC43546JLg) obj;
                }
            }
            return null;
        }
        List B5P3 = c38321qM.A0C.B5P();
        if (B5P3 == null) {
            return null;
        }
        for (Object obj22 : B5P3) {
            JLH BcS2 = ((InterfaceC43546JLg) obj22).BcS();
            if (BcS2 != null) {
                l = BcS2.BF7();
            } else {
                l = null;
            }
            if (C14360o3.A0K(String.valueOf(l), str)) {
                obj = obj22;
                break;
            }
        }
        return (InterfaceC43546JLg) obj;
    }

    public static final boolean A09(C38321qM c38321qM) {
        List AmB;
        if (c38321qM.A5M() && (AmB = c38321qM.A0C.AmB()) != null && (!(AmB instanceof Collection) || !AmB.isEmpty())) {
            Iterator it = AmB.iterator();
            while (it.hasNext()) {
                List B5P = ((C38321qM) it.next()).A0C.B5P();
                if (B5P != null && AbstractC001800i.A0J(B5P) != null) {
                    return true;
                }
            }
        }
        List B5P2 = c38321qM.A0C.B5P();
        if (B5P2 != null && AbstractC001800i.A0J(B5P2) != null) {
            return true;
        }
        return false;
    }
}
