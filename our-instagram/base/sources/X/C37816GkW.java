package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import go.Seq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GkW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37816GkW implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C37816GkW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C37816GkW A00(Object obj, int i) {
        return new C37816GkW(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductTile] */
    /* JADX WARN: Type inference failed for: r4v40, types: [com.instagram.model.shopping.productfeed.ProductFeedItem, java.lang.Object] */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        List list;
        String str;
        ProductCheckoutProperties productCheckoutProperties;
        int i2;
        C38340Gta c38340Gta;
        C1563970j c1563970j;
        ImageView imageView;
        EnumC39647Hic enumC39647Hic;
        EnumC33463Eqy enumC33463Eqy;
        C25531Mh c25531Mh;
        IMK imk;
        HDP hdp;
        C41199ILn c41199ILn;
        int A032;
        int i3;
        Object obj2;
        C120985dq A033;
        C40971v4 A07;
        C38321qM c38321qM;
        Object obj3;
        TreeUpdaterJNI treeUpdaterJNI;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-872683971);
                C71H c71h = (C71H) obj;
                int A034 = C0f9.A03(-1294887956);
                C217949kS c217949kS = ((C42397Ipy) this.A01).A02;
                if (c217949kS != null) {
                    int i4 = c71h.A00;
                    TextView textView = c217949kS.A00;
                    textView.setText(String.valueOf(i4));
                    Context context = textView.getContext();
                    C14360o3.A07(context);
                    textView.setContentDescription(I7T.A00(context, Integer.valueOf(i4)));
                    textView.setVisibility(0);
                }
                C0f9.A0A(-1432867205, A034);
                i = 872925859;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(431514590);
                int A035 = C0f9.A03(735903456);
                C38018Go6.A00(((C38016Go3) this.A01).A01());
                C0f9.A0A(-614499110, A035);
                i = -139503293;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(490006293);
                C42229InF c42229InF = (C42229InF) obj;
                int A036 = C0f9.A03(-150994485);
                C14360o3.A0B(c42229InF, 0);
                C38016Go3 c38016Go3 = (C38016Go3) this.A01;
                C38018Go6 A01 = c38016Go3.A01();
                C99134ca c99134ca = c42229InF.A00;
                C14360o3.A0B(c99134ca, 0);
                ((C42748Ivm) ((AbstractC65202xI) A01).A00).A04.remove(c99134ca);
                C38018Go6.A00(c38016Go3.A01());
                C0f9.A0A(2040057286, A036);
                i = 1161335138;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(-1939577373);
                C42245InV c42245InV = (C42245InV) obj;
                int A037 = C0f9.A03(-657188508);
                C14360o3.A0B(c42245InV, 0);
                C38016Go3 c38016Go32 = (C38016Go3) this.A01;
                ((C42748Ivm) ((AbstractC65202xI) c38016Go32.A01()).A00).A04.remove(c42245InV.A00);
                C38018Go6.A00(c38016Go32.A01());
                C0f9.A0A(1339216315, A037);
                i = -822933852;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = C0f9.A03(1698486428);
                int A038 = C0f9.A03(1642117740);
                C38018Go6.A00(((C38016Go3) this.A01).A01());
                C0f9.A0A(-250307350, A038);
                i = -67316146;
                C0f9.A0A(i, A03);
                return;
            case 5:
                A03 = C0f9.A03(-1105238927);
                C42661xu c42661xu = (C42661xu) obj;
                int A039 = C0f9.A03(-918539332);
                C14360o3.A0B(c42661xu, 0);
                C38083GpC c38083GpC = ((C38137Gq4) this.A01).A07;
                String moduleName = c38083GpC.A03.getModuleName();
                if (!C14360o3.A0K(moduleName, c42661xu.A02) && C14360o3.A0K(moduleName, c42661xu.A01)) {
                    C38083GpC.A00(c38083GpC);
                }
                C0f9.A0A(-1984087690, A039);
                i = 2114981106;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(452175800);
                C3NF c3nf = (C3NF) obj;
                int A0310 = C0f9.A03(-423292756);
                C14360o3.A0B(c3nf, 0);
                C14360o3.A0K(((C38137Gq4) this.A01).A07.A03.getModuleName(), c3nf.A00);
                C0f9.A0A(841073841, A0310);
                i = 1378608245;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A03 = C0f9.A03(-1661565308);
                int A0311 = C0f9.A03(-606005016);
                ((GenericSurveyFragment) this.A01).A0A = true;
                C0f9.A0A(-1997707786, A0311);
                i = -1331745765;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(1192737729);
                int A0312 = C0f9.A03(-545730496);
                GenericSurveyFragment.A04((GenericSurveyFragment) this.A01);
                C0f9.A0A(-1893149471, A0312);
                i = 62914686;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(2060367182);
                C57452kK c57452kK = (C57452kK) obj;
                int A0313 = C0f9.A03(327185979);
                C14360o3.A0B(c57452kK, 0);
                InterfaceC09390do interfaceC09390do = ((HCG) this.A01).A0D;
                MUG mug = (MUG) ((C38320GtF) interfaceC09390do.getValue()).A0A.getValue();
                if (mug != null && (list = (List) mug.A03) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            C38321qM c38321qM2 = ((C154026wB) next).A03.A02;
                            if (c38321qM2 != null && c38321qM2.equals(c57452kK.A00)) {
                                if (next != null) {
                                    ((C38320GtF) interfaceC09390do.getValue()).A03.A02.A01();
                                }
                            }
                        }
                    }
                }
                C0f9.A0A(-983821816, A0313);
                i = -1013738095;
                C0f9.A0A(i, A03);
                return;
            case 10:
                HDJ hdj = (HDJ) this.A01;
                hdj.A08.Cmo(new C38290GsZ(4, hdj, true), true);
                return;
            case 11:
                HDJ hdj2 = (HDJ) this.A01;
                hdj2.A08.Cmo(new C38290GsZ(4, hdj2, true), true);
                C0fA.A00(hdj2.A04, 666714118);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                int A0314 = C0f9.A03(1083215957);
                int A0315 = C0f9.A03(937878042);
                try {
                    throw new NullPointerException("getResponseType");
                } catch (IOException e) {
                    C0K8.A0F("EndToEndDebug", AbstractC111324zv.A00(665), e);
                    C0f9.A0A(1585385648, A0315);
                    C0f9.A0A(1894106250, A0314);
                    return;
                }
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-1441871624);
                int A0316 = C0f9.A03(314821657);
                C66095TzW c66095TzW = ((C38288GsX) this.A01).A04;
                if (c66095TzW == null) {
                    str = "adapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c66095TzW.update();
                C0f9.A0A(-206048667, A0316);
                i = 1709872005;
                C0f9.A0A(i, A03);
                return;
            case 14:
                A03 = C0f9.A03(1322488626);
                C42256Ing c42256Ing = (C42256Ing) obj;
                int A0317 = C0f9.A03(1085755435);
                C14360o3.A0B(c42256Ing, 0);
                HZ6 hz6 = (HZ6) this.A01;
                Product product = hz6.A04.C02().A09;
                List list2 = c42256Ing.A00;
                if (product != null) {
                    productCheckoutProperties = product.A01.A0C;
                } else {
                    productCheckoutProperties = null;
                }
                if (!c42256Ing.A02 && c42256Ing.A01 && product != null && list2 != null && list2.contains(product.A0H) && product.A0P && product.A01.A0C != null && productCheckoutProperties != null) {
                    Boolean bool = true;
                    if (bool.equals(productCheckoutProperties.A02)) {
                        hz6.A03.A00(product, "checkout_exit_button", "checkout_exit_button", AbstractC58317Pt9.A00(241));
                    }
                }
                AbstractC25651Mw.A00(hz6.A01).A02(this, C42256Ing.class);
                C0f9.A0A(785287477, A0317);
                i = 199390571;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(386512709);
                C71I c71i = (C71I) obj;
                int A0318 = C0f9.A03(1776151045);
                String str2 = c71i.A04;
                MerchantShoppingCartFragment merchantShoppingCartFragment = (MerchantShoppingCartFragment) this.A01;
                if (str2.equals(merchantShoppingCartFragment.A0U)) {
                    C41634IbP c41634IbP = c71i.A01;
                    if (c41634IbP != null) {
                        merchantShoppingCartFragment.A0Q = c71i.A02;
                        merchantShoppingCartFragment.A0T = c71i.A03;
                    }
                    MerchantShoppingCartFragment.A00(c71i.A00, merchantShoppingCartFragment, c41634IbP);
                }
                C0f9.A0A(902864005, A0318);
                i = 610354809;
                C0f9.A0A(i, A03);
                return;
            case 16:
                A03 = C0f9.A03(-390668116);
                int A0319 = C0f9.A03(1366119600);
                MerchantShoppingCartFragment merchantShoppingCartFragment2 = (MerchantShoppingCartFragment) this.A01;
                if (((C1563870i) obj).A00.equals(merchantShoppingCartFragment2.A0U)) {
                    if (merchantShoppingCartFragment2.isResumed()) {
                        if (merchantShoppingCartFragment2.mParentFragment instanceof BottomSheetFragment) {
                            C189478aR c189478aR = ((BottomSheetFragment) merchantShoppingCartFragment2.requireParentFragment()).A02;
                            c189478aR.getClass();
                            c189478aR.A08();
                        } else {
                            merchantShoppingCartFragment2.requireActivity().onBackPressed();
                        }
                    } else {
                        merchantShoppingCartFragment2.A0c = true;
                    }
                }
                C0f9.A0A(-522980823, A0319);
                i = -812008770;
                C0f9.A0A(i, A03);
                return;
            case 17:
                A03 = C0f9.A03(-901235053);
                int A0320 = C0f9.A03(370817417);
                ((MerchantShoppingCartFragment) this.A01).A0K.Dyd(((C42246InW) obj).A00);
                C0f9.A0A(-572034546, A0320);
                i = 1813382654;
                C0f9.A0A(i, A03);
                return;
            case 18:
                A03 = C0f9.A03(1615653265);
                C42248InY c42248InY = (C42248InY) obj;
                int A0321 = C0f9.A03(447992708);
                MerchantShoppingCartFragment merchantShoppingCartFragment3 = (MerchantShoppingCartFragment) this.A01;
                C41730Ie1 c41730Ie1 = merchantShoppingCartFragment3.A0F;
                if (c41730Ie1 == null) {
                    i2 = 1126043559;
                } else {
                    Product product2 = c42248InY.A00;
                    String str3 = product2.A0H;
                    Product A04 = c41730Ie1.A04();
                    A04.getClass();
                    if (str3.equals(A04.A0H)) {
                        i2 = -1850441071;
                    } else {
                        C70Y.A00(merchantShoppingCartFragment3.A02).A07.A08(merchantShoppingCartFragment3.A0F, product2, merchantShoppingCartFragment3.A0U);
                        merchantShoppingCartFragment3.A0F = null;
                        i2 = 441314688;
                    }
                }
                C0f9.A0A(i2, A0321);
                i = -963125879;
                C0f9.A0A(i, A03);
                return;
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(-682290727);
                C42255Inf c42255Inf = (C42255Inf) obj;
                int A0322 = C0f9.A03(-341938152);
                if (c42255Inf.A02) {
                    ShoppingCartFragment shoppingCartFragment = (ShoppingCartFragment) this.A01;
                    if (shoppingCartFragment.mView != null) {
                        shoppingCartFragment.A0F = null;
                        RecyclerView recyclerView = shoppingCartFragment.mRecyclerView;
                        if (recyclerView != null) {
                            recyclerView.A0o(0);
                        }
                    }
                }
                ShoppingCartFragment.A00(c42255Inf.A00, c42255Inf.A01, (ShoppingCartFragment) this.A01);
                C0f9.A0A(539131363, A0322);
                i = -1597393156;
                C0f9.A0A(i, A03);
                return;
            case 20:
                A03 = C0f9.A03(1102236076);
                int A0323 = C0f9.A03(-834994370);
                InterfaceC76653cC interfaceC76653cC = ((C3HW) obj).A00;
                boolean z = interfaceC76653cC instanceof C42727IvN;
                HEZ hez = ((ProductCollectionFragment) this.A01).A05;
                if (z) {
                    FBProductItemDetailsDictImpl fBProductItemDetailsDictImpl = (FBProductItemDetailsDictImpl) ((C42727IvN) interfaceC76653cC).A00;
                    c38340Gta = hez.A0E;
                    c38340Gta.A00 = fBProductItemDetailsDictImpl;
                } else {
                    c38340Gta = hez.A0E;
                    c38340Gta.A01 = (Product) interfaceC76653cC;
                }
                c38340Gta.A06();
                C0f9.A0A(2024100215, A0323);
                i = -581836284;
                C0f9.A0A(i, A03);
                return;
            case 21:
                A03 = C0f9.A03(874396509);
                C42249InZ c42249InZ = (C42249InZ) obj;
                int A0324 = C0f9.A03(-1067947246);
                ProductCollectionFragment productCollectionFragment = (ProductCollectionFragment) this.A01;
                if (productCollectionFragment.A04 == EnumC39622HeW.A0O) {
                    HEZ hez2 = productCollectionFragment.A05;
                    String str4 = c42249InZ.A00.A0H;
                    C14360o3.A0B(str4, 0);
                    hez2.A0I.A0E(str4);
                    hez2.A00();
                }
                C0f9.A0A(-1123875448, A0324);
                i = 1615500037;
                C0f9.A0A(i, A03);
                return;
            case 22:
                A03 = C0f9.A03(-1460224634);
                C42253Ind c42253Ind = (C42253Ind) obj;
                int A0325 = C0f9.A03(-32137042);
                C14360o3.A0B(c42253Ind, 0);
                if (c42253Ind.A01 == C05F.A00) {
                    HCI hci = (HCI) this.A01;
                    RefreshableNestedScrollingParent refreshableNestedScrollingParent = hci.A00;
                    if (refreshableNestedScrollingParent != null && (c1563970j = (C1563970j) hci.A06.getValue()) != null && (imageView = c1563970j.A00) != null) {
                        ((HHK) hci.A0I.getValue()).A01(imageView, refreshableNestedScrollingParent, c42253Ind.A00);
                    }
                    ((C2UU) hci.A03.getValue()).notifyDataSetChanged();
                }
                C0f9.A0A(-894603233, A0325);
                i = 617982408;
                C0f9.A0A(i, A03);
                return;
            case 23:
                A03 = C0f9.A03(1609753879);
                C42247InX c42247InX = (C42247InX) obj;
                int A0326 = C0f9.A03(1770802353);
                C14360o3.A0B(c42247InX, 0);
                HCI hci2 = (HCI) this.A01;
                C38331GtQ c38331GtQ = (C38331GtQ) hci2.A0Q.getValue();
                String str5 = c42247InX.A00.A0H;
                C14360o3.A0B(str5, 0);
                C05A c05a = c38331GtQ.A0B;
                c05a.Egh(AnonymousClass090.A01(str5, (java.util.Set) c05a.getValue()));
                ((C2UU) hci2.A03.getValue()).notifyDataSetChanged();
                C0f9.A0A(477591113, A0326);
                i = -1540128385;
                C0f9.A0A(i, A03);
                return;
            case 24:
                A03 = C0f9.A03(1891948256);
                C42257Inh c42257Inh = (C42257Inh) obj;
                int A0327 = C0f9.A03(36561969);
                C14360o3.A0B(c42257Inh, 0);
                C41741IeF c41741IeF = (C41741IeF) ((HCI) this.A01).A0B.getValue();
                EnumC77213d7 enumC77213d7 = c42257Inh.A00;
                Integer num = c42257Inh.A01;
                String str6 = c42257Inh.A02;
                String str7 = c42257Inh.A03;
                C14360o3.A0B(num, 1);
                if (enumC77213d7 == EnumC77213d7.A04) {
                    enumC39647Hic = EnumC39647Hic.A02;
                } else {
                    enumC39647Hic = EnumC39647Hic.A03;
                }
                if (num == C05F.A01) {
                    enumC33463Eqy = EnumC33463Eqy.FAILURE;
                } else {
                    enumC33463Eqy = EnumC33463Eqy.SUCCESS;
                }
                String str8 = c41741IeF.A02;
                long j = 0;
                if (C14360o3.A0K(str8, "instagram_shopping_mini_shop_storefront")) {
                    C18920wW c18920wW = c41741IeF.A00;
                    c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "commerce_storefront_server"), 131);
                    if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                        c25531Mh.A0M(enumC39647Hic, AbstractC111324zv.A00(1259));
                        c25531Mh.A0M(enumC33463Eqy, AbstractC111324zv.A00(1260));
                        c25531Mh.A0M(EnumC39651Hig.A0I, "analytics_referral_component");
                        c25531Mh.A0M(EnumC39649Hie.A03, "analytics_page");
                        c25531Mh.A0M(EnumC39644HiZ.STOREFRONT, "referral_surface");
                        c25531Mh.A0R("shopping_session_id", c41741IeF.A03);
                        c25531Mh.A0R("navigation_chain", C1QM.A00.A02.A00);
                        c25531Mh.A0M(EnumC39651Hig.A0A, "analytics_component");
                        c25531Mh.A0M(C41741IeF.A00(str7), "analytics_module");
                        Long A0k = AbstractC003100w.A0k(10, str6);
                        if (A0k != null) {
                            j = A0k.longValue();
                        }
                        c25531Mh.A0Q("product_id", Long.valueOf(j));
                        c25531Mh.Cht();
                    }
                    C0f9.A0A(-1153953080, A0327);
                    i = -1721238275;
                } else {
                    if (C14360o3.A0K(str8, "instagram_shopping_home")) {
                        C18920wW c18920wW2 = c41741IeF.A00;
                        c25531Mh = new C25531Mh(c18920wW2.A00(c18920wW2.A00, "commerce_tab_feed_server"), 134);
                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                            c25531Mh.A0M(EnumC39651Hig.A0A, "analytics_component");
                            c25531Mh.A0M(EnumC39649Hie.A03, "analytics_page");
                            c25531Mh.A0R("analytics_feed_type", "shop");
                            c25531Mh.A0M(EnumC39644HiZ.TAB_FEED, "referral_surface");
                            c25531Mh.A0R("shopping_session_id", c41741IeF.A03);
                            c25531Mh.A0M(enumC39647Hic, AbstractC111324zv.A00(1259));
                            c25531Mh.A0M(enumC33463Eqy, AbstractC111324zv.A00(1260));
                            c25531Mh.A0M(C41741IeF.A00(str7), "analytics_module");
                            Long A0k2 = AbstractC003100w.A0k(10, str6);
                            if (A0k2 != null) {
                                j = A0k2.longValue();
                            }
                            c25531Mh.A0Q("product_id", Long.valueOf(j));
                            c25531Mh.A0R("navigation_chain", C1QM.A00.A02.A00);
                            c25531Mh.Cht();
                        }
                    }
                    C0f9.A0A(-1153953080, A0327);
                    i = -1721238275;
                }
                C0f9.A0A(i, A03);
                return;
            case 25:
                A03 = C0f9.A03(-1436269073);
                C3HW c3hw = (C3HW) obj;
                int A0328 = C0f9.A03(1067750280);
                C14360o3.A0B(c3hw, 0);
                if (c3hw.A00 instanceof Product) {
                    HCI hci3 = (HCI) this.A01;
                    if (hci3.A00 != null && (imk = (IMK) hci3.A0S.getValue()) != null && imk.A00 != null) {
                        hci3.A0I.getValue();
                    }
                }
                ((C2UU) ((HCI) this.A01).A03.getValue()).notifyDataSetChanged();
                C0f9.A0A(677235080, A0328);
                i = -1433239081;
                C0f9.A0A(i, A03);
                return;
            case 26:
                A03 = C0f9.A03(1086802673);
                int A0329 = C0f9.A03(1365594039);
                ((C2UU) ((HCI) this.A01).A03.getValue()).notifyDataSetChanged();
                C0f9.A0A(-677548458, A0329);
                i = 1439129294;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A03 = C0f9.A03(-1144772822);
                int A0330 = C0f9.A03(-816691449);
                InterfaceC76653cC interfaceC76653cC2 = ((C3HW) obj).A00;
                if (interfaceC76653cC2 instanceof C42727IvN) {
                    FBProductItemDetailsDict fBProductItemDetailsDict = ((C42727IvN) interfaceC76653cC2).A00;
                    ?? obj4 = new Object();
                    obj4.A02 = new ProductTileProductImpl(fBProductItemDetailsDict);
                    ?? obj5 = new Object();
                    Integer num2 = C05F.A0C;
                    obj5.A06 = num2;
                    obj5.A02 = obj4;
                    obj5.A06 = num2;
                    WishListFeedFragment.A00(obj5, (WishListFeedFragment) this.A01, interfaceC76653cC2.CcN());
                } else {
                    WishListFeedFragment wishListFeedFragment = (WishListFeedFragment) this.A01;
                    C41614Ib4.A00(wishListFeedFragment.A00);
                    Context requireContext = wishListFeedFragment.requireContext();
                    UserSession userSession = wishListFeedFragment.A00;
                    ID1 id1 = wishListFeedFragment.A0I;
                    C08790ch A00 = AbstractC018607g.A00(wishListFeedFragment);
                    Integer num3 = C05F.A01;
                    Integer num4 = C05F.A00;
                    C14360o3.A0B(userSession, 1);
                    C14360o3.A0B(id1, 2);
                    List singletonList = Collections.singletonList(interfaceC76653cC2);
                    C14360o3.A07(singletonList);
                    C1ON A002 = I7I.A00(userSession, num3, num4, singletonList);
                    A002.A00 = new C39030HGg(id1, 22);
                    C1GJ.A00(requireContext, A00, A002);
                }
                C0f9.A0A(1161671692, A0330);
                i = 1970609940;
                C0f9.A0A(i, A03);
                return;
            case 28:
                A03 = C0f9.A03(1068362203);
                int A0331 = C0f9.A03(1599032684);
                WishListFeedFragment wishListFeedFragment2 = (WishListFeedFragment) this.A01;
                wishListFeedFragment2.A04.A01(true, true);
                wishListFeedFragment2.A02.A00();
                C0f9.A0A(262499158, A0331);
                i = -2025292509;
                C0f9.A0A(i, A03);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A03 = C0f9.A03(873519851);
                int A0332 = C0f9.A03(562755732);
                ((J1L) ((HCU) this.A01).A0E.getValue()).A01(true, true);
                C0f9.A0A(1999997243, A0332);
                i = 710561979;
                C0f9.A0A(i, A03);
                return;
            case 30:
                A03 = C0f9.A03(711272466);
                int A0333 = C0f9.A03(1797008593);
                ((J1L) ((HCV) this.A01).A0E.getValue()).A01(true, true);
                C0f9.A0A(1358560166, A0333);
                i = -1660821231;
                C0f9.A0A(i, A03);
                return;
            case 31:
                A03 = C0f9.A03(-1322189245);
                int A0334 = C0f9.A03(-1015330095);
                ((C2UU) ((HCW) this.A01).A07.getValue()).notifyDataSetChanged();
                C0f9.A0A(-517412328, A0334);
                i = -1238998047;
                C0f9.A0A(i, A03);
                return;
            case 32:
                A03 = C0f9.A03(-375818717);
                int A0335 = C0f9.A03(-256606210);
                HCS.A00((HCS) this.A01);
                C0f9.A0A(-1829870125, A0335);
                i = 1328711413;
                C0f9.A0A(i, A03);
                return;
            case 33:
                A03 = C0f9.A03(1023415943);
                int A0336 = C0f9.A03(-1407825805);
                HCT.A00((HCT) this.A01);
                C0f9.A0A(74060071, A0336);
                i = -235010526;
                C0f9.A0A(i, A03);
                return;
            case 34:
                A03 = C0f9.A03(668501578);
                int A0337 = C0f9.A03(-550005156);
                InterfaceC76653cC interfaceC76653cC3 = ((C3HW) obj).A00;
                if (interfaceC76653cC3 instanceof Product) {
                    C38371Gu8 c38371Gu8 = ((ShoppingMoreProductsFragment) this.A01).A03;
                    List list3 = c38371Gu8.A0E;
                    int size = list3.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        C38577Gxg c38577Gxg = (C38577Gxg) list3.get(i5);
                        List list4 = c38577Gxg.A06;
                        int i6 = c38577Gxg.A02;
                        int size2 = list4.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            if (interfaceC76653cC3.equals(((ProductFeedItem) list4.get(i7)).A02())) {
                                List list5 = c38371Gu8.A02;
                                if (list5 == null) {
                                    str = "moduleTypeBoundaries";
                                    C14360o3.A0F(str);
                                    throw C00O.createAndThrow();
                                }
                                c38371Gu8.notifyItemChanged(((Number) list5.get(i5)).intValue() + i6 + i7);
                            }
                        }
                    }
                }
                C0f9.A0A(1824694728, A0337);
                i = 1236610932;
                C0f9.A0A(i, A03);
                return;
            case 35:
                A03 = C0f9.A03(-906027776);
                C71H c71h2 = (C71H) obj;
                int A0338 = C0f9.A03(592746501);
                ShoppingMoreProductsFragment shoppingMoreProductsFragment = (ShoppingMoreProductsFragment) this.A01;
                JHS jhs = shoppingMoreProductsFragment.A07;
                if (jhs != null) {
                    jhs.FC9(shoppingMoreProductsFragment, shoppingMoreProductsFragment.A0C, c71h2.A00);
                }
                C0f9.A0A(268613405, A0338);
                i = -866113011;
                C0f9.A0A(i, A03);
                return;
            case 36:
                A03 = C0f9.A03(343501908);
                int A0339 = C0f9.A03(53536654);
                ShoppingMoreProductsFragment shoppingMoreProductsFragment2 = (ShoppingMoreProductsFragment) this.A01;
                Product product3 = ((C42248InY) obj).A00;
                String A0T = AbstractC37300Gc1.A0T(product3);
                if (A0T != null) {
                    AbstractC37300Gc1.A0G(shoppingMoreProductsFragment2.getSession()).A0C(new C39329HYu(shoppingMoreProductsFragment2, product3, A0T), product3, A0T);
                }
                C0f9.A0A(-633471599, A0339);
                i = 1895758586;
                C0f9.A0A(i, A03);
                return;
            case 37:
                A03 = C0f9.A03(-475869685);
                int A0340 = C0f9.A03(1374445297);
                AdsProductPageFragment adsProductPageFragment = (AdsProductPageFragment) this.A01;
                UserSession userSession2 = adsProductPageFragment.A01;
                long j2 = C42274Iny.A04;
                I93.A00(userSession2).A00();
                adsProductPageFragment.A03(true);
                C0f9.A0A(-1568165018, A0340);
                i = 1899680860;
                C0f9.A0A(i, A03);
                return;
            case 38:
                A03 = C0f9.A03(354716130);
                int A0341 = C0f9.A03(-21232095);
                AdsProductPageFragment adsProductPageFragment2 = (AdsProductPageFragment) this.A01;
                if (adsProductPageFragment2.isAdded()) {
                    adsProductPageFragment2.getParentFragmentManager().A0b();
                } else {
                    adsProductPageFragment2.A0Y = true;
                }
                C0f9.A0A(98553207, A0341);
                i = 1092104054;
                C0f9.A0A(i, A03);
                return;
            case 39:
                A03 = C0f9.A03(2013583304);
                C3HW c3hw2 = (C3HW) obj;
                int A0342 = C0f9.A03(-982277730);
                C14360o3.A0B(c3hw2, 0);
                InterfaceC76653cC interfaceC76653cC4 = c3hw2.A00;
                if ((interfaceC76653cC4 instanceof Product) && (c41199ILn = (hdp = (HDP) this.A01).A00) != null) {
                    c41199ILn.A01.A08.setSelected(AbstractC1563570f.A00(hdp.getSession()).A03(interfaceC76653cC4));
                }
                C0f9.A0A(-1177737495, A0342);
                i = -1146177267;
                C0f9.A0A(i, A03);
                return;
            case 40:
                A03 = C0f9.A03(-168728649);
                int A0343 = C0f9.A03(768537406);
                InterfaceC09390do interfaceC09390do2 = ((HCE) this.A01).A0H;
                ((C38323GtI) interfaceC09390do2.getValue()).A05.A01();
                ((C38323GtI) interfaceC09390do2.getValue()).A01("");
                C0f9.A0A(536268713, A0343);
                i = -1941057292;
                C0f9.A0A(i, A03);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A03 = C0f9.A03(-1230002991);
                int A0344 = C0f9.A03(-2070379172);
                InterfaceC09390do interfaceC09390do3 = ((HCE) this.A01).A0H;
                ((C38323GtI) interfaceC09390do3.getValue()).A05.A01();
                ((C38323GtI) interfaceC09390do3.getValue()).A01("");
                C0f9.A0A(-543734376, A0344);
                i = -1198423180;
                C0f9.A0A(i, A03);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A03 = C0f9.A03(1195067882);
                int A0345 = C0f9.A03(1398776880);
                InterfaceC09390do interfaceC09390do4 = ((HCE) this.A01).A0H;
                ((C38323GtI) interfaceC09390do4.getValue()).A05.A01();
                ((C38323GtI) interfaceC09390do4.getValue()).A01("");
                C0f9.A0A(-453503187, A0345);
                i = -23525884;
                C0f9.A0A(i, A03);
                return;
            case 43:
                A03 = C0f9.A03(-127737006);
                C71H c71h3 = (C71H) obj;
                int A0346 = C0f9.A03(-1107405274);
                C14360o3.A0B(c71h3, 0);
                IK7 ik7 = ((C38931HCe) this.A01).A03;
                if (ik7 != null) {
                    int i8 = c71h3.A00;
                    C1XK c1xk = ik7.A05;
                    FragmentActivity fragmentActivity = ik7.A00;
                    UserSession userSession3 = ik7.A01;
                    InterfaceC60442pS interfaceC60442pS = ik7.A03;
                    ik7.A04.A0K(I7U.A00(fragmentActivity, new LPQ(interfaceC60442pS, userSession3, fragmentActivity, c1xk, ik7.A02.getId(), ik7.A06, 2), Integer.valueOf(i8)), true);
                }
                C0f9.A0A(1379118511, A0346);
                i = -113244262;
                C0f9.A0A(i, A03);
                return;
            case 44:
                A03 = C0f9.A03(-1372405052);
                C3HW c3hw3 = (C3HW) obj;
                int A0347 = C0f9.A03(960511101);
                C14360o3.A0B(c3hw3, 0);
                InterfaceC76653cC interfaceC76653cC5 = c3hw3.A00;
                if (interfaceC76653cC5 instanceof Product) {
                    C41631IbM c41631IbM = (C41631IbM) ((C38947HCw) this.A01).A0E.getValue();
                    C14360o3.A0C(interfaceC76653cC5, AbstractC111324zv.A00(1147));
                    Iterator it2 = c41631IbM.A02.iterator();
                    int i9 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) it2.next();
                            if (interfaceC66482zP instanceof C42335Iox) {
                                C153126ug c153126ug = ((C42335Iox) interfaceC66482zP).A05;
                                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(c153126ug, 10));
                                Iterator it3 = c153126ug.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(((ProductFeedItem) it3.next()).A02());
                                }
                                if (arrayList.contains(interfaceC76653cC5)) {
                                }
                            }
                            i9++;
                        } else {
                            i9 = -1;
                        }
                    }
                    c41631IbM.A00.notifyItemChanged(i9);
                }
                C0f9.A0A(109974208, A0347);
                i = -956942452;
                C0f9.A0A(i, A03);
                return;
            case 45:
                A032 = C0f9.A03(948489457);
                C42242InS c42242InS = (C42242InS) obj;
                int A0348 = C0f9.A03(1058274260);
                C14360o3.A0B(c42242InS, 0);
                UpcomingEvent upcomingEvent = c42242InS.A00;
                String id = upcomingEvent.getId();
                C38947HCw c38947HCw = (C38947HCw) this.A01;
                C41052IFv c41052IFv = c38947HCw.A03;
                str = "viewModel";
                if (c41052IFv != null) {
                    if (C14360o3.A0K(id, c41052IFv.A01.A00.getId())) {
                        boolean reminderEnabled = upcomingEvent.getReminderEnabled();
                        C41052IFv c41052IFv2 = c38947HCw.A03;
                        if (c41052IFv2 != null) {
                            if (reminderEnabled != c41052IFv2.A01.A00.getReminderEnabled()) {
                                C41052IFv c41052IFv3 = c38947HCw.A03;
                                if (c41052IFv3 != null) {
                                    c41052IFv3.A01.A00 = upcomingEvent;
                                    C41631IbM c41631IbM2 = (C41631IbM) c38947HCw.A0E.getValue();
                                    C41052IFv c41052IFv4 = c38947HCw.A03;
                                    if (c41052IFv4 != null) {
                                        c41631IbM2.A02(c41052IFv4.A01.A00);
                                    }
                                }
                            }
                        }
                    }
                    C0f9.A0A(-2019444097, A0348);
                    i3 = -868204512;
                    C0f9.A0A(i3, A032);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A032 = C0f9.A03(1701737912);
                int A0349 = C0f9.A03(1993592270);
                ((C38929HCc) this.A01).A0Z = true;
                C0f9.A0A(1639592364, A0349);
                i3 = -1239534529;
                C0f9.A0A(i3, A032);
                return;
            case 47:
                A03 = C0f9.A03(1029059876);
                C3IJ c3ij = (C3IJ) obj;
                int A0350 = C0f9.A03(2006163779);
                C14360o3.A0B(c3ij, 0);
                C37675GiC c37675GiC = (C37675GiC) this.A01;
                C37560GgG c37560GgG = c37675GiC.A0d;
                if (!c37560GgG.A0e(c3ij.A00)) {
                    UserSession userSession4 = c37675GiC.A0C;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession4, 36320618577273610L) || C18U.A06(c06090Tz, userSession4, 36323096768687063L)) {
                        c37560GgG.A0W("resume", false);
                    }
                }
                C0f9.A0A(-525966218, A0350);
                i = -1653797291;
                C0f9.A0A(i, A03);
                return;
            case 48:
                A03 = C0f9.A03(-829747331);
                C3MC c3mc = (C3MC) obj;
                int A0351 = C0f9.A03(-1527870451);
                C14360o3.A0B(c3mc, 0);
                C37525Gfh c37525Gfh = (C37525Gfh) this.A01;
                int i10 = 0;
                for (C120985dq c120985dq : c37525Gfh.A03) {
                    int i11 = i10 + 1;
                    User user = c120985dq.A0K;
                    String str9 = null;
                    if (user != null) {
                        str9 = user.getId();
                    }
                    if (AbstractC002300n.A0g(str9, c3mc.A01, false)) {
                        c37525Gfh.A0Q(c120985dq, i10);
                    }
                    i10 = i11;
                }
                C0f9.A0A(665457924, A0351);
                i = 1308779273;
                C0f9.A0A(i, A03);
                return;
            case 49:
                A03 = C0f9.A03(1407099893);
                C57452kK c57452kK2 = (C57452kK) obj;
                int A0352 = C0f9.A03(-663923250);
                C14360o3.A0B(c57452kK2, 0);
                C38321qM c38321qM3 = c57452kK2.A00;
                String id2 = c38321qM3.getId();
                C37525Gfh c37525Gfh2 = (C37525Gfh) this.A01;
                if (AbstractC001800i.A0u(c37525Gfh2.A04, id2)) {
                    Iterator it4 = c37525Gfh2.A03.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            if (C14360o3.A0K(((C120985dq) obj2).A0C(), id2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    C120985dq c120985dq2 = (C120985dq) obj2;
                    if (c120985dq2 != null) {
                        EnumC129395t1 enumC129395t1 = c120985dq2.A01;
                        if (enumC129395t1 != EnumC129395t1.A02 && enumC129395t1 != EnumC129395t1.A03) {
                            if (enumC129395t1 == EnumC129395t1.A0A) {
                                A033 = C128085qc.A01(c120985dq2.A03().A01, c120985dq2.A06());
                            } else if (enumC129395t1 == EnumC129395t1.A0G && (A07 = c120985dq2.A07()) != null) {
                                A033 = new C120985dq(new C128075qb(c38321qM3, A07));
                            } else {
                                A033 = C128085qc.A02(c38321qM3);
                            }
                        } else {
                            A033 = C128085qc.A03(c120985dq2.A06());
                        }
                        c37525Gfh2.A0S(c120985dq2, A033);
                    }
                }
                C0f9.A0A(1229534632, A0352);
                i = 634005528;
                C0f9.A0A(i, A03);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A03 = C0f9.A03(-1577670017);
                C57452kK c57452kK3 = (C57452kK) obj;
                int A0353 = C0f9.A03(1415936030);
                C14360o3.A0B(c57452kK3, 0);
                C38321qM c38321qM4 = c57452kK3.A00;
                C37897Gls c37897Gls = (C37897Gls) this.A01;
                C120985dq A003 = C37897Gls.A00(c37897Gls);
                if (A003 != null) {
                    c38321qM = A003.A02;
                } else {
                    c38321qM = null;
                }
                if (C14360o3.A0K(c38321qM4, c38321qM)) {
                    C37897Gls.A02(c37897Gls);
                }
                C0f9.A0A(-2079944651, A0353);
                i = 141046866;
                C0f9.A0A(i, A03);
                return;
            case 51:
                A03 = C0f9.A03(-2088055827);
                C211849aB c211849aB = (C211849aB) obj;
                int A0354 = C0f9.A03(764823010);
                C14360o3.A0B(c211849aB, 0);
                Integer num5 = c211849aB.A00;
                if (num5 != null) {
                    int intValue = num5.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue == 2) {
                                C37608Gh3 c37608Gh3 = (C37608Gh3) this.A01;
                                C37608Gh3.A07(c37608Gh3, new J7C(c37608Gh3, 7), false, false);
                            }
                        } else {
                            C37608Gh3 c37608Gh32 = (C37608Gh3) this.A01;
                            C37608Gh3.A07(c37608Gh32, new J7C(c37608Gh32, 6), true, false);
                        }
                    } else {
                        C37608Gh3 c37608Gh33 = (C37608Gh3) this.A01;
                        C37608Gh3.A07(c37608Gh33, new J7C(c37608Gh33, 5), true, true);
                    }
                }
                C0f9.A0A(1082428512, A0354);
                i = -1594559274;
                C0f9.A0A(i, A03);
                return;
            case 52:
                A032 = C0f9.A03(792018625);
                int A0355 = C0f9.A03(-1069439954);
                C38285GsU c38285GsU = (C38285GsU) this.A01;
                c38285GsU.A08 = true;
                c38285GsU.A0E.FAg();
                C0f9.A0A(-1081223307, A0355);
                i3 = 216426629;
                C0f9.A0A(i3, A032);
                return;
            case 53:
                A032 = C0f9.A03(-257662578);
                C70143Cy c70143Cy = (C70143Cy) obj;
                int A0356 = C0f9.A03(-1873963153);
                C14360o3.A0B(c70143Cy, 0);
                ((C38285GsU) this.A01).A0E.CtR(c70143Cy.A00);
                C0f9.A0A(1668336619, A0356);
                i3 = -1730958032;
                C0f9.A0A(i3, A032);
                return;
            case 54:
                A03 = C0f9.A03(1473492690);
                int A0357 = C0f9.A03(1211022544);
                C37987GnX c37987GnX = (C37987GnX) this.A01;
                C41628IbJ c41628IbJ = c37987GnX.A01;
                if (c41628IbJ != null) {
                    QuestionResponseModelIntf questionResponseModelIntf = c41628IbJ.A00;
                    C14360o3.A0B(questionResponseModelIntf, 1);
                    questionResponseModelIntf.BCd();
                    String id3 = questionResponseModelIntf.getId();
                    QuestionMediaResponseModelIntf BRR = questionResponseModelIntf.BRR();
                    MusicQuestionResponseModelIntf BVk = questionResponseModelIntf.BVk();
                    String Bog = questionResponseModelIntf.Bog();
                    QuestionResponseType Bol = questionResponseModelIntf.Bol();
                    Boolean Bs7 = questionResponseModelIntf.Bs7();
                    Boolean Bv1 = questionResponseModelIntf.Bv1();
                    int CBC = questionResponseModelIntf.CBC();
                    User CDj = questionResponseModelIntf.CDj();
                    QuestionMediaResponseModel questionMediaResponseModel = null;
                    TreeUpdaterJNI treeUpdaterJNI2 = null;
                    new C1DY((C1DV) new C37761pD(null), 6, false);
                    if (questionResponseModelIntf instanceof ImmutablePandoQuestionResponseModel) {
                        C09530e4 c09530e4 = new C09530e4("has_shared_response", true);
                        C09530e4 c09530e42 = new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_ID, id3);
                        if (BRR != null) {
                            treeUpdaterJNI = BRR.F7o();
                        } else {
                            treeUpdaterJNI = null;
                        }
                        C09530e4 c09530e43 = new C09530e4("media_response", treeUpdaterJNI);
                        if (BVk != null) {
                            treeUpdaterJNI2 = BVk.F7o();
                        }
                        C09530e4 c09530e44 = new C09530e4("music_response", treeUpdaterJNI2);
                        C09530e4 c09530e45 = new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, Bog);
                        C14360o3.A0B(Bol, 0);
                        TreeJNI treeJNI = (TreeJNI) questionResponseModelIntf;
                        Object applyToTree = new TreeUpdaterJNI(AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, new C09530e4("response_type", Bol.A00), new C09530e4("seen", Bs7), new C09530e4("should_enable_reply_creation", Bv1), new C09530e4("ts", Integer.valueOf(CBC)), new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CDj.A07())), treeJNI).applyToTree(treeJNI);
                        C14360o3.A07(applyToTree);
                        obj3 = applyToTree;
                    } else {
                        MusicQuestionResponseModel musicQuestionResponseModel = null;
                        C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
                        if (BRR != null) {
                            questionMediaResponseModel = BRR.F74();
                        }
                        if (BVk != null) {
                            musicQuestionResponseModel = BVk.F6z(c1dy);
                        }
                        obj3 = new QuestionResponseModel(musicQuestionResponseModel, Bol, questionMediaResponseModel, CDj, Bs7, Bv1, id3, Bog, CBC, true);
                    }
                    c41628IbJ.A00 = (QuestionResponseModelIntf) obj3;
                    c37987GnX.A0B.Dgn();
                }
                C0f9.A0A(2023560272, A0357);
                i = -644989979;
                C0f9.A0A(i, A03);
                return;
            default:
                return;
        }
    }
}
