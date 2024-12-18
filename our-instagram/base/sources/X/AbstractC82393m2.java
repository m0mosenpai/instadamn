package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82393m2 {
    public static final boolean A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Boolean CdA = C08730cb.A00(userSession).A00().A03.CdA();
        if (CdA != null && CdA.booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36311195413643730L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        boolean z;
        boolean z2;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        String str;
        boolean z3;
        User BSW;
        String str2;
        C14360o3.A0B(c38321qM, 1);
        User A01 = C17060sy.A01.A01(userSession);
        User A2E = c38321qM.A2E(userSession);
        boolean z4 = !c38321qM.A63();
        C84923qg A1V = c38321qM.A1V();
        if (A1V != null && (str2 = A1V.A0e) != null) {
            z = AbstractC001900j.A0a(str2, AnonymousClass001.A0D(A01.A03.getUsername(), '@'), false);
        } else {
            z = false;
        }
        ArrayList A06 = AbstractC82403m3.A06(c38321qM);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A06, 10));
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            arrayList.add(((PeopleTag) it.next()).A07().getId());
        }
        boolean A0u = AbstractC001800i.A0u(arrayList, AbstractC76433bn.A00(A01));
        List BSa = c38321qM.BSa();
        if (BSa != null) {
            z2 = BSa.contains(AbstractC76433bn.A00(A01));
        } else {
            z2 = false;
        }
        ArrayList A05 = AbstractC82403m3.A05(c38321qM);
        if (!(A05 instanceof Collection) || !A05.isEmpty()) {
            Iterator it2 = A05.iterator();
            while (it2.hasNext()) {
                InterfaceC43546JLg interfaceC43546JLg = (InterfaceC43546JLg) it2.next();
                JLH BcS = interfaceC43546JLg.BcS();
                if (BcS != null) {
                    featuredProductPermissionStatus = BcS.C0K();
                } else {
                    featuredProductPermissionStatus = null;
                }
                if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.A04) {
                    ProductDetailsProductItemDictIntf Bgl = interfaceC43546JLg.Bgl();
                    if (Bgl != null && (BSW = Bgl.BSW()) != null) {
                        str = AbstractC76433bn.A00(BSW);
                    } else {
                        str = null;
                    }
                    if (C14360o3.A0K(str, AbstractC76433bn.A00(A01))) {
                        z3 = true;
                        break;
                    }
                }
            }
        }
        z3 = false;
        if (!C14360o3.A0K(A2E, A01) && !z3 && z4) {
            if ((z || A0u || z2) && A00(userSession)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        String str;
        Object obj;
        String str2;
        ProductDetailsProductItemDictIntf Bgl;
        User BSW;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        Iterator it = AbstractC82403m3.A05(c38321qM).iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                JLH BcS = ((InterfaceC43546JLg) obj).BcS();
                if (BcS != null) {
                    featuredProductPermissionStatus = BcS.C0K();
                } else {
                    featuredProductPermissionStatus = null;
                }
                if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.A04) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC43546JLg interfaceC43546JLg = (InterfaceC43546JLg) obj;
        if (interfaceC43546JLg != null && (Bgl = interfaceC43546JLg.Bgl()) != null && (BSW = Bgl.BSW()) != null) {
            str2 = AbstractC76433bn.A00(BSW);
        } else {
            str2 = null;
        }
        String str3 = userSession.userId;
        if (interfaceC43546JLg != null) {
            if (!C14360o3.A0K(str3, str2)) {
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    str = A2E.getId();
                }
                if (!C14360o3.A0K(str3, str)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
