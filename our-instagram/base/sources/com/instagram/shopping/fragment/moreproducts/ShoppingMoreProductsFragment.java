package com.instagram.shopping.fragment.moreproducts;

import X.AbstractC003100w;
import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC25230BEn;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31180DnO;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC41071vF;
import X.AbstractC41665Ibx;
import X.AbstractC55229Oez;
import X.AbstractC63071Sbt;
import X.AbstractC76433bn;
import X.AnonymousClass309;
import X.C006802i;
import X.C00O;
import X.C06090Tz;
import X.C0K8;
import X.C0f9;
import X.C0w9;
import X.C11520jB;
import X.C14360o3;
import X.C18950wb;
import X.C18U;
import X.C1M1;
import X.C1ON;
import X.C1XJ;
import X.C25621Ms;
import X.C25671My;
import X.C37330GcY;
import X.C37460Gee;
import X.C37484Gf2;
import X.C37816GkW;
import X.C37922GmJ;
import X.C38321qM;
import X.C38371Gu8;
import X.C38642Gyj;
import X.C38675GzG;
import X.C39329HYu;
import X.C3DN;
import X.C3HW;
import X.C3LO;
import X.C3LY;
import X.C41145IJk;
import X.C41223IMo;
import X.C41279IOu;
import X.C41625IbF;
import X.C41633IbO;
import X.C41636IbR;
import X.C41646Ibe;
import X.C42113IlN;
import X.C42248InY;
import X.C42927Iyf;
import X.C44229JgZ;
import X.C51D;
import X.C53Z;
import X.C57112jm;
import X.C62882tR;
import X.C64952wt;
import X.C64972wv;
import X.C71163Hc;
import X.C71H;
import X.EnumC27385C6o;
import X.EnumC39571Hdh;
import X.EnumC39572Hdi;
import X.EnumC39622HeW;
import X.H99;
import X.I6P;
import X.I95;
import X.IRD;
import X.ISD;
import X.InterfaceC02590Ai;
import X.InterfaceC41501vz;
import X.InterfaceC43444JHi;
import X.InterfaceC56362iU;
import X.InterfaceC56392iX;
import X.InterfaceC60122ou;
import X.JHS;
import X.JII;
import X.U8S;
import X.ViewOnClickListenerC42033Ik2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class ShoppingMoreProductsFragment extends C53Z implements C1M1, AnonymousClass309, JII, C51D, InterfaceC43444JHi, InterfaceC60122ou {
    public C57112jm A00;
    public C38321qM A01;
    public EnumC39571Hdh A02;
    public C38371Gu8 A03;
    public C41145IJk A04;
    public C41223IMo A05;
    public C41646Ibe A06;
    public JHS A07;
    public ProductCollection A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public long A0D;
    public long A0E;
    public C62882tR A0F;
    public C64952wt A0G;
    public C64952wt A0H;
    public C64972wv A0I;
    public EnumC39572Hdi A0J;
    public C38642Gyj A0K;
    public C41633IbO A0L;
    public C41633IbO A0M;
    public C42927Iyf A0N;
    public Integer A0O;
    public String A0P;
    public List A0Q;
    public List A0R;
    public boolean A0S;
    public View mContainerView;
    public RecyclerView mRecyclerView;
    public final InterfaceC41501vz A0U = C37816GkW.A00(this, 34);
    public final InterfaceC41501vz A0T = C37816GkW.A00(this, 35);
    public final InterfaceC41501vz A0V = C37816GkW.A00(this, 36);
    public final C37330GcY A0W = new C37330GcY();
    public final List A0X = AbstractC166987dD.A1E();

    @Override // X.JII
    public final /* synthetic */ void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        throw C00O.createAndThrow();
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final /* synthetic */ void DbB(String str, int i) {
    }

    @Override // X.JII
    public final void DbC(Product product, int i, int i2) {
    }

    @Override // X.JII
    public final boolean DbG(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final void DbI(Product product) {
        String A00;
        C41646Ibe c41646Ibe = this.A06;
        if (c41646Ibe == null) {
            String str = null;
            C41636IbR c41636IbR = new C41636IbR(this, getSession(), this, EnumC39622HeW.A0P, this.A0C, this.A0A, null);
            User A002 = A00();
            String str2 = "";
            if (A002 != null && (A00 = AbstractC76433bn.A00(A002)) != null) {
                str2 = A00;
            }
            c41636IbR.A0B = str2;
            String str3 = null;
            if (A00() != null) {
                str = AbstractC37300Gc1.A0U(A00());
            }
            c41636IbR.A0C = str;
            C38321qM c38321qM = this.A01;
            c41636IbR.A01 = c38321qM;
            if (c38321qM != null) {
                str3 = c38321qM.getId();
            }
            c41636IbR.A0A = str3;
            c41636IbR.A00 = this.A00;
            c41646Ibe = c41636IbR.A02();
            this.A06 = c41646Ibe;
        }
        c41646Ibe.A05(product);
    }

    @Override // X.JII
    public final /* synthetic */ void DbJ(String str) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbK(Product product) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    private User A00() {
        String A00;
        boolean isEmpty = this.A0R.isEmpty();
        C38321qM c38321qM = this.A01;
        if (isEmpty) {
            if (c38321qM != null) {
                if (AbstractC41071vF.A07(getSession(), this.A01) != null) {
                    A00 = AbstractC41071vF.A07(getSession(), this.A01);
                } else {
                    A00 = AbstractC111324zv.A00(3841);
                }
                AbstractC37302Gc3.A12(C18950wb.A01.AEp("AD_SHOPPING_BOTTOMSHEET_EMPTY_TAGGED_PRODUCTS", 817903741), "Expected non-empty tagged products list for ad ", A00);
                return null;
            }
            C0K8.A0C(AbstractC111324zv.A00(1797), AbstractC111324zv.A00(2694));
            return null;
        }
        return I95.A00(getSession(), c38321qM, this.A0R);
    }

    private String A01() {
        C38321qM c38321qM = this.A01;
        String str = null;
        if (c38321qM == null || (c38321qM.CdW() && (str = AbstractC41071vF.A0F(getSession(), this.A01)) != null)) {
            return str;
        }
        return AbstractC41071vF.A0F(getSession(), this.A01.A1g(getSession()));
    }

    public static void A02(EnumC39571Hdh enumC39571Hdh, ShoppingMoreProductsFragment shoppingMoreProductsFragment) {
        Long l;
        if (shoppingMoreProductsFragment.A01 != null && !shoppingMoreProductsFragment.A06()) {
            int ordinal = enumC39571Hdh.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    UserSession session = shoppingMoreProductsFragment.getSession();
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (!C18U.A06(c06090Tz, session, 36328345218072026L) && !C18U.A06(c06090Tz, shoppingMoreProductsFragment.getSession(), 36328345218137563L)) {
                        return;
                    }
                    C38321qM c38321qM = shoppingMoreProductsFragment.A01;
                    Integer num = shoppingMoreProductsFragment.A09;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (c38321qM == null) {
                            return;
                        }
                        C38321qM A1e = c38321qM.A1e(intValue);
                        if (A1e != null) {
                            c38321qM = A1e;
                        }
                    } else if (c38321qM == null) {
                        return;
                    }
                    if (c38321qM.A38() == null) {
                        return;
                    }
                    UserSession session2 = shoppingMoreProductsFragment.getSession();
                    String A38 = c38321qM.A38();
                    boolean A1T = AbstractC31175DnJ.A1T(1, session2, A38);
                    Long l2 = null;
                    C25621Ms A0q = AbstractC25228BEl.A0q(session2);
                    A0q.A0B("ads/intent_aware_ads/shoppable_everything/feed/api/views/search_similar_products_dogfood/");
                    A0q.A05();
                    A0q.A9s("seed_media_id", A38);
                    C1ON A0R = AbstractC31172DnG.A0R(null, A0q, H99.class, C41279IOu.class, A1T);
                    C37460Gee.A00(A0R, shoppingMoreProductsFragment, enumC39571Hdh, c38321qM, 10);
                    shoppingMoreProductsFragment.schedule(A0R);
                    shoppingMoreProductsFragment.A03.A04(enumC39571Hdh, true);
                    C41223IMo c41223IMo = shoppingMoreProductsFragment.A05;
                    if (c41223IMo == null || shoppingMoreProductsFragment.A01 == null) {
                        return;
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41223IMo.A00, "instagram_shoppable_everything_fetch_start");
                    if (!A0f.isSampled()) {
                        return;
                    }
                    AbstractC37301Gc2.A15(A0f, c41223IMo.A02);
                    String A382 = c38321qM.A38();
                    if (A382 != null) {
                        l = AbstractC003100w.A0k(10, A382);
                    } else {
                        l = null;
                    }
                    A0f.A9K("seed_media_id", l);
                    String A07 = AbstractC41071vF.A07(c41223IMo.A01, c38321qM);
                    if (A07 != null) {
                        l2 = AbstractC003100w.A0k(10, A07);
                    }
                    A0f.A9K("seed_ad_id", l2);
                    A0f.Cht();
                    return;
                }
                throw AbstractC166987dD.A14(AbstractC167017dG.A0n(enumC39571Hdh, AbstractC111324zv.A00(339), AbstractC166987dD.A1C()));
            }
            UserSession session3 = shoppingMoreProductsFragment.getSession();
            String A383 = shoppingMoreProductsFragment.A01.A38();
            String str = shoppingMoreProductsFragment.A0A;
            String A01 = shoppingMoreProductsFragment.A01();
            AbstractC25230BEn.A15(1, session3, A383);
            C14360o3.A0B(str, 2);
            C25621Ms A0q2 = AbstractC25228BEl.A0q(session3);
            AbstractC31173DnH.A1Q(A0q2, "commerce/media/%s/related_products/", new Object[]{A383});
            A0q2.A06();
            A0q2.A0R(ProductFeedResponse.class, IRD.class);
            A0q2.A9s("prior_module", str);
            A0q2.A9s("is_cam_media", "false");
            A0q2.A0H("ads_tracking_token", A01);
            C1ON A0N = A0q2.A0N();
            C37484Gf2.A00(A0N, shoppingMoreProductsFragment, enumC39571Hdh, 18);
            shoppingMoreProductsFragment.schedule(A0N);
            shoppingMoreProductsFragment.A03.A04(enumC39571Hdh, true);
        }
    }

    public static void A03(ShoppingMoreProductsFragment shoppingMoreProductsFragment, String str) {
        C1XJ.A00.A1C(shoppingMoreProductsFragment.requireActivity(), shoppingMoreProductsFragment.getSession(), shoppingMoreProductsFragment.A0C, shoppingMoreProductsFragment.getModuleName(), "tags", shoppingMoreProductsFragment.A01(), str, null);
    }

    public static void A04(ShoppingMoreProductsFragment shoppingMoreProductsFragment, String str) {
        Iterator it;
        int i;
        List list = shoppingMoreProductsFragment.A0X;
        AbstractC63071Sbt.A01(new C42113IlN(shoppingMoreProductsFragment, str, 0), list.iterator());
        C38371Gu8 c38371Gu8 = shoppingMoreProductsFragment.A03;
        c38371Gu8.A01 = shoppingMoreProductsFragment.A08;
        c38371Gu8.A03(EnumC39571Hdh.A06, list);
        C38321qM c38321qM = shoppingMoreProductsFragment.A01;
        if (c38321qM != null) {
            boolean A5P = c38321qM.A5P();
            C38321qM c38321qM2 = shoppingMoreProductsFragment.A01;
            if (A5P) {
                if (AbstractC25226BEj.A0u(c38321qM2) != null && AbstractC25226BEj.A0u(shoppingMoreProductsFragment.A01).Buh() != null) {
                    it = AbstractC25226BEj.A0u(shoppingMoreProductsFragment.A01).Buh().BhR().iterator();
                    i = 1;
                } else {
                    return;
                }
            } else {
                if (c38321qM2.A3O() == null) {
                    return;
                }
                it = shoppingMoreProductsFragment.A01.A3O().iterator();
                i = 2;
            }
            AbstractC63071Sbt.A01(new C42113IlN(shoppingMoreProductsFragment, str, i), it);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A05() {
        /*
            r5 = this;
            java.lang.String r0 = r5.A0B
            boolean r0 = X.I6P.A00(r0)
            r3 = 1
            if (r0 != 0) goto L7c
            boolean r0 = r5.A06()
            r4 = 0
            if (r0 == 0) goto L11
            return r4
        L11:
            X.1qM r0 = r5.A01
            if (r0 == 0) goto L5c
            X.Hdi r1 = r0.A29()
            X.Hdi r0 = X.EnumC39572Hdi.A04
            if (r1 == r0) goto L7b
            X.1qM r0 = r5.A01
            X.Hdi r1 = r0.A29()
            X.Hdi r0 = X.EnumC39572Hdi.A07
            if (r1 == r0) goto L7b
            X.1qM r1 = r5.A01
            com.instagram.common.session.UserSession r0 = r5.getSession()
            boolean r0 = r1.A6e(r0)
            if (r0 == 0) goto L7c
            com.instagram.common.session.UserSession r2 = r5.getSession()
            X.1qM r1 = r5.A01
            X.C14360o3.A0B(r2, r4)
            X.C14360o3.A0B(r1, r3)
            boolean r0 = r1.A53()
            if (r0 == 0) goto L7b
            boolean r0 = X.AbstractC37301Gc2.A1Z(r2, r1)
            if (r0 == 0) goto L7b
            X.1qM r0 = r1.A1g(r2)
            java.lang.String r1 = r0.A2y()
            java.lang.String r0 = "105622048790232"
            boolean r0 = X.C14360o3.A0K(r1, r0)
        L59:
            if (r0 == 0) goto L7b
            return r3
        L5c:
            java.util.List r0 = r5.A0R
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7b
            com.instagram.common.session.UserSession r0 = r5.getSession()
            java.lang.String r1 = r0.userId
            java.util.List r0 = r5.A0R
            java.lang.Object r0 = r0.get(r4)
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r0 = X.AbstractC37300Gc1.A0T(r0)
            boolean r0 = r1.equals(r0)
            goto L59
        L7b:
            r3 = 0
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.A05():boolean");
    }

    private boolean A06() {
        C38321qM c38321qM;
        if (!I6P.A00(this.A0B) && (c38321qM = this.A01) != null && AbstractC37301Gc2.A1Z(getSession(), c38321qM)) {
            if (C18U.A06(C06090Tz.A05, getSession(), 36328190599249209L)) {
                return true;
            }
        }
        return false;
    }

    public final String A07(Context context) {
        if (this.A02 == EnumC39571Hdh.A06) {
            String str = this.A0P;
            if (str == null) {
                C38321qM c38321qM = this.A01;
                if (c38321qM != null) {
                    return AbstractC55229Oez.A03(context, c38321qM);
                }
            } else {
                return str;
            }
        }
        return AbstractC166997dE.A0q(context.getResources(), 2131973976);
    }

    @Override // X.InterfaceC43444JHi
    public final void A8F(User user) {
        C42927Iyf c42927Iyf = this.A0N;
        if (c42927Iyf != null) {
            c42927Iyf.A8F(user);
        }
    }

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
        List list = product.A0O;
        if (list != null && !list.isEmpty()) {
            C1XJ.A00.A0h(requireActivity(), null, product);
            return;
        }
        String A0T = AbstractC37300Gc1.A0T(product);
        if (A0T == null) {
            return;
        }
        AbstractC37300Gc1.A0G(getSession()).A0C(new C39329HYu(this, product, A0T), product, A0T);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    @Override // X.JII
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Db6(android.view.View r24, X.C38675GzG r25, com.instagram.model.shopping.productfeed.ProductFeedItem r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.Db6(android.view.View, X.GzG, com.instagram.model.shopping.productfeed.ProductFeedItem, int, int):void");
    }

    @Override // X.JII
    public final void Db9(Product product, String str, String str2, int i, int i2) {
        C38321qM c38321qM;
        C41223IMo c41223IMo = this.A05;
        if (c41223IMo != null && (c38321qM = this.A01) != null) {
            c41223IMo.A00(c38321qM, product, Integer.valueOf(i), Integer.valueOf(i2), str, str2);
        }
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        C38321qM c38321qM;
        C64972wv c64972wv = this.A0I;
        Product product = productTile.A07;
        String str = null;
        if (product != null && this.A0R.contains(product)) {
            c38321qM = this.A01;
        } else {
            c38321qM = null;
        }
        C41625IbF A01 = c64972wv.A01(c38321qM, productTile);
        if (c38675GzG != null) {
            str = c38675GzG.A04;
        }
        A01.A08 = str;
        A01.A00();
    }

    @Override // X.JII
    public final void DbH(Product product) {
        A03(this, product.A0H);
    }

    @Override // X.InterfaceC43444JHi
    public final void EDC(View view) {
        C42927Iyf c42927Iyf = this.A0N;
        if (c42927Iyf != null) {
            c42927Iyf.EDC(view);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        boolean z;
        if (this.A0S && (str = this.A0P) != null) {
            AbstractC31175DnJ.A1I(interfaceC56362iU, str);
            C38321qM c38321qM = this.A01;
            if (c38321qM != null && (c38321qM.A29() == EnumC39572Hdi.A04 || this.A01.A29() == EnumC39572Hdi.A07)) {
                z = true;
            } else {
                z = false;
            }
            if (AbstractC37302Gc3.A1a(getSession()) && !z) {
                ViewOnClickListenerC42033Ik2 viewOnClickListenerC42033Ik2 = new ViewOnClickListenerC42033Ik2(this, 53);
                Context requireContext = requireContext();
                Integer num = this.A0O;
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A0G = viewOnClickListenerC42033Ik2;
                A0B.A0F = new U8S(requireContext, num);
                A0B.A05 = 2131973957;
                interfaceC56362iU.AA9(new C3LY(A0B));
            }
        }
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (I6P.A00(this.A0B)) {
            String str = this.A0B;
            if (str == null) {
                return "";
            }
            return str;
        }
        C38321qM c38321qM = this.A01;
        if (c38321qM != null && c38321qM.A5P()) {
            return "instagram_shopping_clips_viewer_product_feed";
        }
        return StringFormatUtil.formatStrLocaleSafe(AbstractC111324zv.A00(3204), this.A0A);
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return this.A0C;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC43444JHi
    public final void D7m(User user) {
        C3DN A01 = C3DN.A00.A01(requireContext());
        if (A01 != null) {
            A01.A0B();
        }
        C42927Iyf c42927Iyf = this.A0N;
        if (c42927Iyf != null) {
            c42927Iyf.D7m(user);
        }
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A0B.A06(this.A0W.A00);
        return A0B;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return E6P();
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f6, code lost:
    
        if (((com.instagram.user.model.Product) r47.A0R.get(0)).A04() == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r48) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-488034455);
        this.mContainerView = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.shopping_more_products_fragment);
        C57112jm c57112jm = this.A00;
        if (c57112jm == null) {
            c57112jm = AbstractC31180DnO.A0N();
            this.A00 = c57112jm;
        }
        c57112jm.A06(this.mContainerView, C71163Hc.A00(this));
        this.mRecyclerView = (RecyclerView) this.mContainerView.findViewById(R.id.more_products_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.A01 = new C37922GmJ(this, 4);
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.A03);
        if (this.A07 != null && !I6P.A00(this.A0B)) {
            this.mRecyclerView.A14(new C44229JgZ(6, gridLayoutManager, this));
        }
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.A14(this.A0F);
        this.A0D = System.currentTimeMillis();
        View view = this.mContainerView;
        C0f9.A09(198947167, A02);
        return view;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(648876521);
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A02(this.A0U, C3HW.class);
        A00.A02(this.A0T, C71H.class);
        A00.A02(this.A0V, C42248InY.class);
        super.onDestroy();
        unregisterLifecycleListener(this.A0F);
        C0f9.A09(-349888486, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-907910798);
        C38321qM c38321qM = this.A01;
        if (c38321qM != null && AbstractC37301Gc2.A1Z(getSession(), c38321qM) && this.A0J == null) {
            C38321qM c38321qM2 = this.A01;
            long currentTimeMillis = System.currentTimeMillis() - this.A0D;
            UserSession session = getSession();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, session), "instagram_shopping_sheet_closed");
            if (c38321qM2.A5N()) {
                c38321qM2 = c38321qM2.A1g(session);
            }
            String CAR = c38321qM2.CAR();
            if (A0f.isSampled()) {
                AbstractC37300Gc1.A0o(A0f, CAR);
                A0f.A9K("time_spent", Long.valueOf(currentTimeMillis));
                A0f.Cht();
            }
        }
        super.onDestroyView();
        ShoppingMoreProductsFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(341167547, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1721854133);
        super.onPause();
        C41145IJk c41145IJk = this.A04;
        if (c41145IJk != null) {
            try {
                C006802i c006802i = c41145IJk.A00;
                C14360o3.A06(c006802i);
                ISD.A00(c006802i, c41145IJk.A04);
            } catch (Exception e) {
                C0w9.A06(AbstractC111324zv.A00(1797), "PerfLogger logCancel() failed", e);
            }
        }
        C38321qM c38321qM = this.A01;
        if (c38321qM != null && AbstractC37301Gc2.A1Z(getSession(), c38321qM) && !I6P.A00(this.A0B)) {
            AbstractC41665Ibx.A02(getSession(), this.A01, this, this.A0R, System.currentTimeMillis() - this.A0E);
        }
        C0f9.A09(-759774084, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1049845941);
        super.onResume();
        this.A0E = System.currentTimeMillis();
        C38371Gu8 c38371Gu8 = this.A03;
        if (c38371Gu8 != null) {
            c38371Gu8.notifyDataSetChanged();
        }
        C0f9.A09(-1666942313, A02);
    }
}
