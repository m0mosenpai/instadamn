package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1vF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41071vF {
    public static final IGCTMessagingAdsInfoDictIntf A00(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        if (c38321qM == null) {
            return null;
        }
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A09;
        }
        return c38321qM.A1I();
    }

    public static final InterfaceC104904o2 A02(UserSession userSession, C38321qM c38321qM) {
        InterfaceC39541sb injected;
        InterfaceC104904o2 BGF;
        C14360o3.A0B(userSession, 0);
        if (c38321qM != null) {
            C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
            if (A00 == null || (injected = A00.A0J.A0C.getInjected()) == null || (BGF = injected.BGF()) == null) {
                InterfaceC39541sb injected2 = c38321qM.A0C.getInjected();
                if (injected2 != null) {
                    return injected2.BGF();
                }
                return null;
            }
            return BGF;
        }
        return null;
    }

    public static final C47W A03(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0G;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return injected.BiD();
        }
        return null;
    }

    public static final Integer A05(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0P;
        }
        return c38321qM.BA3();
    }

    public static final String A06(UserSession userSession, C1NI c1ni) {
        C14360o3.A0B(userSession, 0);
        if (c1ni instanceof C38321qM) {
            return A0F(userSession, (C38321qM) c1ni);
        }
        if (c1ni != null) {
            return c1ni.BzL(userSession);
        }
        return null;
    }

    public static final String A07(UserSession userSession, C38321qM c38321qM) {
        String str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 == null || (str = A00.A0S) == null) {
            return c38321qM.A2W();
        }
        return str;
    }

    public static final String A09(UserSession userSession, C38321qM c38321qM) {
        String Asj;
        String str;
        C14360o3.A0B(userSession, 0);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 == null || (str = A00.A0R) == null) {
            InterfaceC39541sb injected = c38321qM.A0C.getInjected();
            if (injected == null || (Asj = injected.Asj()) == null) {
                return "UNKNOWN";
            }
            return Asj;
        }
        return str;
    }

    public static final String A0F(UserSession userSession, C38321qM c38321qM) {
        String str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 == null || (str = A00.A0j) == null) {
            return c38321qM.A33();
        }
        return str;
    }

    public static final String A0G(UserSession userSession, C38321qM c38321qM) {
        String fullName;
        String A2X;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 == null || (fullName = A00.A0U) == null || fullName.length() <= 0) {
            if (c38321qM.CdW() && (A2X = c38321qM.A2X()) != null && A2X.length() != 0) {
                fullName = c38321qM.A2X();
            } else {
                User A2E = c38321qM.A2E(userSession);
                if (A2E == null) {
                    return "";
                }
                fullName = A2E.A03.getFullName();
            }
            if (fullName == null) {
                return "";
            }
        }
        return fullName;
    }

    public static final String A0H(UserSession userSession, String str) {
        C40971v4 c40971v4;
        C14360o3.A0B(userSession, 0);
        if (str == null) {
            return null;
        }
        C41571w7 A00 = AbstractC41561w6.A00(userSession);
        if (AbstractC41641wE.A00 || (c40971v4 = (C40971v4) A00.A00.get(str)) == null) {
            return null;
        }
        return c40971v4.A0c;
    }

    public static final String A0I(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C38321qM A02 = C1DW.A00(userSession).A02(str);
        if (A02 == null) {
            return null;
        }
        return A0F(userSession, A02);
    }

    public static final String A0J(String str) {
        C14360o3.A0B(str, 0);
        if (str.length() > 27) {
            String substring = str.substring(0, 27);
            C14360o3.A07(substring);
            String A0R = AnonymousClass001.A0R(substring, "...");
            C14360o3.A0A(A0R);
            return A0R;
        }
        return str;
    }

    public static final List A0K(UserSession userSession, C38321qM c38321qM) {
        ImmutableList immutableList;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null && (immutableList = A00.A00) != null) {
            return immutableList;
        }
        return c38321qM.A3X();
    }

    public static final boolean A0M(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0o;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.Axd(), true);
        }
        return false;
    }

    public static final boolean A0O(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0w;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.CYx(), true);
        }
        return false;
    }

    public static final boolean A0R(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A12;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.CSW(), true);
        }
        return false;
    }

    public static final boolean A0S(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A13;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.CVu(), true);
        }
        return false;
    }

    public static final boolean A0T(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        if (c38321qM.A5E() && !c38321qM.A5M() && !c38321qM.A5m() && !c38321qM.A5w() && !c38321qM.A5v() && c38321qM.A0C.BNT() != null && C18U.A06(C06090Tz.A05, userSession, 36329238571270357L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0U(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A14;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.Ayi(), true);
        }
        return false;
    }

    public static final boolean A0V(UserSession userSession, C38321qM c38321qM) {
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0p;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.AyV(), true);
        }
        return false;
    }

    public static final boolean A0W(UserSession userSession, C38321qM c38321qM, User user) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(user, 2);
        C47W A03 = A03(userSession, c38321qM);
        if (A03 == null) {
            return false;
        }
        Integer BrW = A03.BrW();
        if (BrW != null && BrW.intValue() == 8 && user.B7L() == FollowStatus.A05) {
            return false;
        }
        return true;
    }

    public static final boolean A0X(UserSession userSession, String str, boolean z) {
        C40971v4 c40971v4;
        C14360o3.A0B(str, 1);
        C41571w7 A00 = AbstractC41561w6.A00(userSession);
        if (!AbstractC41641wE.A00 && (c40971v4 = (C40971v4) A00.A00.get(str)) != null) {
            return c40971v4.A15;
        }
        return z;
    }

    public static final boolean A0Y(C76623c7 c76623c7) {
        List sponsorTags;
        InterfaceC102194ip interfaceC102194ip;
        InterfaceC76613c6 interfaceC76613c6 = c76623c7.A00;
        List sponsorTags2 = interfaceC76613c6.getSponsorTags();
        if (sponsorTags2 != null && !sponsorTags2.isEmpty() && (sponsorTags = interfaceC76613c6.getSponsorTags()) != null && (interfaceC102194ip = (InterfaceC102194ip) AbstractC001800i.A0O(sponsorTags, 0)) != null && interfaceC102194ip.BzF() != null) {
            return true;
        }
        return false;
    }

    public static final C38321qM A04(Object obj) {
        if (obj instanceof C38321qM) {
            return (C38321qM) obj;
        }
        if (obj instanceof C40971v4) {
            return ((C40971v4) obj).A0K;
        }
        return null;
    }

    public static final Map A0L(List list) {
        EnumC41091vH enumC41091vH;
        EnumC41091vH enumC41091vH2;
        if (list != null) {
            ArrayList<InterfaceC38791rB> arrayList = new ArrayList();
            for (Object obj : list) {
                Integer BZI = ((InterfaceC38791rB) obj).BZI();
                EnumC41091vH[] values = EnumC41091vH.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        enumC41091vH2 = values[i];
                        int i2 = enumC41091vH2.A00;
                        if (BZI != null && i2 == BZI.intValue()) {
                            break;
                        }
                        i++;
                    } else {
                        enumC41091vH2 = EnumC41091vH.A0P;
                        break;
                    }
                }
                if (enumC41091vH2 != EnumC41091vH.A0P) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC38791rB interfaceC38791rB : arrayList) {
                Integer BZK = interfaceC38791rB.BZK();
                if (BZK != null) {
                    Integer BZI2 = interfaceC38791rB.BZI();
                    EnumC41091vH[] values2 = EnumC41091vH.values();
                    int length2 = values2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            enumC41091vH = values2[i3];
                            int i4 = enumC41091vH.A00;
                            if (BZI2 != null && i4 == BZI2.intValue()) {
                                break;
                            }
                            i3++;
                        } else {
                            enumC41091vH = EnumC41091vH.A0P;
                            break;
                        }
                    }
                    arrayList2.add(new C09530e4(enumC41091vH, BZK));
                }
            }
            return AbstractC06930Yk.A08(arrayList2);
        }
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c16920sk;
    }

    public static final boolean A0Q(UserSession userSession, C38321qM c38321qM) {
        List AmB = c38321qM.A0C.AmB();
        if (AmB != null) {
            if ((AmB instanceof Collection) && AmB.isEmpty()) {
                return false;
            }
            Iterator it = AmB.iterator();
            while (it.hasNext()) {
                if (((C38321qM) it.next()).A0C.Azy() != null) {
                    if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36325295791354860L)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final InterfaceC39421sN A01(UserSession userSession, C38321qM c38321qM) {
        InterfaceC39541sb injected;
        InterfaceC39421sN BEa;
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 == null || (injected = A00.A0J.A0C.getInjected()) == null || (BEa = injected.BEa()) == null) {
            InterfaceC39541sb injected2 = c38321qM.A0C.getInjected();
            if (injected2 != null) {
                return injected2.BEa();
            }
            return null;
        }
        return BEa;
    }

    public static final String A08(UserSession userSession, C38321qM c38321qM) {
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0U;
        }
        return c38321qM.A2X();
    }

    public static final String A0A(UserSession userSession, C38321qM c38321qM) {
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0Y;
        }
        return c38321qM.A2i();
    }

    public static final String A0B(UserSession userSession, C38321qM c38321qM) {
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0Z;
        }
        return c38321qM.A2j();
    }

    public static final String A0C(UserSession userSession, C38321qM c38321qM) {
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0a;
        }
        return c38321qM.A2k();
    }

    public static final String A0D(UserSession userSession, C38321qM c38321qM) {
        InterfaceC104944o7 BeI;
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0h;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null && (BeI = injected.BeI()) != null) {
            return BeI.AjQ();
        }
        return null;
    }

    public static final String A0E(UserSession userSession, C38321qM c38321qM) {
        String str;
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 == null || (str = A00.A0i) == null) {
            return c38321qM.A32();
        }
        return str;
    }

    public static final boolean A0N(UserSession userSession, C38321qM c38321qM) {
        C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
        if (A00 != null) {
            return A00.A0r;
        }
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null) {
            return C14360o3.A0K(injected.CQK(), true);
        }
        return false;
    }

    public static final boolean A0P(UserSession userSession, C38321qM c38321qM) {
        if (!A0a(c38321qM) && !A0Z(c38321qM) && !A0Q(userSession, c38321qM)) {
            return false;
        }
        return true;
    }

    public static final boolean A0Z(C38321qM c38321qM) {
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption;
        if (c38321qM.CdW() && c38321qM.A2D() != null) {
            InterfaceC39541sb injected = c38321qM.A0C.getInjected();
            if (injected != null) {
                brandedContentAdsPaidPartnershipLabelRemovalOption = injected.Afo();
            } else {
                brandedContentAdsPaidPartnershipLabelRemovalOption = null;
            }
            if (brandedContentAdsPaidPartnershipLabelRemovalOption == BrandedContentAdsPaidPartnershipLabelRemovalOption.A04) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0a(C38321qM c38321qM) {
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption;
        if (c38321qM.CdW() && c38321qM.A2D() != null) {
            InterfaceC39541sb injected = c38321qM.A0C.getInjected();
            if (injected != null) {
                brandedContentAdsPaidPartnershipLabelRemovalOption = injected.Afo();
            } else {
                brandedContentAdsPaidPartnershipLabelRemovalOption = null;
            }
            if (brandedContentAdsPaidPartnershipLabelRemovalOption == BrandedContentAdsPaidPartnershipLabelRemovalOption.A05) {
                return true;
            }
        }
        return false;
    }
}
