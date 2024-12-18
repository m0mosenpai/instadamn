package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.sizechart.SizeChart;
import com.instagram.music.common.model.AudioType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.fragment.sizechart.SizeChartFragment;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import go.Seq;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Gog, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC38053Gog implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC38053Gog(C38580Gxj c38580Gxj, C38929HCc c38929HCc, int i) {
        this.A00 = i;
        switch (i) {
            case 53:
            case 54:
            case 56:
            case 57:
            case 59:
            case 60:
                this.A02 = c38929HCc;
                this.A01 = c38580Gxj;
                break;
            case 55:
            case 58:
            default:
                this.A01 = c38580Gxj;
                this.A02 = c38929HCc;
                break;
        }
    }

    public static ViewOnClickListenerC38053Gog A02(Object obj, Object obj2, int i) {
        return new ViewOnClickListenerC38053Gog(i, obj, obj2);
    }

    public static void A03(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC38053Gog(i, obj, obj2), view);
    }

    public static void A04(C50674MYs c50674MYs, Object obj, Object obj2, int i, int i2) {
        c50674MYs.A03(new ViewOnClickListenerC38053Gog(i, obj, obj2), i2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.instagram.model.shopping.ProductSource, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int A052;
        String str;
        String str2;
        String str3;
        EnumC39617HeR enumC39617HeR;
        int i2;
        ProductSourceOverrideStatus productSourceOverrideStatus;
        int A053;
        int i3;
        String str4;
        String str5;
        String A00;
        String str6;
        User BSW;
        String str7;
        String str8;
        InterfaceC88553xD interfaceC88553xD;
        AudioType audioType;
        String str9;
        OriginalAudioSubtype Ae4;
        String str10;
        View view2;
        int A054;
        int i4;
        IllegalStateException A0g;
        int i5;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1578986070);
                ((JHL) this.A01).DRE((C39350HZp) this.A02);
                i = 998598659;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(1360567979);
                ((JHL) this.A01).DRF((C39350HZp) this.A02);
                i = 473332445;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(1467447304);
                ((JHN) this.A01).DpG((C39352HZr) this.A02);
                i = 568036982;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-253662049);
                ((C41199ILn) this.A02).A00.A00();
                ((C41072IGp) this.A01).A00.invoke();
                i = -1143668889;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A052 = C0f9.A05(-1446674062);
                ILC ilc = (ILC) this.A02;
                IIT iit = (IIT) this.A01;
                HCN hcn = ilc.A00;
                IgdsInlineSearchBox igdsInlineSearchBox = hcn.A00;
                ProductSource productSource = null;
                if (igdsInlineSearchBox == null) {
                    str = "inlineSearchBox";
                } else {
                    igdsInlineSearchBox.A03();
                    if (!ilc.A00(iit)) {
                        ProductSourceOverrideState productSourceOverrideState = hcn.A06;
                        if (productSourceOverrideState != null && (productSourceOverrideStatus = productSourceOverrideState.A01) != null) {
                            Context requireContext = hcn.requireContext();
                            ProductSourceOverrideState productSourceOverrideState2 = hcn.A06;
                            if (productSourceOverrideState2 != null) {
                                productSource = productSourceOverrideState2.A00;
                            }
                            productSourceOverrideStatus.A00(requireContext, productSource);
                        }
                    } else {
                        UserSession A0r = AbstractC166987dD.A0r(hcn.A08);
                        String str11 = iit.A02;
                        C14360o3.A0B(A0r, 0);
                        C41768Iek c41768Iek = C41768Iek.A00;
                        EnumC39617HeR enumC39617HeR2 = EnumC39617HeR.A03;
                        InterfaceC19610xo ARD = C41768Iek.A02(A0r, c41768Iek).ARD();
                        ARD.E7K("last_selected_product_source_type", enumC39617HeR2.toString());
                        ARD.apply();
                        InterfaceC19610xo ARD2 = C41768Iek.A02(A0r, c41768Iek).ARD();
                        ARD2.E7K("shopping_brand_id", str11);
                        ARD2.apply();
                        boolean equals = "entry_point_creator_swipe_up_to_shop".equals(hcn.A07);
                        str = "logger";
                        C41762Ied c41762Ied = hcn.A03;
                        if (equals) {
                            if (c41762Ied != 0) {
                                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(c41762Ied.A07), "instagram_shopping_merchant_selected");
                                C41762Ied.A02(A0f, c41762Ied);
                                AbstractC37301Gc2.A17(A0f, iit.A02);
                                A0f.AAP("merchant_name", iit.A03);
                                String str12 = c41762Ied.A05;
                                if (str12 == null) {
                                    str12 = "";
                                }
                                AbstractC37300Gc1.A0n(A0f, str12);
                                C41762Ied.A03(A0f, c41762Ied);
                                ProductSource productSource2 = c41762Ied.A00;
                                if (productSource2 != null) {
                                    str2 = productSource2.A01;
                                } else {
                                    str2 = null;
                                }
                                A0f.AAP("selected_source_id", str2);
                                ProductSource productSource3 = c41762Ied.A00;
                                if (productSource3 != null && (enumC39617HeR = productSource3.A00) != null) {
                                    str3 = enumC39617HeR.toString();
                                } else {
                                    str3 = null;
                                }
                                A0f.AAP("selected_source_type", str3);
                                A0f.AAP("selected_source_name", null);
                                A0f.AAP("waterfall_id", c41762Ied.A06);
                                A0f.Cht();
                                Intent intent = new Intent();
                                intent.putExtra(MSV.A00(397), iit.A02);
                                intent.putExtra(MSV.A00(398), iit.A03);
                                AbstractC31176DnK.A18(intent, hcn);
                                AbstractC25227BEk.A1B(hcn);
                            }
                        } else if (c41762Ied != 0) {
                            String str13 = iit.A02;
                            String str14 = iit.A03;
                            ?? obj = new Object();
                            obj.A01 = str13;
                            obj.A00 = enumC39617HeR2;
                            obj.A04 = str14;
                            c41762Ied.A06(obj);
                            Intent intent2 = new Intent();
                            intent2.putExtra(MSV.A00(397), iit.A02);
                            intent2.putExtra(MSV.A00(398), iit.A03);
                            AbstractC31176DnK.A18(intent2, hcn);
                            AbstractC25227BEk.A1B(hcn);
                        }
                        C0f9.A0C(i2, A052);
                        return;
                    }
                    i2 = -1899355499;
                    C0f9.A0C(i2, A052);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A053 = C0f9.A05(-511498161);
                HD9 hd9 = (HD9) this.A01;
                C42506Irl c42506Irl = (C42506Irl) this.A02;
                Integer num = c42506Irl.A00;
                Integer num2 = C05F.A00;
                if (num != num2) {
                    c42506Irl.A00 = num2;
                    HEW hew = hd9.A02;
                    if (hew == null) {
                        str = "adapter";
                    } else {
                        hew.notifyDataSetChanged();
                        C41148IJn c41148IJn = hd9.A04;
                        if (c41148IJn == null) {
                            str = "sectionNetworkHelper";
                        } else {
                            String str15 = hd9.A08;
                            Map map = c41148IJn.A05;
                            Object obj2 = map.get(c42506Irl);
                            EnumC39538HdA enumC39538HdA = EnumC39538HdA.A03;
                            if (obj2 != enumC39538HdA) {
                                map.put(c42506Irl, enumC39538HdA);
                                C25621Ms A0M = AbstractC31177DnL.A0M(c41148IJn.A02);
                                String str16 = c41148IJn.A04;
                                switch (c42506Irl.A01.intValue()) {
                                    case 1:
                                        str4 = "BUSINESS_MANAGER";
                                        break;
                                    case 2:
                                        str4 = "SHARED_WITH_BUSINESS";
                                        break;
                                    default:
                                        str4 = "FACEBOOK_PAGE";
                                        break;
                                }
                                AbstractC31173DnH.A1Q(A0M, str16, new Object[]{str4});
                                A0M.A0H("initially_selected_catalog_id", str15);
                                A0M.A0H("max_id", c42506Irl.A02);
                                C1ON A0e = AbstractC25227BEk.A0e(A0M, HB8.class, ISG.class);
                                C37484Gf2.A00(A0e, c42506Irl, c41148IJn, 15);
                                C1GJ.A00(c41148IJn.A00, c41148IJn.A01, A0e);
                            }
                            C41762Ied c41762Ied2 = hd9.A03;
                            if (c41762Ied2 == null) {
                                str = "logger";
                            } else {
                                Integer num3 = c42506Irl.A01;
                                C14360o3.A07(num3);
                                C19280xC A002 = C41762Ied.A00(c41762Ied2, "catalog_load_more_start");
                                A002.A0C("products_source_type", I8Y.A00(num3));
                                C41762Ied.A05(A002, c41762Ied2);
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i3 = -2057323863;
                C0f9.A0C(i3, A053);
                return;
            case 6:
                A05 = C0f9.A05(-9442040);
                ID7 id7 = (ID7) this.A01;
                Object obj3 = this.A02;
                HCE hce = id7.A00;
                C50674MYs A0W = AbstractC31177DnL.A0W(hce.requireContext(), hce.A0G);
                A0W.A01(A02(obj3, hce, 16), 2131957696);
                A04(A0W, obj3, hce, 17, 2131961610);
                new C31727DwY(A0W).A07(hce.requireContext());
                i = 1785489451;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-1793754633);
                IDA ida = (IDA) this.A01;
                C42298IoM c42298IoM = (C42298IoM) this.A02;
                C38687GzS c38687GzS = c42298IoM.A00;
                String str17 = c42298IoM.A01;
                HCK hck = ida.A00;
                InterfaceC09390do interfaceC09390do = hck.A0E;
                C38330GtP c38330GtP = (C38330GtP) interfaceC09390do.getValue();
                C41691IdK.A01(c38330GtP.A01, AbstractC167027dH.A0Q(c38330GtP.A02.getValue()), new C50270MHz(str17, c38687GzS, 2));
                AbstractC37301Gc2.A0N(hck).A00(((C38672GzD) AbstractC37301Gc2.A0e(((C38330GtP) interfaceC09390do.getValue()).A00)).A00, null, null, str17, null, null, null, C38330GtP.A01(interfaceC09390do));
                i = 520636977;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(1975964640);
                ((JGW) this.A01).CuV((User) this.A02);
                i = 1689144157;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A053 = C0f9.A05(1281854467);
                J0U j0u = (J0U) this.A01;
                if (!j0u.A05.booleanValue()) {
                    j0u.A05 = AbstractC166997dE.A0b();
                    SizeChart sizeChart = ((VariantSelectorModel) this.A02).A08.A01;
                    sizeChart.getClass();
                    Product product = j0u.A04;
                    C62862tP c62862tP = j0u.A00;
                    Boolean A0a = AbstractC166997dE.A0a();
                    if (c62862tP != null && product != null) {
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("product_id", product.A0H);
                        A1G.put("push_bottom_sheet", "true");
                        C66246U5q c66246U5q = j0u.A01;
                        if (c66246U5q != null) {
                            j0u.A05 = A0a;
                            AbstractC33787EwD.A00(c62862tP, c66246U5q);
                        } else {
                            UserSession userSession = j0u.A08;
                            C006802i.A0p.markerStart(37369280);
                            C1GL c1gl = c62862tP.A07;
                            AbstractC192798gL A04 = C192108fB.A04(userSession, "com.bloks.www.bloks.commerce.size-chart.async", A1G);
                            A04.A00(new C32394EOv(18, j0u, c62862tP));
                            c1gl.schedule(A04);
                        }
                    } else {
                        j0u.A05 = A0a;
                        SizeChartFragment sizeChartFragment = new SizeChartFragment();
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putParcelable(AbstractC111324zv.A00(3112), sizeChart);
                        sizeChartFragment.setArguments(A0b);
                        C189448aO A0y = AbstractC25225BEi.A0y(j0u.A08);
                        A0y.A0T = sizeChartFragment;
                        C189478aR c189478aR = j0u.A02;
                        if (c189478aR != null) {
                            c189478aR.A0E(sizeChartFragment, A0y);
                        }
                    }
                }
                i3 = 2115234040;
                C0f9.A0C(i3, A053);
                return;
            case 10:
                A05 = C0f9.A05(-760793042);
                C41646Ibe c41646Ibe = (C41646Ibe) this.A02;
                WEz A01 = AbstractC69993VzD.A01(c41646Ibe.A02.requireActivity(), c41646Ibe.A04, c41646Ibe.A03, EnumC65855TvH.A19, VG2.A0f, ((ProductFeedItem) this.A01).getId());
                A01.A08(new C39452Hbe(c41646Ibe, 2));
                A01.A09("shopping_session_id", c41646Ibe.A0I);
                WEz.A00(null, A01);
                i = -1120338629;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A053 = C0f9.A05(-1635939392);
                C41646Ibe c41646Ibe2 = (C41646Ibe) this.A02;
                C9GR.A07(c41646Ibe2.A02.getActivity(), 2131970003);
                C64952wt c64952wt = c41646Ibe2.A07;
                ProductTile productTile = (ProductTile) this.A01;
                C38321qM c38321qM = productTile.A05;
                if (c38321qM != null && (str5 = c64952wt.A0D) != null) {
                    C18920wW c18920wW = c64952wt.A01;
                    Product product2 = productTile.A07;
                    if (product2 != null) {
                        String id = c38321qM.getId();
                        C14360o3.A0B(c18920wW, 0);
                        User user = product2.A0B;
                        if (user != null && (A00 = AbstractC76433bn.A00(user)) != null && id != null) {
                            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c18920wW, "instagram_shopping_product_report_thumbnail_relevancy");
                            if (A0f2.isSampled()) {
                                AbstractC37303Gc4.A0j(A0f2, product2);
                                AbstractC37301Gc2.A17(A0f2, A00);
                                A0f2.AAP("displayed_m_pk", id);
                                AbstractC37300Gc1.A0t(A0f2, str5);
                                A0f2.Cht();
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A14("product expected");
                    }
                }
                i3 = 1912169577;
                C0f9.A0C(i3, A053);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A053 = C0f9.A05(1125052511);
                C1XJ c1xj = C1XJ.A00;
                C41646Ibe c41646Ibe3 = (C41646Ibe) this.A02;
                UserSession userSession2 = c41646Ibe3.A03;
                FragmentActivity requireActivity = c41646Ibe3.A02.requireActivity();
                Product product3 = ((ProductTile) this.A01).A07;
                if (product3 != null && (str6 = product3.A0D) != null) {
                    c1xj.A17(requireActivity, userSession2, str6);
                    i3 = -1271621535;
                    C0f9.A0C(i3, A053);
                    return;
                } else {
                    IllegalStateException A14 = AbstractC166987dD.A14("tile product debugInfo must not be null");
                    C0f9.A0C(407315358, A053);
                    throw A14;
                }
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A053 = C0f9.A05(1616171564);
                C41597Iak.A00((EnumC39582Hds) this.A01, (C41597Iak) this.A02);
                i3 = -1521911589;
                C0f9.A0C(i3, A053);
                return;
            case 14:
                A053 = C0f9.A05(-1590473522);
                C41597Iak.A00((EnumC39582Hds) this.A01, (C41597Iak) this.A02);
                i3 = 88985718;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGTERM /* 15 */:
                A052 = C0f9.A05(407094141);
                HashMap A1G2 = AbstractC166987dD.A1G();
                HD9 hd92 = (HD9) this.A02;
                HEW hew2 = hd92.A02;
                String str18 = "adapter";
                if (hew2 != null) {
                    A1G2.put("catalog_id", hew2.A03.A01);
                    Bundle requireArguments = hd92.requireArguments();
                    A1G2.put("waterfall_id", requireArguments.getString("waterfall_id"));
                    A1G2.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY));
                    A1G2.put("prior_module", requireArguments.getString("prior_module_name"));
                    HEW hew3 = hd92.A02;
                    if (hew3 != null) {
                        A1G2.put("catalog_id", hew3.A03.A01);
                        A1G2.put("presentation_style", requireArguments.getString("presentation_style"));
                        InterfaceC09390do interfaceC09390do2 = hd92.A0K;
                        C62862tP A03 = C62862tP.A03(hd92, AbstractC166987dD.A0o(interfaceC09390do2), null);
                        IgdsBottomButtonLayout igdsBottomButtonLayout = hd92.A01;
                        if (igdsBottomButtonLayout != null) {
                            igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
                        }
                        C41762Ied c41762Ied3 = hd92.A03;
                        if (c41762Ied3 != null) {
                            HEW hew4 = hd92.A02;
                            if (hew4 != null) {
                                String str19 = hew4.A03.A01;
                                C19280xC A003 = C41762Ied.A00(c41762Ied3, "onboarding_navigation_button_clicked");
                                A003.A0C("catalog_id", str19);
                                C41762Ied.A05(A003, c41762Ied3);
                                C41762Ied c41762Ied4 = hd92.A03;
                                if (c41762Ied4 != null) {
                                    C19280xC A004 = C41762Ied.A00(c41762Ied4, "onboarding_navigation_request_started");
                                    A004.A0B("network_start_time", AbstractC31173DnH.A0g());
                                    C41762Ied.A05(A004, c41762Ied4);
                                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do2);
                                    String str20 = hd92.A07;
                                    if (str20 == null) {
                                        str18 = "inAppSignUpFlowBottomButtonRoute";
                                    } else {
                                        AbstractC192798gL A02 = C192108fB.A02(null, A0o, str20, A1G2);
                                        A02.A00(new C32393EOu(14, this.A01, A03, hd92));
                                        hd92.schedule(A02);
                                        i2 = -551221933;
                                        C0f9.A0C(i2, A052);
                                        return;
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("logger");
                        throw C00O.createAndThrow();
                    }
                }
                C14360o3.A0F(str18);
                throw C00O.createAndThrow();
            case 16:
                A053 = C0f9.A05(31127709);
                C1XJ c1xj2 = C1XJ.A00;
                HCE hce2 = (HCE) this.A02;
                FragmentActivity requireActivity2 = hce2.requireActivity();
                UserSession A0r2 = AbstractC166987dD.A0r(hce2.A0G);
                String A0n = AbstractC166997dE.A0n();
                String obj4 = EnumC33406Epd.A06.toString();
                String str21 = ((Product) this.A01).A0H;
                if (str21 == null) {
                    str21 = "";
                }
                c1xj2.A1D(requireActivity2, A0r2, A0n, obj4, null, str21, false, true, false);
                i3 = 243503178;
                C0f9.A0C(i3, A053);
                return;
            case 17:
                A053 = C0f9.A05(-693956837);
                C1XJ c1xj3 = C1XJ.A00;
                HCE hce3 = (HCE) this.A02;
                FragmentActivity requireActivity3 = hce3.requireActivity();
                UserSession A0r3 = AbstractC166987dD.A0r(hce3.A0G);
                String A0n2 = AbstractC166997dE.A0n();
                String obj5 = EnumC33406Epd.A0A.toString();
                String str22 = ((Product) this.A01).A0H;
                if (str22 == null) {
                    str22 = "";
                }
                c1xj3.A1D(requireActivity3, A0r3, A0n2, obj5, null, str22, false, false, false);
                i3 = -1600669796;
                C0f9.A0C(i3, A053);
                return;
            case 18:
                A053 = C0f9.A05(17547526);
                HZ2 hz2 = ((IIO) this.A02).A03;
                C39345HZk c39345HZk = (C39345HZk) this.A01;
                String str23 = ((AbstractC42328Ioq) c39345HZk).A02;
                C14360o3.A07(str23);
                hz2.A00(c39345HZk.A00, null, c39345HZk.A02, str23, c39345HZk.A03);
                i3 = -189377901;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGSTOP /* 19 */:
                A053 = C0f9.A05(1418578475);
                HZ2 hz22 = ((IIO) this.A02).A03;
                C39345HZk c39345HZk2 = (C39345HZk) this.A01;
                String str24 = ((AbstractC42328Ioq) c39345HZk2).A02;
                C14360o3.A07(str24);
                hz22.A00(null, c39345HZk2.A01, c39345HZk2.A02, str24, c39345HZk2.A03);
                i3 = 912285485;
                C0f9.A0C(i3, A053);
                return;
            case 20:
                A053 = C0f9.A05(223358299);
                ((JII) this.A01).DbJ(AbstractC37300Gc1.A0V(this.A02));
                i3 = -1862536604;
                C0f9.A0C(i3, A053);
                return;
            case 21:
                A053 = C0f9.A05(-2060652769);
                Product A022 = ((ProductFeedItem) this.A02).A02();
                if (A022 != null) {
                    ((JII) this.A01).DbH(A022);
                }
                i3 = 1463230987;
                C0f9.A0C(i3, A053);
                return;
            case 22:
                A053 = C0f9.A05(-616705687);
                Product A023 = ((ProductFeedItem) this.A02).A02();
                if (A023 != null) {
                    ((JII) this.A01).DbI(A023);
                }
                i3 = 410793397;
                C0f9.A0C(i3, A053);
                return;
            case 23:
                A053 = C0f9.A05(1855742721);
                Product A024 = ((ProductFeedItem) this.A02).A02();
                if (A024 != null) {
                    ((JII) this.A01).DbK(A024);
                }
                i3 = 390189129;
                C0f9.A0C(i3, A053);
                return;
            case 24:
                A053 = C0f9.A05(-1190760325);
                C41592Iaf.A00((C41592Iaf) this.A01, "view_product");
                ((View.OnClickListener) this.A02).onClick(view);
                i3 = -822760962;
                C0f9.A0C(i3, A053);
                return;
            case 25:
                A053 = C0f9.A05(962740806);
                InterfaceC43444JHi interfaceC43444JHi = ((HF8) this.A02).A00;
                User user2 = ((C39695HjR) this.A01).A00;
                C14360o3.A07(user2);
                interfaceC43444JHi.D7m(user2);
                i3 = 48550728;
                C0f9.A0C(i3, A053);
                return;
            case 26:
                A053 = C0f9.A05(-448769616);
                InterfaceC43444JHi interfaceC43444JHi2 = (InterfaceC43444JHi) this.A02;
                User user3 = ((C39695HjR) this.A01).A00;
                C14360o3.A07(user3);
                interfaceC43444JHi2.D7m(user3);
                i3 = 873701984;
                C0f9.A0C(i3, A053);
                return;
            case 27:
                A05 = C0f9.A05(-314565548);
                InterfaceC99144cb interfaceC99144cb = (InterfaceC99144cb) this.A02;
                if ((interfaceC99144cb instanceof C99134ca) && ((C99134ca) interfaceC99144cb).A02 == EnumC39580Hdq.A08) {
                    ((InterfaceC64872wl) this.A01).E10(interfaceC99144cb);
                } else {
                    InterfaceC64872wl interfaceC64872wl = (InterfaceC64872wl) this.A01;
                    JI4 Aiv = interfaceC99144cb.Aiv();
                    if (Aiv != null && (BSW = Aiv.BSW()) != null) {
                        interfaceC64872wl.E0v(interfaceC99144cb, BSW);
                    } else {
                        IllegalStateException A0g2 = AbstractC166997dE.A0g();
                        C0f9.A0C(1204358199, A05);
                        throw A0g2;
                    }
                }
                i = -1608062929;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(1079832673);
                C41219IMi c41219IMi = ((IJJ) this.A01).A00;
                if (c41219IMi != null) {
                    c41219IMi.A00();
                }
                InterfaceC16660sJ interfaceC16660sJ = ((C42323Iol) this.A02).A01.A02;
                C14360o3.A0A(view);
                interfaceC16660sJ.invoke(view);
                i = -1318767408;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(1424320793);
                Product A025 = ((ProductFeedItem) this.A02).A02();
                if (A025 != null) {
                    ((JII) this.A01).DbH(A025);
                }
                i = 953698862;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(728569109);
                Product A026 = ((ProductFeedItem) this.A02).A02();
                if (A026 != null) {
                    ((JII) this.A01).DbI(A026);
                }
                i = -758913516;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A05 = C0f9.A05(1003961805);
                Product A027 = ((ProductFeedItem) this.A02).A02();
                if (A027 != null) {
                    ((JII) this.A01).DbK(A027);
                }
                i = 1809562286;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A053 = A01(this, 869642432);
                i3 = 671273488;
                C0f9.A0C(i3, A053);
                return;
            case 33:
                A053 = A01(this, 1202509011);
                i3 = -1004360067;
                C0f9.A0C(i3, A053);
                return;
            case 34:
                A053 = A00(this, -2114460811);
                i3 = -2014170790;
                C0f9.A0C(i3, A053);
                return;
            case 35:
                A053 = A00(this, -48734713);
                i3 = 419279384;
                C0f9.A0C(i3, A053);
                return;
            case 36:
                A053 = A01(this, 812164497);
                i3 = 1373986858;
                C0f9.A0C(i3, A053);
                return;
            case 37:
                A053 = A01(this, 1761141533);
                i3 = 2019213668;
                C0f9.A0C(i3, A053);
                return;
            case 38:
                A053 = A01(this, -907603908);
                i3 = 1726741306;
                C0f9.A0C(i3, A053);
                return;
            case 39:
                A053 = A00(this, 1803318109);
                i3 = 1518838270;
                C0f9.A0C(i3, A053);
                return;
            case 40:
                A053 = A00(this, -216516064);
                i3 = 964182628;
                C0f9.A0C(i3, A053);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A053 = C0f9.A05(-2088115920);
                C37605Gh0.A06((C75113Zb) this.A01, (C37605Gh0) this.A02);
                i3 = 847417089;
                C0f9.A0C(i3, A053);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A053 = C0f9.A05(-2024423397);
                ((C38325GtK) this.A02).A03.A00.F8m(new C51930MxD((C41181vS) this.A01, C05F.A00));
                i3 = -1324719430;
                C0f9.A0C(i3, A053);
                return;
            case 43:
                A053 = C0f9.A05(-1090816803);
                ((C38325GtK) this.A02).A03.A00.F8m(new C51929MxC((C41181vS) this.A01, C05F.A00));
                i3 = -1924734130;
                C0f9.A0C(i3, A053);
                return;
            case 44:
                A053 = C0f9.A05(292448867);
                ((InterfaceC43422JGm) this.A01).D9b((ProductCollection) this.A02);
                i3 = -1739229763;
                C0f9.A0C(i3, A053);
                return;
            case 45:
                A053 = C0f9.A05(-1109512807);
                ((InterfaceC43445JHj) this.A01).CvL((Product) this.A02);
                i3 = 599648956;
                C0f9.A0C(i3, A053);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A053 = C0f9.A05(661429820);
                ((InterfaceC43445JHj) this.A01).D9a((Product) this.A02);
                i3 = 1457783158;
                C0f9.A0C(i3, A053);
                return;
            case 47:
                A054 = C0f9.A05(1011256697);
                i4 = 1600543784;
                C0f9.A0C(i4, A054);
                return;
            case 48:
                A05 = C0f9.A05(-112236531);
                C153936w2.A05((C153936w2) this.A01, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "trial_settings", "tap_close");
                AbstractC31179DnN.A0x((Fragment) this.A02);
                i = 1839821907;
                C0f9.A0C(i, A05);
                return;
            case 49:
                A052 = C0f9.A05(885466279);
                C153936w2.A05((C153936w2) this.A01, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "trial_settings", "tap_learn_more");
                N4Q n4q = (N4Q) this.A02;
                InterfaceC09390do interfaceC09390do3 = n4q.A02;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do3), 2342168176156422967L)) {
                    AbstractC41776Ies.A09(n4q.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do3), C2Fb.A46, "https://help.instagram.com/1013292530224018", n4q.A01);
                } else {
                    AbstractC41776Ies.A03(AbstractC166997dE.A0L(view), "https://help.instagram.com/1013292530224018");
                }
                i2 = -1338148638;
                C0f9.A0C(i2, A052);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A053 = C0f9.A05(731032125);
                ((InterfaceC70493Ek) this.A02).DeM();
                i3 = 1058319701;
                C0f9.A0C(i3, A053);
                return;
            case 51:
                A053 = C0f9.A05(1577514817);
                C37516GfY c37516GfY = (C37516GfY) this.A02;
                AbstractC31175DnJ.A1N(c37516GfY.A00, "ig_feed_unified_feedback_disclosure_click");
                c37516GfY.A02.A01(AbstractC166997dE.A0L((View) this.A01));
                i3 = 1874378975;
                C0f9.A0C(i3, A053);
                return;
            case 52:
                A05 = C0f9.A05(503048238);
                EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A01;
                EffectAttribution effectAttribution = (EffectAttribution) this.A02;
                EffectsPageModel effectsPageModel = effectsPageFragment.A03;
                if (effectsPageModel != null && effectsPageModel.A0D != null) {
                    OXk.A00(effectsPageFragment.requireActivity(), effectAttribution, effectsPageFragment.A07);
                }
                i = -47311102;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A053 = C0f9.A05(1707746680);
                C38335GtV c38335GtV = ((C38929HCc) this.A02).A0J;
                if (c38335GtV != null) {
                    C38580Gxj c38580Gxj = (C38580Gxj) this.A01;
                    String str25 = c38580Gxj.A06;
                    AbstractC166987dD.A1Z(new PZQ(c38580Gxj.A02, c38335GtV, str25, null, 46), AbstractC37302Gc3.A08(c38335GtV, str25));
                    i3 = 191292435;
                    C0f9.A0C(i3, A053);
                    return;
                }
                str = "audioPageViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 54:
                A05 = C0f9.A05(2095371213);
                C38929HCc c38929HCc = (C38929HCc) this.A02;
                LBG.A01(c38929HCc, AbstractC166987dD.A0r(c38929HCc.A0o), Long.valueOf(c38929HCc.A00), c38929HCc.A0X);
                C38335GtV c38335GtV2 = c38929HCc.A0J;
                String str26 = null;
                if (c38335GtV2 != null) {
                    C38580Gxj c38580Gxj2 = (C38580Gxj) this.A01;
                    String str27 = c38580Gxj2.A04;
                    String str28 = c38580Gxj2.A05;
                    InterfaceC88553xD interfaceC88553xD2 = c38580Gxj2.A01;
                    if (interfaceC88553xD2 != null) {
                        str26 = interfaceC88553xD2.AD3(c38929HCc.requireContext());
                    }
                    String str29 = c38929HCc.A0X;
                    AbstractC167017dG.A1N(str27, str28);
                    AbstractC166987dD.A1Z(new MAv(c38335GtV2, str28, str29, str26, str27, null, 2), AbstractC141776au.A00(c38335GtV2));
                    i = -1904668481;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "audioPageViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 55:
                A05 = C0f9.A05(2009775267);
                String str30 = ((C38580Gxj) this.A01).A05;
                if (str30 != null) {
                    C38929HCc c38929HCc2 = (C38929HCc) this.A02;
                    C38335GtV c38335GtV3 = c38929HCc2.A0J;
                    if (c38335GtV3 != null) {
                        C38801rC c38801rC = C38321qM.A0h;
                        String A06 = C38801rC.A06(str30);
                        C14360o3.A0B(A06, 0);
                        C25621Ms A0c = AbstractC167017dG.A0c(c38335GtV3.A0C.A05.A00);
                        A0c.A0B("clips/restore_original_audio_attribution/");
                        A0c.A9s("clips_media_id", A06);
                        AbstractC18560vj.A03(AbstractC141776au.A00(c38335GtV3), new C172887n0(new D51(c38335GtV3, (InterfaceC23621Ds) null, 41), AbstractC1807880g.A00(new C57154PYy(c38335GtV3, null, 46), AbstractC25227BEk.A0e(A0c, C38871H9t.class, C41303IPs.class).A04(1129372021, 3))));
                        c38929HCc2.A02();
                    }
                    str = "audioPageViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                i = 1007511592;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A05 = C0f9.A05(-1273190888);
                C38929HCc c38929HCc3 = (C38929HCc) this.A02;
                UserSession A0r4 = AbstractC166987dD.A0r(c38929HCc3.A0o);
                Long valueOf = Long.valueOf(c38929HCc3.A00);
                C14360o3.A0B(A0r4, 1);
                if (valueOf != null) {
                    InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c38929HCc3, A0r4), "instagram_organic_audio_copy_link_tap");
                    AbstractC25225BEi.A1O(A0f3, "audio_page");
                    AbstractC37300Gc1.A0j(A0f3, valueOf);
                    AbstractC25233BEq.A17(A0f3, "media_tap_token", AbstractC166997dE.A0n());
                    A0f3.Cht();
                }
                C38335GtV c38335GtV4 = c38929HCc3.A0J;
                if (c38335GtV4 != null) {
                    String str31 = ((C38580Gxj) this.A01).A04;
                    AbstractC166987dD.A1Z(new PXV(c38335GtV4, str31, null, 4), AbstractC37302Gc3.A08(c38335GtV4, str31));
                    i = -203665945;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "audioPageViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 57:
                A052 = C0f9.A05(773293192);
                C38929HCc c38929HCc4 = (C38929HCc) this.A02;
                C38335GtV c38335GtV5 = c38929HCc4.A0J;
                User user4 = null;
                if (c38335GtV5 != null) {
                    C38580Gxj c38580Gxj3 = (C38580Gxj) this.A01;
                    String str32 = c38580Gxj3.A04;
                    InterfaceC88553xD interfaceC88553xD3 = c38580Gxj3.A01;
                    if (interfaceC88553xD3 != null) {
                        str7 = interfaceC88553xD3.AD3(c38929HCc4.requireContext());
                        str8 = interfaceC88553xD3.Ach();
                        user4 = interfaceC88553xD3.Ade();
                    } else {
                        str7 = null;
                        str8 = null;
                    }
                    AbstractC166987dD.A1Z(new D50(c38335GtV5, user4, str8, str32, str7, null, 8), AbstractC37302Gc3.A08(c38335GtV5, str32));
                    i2 = 1049744464;
                    C0f9.A0C(i2, A052);
                    return;
                }
                str = "audioPageViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 58:
                A05 = C0f9.A05(-1992807681);
                C38929HCc c38929HCc5 = (C38929HCc) this.A02;
                N8L n8l = c38929HCc5.A04;
                C4SX c4sx = null;
                if (n8l == null) {
                    str = "clipsAudioPagePerfLogger";
                } else {
                    N8L.A00(n8l, "more_actions");
                    C38335GtV c38335GtV6 = c38929HCc5.A0J;
                    if (c38335GtV6 != null) {
                        C38653Gyu A005 = C38335GtV.A00(c38335GtV6);
                        if (A005 != null) {
                            interfaceC88553xD = A005.A03;
                        } else {
                            interfaceC88553xD = null;
                        }
                        InterfaceC09390do interfaceC09390do4 = c38929HCc5.A0o;
                        UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do4);
                        Long valueOf2 = Long.valueOf(c38929HCc5.A00);
                        String str33 = c38929HCc5.A0S;
                        if (interfaceC88553xD != null) {
                            audioType = interfaceC88553xD.Ae7();
                        } else {
                            audioType = null;
                        }
                        EnumC39636HiR A006 = I4Y.A00(audioType);
                        if (interfaceC88553xD != null && (Ae4 = interfaceC88553xD.Ae4()) != null) {
                            str9 = AbstractC40748I4c.A00(Ae4);
                        } else {
                            str9 = null;
                        }
                        C153756vk c153756vk = c38929HCc5.A07;
                        if (c153756vk == null) {
                            str = "pivotPageSessionProvider";
                        } else {
                            C14360o3.A0B(A0r5, 1);
                            if (valueOf2 != null) {
                                Long A0W2 = AbstractC37302Gc3.A0W(str33);
                                InterfaceC02590Ai A0f4 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c38929HCc5, A0r5), "instagram_organic_audio_more_button_tapped");
                                AbstractC25225BEi.A1O(A0f4, "audio_page");
                                AbstractC37300Gc1.A0j(A0f4, valueOf2);
                                AbstractC25233BEq.A17(A0f4, "media_tap_token", AbstractC166997dE.A0n());
                                if (A0W2 != null) {
                                    c4sx = new C4SX(A0W2);
                                }
                                A0f4.AAK(c4sx, "audio_owner_id");
                                AbstractC37302Gc3.A0s(A006, A0f4, str9);
                                AbstractC37303Gc4.A0e(A0f4, c153756vk);
                                A0f4.Cht();
                            }
                            C189478aR c189478aR2 = c38929HCc5.A08;
                            C50674MYs c50674MYs = (C50674MYs) this.A01;
                            if (c189478aR2 != null) {
                                C31727DwY c31727DwY = new C31727DwY(c50674MYs, c189478aR2);
                                C189448aO A0y2 = AbstractC25225BEi.A0y(AbstractC166987dD.A0r(interfaceC09390do4));
                                A0y2.A1G = true;
                                c31727DwY.A08(A0y2);
                            } else {
                                C31727DwY.A02(c38929HCc5, c50674MYs);
                            }
                            i = 1054825543;
                            C0f9.A0C(i, A05);
                            return;
                        }
                    }
                    str = "audioPageViewModel";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 59:
                A053 = C0f9.A05(-450584302);
                C38335GtV c38335GtV7 = ((C38929HCc) this.A02).A0J;
                if (c38335GtV7 != null) {
                    C38580Gxj c38580Gxj4 = (C38580Gxj) this.A01;
                    c38335GtV7.A04(c38580Gxj4.A01, c38580Gxj4.A04);
                    i3 = -146419041;
                    C0f9.A0C(i3, A053);
                    return;
                }
                str = "audioPageViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 60:
                A053 = C0f9.A05(-1769218310);
                C38335GtV c38335GtV8 = ((C38929HCc) this.A02).A0J;
                if (c38335GtV8 != null) {
                    C38580Gxj c38580Gxj5 = (C38580Gxj) this.A01;
                    c38335GtV8.A04(c38580Gxj5.A01, c38580Gxj5.A04);
                    i3 = -1309539991;
                    C0f9.A0C(i3, A053);
                    return;
                }
                str = "audioPageViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 61:
                A053 = C0f9.A05(721994688);
                C42276Io0 c42276Io0 = (C42276Io0) this.A02;
                AbstractC183338Bg.A00(c42276Io0.A0R).A0K(EnumC114925Hg.CLIPS.toString());
                C38335GtV c38335GtV9 = c42276Io0.A0X;
                Object obj6 = this.A01;
                AbstractC166987dD.A1Z(new C57156PZa(c38335GtV9, obj6, (InterfaceC23621Ds) null, 11), AbstractC37302Gc3.A08(c38335GtV9, obj6));
                i3 = -1312547754;
                C0f9.A0C(i3, A053);
                return;
            case 62:
                A053 = C0f9.A05(-2025041587);
                C140966Yy A0r6 = AbstractC25225BEi.A0r((FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                A0r6.A0D(new C38923HBv());
                A0r6.A04();
                i3 = -457138909;
                C0f9.A0C(i3, A053);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A053 = C0f9.A05(-1928118356);
                C140966Yy A0r7 = AbstractC25225BEi.A0r((FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                A0r7.A0D(new C38924HBw());
                A0r7.A04();
                i3 = -752136831;
                C0f9.A0C(i3, A053);
                return;
            case 64:
                A053 = C0f9.A05(-834674534);
                HC4 hc4 = (HC4) this.A02;
                ((CreatorInspirationSignalsPlaygroundRecommendationsViewModel) hc4.A0D.getValue()).performFeedbackButtonAction(AbstractC166987dD.A0r(hc4.A0E), hc4, AbstractC25225BEi.A15(hc4.A0I), AbstractC25225BEi.A15(hc4.A0G), (CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType) this.A01);
                i3 = 472742944;
                C0f9.A0C(i3, A053);
                return;
            case 65:
                A053 = C0f9.A05(-359810627);
                C37675GiC c37675GiC = (C37675GiC) this.A02;
                EnumC25546BRi enumC25546BRi = (EnumC25546BRi) this.A01;
                C14360o3.A0A(enumC25546BRi);
                C22P c22p = C22P.A1d;
                UserSession userSession3 = c37675GiC.A0C;
                INH A0C = AbstractC86593tX.A0C(c22p);
                A0C.A0L = enumC25546BRi.A04;
                Bundle A007 = A0C.A00();
                FragmentActivity fragmentActivity = c37675GiC.A07;
                C6XJ A028 = C6XJ.A02(fragmentActivity, A007, userSession3, TransparentModalActivity.class, "clips_camera");
                AbstractC31179DnN.A1S(A028);
                A028.A0C(fragmentActivity);
                i3 = -537861483;
                C0f9.A0C(i3, A053);
                return;
            case 66:
                A052 = C0f9.A05(-257459417);
                C37675GiC c37675GiC2 = (C37675GiC) this.A02;
                C9C1 A0E = c37675GiC2.A0d.A0E();
                C38321qM c38321qM2 = (C38321qM) this.A01;
                if (A0E != null) {
                    str10 = A0E.A02;
                } else {
                    str10 = null;
                }
                C37675GiC.A0G(c38321qM2, c37675GiC2, str10, true, false);
                i2 = -985704556;
                C0f9.A0C(i2, A052);
                return;
            case 67:
                A052 = C0f9.A05(1026142359);
                C13400mQ c13400mQ = (C13400mQ) this.A01;
                C37851Gl5 c37851Gl5 = (C37851Gl5) this.A02;
                C37556GgC c37556GgC = ((AbstractC37623GhI) c37851Gl5).A02;
                if (c37556GgC != null) {
                    view2 = c37556GgC.A07(c37556GgC.A03());
                } else {
                    view2 = null;
                }
                if (c13400mQ.A01(view2)) {
                    c13400mQ.A01(c37851Gl5.A03);
                }
                i2 = -49530916;
                C0f9.A0C(i2, A052);
                return;
            case 68:
                A05 = C0f9.A05(-1828046443);
                InterfaceC16820sZ interfaceC16820sZ = ((C38579Gxi) this.A01).A04;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                ((View) this.A02).setOnClickListener(null);
                i = 1635771303;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A054 = C0f9.A05(-1167976626);
                C37610Gh5 c37610Gh5 = (C37610Gh5) this.A02;
                UserSession userSession4 = c37610Gh5.A02;
                C38321qM c38321qM3 = (C38321qM) this.A01;
                String id2 = c38321qM3.getId();
                if (id2 != null) {
                    C1ON A012 = AnonymousClass755.A01(userSession4, "remove", id2);
                    C37484Gf2.A00(A012, c38321qM3, c37610Gh5, 28);
                    c37610Gh5.A01.schedule(A012);
                    i4 = -1879908692;
                    C0f9.A0C(i4, A054);
                    return;
                }
                A0g = AbstractC166997dE.A0g();
                i5 = 207358602;
                C0f9.A0C(i5, A054);
                throw A0g;
            default:
                A054 = C0f9.A05(-1455680530);
                C37610Gh5 c37610Gh52 = (C37610Gh5) this.A02;
                UserSession userSession5 = c37610Gh52.A02;
                C38321qM c38321qM4 = (C38321qM) this.A01;
                String id3 = c38321qM4.getId();
                if (id3 != null) {
                    C1ON A013 = AnonymousClass755.A01(userSession5, "approve", id3);
                    C37484Gf2.A00(A013, c38321qM4, c37610Gh52, 29);
                    c37610Gh52.A01.schedule(A013);
                    i4 = -1707101731;
                    C0f9.A0C(i4, A054);
                    return;
                }
                A0g = AbstractC166997dE.A0g();
                i5 = -155110662;
                C0f9.A0C(i5, A054);
                throw A0g;
        }
    }

    public static int A00(ViewOnClickListenerC38053Gog viewOnClickListenerC38053Gog, int i) {
        int A05 = C0f9.A05(i);
        C37605Gh0.A05((C75113Zb) viewOnClickListenerC38053Gog.A01, (C37605Gh0) viewOnClickListenerC38053Gog.A02);
        return A05;
    }

    public static int A01(ViewOnClickListenerC38053Gog viewOnClickListenerC38053Gog, int i) {
        int A05 = C0f9.A05(i);
        C37605Gh0.A04((C75113Zb) viewOnClickListenerC38053Gog.A01, (C37605Gh0) viewOnClickListenerC38053Gog.A02);
        return A05;
    }

    public ViewOnClickListenerC38053Gog(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
