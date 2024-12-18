package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.paging.PagingDataAdapter;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import go.Seq;

/* renamed from: X.Ik2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42033Ik2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC42033Ik2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC42033Ik2(obj, i), view);
    }

    public static void A01(C1571273r c1571273r, Object obj, int i) {
        c1571273r.A05 = new ViewOnClickListenerC42033Ik2(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, X.1vN] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int A052;
        int i2;
        String str;
        C38321qM A0h;
        int A053;
        int i3;
        String str2;
        switch (this.A00) {
            case 0:
                ((C38930HCd) this.A01).A03.A0B(0.0f);
                return;
            case 1:
                A053 = C0f9.A05(-2013945734);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = 1205251273;
                C0f9.A0C(i3, A053);
                return;
            case 2:
                A053 = C0f9.A05(-920569843);
                ((InterfaceC144586fe) this.A01).Cvj();
                i3 = -2119342658;
                C0f9.A0C(i3, A053);
                return;
            case 3:
                A053 = C0f9.A05(831302541);
                ((InterfaceC144586fe) this.A01).Cvj();
                i3 = -1668385919;
                C0f9.A0C(i3, A053);
                return;
            case 4:
                A053 = C0f9.A05(-687352252);
                HYC hyc = (HYC) this.A01;
                hyc.A08.Ddl(hyc.A06, (int) (hyc.A07.A0F * 0.5f), (int) (hyc.A05.getTranslationY() + (hyc.A04.getIntrinsicHeight() * 0.5f)));
                i3 = 1945171837;
                C0f9.A0C(i3, A053);
                return;
            case 5:
                A053 = C0f9.A05(-140244391);
                HDK.A02((HDK) this.A01, true);
                i3 = 635000418;
                C0f9.A0C(i3, A053);
                return;
            case 6:
                A053 = C0f9.A05(-1764353781);
                C1ZP A00 = AbstractC40901I9z.A00();
                HCH hch = (HCH) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(hch.A03);
                FragmentActivity requireActivity = hch.requireActivity();
                EnumC39549HdL enumC39549HdL = EnumC39549HdL.A06;
                Gt4 gt4 = hch.A00;
                if (gt4 == null) {
                    str2 = "viewModel";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                A00.A01(requireActivity, null, A0r, enumC39549HdL, gt4.A00);
                i3 = 270162537;
                C0f9.A0C(i3, A053);
                return;
            case 7:
                A053 = C0f9.A05(-956712853);
                ((PagingDataAdapter) this.A01).A05();
                i3 = 302687723;
                C0f9.A0C(i3, A053);
                return;
            case 8:
                A053 = C0f9.A05(1676436078);
                C41198ILm c41198ILm = ((C38288GsX) this.A01).A0D;
                if (c41198ILm == null) {
                    str2 = "optionsActionSheet";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                c41198ILm.A00();
                i3 = -1186154143;
                C0f9.A0C(i3, A053);
                return;
            case 9:
                A053 = C0f9.A05(-295386805);
                ((C38288GsX) this.A01).A0C();
                i3 = 2001741023;
                C0f9.A0C(i3, A053);
                return;
            case 10:
                A05 = C0f9.A05(-518391936);
                C38288GsX c38288GsX = (C38288GsX) this.A01;
                FragmentActivity requireActivity2 = c38288GsX.requireActivity();
                UserSession userSession = c38288GsX.A03;
                if (userSession == null) {
                    str2 = "userSession";
                } else {
                    C140966Yy A0r2 = AbstractC25225BEi.A0r(requireActivity2, userSession);
                    FB6.A00();
                    SavedCollection savedCollection = c38288GsX.A0C;
                    if (savedCollection == null) {
                        str2 = "collection";
                    } else {
                        String str3 = c38288GsX.A0F;
                        if (str3 == null) {
                            str2 = "_sessionId";
                        } else {
                            HDK hdk = new HDK();
                            Bundle A0b = AbstractC166987dD.A0b();
                            A0b.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
                            A0b.putString(AbstractC111324zv.A00(335), str3);
                            hdk.setArguments(A0b);
                            A0r2.A0D(hdk);
                            A0r2.A04();
                            i = 1364945023;
                            C0f9.A0C(i, A05);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 11:
                A053 = C0f9.A05(-758603219);
                ((C38288GsX) this.A01).A0C();
                i3 = 1499043256;
                C0f9.A0C(i3, A053);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A053 = C0f9.A05(-1877180669);
                ((InterfaceC43452JHq) this.A01).Dwk();
                i3 = 1892597185;
                C0f9.A0C(i3, A053);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A053 = C0f9.A05(661565779);
                ((InterfaceC43452JHq) this.A01).CvM();
                i3 = 1742408874;
                C0f9.A0C(i3, A053);
                return;
            case 14:
                A053 = C0f9.A05(1760464716);
                ((InterfaceC43452JHq) this.A01).Det();
                i3 = 146841838;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGTERM /* 15 */:
                A053 = C0f9.A05(-1233677908);
                ((InterfaceC43452JHq) this.A01).DTv();
                i3 = -909046057;
                C0f9.A0C(i3, A053);
                return;
            case 16:
                A053 = C0f9.A05(1496405833);
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) ((C33143Ejm) this.A01).A04.getValue();
                C43172J6r.A03(abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 4);
                i3 = -449125515;
                C0f9.A0C(i3, A053);
                return;
            case 17:
                A053 = C0f9.A05(-1554196972);
                ShoppingCartFragment shoppingCartFragment = (ShoppingCartFragment) this.A01;
                shoppingCartFragment.A09 = EnumC39539HdB.A04;
                ShoppingCartFragment.A01(shoppingCartFragment);
                C70Y.A00(shoppingCartFragment.A02).A07(null);
                i3 = -452033603;
                C0f9.A0C(i3, A053);
                return;
            case 18:
                A053 = C0f9.A05(101414701);
                MerchantShoppingCartFragment merchantShoppingCartFragment = ((C42824Ix0) this.A01).A00;
                EnumC39539HdB enumC39539HdB = EnumC39539HdB.A04;
                merchantShoppingCartFragment.A0A = enumC39539HdB;
                MerchantShoppingCartFragment.A00(enumC39539HdB, merchantShoppingCartFragment, merchantShoppingCartFragment.A0E);
                C70Y.A00(merchantShoppingCartFragment.A02).A04(merchantShoppingCartFragment.A0U);
                i3 = 775157317;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGSTOP /* 19 */:
                A052 = C0f9.A05(-1316859455);
                MerchantShoppingCartFragment merchantShoppingCartFragment2 = ((C42824Ix0) this.A01).A00;
                CheckoutLaunchParams checkoutLaunchParams = merchantShoppingCartFragment2.A04;
                if (checkoutLaunchParams == null) {
                    C0w9.A03("instagram_shopping_merchant_bag", "Attempting to checkout with a cart with no available items to checkout.");
                } else {
                    merchantShoppingCartFragment2.A0B.Cqg(checkoutLaunchParams);
                    C41731Ie2 c41731Ie2 = merchantShoppingCartFragment2.A09;
                    String str4 = merchantShoppingCartFragment2.A0S;
                    String str5 = merchantShoppingCartFragment2.A0Y;
                    String str6 = merchantShoppingCartFragment2.A0U;
                    String str7 = merchantShoppingCartFragment2.A0N;
                    String str8 = merchantShoppingCartFragment2.A0Q;
                    str8.getClass();
                    String str9 = merchantShoppingCartFragment2.A0T;
                    str9.getClass();
                    Integer A06 = C70Y.A00(merchantShoppingCartFragment2.A02).A06();
                    A06.getClass();
                    int intValue = A06.intValue();
                    C41634IbP c41634IbP = merchantShoppingCartFragment2.A0E;
                    c41634IbP.getClass();
                    c41731Ie2.A04(c41634IbP, str4, str5, str6, str7, str8, str9, intValue);
                }
                i2 = 1443502526;
                C0f9.A0C(i2, A052);
                return;
            case 20:
                A053 = C0f9.A05(-914833554);
                ((C42824Ix0) this.A01).A04();
                i3 = -813259800;
                C0f9.A0C(i3, A053);
                return;
            case 21:
                A053 = C0f9.A05(552643033);
                ((C42334Iow) this.A01).A02.A00.invoke();
                i3 = -1336835631;
                C0f9.A0C(i3, A053);
                return;
            case 22:
                A053 = C0f9.A05(177033408);
                ((H7A) this.A01).A02.invoke();
                i3 = 1214702015;
                C0f9.A0C(i3, A053);
                return;
            case 23:
                A053 = C0f9.A05(1890010535);
                i3 = -422642426;
                C0f9.A0C(i3, A053);
                return;
            case 24:
                A053 = C0f9.A05(-874873334);
                i3 = -1637246975;
                C0f9.A0C(i3, A053);
                return;
            case 25:
                A053 = C0f9.A05(1664982402);
                ((C42329Ior) this.A01).A01.A00.invoke();
                i3 = 14827907;
                C0f9.A0C(i3, A053);
                return;
            case 26:
                A053 = C0f9.A05(2135982796);
                ((C42329Ior) this.A01).A01.A03.invoke();
                i3 = -530398616;
                C0f9.A0C(i3, A053);
                return;
            case 27:
                A053 = C0f9.A05(-572444430);
                ((C38643Gyk) this.A01).A05.invoke();
                i3 = -1097258990;
                C0f9.A0C(i3, A053);
                return;
            case 28:
                A053 = C0f9.A05(-2059660565);
                ((C42317Iof) this.A01).A01.A00.invoke();
                i3 = 1563151959;
                C0f9.A0C(i3, A053);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A053 = C0f9.A05(1794276431);
                ((C42317Iof) this.A01).A01.A01.invoke();
                i3 = -233426590;
                C0f9.A0C(i3, A053);
                return;
            case 30:
                A053 = C0f9.A05(917046243);
                ((H7E) this.A01).A00.A00.invoke();
                i3 = -1366781767;
                C0f9.A0C(i3, A053);
                return;
            case 31:
                A053 = C0f9.A05(-1743872710);
                ((C42332Iou) this.A01).A01.A00.invoke();
                i3 = 371244732;
                C0f9.A0C(i3, A053);
                return;
            case 32:
                A053 = C0f9.A05(1228131698);
                ((InterfaceC43441JHf) this.A01).Cve();
                i3 = 450590012;
                C0f9.A0C(i3, A053);
                return;
            case 33:
                A053 = C0f9.A05(895008751);
                ((InterfaceC43441JHf) this.A01).D13();
                i3 = 1769291620;
                C0f9.A0C(i3, A053);
                return;
            case 34:
                A053 = C0f9.A05(-615471871);
                ((InterfaceC43441JHf) this.A01).E0f();
                i3 = -14386986;
                C0f9.A0C(i3, A053);
                return;
            case 35:
                A053 = C0f9.A05(1191818708);
                ((JGQ) this.A01).Dyl();
                i3 = -966568122;
                C0f9.A0C(i3, A053);
                return;
            case 36:
                A053 = C0f9.A05(-492850628);
                ((C42319Ioh) this.A01).A01.A00.invoke();
                i3 = 873824953;
                C0f9.A0C(i3, A053);
                return;
            case 37:
                A053 = C0f9.A05(1336979041);
                ((C42320Ioi) this.A01).A01.A00.invoke();
                i3 = -276340692;
                C0f9.A0C(i3, A053);
                return;
            case 38:
                A053 = C0f9.A05(110115250);
                ((C42321Ioj) this.A01).A01.A00.invoke();
                i3 = 642291091;
                C0f9.A0C(i3, A053);
                return;
            case 39:
                A053 = C0f9.A05(-2001722759);
                ((C42321Ioj) this.A01).A01.A01.invoke();
                i3 = -1487823928;
                C0f9.A0C(i3, A053);
                return;
            case 40:
                A053 = C0f9.A05(539663661);
                ((C41072IGp) this.A01).A01.invoke();
                i3 = -1846738555;
                C0f9.A0C(i3, A053);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A053 = C0f9.A05(-1113882647);
                ((HIM) this.A01).A00.DVd();
                i3 = -413269987;
                C0f9.A0C(i3, A053);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = C0f9.A05(259202209);
                IMK imk = (IMK) this.A01;
                C41741IeF c41741IeF = imk.A03;
                if (c41741IeF != null) {
                    String str10 = c41741IeF.A02;
                    if (C14360o3.A0K(str10, "instagram_shopping_mini_shop_storefront")) {
                        C41741IeF.A02(EnumC39651Hig.A0L, EnumC39644HiZ.STOREFRONT, EnumC39650Hif.A05, EnumC39649Hie.A03, c41741IeF);
                    } else if (C14360o3.A0K(str10, "instagram_shopping_home")) {
                        C41741IeF.A03(EnumC39651Hig.A0L, EnumC39644HiZ.TAB_FEED, EnumC39650Hif.A05, EnumC39649Hie.A03, c41741IeF);
                    }
                }
                C1XJ.A00.A1A(imk.A01, imk.A02, imk.A05, imk.A04, "navigation_bar");
                i = -140358691;
                C0f9.A0C(i, A05);
                return;
            case 43:
                A053 = C0f9.A05(-84046455);
                C42882Ixw c42882Ixw = (C42882Ixw) this.A01;
                c42882Ixw.A03.A01(true, true);
                c42882Ixw.FAs();
                i3 = 1109720345;
                C0f9.A0C(i3, A053);
                return;
            case 44:
                A053 = C0f9.A05(-1118674436);
                C42883Ixx c42883Ixx = (C42883Ixx) this.A01;
                c42883Ixx.A02.A00(c42883Ixx.A04, c42883Ixx.A03);
                c42883Ixx.FAs();
                i3 = -1196188034;
                C0f9.A0C(i3, A053);
                return;
            case 45:
                A053 = C0f9.A05(788793833);
                C42884Ixy c42884Ixy = (C42884Ixy) this.A01;
                c42884Ixy.A02.A01(c42884Ixy.A04, c42884Ixy.A03);
                c42884Ixy.FAs();
                i3 = 194708507;
                C0f9.A0C(i3, A053);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(125125125);
                HHF hhf = (HHF) this.A01;
                User user = hhf.A06;
                if (user != null) {
                    hhf.A0A.A06(user.getId(), "ads_product_page_title_bar", "ads_product_page_title_bar");
                }
                i = 80025052;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A053 = C0f9.A05(-1999280635);
                C42881Ixv c42881Ixv = (C42881Ixv) this.A01;
                c42881Ixv.A01.A00(c42881Ixv.A02);
                c42881Ixv.FAs();
                i3 = 785532808;
                C0f9.A0C(i3, A053);
                return;
            case 48:
                A053 = C0f9.A05(1865707019);
                C42881Ixv c42881Ixv2 = (C42881Ixv) this.A01;
                c42881Ixv2.A01.A00(c42881Ixv2.A02);
                c42881Ixv2.FAs();
                i3 = -1510140789;
                C0f9.A0C(i3, A053);
                return;
            case 49:
                A053 = C0f9.A05(934901899);
                C42878Ixs c42878Ixs = (C42878Ixs) this.A01;
                c42878Ixs.A01.A01(true, true);
                c42878Ixs.FAs();
                i3 = 1887613675;
                C0f9.A0C(i3, A053);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A053 = C0f9.A05(-723218603);
                C42880Ixu c42880Ixu = (C42880Ixu) this.A01;
                c42880Ixu.A01.A01(true, true);
                c42880Ixu.FAs();
                i3 = -1879165987;
                C0f9.A0C(i3, A053);
                return;
            case 51:
                A053 = C0f9.A05(640576727);
                C42879Ixt c42879Ixt = (C42879Ixt) this.A01;
                J1K j1k = ((HCN) c42879Ixt.A01.A01).A04;
                if (j1k != null) {
                    J1K.A00(j1k, true);
                    c42879Ixt.FAs();
                    i3 = -987957255;
                    C0f9.A0C(i3, A053);
                    return;
                }
                str2 = "networkHelper";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 52:
                A052 = C0f9.A05(-547276138);
                HCI hci = (HCI) this.A01;
                C41741IeF A0K = AbstractC37304Gc5.A0K(hci);
                String str11 = A0K.A02;
                if (C14360o3.A0K(str11, "instagram_shopping_mini_shop_storefront")) {
                    C41741IeF.A02(EnumC39651Hig.A03, EnumC39644HiZ.STOREFRONT, EnumC39650Hif.A05, EnumC39649Hie.A03, A0K);
                } else if (C14360o3.A0K(str11, "instagram_shopping_home")) {
                    C41741IeF.A03(EnumC39651Hig.A03, EnumC39644HiZ.TAB_FEED, EnumC39650Hif.A05, EnumC39649Hie.A03, A0K);
                }
                AbstractC25226BEj.A1Q(hci);
                i2 = 139557087;
                C0f9.A0C(i2, A052);
                return;
            case 53:
                A05 = C0f9.A05(954359648);
                ShoppingMoreProductsFragment shoppingMoreProductsFragment = (ShoppingMoreProductsFragment) this.A01;
                C38321qM c38321qM = shoppingMoreProductsFragment.A01;
                if (c38321qM != null) {
                    ShoppingMoreProductsFragment.A03(shoppingMoreProductsFragment, c38321qM.getId());
                }
                i = 1025001405;
                C0f9.A0C(i, A05);
                return;
            case 54:
                A052 = C0f9.A05(1512342855);
                C41729Ie0 c41729Ie0 = ((AdsProductPageFragment) this.A01).A09;
                C38321qM c38321qM2 = c41729Ie0.A01;
                String str12 = null;
                if (c38321qM2 != null) {
                    c38321qM2.BRp();
                }
                C38321qM c38321qM3 = c41729Ie0.A01;
                if (c38321qM3 != null) {
                    str12 = c38321qM3.getId();
                }
                AbstractC59962oe abstractC59962oe = c41729Ie0.A07;
                C41597Iak c41597Iak = new C41597Iak(c41729Ie0.A06, abstractC59962oe, c41729Ie0.A08, c41729Ie0.A0A, C41726Idx.A00(c41729Ie0.A0B), str12, c41729Ie0.A0J, c41729Ie0.A0G, c41729Ie0.A0H);
                FragmentActivity requireActivity3 = abstractC59962oe.requireActivity();
                UserSession userSession2 = c41597Iak.A02;
                C50674MYs c50674MYs = new C50674MYs(requireActivity3, userSession2);
                for (EnumC39582Hds enumC39582Hds : c41597Iak.A08) {
                    int ordinal = enumC39582Hds.ordinal();
                    if (ordinal != 0 && ordinal != 1 && ordinal != 6) {
                        ViewOnClickListenerC38053Gog.A04(c50674MYs, enumC39582Hds, c41597Iak, 14, enumC39582Hds.A00);
                    } else {
                        c50674MYs.A01(ViewOnClickListenerC38053Gog.A02(enumC39582Hds, c41597Iak, 13), enumC39582Hds.A00);
                    }
                }
                AbstractC59962oe abstractC59962oe2 = c41597Iak.A01;
                if (abstractC59962oe2.mParentFragment instanceof BottomSheetFragment) {
                    new C31727DwY(c50674MYs).A06(abstractC59962oe2.requireContext());
                } else {
                    Context context = abstractC59962oe2.getContext();
                    if (context != null) {
                        C31727DwY.A01(context, c50674MYs);
                    }
                }
                FragmentActivity activity = abstractC59962oe2.getActivity();
                Product product = c41597Iak.A03;
                if (product != null) {
                    str = product.A0H;
                } else {
                    str = c41597Iak.A06;
                }
                String str13 = c41597Iak.A04;
                C19280xC A002 = C19280xC.A00(abstractC59962oe2, "report_product");
                A002.A0C("actor_id", userSession2.userId);
                A002.A0C("action", "ACTION_OPEN_PRODUCT_DIALOG");
                A002.A0C("target_id", str);
                A002.A0C("m_pk", str13);
                if (str13 != null && (A0h = AbstractC25229BEm.A0h(userSession2, str13)) != null) {
                    User A2E = A0h.A2E(userSession2);
                    if (A2E != null) {
                        A002.A0C("follow_status", AbstractC167007dF.A0h(A2E.B7L().toString()));
                        VXI.A00(activity, A002, userSession2);
                    }
                    i2 = -1296354357;
                    C0f9.A0C(i2, A052);
                    return;
                }
                AbstractC31173DnH.A1S(A002, userSession2);
                i2 = -1296354357;
                C0f9.A0C(i2, A052);
                return;
            case 55:
                A053 = C0f9.A05(-1841259532);
                HCB hcb = (HCB) this.A01;
                hcb.A03 = "close_button";
                AbstractC25226BEj.A1Q(hcb);
                i3 = -624963444;
                C0f9.A0C(i3, A053);
                return;
            case 56:
                A053 = C0f9.A05(1667068758);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = -1766108122;
                C0f9.A0C(i3, A053);
                return;
            case 57:
                A053 = C0f9.A05(-878859293);
                HCO.A01(EnumC39534Hd4.A03, (HCO) this.A01);
                i3 = 1674624957;
                C0f9.A0C(i3, A053);
                return;
            case 58:
                A053 = C0f9.A05(1339172554);
                HCO.A01(EnumC39534Hd4.A02, (HCO) this.A01);
                i3 = 200500315;
                C0f9.A0C(i3, A053);
                return;
            case 59:
                A05 = C0f9.A05(-2026210582);
                HD9 hd9 = (HD9) this.A01;
                FragmentActivity activity2 = hd9.getActivity();
                if (activity2 != null) {
                    if (hd9.A0C) {
                        activity2.setResult(-1);
                        activity2.finish();
                    } else {
                        activity2.onBackPressed();
                    }
                }
                AbstractC31176DnK.A0Q(hd9.A0K).E4s(new Object());
                i = 939244211;
                C0f9.A0C(i, A05);
                return;
            case 60:
                A053 = C0f9.A05(-1641619585);
                HD9 hd92 = (HD9) this.A01;
                C41762Ied c41762Ied = hd92.A03;
                if (c41762Ied == null) {
                    str2 = "logger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C41762Ied.A05(C41762Ied.A00(c41762Ied, "onboarding_use_a_different_catalog_clicked"), c41762Ied);
                View.OnClickListener onClickListener = hd92.A00;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    i3 = 1158083228;
                    C0f9.A0C(i3, A053);
                    return;
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0C(629599092, A053);
                    throw A0g;
                }
            case 61:
                A053 = C0f9.A05(1558273747);
                HD9 hd93 = (HD9) this.A01;
                IMJ imj = hd93.A05;
                if (imj != null) {
                    imj.A00(hd93.A08);
                    HD9.A01(hd93, EnumC153216up.A06);
                    i3 = -1800834746;
                    C0f9.A0C(i3, A053);
                    return;
                }
                str2 = "networkHelper";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 62:
                A053 = C0f9.A05(1038032900);
                HD9 hd94 = (HD9) this.A01;
                IMJ imj2 = hd94.A05;
                if (imj2 != null) {
                    imj2.A00(hd94.A08);
                    i3 = -1702093526;
                    C0f9.A0C(i3, A053);
                    return;
                }
                str2 = "networkHelper";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A053 = C0f9.A05(459984288);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = -1821415631;
                C0f9.A0C(i3, A053);
                return;
            case 64:
                A053 = C0f9.A05(-1445594174);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = -47698582;
                C0f9.A0C(i3, A053);
                return;
            case 65:
                A053 = C0f9.A05(1903965981);
                AbstractC31176DnK.A1Y(this.A01);
                i3 = -1660226893;
                C0f9.A0C(i3, A053);
                return;
            case 66:
                A053 = C0f9.A05(-258156189);
                HCK.A04((HCK) this.A01, false);
                i3 = 687001700;
                C0f9.A0C(i3, A053);
                return;
            case 67:
                A053 = C0f9.A05(-862749400);
                HCK.A04((HCK) this.A01, false);
                i3 = 147024901;
                C0f9.A0C(i3, A053);
                return;
            case 68:
                A053 = C0f9.A05(517694618);
                HC1 hc1 = (HC1) this.A01;
                C41205ILt c41205ILt = hc1.A04;
                if (c41205ILt == null) {
                    str2 = "controller";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                c41205ILt.A00(AbstractC018607g.A00(hc1));
                i3 = -60224042;
                C0f9.A0C(i3, A053);
                return;
            case 69:
                A053 = C0f9.A05(-2053133000);
                C42130Ile.A00((C42130Ile) this.A01);
                i3 = -478952946;
                C0f9.A0C(i3, A053);
                return;
            default:
                A053 = C0f9.A05(-1863216385);
                ((C41724Idv) this.A01).A02.invoke();
                i3 = -481959033;
                C0f9.A0C(i3, A053);
                return;
        }
    }
}
