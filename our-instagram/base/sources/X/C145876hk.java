package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145876hk {
    public final FragmentActivity A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C145826hf A04;
    public final C3G2 A05;

    public C145876hk(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C145826hf c145826hf) {
        C14360o3.A0B(c145826hf, 1);
        C14360o3.A0B(c3g2, 4);
        C14360o3.A0B(userSession, 5);
        this.A04 = c145826hf;
        this.A00 = fragmentActivity;
        this.A03 = interfaceC60442pS;
        this.A05 = c3g2;
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
    }

    public static final void A02(C41181vS c41181vS, C145876hk c145876hk, User user, boolean z) {
        String str;
        String str2;
        if (user != null) {
            str = AbstractC76433bn.A00(user);
        } else {
            str = null;
        }
        ArrayList A0A = C128205qp.A0A(c41181vS);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            User user2 = ((Product) next).A0B;
            if (user2 != null) {
                str2 = AbstractC76433bn.A00(user2);
            } else {
                str2 = null;
            }
            if (AbstractC002300n.A0g(str2, str, true)) {
                arrayList.add(next);
            }
        }
        List A00 = AbstractC34845FXd.A00(arrayList);
        String A002 = user != null ? AbstractC76433bn.A00(user) : null;
        String username = user.A03.getUsername();
        if (A002 != null && username != null) {
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity fragmentActivity = c145876hk.A00;
            UserSession userSession = c145876hk.A02;
            InterfaceC60442pS interfaceC60442pS = c145876hk.A03;
            C41749IeN A0N = c1xj.A0N(fragmentActivity, SellerShoppableFeedType.A04, userSession, interfaceC60442pS, c145876hk.A04.A02, interfaceC60442pS.getModuleName(), "stories_cta", A002, username);
            A0N.A03 = c41181vS.A0b;
            A0N.A0I = A00;
            A0N.A0K = z;
            A0N.A0C = AbstractC76433bn.A00(user);
            A0N.A05();
        }
    }

    public final void A03(Context context, C41181vS c41181vS) {
        ArrayList A09;
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        String moduleName = interfaceC60442pS.getModuleName();
        C14360o3.A0B(moduleName, 2);
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_shopping_story_cta_bar_tap");
            boolean z = true;
            if (!A00.isSampled()) {
                z = false;
            }
            if (z) {
                String id = c38321qM.getId();
                if (id != null) {
                    A00.AAP("m_pk", id);
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A06("prior_module", moduleName);
                    c0Zx.A06("submodule", "stories_cta");
                    A00.AAQ(c0Zx, "navigation_info");
                    A00.AAk("product_ids", AbstractC34845FXd.A01(C128205qp.A0A(c41181vS)));
                    A00.A9M("product_merchant_ids", C128205qp.A0B(c41181vS));
                    A00.AAP("cta_bar_type", "stories_view_shop");
                    A00.Cht();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C18920wW A012 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            InterfaceC02590Ai A002 = A012.A00(A012.A00, "commerce_feed_click");
            if (A002.isSampled()) {
                A002.AAP("shopping_session_id", "");
                A002.A8R(EnumC39651Hig.A07, "analytics_component");
                A002.AAP("legacy_event_name", "instagram_shopping_story_cta_bar_tap");
                A002.AAP("legacy_referral_surface", moduleName);
                A002.AAP("legacy_ui_component", "stories_cta");
                A002.AAP("m_pk", c38321qM.getId());
                A002.AAP("cta_bar_type", "stories_view_shop");
                A002.AAk("product_ids", AbstractC34845FXd.A01(C128205qp.A0A(c41181vS)));
                A002.A9M("product_merchant_ids", C128205qp.A0B(c41181vS));
                A002.Cht();
                A09 = C128205qp.A09(c38321qM);
                if (A09 == null && !A09.isEmpty()) {
                    if (A09.size() == 1) {
                        A02(c41181vS, this, (User) A09.get(0), true);
                        return;
                    }
                    if (context != null) {
                        C189448aO c189448aO = new C189448aO(userSession);
                        c189448aO.A0d = context.getString(2131973944);
                        C189478aR A003 = c189448aO.A00();
                        FragmentActivity fragmentActivity = this.A00;
                        C14360o3.A0C(fragmentActivity, AbstractC43591JPw.A00(4));
                        C41769Iel A0T = C1XJ.A00.A0T();
                        ArrayList arrayList = new ArrayList(A09);
                        A003.A02(fragmentActivity, A0T.A0G(userSession, new HZY(c41181vS, this), null, interfaceC60442pS.getModuleName(), "stories_cta", c38321qM.getId(), c38321qM.CAR(), arrayList));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        if (c38321qM == null) {
            return;
        }
        A09 = C128205qp.A09(c38321qM);
        if (A09 == null) {
        }
    }

    public final void A04(DialogInterface.OnDismissListener onDismissListener, C41181vS c41181vS, C41551w4 c41551w4, C130935vh c130935vh, InterfaceC1119153d interfaceC1119153d, C2Fb c2Fb) {
        ReelMultiProductLinkIntf reelMultiProductLinkIntf;
        C4SX c4sx;
        User user;
        String A00;
        C14360o3.A0B(onDismissListener, 4);
        if (c41181vS.A0e == EnumC41231vY.A09) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            reelMultiProductLinkIntf = c38321qM.A24();
        } else {
            reelMultiProductLinkIntf = null;
        }
        if (reelMultiProductLinkIntf != null) {
            List BhR = reelMultiProductLinkIntf.BhR();
            if (BhR != null && BhR.size() == 1) {
                A00(onDismissListener, c41181vS, c41551w4, c130935vh, c2Fb, AbstractC38048Gob.A01((ProductDetailsProductItemDictIntf) BhR.get(0)));
                return;
            }
            A01(c41181vS, c41551w4, c130935vh, c2Fb, "multi_product");
            if (BhR != null) {
                C145826hf c145826hf = this.A04;
                List A03 = AbstractC38048Gob.A03(BhR);
                String obj = c2Fb.toString();
                C14360o3.A0B(obj, 3);
                C18920wW A01 = AbstractC12220kQ.A01(C145826hf.A01(c41551w4.A0H, c145826hf), c145826hf.A06);
                C25531Mh c25531Mh = new C25531Mh(A01.A00(A01.A00, "instagram_shopping_viewer_open_shopping_permanent_entrypoint"), 325);
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    C38321qM c38321qM2 = c41181vS.A0b;
                    if (c38321qM2 != null) {
                        String id = c38321qM2.getId();
                        if (id != null) {
                            c25531Mh.A0l(id);
                            ((AbstractC02600Aj) c25531Mh).A00.A9M("product_merchant_ids", C128205qp.A0D(A03));
                            C14360o3.A0B(A03, 0);
                            Product product = (Product) AbstractC001800i.A0J(A03);
                            if (product != null && (user = product.A0B) != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                                c4sx = C4SX.A00(A00);
                            } else {
                                c4sx = null;
                            }
                            c25531Mh.A0d(c4sx);
                            c25531Mh.A0O("is_checkout_enabled", C128205qp.A08(A03));
                            c25531Mh.A0R("submodule", obj);
                            c25531Mh.Cht();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            C41214IMd A0P = C1XJ.A00.A0P(this.A00, this.A02, this.A03);
            A0P.A07 = C05F.A0C;
            C38321qM c38321qM3 = c41181vS.A0b;
            if (c38321qM3 != null) {
                A0P.A01 = c38321qM3;
                A0P.A02 = null;
                A0P.A05 = interfaceC1119153d;
                A0P.A00();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A05(DialogInterface.OnDismissListener onDismissListener, C41181vS c41181vS, C41551w4 c41551w4, C130935vh c130935vh, C2Fb c2Fb) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        C14360o3.A0B(onDismissListener, 4);
        if (c41181vS.A0e == EnumC41231vY.A09) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            ReelProductLink A25 = c38321qM.A25();
            if (A25 != null && (productDetailsProductItemDict = A25.A00) != null) {
                A00(onDismissListener, c41181vS, c41551w4, c130935vh, c2Fb, new Product(null, productDetailsProductItemDict));
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A06(C41181vS c41181vS, C41551w4 c41551w4, C130935vh c130935vh, C2Fb c2Fb) {
        ProductCollectionLinkIntf productCollectionLinkIntf;
        if (c41181vS.A0e == EnumC41231vY.A09) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            productCollectionLinkIntf = c38321qM.A22();
        } else {
            productCollectionLinkIntf = null;
        }
        if (productCollectionLinkIntf != null) {
            A01(c41181vS, c41551w4, c130935vh, c2Fb, "seller_funded_incentive");
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A02;
            String moduleName = this.A03.getModuleName();
            C38321qM c38321qM2 = c41181vS.A0b;
            if (c38321qM2 != null) {
                String id = c38321qM2.getId();
                if (id != null) {
                    c1xj.A12(fragmentActivity, userSession, productCollectionLinkIntf, moduleName, id);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07(C41181vS c41181vS, C41551w4 c41551w4, C130935vh c130935vh, C2Fb c2Fb) {
        String str;
        if (c41181vS.A0e == EnumC41231vY.A09) {
            C38321qM c38321qM = c41181vS.A0b;
            c38321qM.getClass();
            ProfileShopLinkIntf A23 = c38321qM.A23();
            if (A23 != null) {
                C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0y, c41181vS.A0c());
                ArrayList arrayList = null;
                if (A00 != null) {
                    User user = A00.A0H().A0B;
                    if (user != null) {
                        str = AbstractC76433bn.A00(user);
                    } else {
                        str = null;
                    }
                    String Bi6 = A23.Bi6();
                    if (Bi6 == null) {
                        Bi6 = null;
                    }
                    if (C14360o3.A0K(str, Bi6)) {
                        arrayList = new ArrayList();
                        arrayList.add(A00.A0H().A0H);
                    }
                }
                A01(c41181vS, c41551w4, c130935vh, c2Fb, "profile_shop");
                String Bi62 = A23.Bi6();
                if (Bi62 == null) {
                    Bi62 = null;
                }
                C1XJ c1xj = C1XJ.A00;
                FragmentActivity fragmentActivity = this.A00;
                UserSession userSession = this.A02;
                InterfaceC60442pS interfaceC60442pS = this.A03;
                String str2 = this.A04.A02;
                String str3 = this.A05.A00;
                if (A23.Bi6() == null || Bi62 == null) {
                    Bi62 = "";
                }
                C41749IeN A0N = c1xj.A0N(fragmentActivity, A23.Bt7(), userSession, interfaceC60442pS, str2, str3, "shopping_swipe_up", Bi62, A23.Bi7());
                A0N.A03 = c38321qM;
                A0N.A0H = arrayList;
                A0N.A0J = true;
                A0N.A05();
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A00(DialogInterface.OnDismissListener onDismissListener, C41181vS c41181vS, C41551w4 c41551w4, C130935vh c130935vh, C2Fb c2Fb, Product product) {
        A01(c41181vS, c41551w4, c130935vh, c2Fb, "shopping_pdp");
        C42130Ile A0L = C1XJ.A00.A0L(this.A00, this.A02, this.A03, product, "shopping_swipe_up", null);
        A0L.A02 = onDismissListener;
        A0L.A02(c41181vS.A0b, null);
        A0L.A0U = true;
        A0L.A0B = c2Fb;
        A0L.A00 = c41551w4.A01;
        C42130Ile.A01(A0L);
    }

    private final void A01(C41181vS c41181vS, C41551w4 c41551w4, C130935vh c130935vh, C2Fb c2Fb, String str) {
        C145826hf c145826hf = this.A04;
        User user = c41181vS.A0i;
        String obj = c2Fb.toString();
        c145826hf.A0M(c41551w4, c130935vh, user, obj, "reel_present_browser", str);
        c145826hf.A0M(c41551w4, c130935vh, user, obj, "instagram_organic_action", str);
    }
}
