package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HZ6 extends AbstractC40977ICy implements InterfaceC43412JGc {
    public final C37816GkW A00;
    public final UserSession A01;
    public final C41729Ie0 A02;
    public final IND A03;
    public final JI6 A04;
    public final C41702IdW A05;
    public final C41727Idy A06;
    public final C41621IbB A07;
    public final HH1 A08;
    public final C41693IdM A09;
    public final C41632IbN A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HZ6(UserSession userSession, C41702IdW c41702IdW, C41727Idy c41727Idy, C41729Ie0 c41729Ie0, IND ind, C41621IbB c41621IbB, HH1 hh1, C41693IdM c41693IdM, C41632IbN c41632IbN, JI6 ji6, C41622IbC c41622IbC) {
        super(c41622IbC);
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A0k(3, c41727Idy, c41729Ie0, ind, c41693IdM);
        AbstractC25234BEr.A0l(8, c41622IbC, c41632IbN, c41621IbB, hh1);
        this.A01 = userSession;
        this.A04 = ji6;
        this.A06 = c41727Idy;
        this.A05 = c41702IdW;
        this.A02 = c41729Ie0;
        this.A03 = ind;
        this.A09 = c41693IdM;
        this.A0A = c41632IbN;
        this.A07 = c41621IbB;
        this.A08 = hh1;
        this.A00 = C37816GkW.A00(this, 14);
    }

    @Override // X.InterfaceC43412JGc
    public final void D2x(Integer num, String str, boolean z) {
        String str2;
        User user;
        C14360o3.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    Product A00 = C41726Idx.A00(this.A04);
                    if (A00 != null) {
                        A01();
                        this.A02.A04(A00);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                A01();
                JI6 ji6 = this.A04;
                Product A002 = C41726Idx.A00(ji6);
                String BOz = ji6.BUL().BOz();
                if (BOz == null) {
                    return;
                }
                C41729Ie0 c41729Ie0 = this.A02;
                String str3 = null;
                if (A002 != null && (user = A002.A0B) != null) {
                    str3 = AbstractC76433bn.A00(user);
                }
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                if (A002 != null && (str2 = A002.A0H) != null) {
                    str4 = str2;
                }
                String str5 = null;
                if (C41729Ie0.A02(c41729Ie0)) {
                    AbstractC59962oe abstractC59962oe = c41729Ie0.A07;
                    Fragment fragment = abstractC59962oe.mParentFragment;
                    if (fragment != null) {
                        C189478aR c189478aR = ((BottomSheetFragment) fragment).A02;
                        if (c189478aR != null) {
                            UserSession userSession = c41729Ie0.A08;
                            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                            AbstractC25226BEj.A1M(abstractC59962oe.requireContext(), A0y, 2131973957);
                            AbstractC25225BEi.A1Q(A0y, true);
                            A0y.A0x = true;
                            A0y.A03 = 0.66f;
                            A0y.A1O = false;
                            int[] iArr = C189448aO.A1X;
                            A0y.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
                            C1XJ c1xj = C1XJ.A00;
                            String str6 = c41729Ie0.A0J;
                            String moduleName = c41729Ie0.A09.getModuleName();
                            C38321qM c38321qM = c41729Ie0.A01;
                            if (c38321qM != null) {
                                str5 = AbstractC41071vF.A06(userSession, c38321qM);
                            }
                            c1xj.A1J(c189478aR, A0y, null, str3, str6, moduleName, "view_in_cart_cta", BOz, str5, null, null, c41729Ie0.A0C, str4, null, null, false);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C1XJ c1xj2 = C1XJ.A00;
                FragmentActivity fragmentActivity = c41729Ie0.A05;
                UserSession userSession2 = c41729Ie0.A08;
                String str7 = c41729Ie0.A0J;
                String moduleName2 = c41729Ie0.A09.getModuleName();
                C38321qM c38321qM2 = c41729Ie0.A01;
                if (c38321qM2 != null) {
                    str5 = AbstractC41071vF.A06(userSession2, c38321qM2);
                }
                c1xj2.A0m(fragmentActivity, EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, userSession2, null, str3, str7, moduleName2, "view_in_cart_cta", BOz, str5, null, null, c41729Ie0.A0C, str4, null, null, null, null, false);
                return;
            }
            A02(this, str);
            return;
        }
        A03(this, str, z);
    }

    public static final ProductVariantDimension A00(HZ6 hz6) {
        C41726Idx C02 = hz6.A04.C02();
        ProductGroup productGroup = C02.A00;
        if (productGroup != null && Collections.unmodifiableList(productGroup.A02) != null) {
            Iterator A13 = AbstractC31174DnI.A13(productGroup.A02);
            while (A13.hasNext()) {
                ProductVariantDimension productVariantDimension = (ProductVariantDimension) A13.next();
                C41578IaR c41578IaR = C02.A07;
                String str = productVariantDimension.A02;
                C14360o3.A07(str);
                if (c41578IaR.A01.get(str) == null) {
                    return productVariantDimension;
                }
            }
        }
        return null;
    }

    private final void A01() {
        Product A00 = C41726Idx.A00(this.A04);
        if (A00 != null) {
            C41702IdW c41702IdW = this.A05;
            if (c41702IdW != null) {
                c41702IdW.A03(A00, "webclick");
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A03(HZ6 hz6, String str, boolean z) {
        User user;
        String str2;
        String str3;
        String str4;
        String A06;
        String str5;
        A00(hz6);
        hz6.A01();
        ProductVariantDimension A00 = A00(hz6);
        if (A00 != null) {
            hz6.A0A.A01(A00, new C42890Iy4(hz6, str, z), new J0d(hz6, str, z));
            return;
        }
        Product A002 = C41726Idx.A00(hz6.A04);
        if (A002 != null) {
            hz6.A09.A00 = true;
            if (!A002.A0P) {
                return;
            }
            AbstractC25651Mw.A00(hz6.A01).A01(hz6.A00, C42256Ing.class);
            C41729Ie0 c41729Ie0 = hz6.A02;
            C41585IaY c41585IaY = (C41585IaY) C41585IaY.A04.getValue();
            List A1J = AbstractC166987dD.A1J(A002);
            c41585IaY.A03 = A1J;
            IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = c41585IaY.A01;
            if (igReactPurchaseExperienceBridgeModule != null) {
                igReactPurchaseExperienceBridgeModule.mProducts = A1J;
            }
            C38321qM c38321qM = c41729Ie0.A01;
            if (c38321qM != null) {
                user = c38321qM.A2E(c41729Ie0.A08);
            } else {
                user = null;
            }
            User user2 = A002.A0B;
            if (user2 == null || (str2 = AbstractC76433bn.A00(user2)) == null) {
                str2 = "";
            }
            String str6 = c41729Ie0.A0C;
            String moduleName = c41729Ie0.A09.getModuleName();
            String str7 = c41729Ie0.A0G;
            String str8 = c41729Ie0.A0E;
            if (c41729Ie0.A01 != null && user != null) {
                str3 = user.getId();
            } else {
                str3 = null;
            }
            C38321qM c38321qM2 = c41729Ie0.A01;
            if (c38321qM2 != null) {
                str4 = c38321qM2.A38();
            } else {
                str4 = null;
            }
            C38321qM c38321qM3 = c41729Ie0.A01;
            if (c38321qM3 == null) {
                A06 = null;
            } else {
                A06 = AbstractC41071vF.A06(c41729Ie0.A08, c38321qM3);
            }
            String str9 = c41729Ie0.A0J;
            JI6 ji6 = c41729Ie0.A0B;
            java.util.Set keySet = ji6.C02().A0D.keySet();
            User BSW = ji6.BUL().BSW();
            if (BSW != null) {
                str5 = AbstractC76433bn.A00(BSW);
            } else {
                str5 = null;
            }
            CheckoutLaunchParams A01 = AbstractC41734Ie6.A01(A002, str2, str6, moduleName, str7, str8, str3, str4, A06, null, str9, "pdp", str5, c41729Ie0.A0F, keySet, z);
            C1XF A003 = AbstractC40758I4m.A00();
            boolean A02 = C41729Ie0.A02(c41729Ie0);
            FragmentActivity fragmentActivity = c41729Ie0.A05;
            UserSession userSession = c41729Ie0.A08;
            if (A02) {
                C1XE.A02(fragmentActivity, userSession, A01, (C1XE) A003, "pdp", true);
                return;
            } else {
                A003.A04(fragmentActivity, userSession, A01, "pdp");
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(HZ6 hz6, String str) {
        A00(hz6);
        hz6.A01();
        ProductVariantDimension A00 = A00(hz6);
        if (A00 != null) {
            hz6.A0A.A01(A00, new C42889Iy3(hz6, str), new C56759PHb(str, hz6, 1));
            return;
        }
        Product A002 = C41726Idx.A00(hz6.A04);
        if (A002 != null) {
            if (!A002.A0P) {
                return;
            }
            IND ind = hz6.A03;
            C14360o3.A0B(str, 0);
            ind.A00(A002, str, ind.A0A, ind.A0B);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
