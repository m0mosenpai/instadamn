package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import go.Seq;
import java.util.HashMap;

/* renamed from: X.J8f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43208J8f extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43208J8f(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C43208J8f A00(Object obj, Object obj2, int i) {
        return new C43208J8f(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C140966Yy A0j;
        Activity activity;
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        String A06;
        InterfaceC23621Ds interfaceC23621Ds;
        C008302x A03;
        int i;
        String A062;
        JI6 ji6;
        C41753IeT A00;
        String str;
        String str2;
        C4SX c4sx;
        HZ4 hz4;
        String str3;
        C38819H7k c38819H7k;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        String A002;
        Context context;
        String str4;
        C07N c07n;
        Object invoke;
        switch (this.A00) {
            case 2:
                HC3 hc3 = (HC3) this.A02;
                C33164EkB c33164EkB = new C33164EkB(I97.A00(AbstractC166987dD.A0r(hc3.A01)).A00);
                Product product = (Product) this.A01;
                User user = product.A0B;
                String str5 = null;
                String A0o = AbstractC37301Gc2.A0o(user);
                C14360o3.A0A(A0o);
                if (user != null) {
                    str5 = AbstractC37300Gc1.A0U(user);
                }
                C14360o3.A0A(str5);
                String str6 = product.A0H;
                AbstractC167027dH.A12(A0o, str5, str6);
                C33164EkB.A01(new FLL(A0o, str5, str6), c33164EkB, "pinned");
                context = hc3.getContext();
                str4 = "Pinned Product Details Page";
                C9GR.A09(context, str4);
                return C0eB.A00;
            case 3:
                HC3 hc32 = (HC3) this.A02;
                UserSession userSession = I97.A00(AbstractC166987dD.A0r(hc32.A01)).A00;
                C14360o3.A0B(userSession, 1);
                InterfaceC19630xq A032 = C1AT.A01(userSession).A03(C1AV.A2u);
                User user2 = ((Product) this.A01).A0B;
                String str7 = null;
                String A0o2 = AbstractC37301Gc2.A0o(user2);
                C14360o3.A0A(A0o2);
                if (user2 != null) {
                    str7 = AbstractC37300Gc1.A0U(user2);
                }
                C14360o3.A0A(str7);
                AbstractC25230BEn.A15(1, A0o2, str7);
                if (C2TN.A00(userSession)) {
                    InterfaceC19610xo ARD = A032.ARD();
                    String A003 = AbstractC111324zv.A00(4240);
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(A003, "profile_shop", "pinned", "merchant_id");
                    C14360o3.A07(formatStrLocaleSafe);
                    ARD.E7K(formatStrLocaleSafe, A0o2);
                    String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe(A003, "profile_shop", "pinned", "merchant_username");
                    C14360o3.A07(formatStrLocaleSafe2);
                    ARD.E7K(formatStrLocaleSafe2, str7);
                    ARD.apply();
                }
                context = hc32.getContext();
                str4 = "Pinned Profile Shop";
                C9GR.A09(context, str4);
                return C0eB.A00;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 44:
            case 45:
            case 47:
            default:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ == null || (invoke = interfaceC16820sZ.invoke()) == null) {
                    InterfaceC018407e interfaceC018407e = (InterfaceC018407e) ((InterfaceC09390do) this.A02).getValue();
                    if ((interfaceC018407e instanceof C07N) && (c07n = (C07N) interfaceC018407e) != null) {
                        return c07n.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke;
            case 14:
                HZ1 hz1 = ((C41593Iag) this.A02).A03;
                str = ((AbstractC42328Ioq) this.A01).A02;
                C14360o3.A07(str);
                ji6 = hz1.A03;
                A00 = C41753IeT.A00(ji6);
                A00.A0C.put(str, Boolean.valueOf(!AbstractC167007dF.A1X(r2.get(str), Boolean.TRUE)));
                C41726Idx.A02(ji6, A00);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                HZ1 hz12 = ((C41593Iag) this.A02).A03;
                Product product2 = (Product) this.A01;
                C14360o3.A0B(product2, 0);
                JI6 ji62 = hz12.A03;
                User user3 = ji62.BUL().Bgk().A0B;
                if (user3 != null && (A002 = AbstractC76433bn.A00(user3)) != null) {
                    C64972wv c64972wv = hz12.A02;
                    C38321qM Byj = ji62.Byj();
                    ji62.C02();
                    C41625IbF c41625IbF = new C41625IbF(Byj, c64972wv, product2, A002);
                    c41625IbF.A08 = "attribute_section";
                    c41625IbF.A00();
                }
                return C0eB.A00;
            case 16:
                HZ1 hz13 = ((C41593Iag) this.A02).A03;
                Product product3 = (Product) this.A01;
                C14360o3.A0B(product3, 0);
                C41729Ie0 c41729Ie0 = hz13.A01;
                C38321qM Byj2 = hz13.A03.Byj();
                C3DN A004 = C3DN.A00.A00(c41729Ie0.A07.requireActivity());
                if (C41729Ie0.A02(c41729Ie0)) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable("product", product3);
                    AbstractC37300Gc1.A0c(A0b, c41729Ie0.A09.getModuleName());
                    A0b.putString(MSV.A00(4), AbstractC43591JPw.A00(340));
                    UserSession userSession2 = c41729Ie0.A08;
                    FragmentActivity fragmentActivity = c41729Ie0.A05;
                    C6XJ A0L = AbstractC31171DnF.A0L(fragmentActivity, A0b, userSession2, TransparentBackgroundModalActivity.class, "bottom_sheet");
                    A0L.A09(0);
                    A0L.A0C(fragmentActivity.getApplicationContext());
                } else if (A004 != null) {
                    UserSession userSession3 = c41729Ie0.A08;
                    String moduleName = c41729Ie0.A09.getModuleName();
                    C14360o3.A0B(moduleName, 1);
                    C34726FRp c34726FRp = new C34726FRp(userSession3, C2EY.A1a, moduleName);
                    c34726FRp.A07.putParcelable(MSV.A00(25), product3);
                    A004.A0K(c34726FRp.A00());
                }
                AbstractC41775Ier.A03(c41729Ie0.A09, c41729Ie0.A08, Byj2, product3, c41729Ie0.A0G);
                return C0eB.A00;
            case 17:
                HZ1 hz14 = ((C41593Iag) this.A02).A03;
                Product product4 = (Product) this.A01;
                C14360o3.A0B(product4, 0);
                C41729Ie0 c41729Ie02 = hz14.A01;
                UserSession userSession4 = c41729Ie02.A08;
                FragmentActivity fragmentActivity2 = c41729Ie02.A05;
                String str8 = product4.A0H;
                String A0d = AbstractC37302Gc3.A0d(product4);
                String str9 = c41729Ie02.A0J;
                String str10 = c41729Ie02.A0E;
                AbstractC167017dG.A1P(fragmentActivity2, str8);
                A0j = AbstractC31173DnH.A0P(fragmentActivity2, userSession4);
                C1XJ.A00.A0T();
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("product_id", str8);
                A1G.put("merchant_igid", A0d);
                A1G.put("prior_module", "pdp");
                A1G.put("prior_submodule", "ratings_summary");
                A1G.put("first_entry_point", str10);
                A1G.put("shopping_session_id", str9);
                A0j.A0D(AbstractC31180DnO.A0G(userSession4, "com.bloks.www.bk.commerce.ratings_and_reviews.all_reviews", A1G));
                A0j.A0A = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                A0j.A04();
                return C0eB.A00;
            case 18:
                HZ5 hz5 = ((IDC) this.A02).A00;
                C39343HZi c39343HZi = (C39343HZi) this.A01;
                String str11 = ((AbstractC42328Ioq) c39343HZi).A02;
                C14360o3.A07(str11);
                Integer num = c39343HZi.A00;
                if (num != null) {
                    hz5.D2x(num, str11, false);
                    return C0eB.A00;
                }
                throw AbstractC166997dE.A0g();
            case Process.SIGSTOP /* 19 */:
                hz4 = ((IDD) this.A02).A00;
                C39346HZl c39346HZl = (C39346HZl) this.A01;
                str3 = ((AbstractC42328Ioq) c39346HZl).A02;
                C14360o3.A07(str3);
                c38819H7k = c39346HZl.A01;
                C45095JxP c45095JxP = c39346HZl.A00;
                if (c45095JxP != null) {
                    C193328hC A0I = AbstractC31171DnF.A0I(hz4.A00);
                    A0I.A05 = c45095JxP.A05;
                    A0I.A0r(c45095JxP.A04);
                    A0I.A0d(new Og6(c45095JxP, hz4, c38819H7k, str3, 5), c45095JxP.A02);
                    A0I.A0b(new Og6(c45095JxP, hz4, c38819H7k, str3, 6), c45095JxP.A03);
                    AbstractC166987dD.A1W(A0I);
                    return C0eB.A00;
                }
                featuredProductPermissionStatus = FeaturedProductPermissionStatus.A04;
                JI6 ji63 = hz4.A04;
                C41753IeT A005 = C41753IeT.A00(ji63);
                IIQ iiq = ji63.C02().A03;
                C14360o3.A07(iiq);
                A005.A03 = new IIQ(iiq.A01, featuredProductPermissionStatus, EnumC39591He1.A06, iiq.A03);
                C41726Idx.A02(ji63, A005);
                IND ind = hz4.A02;
                ind.A00.schedule(I6U.A00(ind.A01, featuredProductPermissionStatus, String.valueOf(c38819H7k.A02), new ME8(featuredProductPermissionStatus, hz4, c38819H7k, str3, 19), new C50365MLr(featuredProductPermissionStatus, hz4, c38819H7k, str3, 41)));
                return C0eB.A00;
            case 20:
                hz4 = ((IDD) this.A02).A00;
                C39346HZl c39346HZl2 = (C39346HZl) this.A01;
                str3 = ((AbstractC42328Ioq) c39346HZl2).A02;
                C14360o3.A07(str3);
                c38819H7k = c39346HZl2.A01;
                featuredProductPermissionStatus = FeaturedProductPermissionStatus.A09;
                JI6 ji632 = hz4.A04;
                C41753IeT A0052 = C41753IeT.A00(ji632);
                IIQ iiq2 = ji632.C02().A03;
                C14360o3.A07(iiq2);
                A0052.A03 = new IIQ(iiq2.A01, featuredProductPermissionStatus, EnumC39591He1.A06, iiq2.A03);
                C41726Idx.A02(ji632, A0052);
                IND ind2 = hz4.A02;
                ind2.A00.schedule(I6U.A00(ind2.A01, featuredProductPermissionStatus, String.valueOf(c38819H7k.A02), new ME8(featuredProductPermissionStatus, hz4, c38819H7k, str3, 19), new C50365MLr(featuredProductPermissionStatus, hz4, c38819H7k, str3, 41)));
                return C0eB.A00;
            case 21:
                HZ4 hz42 = ((IDD) this.A02).A00;
                String str12 = ((C39346HZl) this.A01).A05;
                C41729Ie0 c41729Ie03 = hz42.A01;
                AbstractC41776Ies.A09(c41729Ie03.A05, c41729Ie03.A08, C2Fb.A2w, str12, c41729Ie03.A09.getModuleName());
                return C0eB.A00;
            case 22:
                ((C41580IaT) this.A02).A01.DKO(((C39354HZt) this.A01).A01);
                return C0eB.A00;
            case 23:
            case 24:
                C14360o3.A0B(this.A01, 0);
                return C0eB.A00;
            case 25:
                HZ3 hz3 = ((IIN) this.A02).A03;
                AbstractC42328Ioq abstractC42328Ioq = (AbstractC42328Ioq) this.A01;
                C14360o3.A0B(abstractC42328Ioq, 0);
                C41702IdW c41702IdW = hz3.A00;
                if (c41702IdW != null) {
                    C38683GzO A0M = AbstractC37304Gc5.A0M(c41702IdW, hz3.A03.C02().A08);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_tap_information_row");
                    if (A0f.isSampled()) {
                        C38642Gyj c38642Gyj = c41702IdW.A01;
                        if (c38642Gyj == null || (str2 = c38642Gyj.A05) == null) {
                            str2 = "";
                        }
                        AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str2));
                        if (A0M != null) {
                            c4sx = A0M.A01;
                        } else {
                            c4sx = null;
                        }
                        A0f.AAK(c4sx, "advertiser_id");
                        A0f.A9K("catalog_id", null);
                        AbstractC37300Gc1.A0n(A0f, c41702IdW.A05);
                        AbstractC37300Gc1.A0q(A0f, c41702IdW.A06);
                        A0f.Cht();
                    }
                }
                ji6 = hz3.A03;
                A00 = C41753IeT.A00(ji6);
                str = abstractC42328Ioq.A02;
                A00.A0C.put(str, Boolean.valueOf(!AbstractC167007dF.A1X(r2.get(str), Boolean.TRUE)));
                C41726Idx.A02(ji6, A00);
                return C0eB.A00;
            case 26:
                ((IIN) this.A02).A03.A00((C39344HZj) this.A01);
                return C0eB.A00;
            case 27:
                ((IIO) this.A02).A03.A00.A06(((User) this.A01).getId(), "shopping_pdp_media_attribution", "pdp_media");
                return C0eB.A00;
            case 28:
                C38631GyY c38631GyY = (C38631GyY) this.A01;
                if (c38631GyY.A05) {
                    A062 = null;
                } else {
                    A062 = AbstractC37300Gc1.A04(((C42347Ip9) this.A02).A0D(c38631GyY.A02)).A06(EnumC39623HeX.A04);
                }
                C41039IFi c41039IFi = ((C42347Ip9) this.A02).A02;
                String str13 = c38631GyY.A02;
                Integer num2 = c38631GyY.A01;
                interfaceC23621Ds = null;
                C25621Ms A0q = AbstractC25228BEl.A0q(c41039IFi.A00);
                A0q.A0B("commerce/bag/creator_cart_products_feed/");
                A0q.A06();
                A0q.A0R(HB3.class, C41660Ibs.class);
                AbstractC37301Gc2.A1N(A0q, "creator_id", str13, A062);
                A0q.A0A(num2, "count");
                A03 = A0q.A0N().A03(775);
                i = 23;
                return JX4.A00(new GSB(i, interfaceC23621Ds), A03);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C38631GyY c38631GyY2 = (C38631GyY) this.A01;
                if (c38631GyY2.A05) {
                    A06 = null;
                } else {
                    A06 = AbstractC37300Gc1.A04(((C42347Ip9) this.A02).A0D(c38631GyY2.A02)).A06(EnumC39623HeX.A06);
                }
                C41039IFi c41039IFi2 = ((C42347Ip9) this.A02).A02;
                String str14 = c38631GyY2.A02;
                interfaceC23621Ds = null;
                C25621Ms A0q2 = AbstractC25228BEl.A0q(c41039IFi2.A00);
                A0q2.A0B("commerce/reconsideration/recently_viewed_products_feed/");
                A0q2.A06();
                A0q2.A0R(HB3.class, C41660Ibs.class);
                AbstractC37304Gc5.A1B(A0q2, "include_offsite_products", "true", A06);
                A0q2.A0H("merchant_id", str14);
                A03 = A0q2.A0N().A03(775);
                i = 24;
                return JX4.A00(new GSB(i, interfaceC23621Ds), A03);
            case 30:
                C55056OaB.A01(((C38648Gyp) this.A01).A01, (C55056OaB) this.A02, C43339JDg.A00);
                return C0eB.A00;
            case 31:
                C41220IMj c41220IMj = (C41220IMj) this.A02;
                C2GT c2gt = (C2GT) c41220IMj.A01.getValue();
                Boolean bool = (Boolean) this.A01;
                c2gt.A0B(bool);
                C17060sy.A01.A01(c41220IMj.A00).A03.EQ6(bool);
                return C0eB.A00;
            case 32:
                interfaceC16660sJ = ((C42308IoW) this.A02).A01.A00;
                obj = AbstractC31171DnF.A06((C3OO) this.A01);
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 33:
                interfaceC16660sJ = ((C42333Iov) this.A02).A01.A04;
                if (interfaceC16660sJ != null) {
                    obj = ((C66479UJd) this.A01).A05.A04;
                    interfaceC16660sJ.invoke(obj);
                }
                return C0eB.A00;
            case 34:
                ((JHT) this.A01).Dw3((ProductFeedItem) this.A02);
                return C0eB.A00;
            case 35:
                return new C2N6((Context) this.A01, (UserSession) this.A02);
            case 36:
                C77123cy c77123cy = (C77123cy) this.A02;
                C2XV.A00();
                Animator animator = (Animator) c77123cy.A00;
                if (animator != null) {
                    animator.cancel();
                }
                C77123cy c77123cy2 = (C77123cy) this.A01;
                C2XV.A00();
                Animator animator2 = (Animator) c77123cy2.A00;
                if (animator2 != null) {
                    animator2.cancel();
                }
                return C0eB.A00;
            case 37:
                ((C1810281e) this.A02).A02.remove(this.A01);
                return C0eB.A00;
            case 38:
                ((C55554Olo) this.A02).A00.EFx((InterfaceC60152ox) this.A01);
                return C0eB.A00;
            case 39:
                Context context2 = ((View) this.A02).getContext();
                if (context2 instanceof Activity) {
                    activity = (Activity) context2;
                } else {
                    activity = null;
                }
                return new C55554Olo(activity, (C07T) this.A01);
            case 40:
                UserSession userSession5 = (UserSession) this.A02;
                Context context3 = (Context) this.A01;
                C14360o3.A0A(context3);
                return new C2052096l(userSession5, context3);
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                Context context4 = (Context) this.A01;
                FBUserTag.FBUserInfo fBUserInfo = ((FBUserTag) this.A02).A02;
                C35134Feb.A00(context4, fBUserInfo.A02, fBUserInfo.A04);
                return C0eB.A00;
            case 43:
                ((C75113Zb) this.A02).A0M((C33R) this.A01, null, true);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C153936w2.A05((C153936w2) this.A02, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "drafts_megaphone", "tap_close");
                ((ViewGroup) this.A01).removeAllViews();
                return C0eB.A00;
            case 48:
                if (((AnonymousClass415) this.A02).A04 != null) {
                    CirclePageIndicator circlePageIndicator = (CirclePageIndicator) this.A01;
                    if (circlePageIndicator.A0E) {
                        circlePageIndicator.setGestureInProgress(false);
                    }
                    ((C41L) circlePageIndicator).A08 = null;
                }
                return C0eB.A00;
            case 49:
                N5B n5b = ((C32642EYq) this.A02).A02;
                C36191Fy5 c36191Fy5 = (C36191Fy5) this.A01;
                C14360o3.A0B(c36191Fy5, 0);
                InterfaceC09390do interfaceC09390do = n5b.A01;
                C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), c36191Fy5.A00.getId(), AbstractC111324zv.A00(2965), MSV.A00(1626));
                A0j = AbstractC25233BEq.A0j(n5b, interfaceC09390do);
                A0j.A0D(C31368DqX.A00(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01));
                A0j.A04();
                return C0eB.A00;
        }
    }
}
