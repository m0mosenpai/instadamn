package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;
import go.Seq;
import java.io.Serializable;
import java.util.Collections;

/* renamed from: X.J8c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43205J8c extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43205J8c(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new C43205J8c(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.NVk, java.lang.Object, X.OwC] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View view;
        int i;
        String A00;
        ImageUrlBase imageUrlBase;
        String A002;
        switch (this.A00) {
            case 0:
                C50685MZd.A00((C50685MZd) this.A01).A04();
                return C0eB.A00;
            case 1:
                return new C34931FaH(AbstractC166987dD.A0r(((C50685MZd) this.A01).A06));
            case 2:
                Serializable serializable = AbstractC31179DnN.A04(this.A01).getSerializable(AbstractC111324zv.A00(1125));
                C14360o3.A0C(serializable, AbstractC111324zv.A00(11));
                return serializable;
            case 3:
                C27961Xa A003 = AbstractC54912fq.A00();
                C50685MZd c50685MZd = (C50685MZd) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c50685MZd.A06);
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A03;
                C54922fr A0S = AbstractC31175DnJ.A0S();
                A0S.A02 = new GCN(c50685MZd, 2);
                return AbstractC31175DnJ.A0T(c50685MZd, A0r, A0S, A003, quickPromotionSlot);
            case 4:
                Serializable serializable2 = AbstractC31179DnN.A04(this.A01).getSerializable(AbstractC111324zv.A00(3048));
                C14360o3.A0C(serializable2, "null cannot be cast to non-null type com.instagram.settings2.extension.common.generated.id.ScreenId");
                return serializable2;
            case 5:
            case 23:
                return this.A01;
            case 6:
            case 24:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
            case 25:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 8:
                C50685MZd c50685MZd2 = (C50685MZd) this.A01;
                return new C39050HHa(c50685MZd2, AbstractC166987dD.A0r(c50685MZd2.A06), (EnumC72365Xc1) c50685MZd2.A05.getValue(), AbstractC25225BEi.A15(c50685MZd2.A01), AbstractC167007dF.A1Z(c50685MZd2.A03));
            case 9:
                UserSession userSession = ((SettingsScreenViewModel) this.A01).A06;
                return userSession.A01(OMF.class, new C37061GUv(userSession, 45));
            case 10:
                return new C54815OKq((UserSession) this.A01);
            case 11:
                return new ABH((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C196068lw.A00(AbstractC166987dD.A0r(((N54) this.A01).A07));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C26816Bse c26816Bse = (C26816Bse) this.A01;
                return AbstractC31176DnK.A0M(c26816Bse, c26816Bse.A01);
            case 14:
                return C196068lw.A00(((N7F) this.A01).getSession());
            case Process.SIGTERM /* 15 */:
                ?? owC = new OwC((UserSession) this.A01);
                owC.A00 = C82H.A0O;
                return owC;
            case 16:
                return new OwC((UserSession) this.A01);
            case 17:
                return new C23653Adm((UserSession) this.A01);
            case 18:
                return new C70806WhM((UserSession) this.A01);
            case Process.SIGSTOP /* 19 */:
                Fragment fragment = (Fragment) this.A01;
                TextView A0T = AbstractC166997dE.A0T(fragment.requireView(), R.id.audience_picker_disclaimer_text);
                A0T.setText(fragment.requireContext().getText(2131973782));
                return A0T;
            case 20:
                Fragment fragment2 = (Fragment) this.A01;
                IgdsButton igdsButton = (IgdsButton) fragment2.requireView().requireViewById(R.id.done_button);
                igdsButton.setEnabled(false);
                igdsButton.setText(2131973280);
                ViewOnClickListenerC42033Ik2.A00(igdsButton, 16, fragment2);
                return igdsButton;
            case 21:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 22:
                return ((Fragment) this.A01).requireActivity().getDefaultViewModelProviderFactory();
            case 26:
                C33143Ejm c33143Ejm = (C33143Ejm) this.A01;
                return new HHR(AbstractC166987dD.A0r(c33143Ejm.A03), ((ELn) c33143Ejm).A03);
            case 27:
                view = ((C38507GwS) this.A01).A00;
                i = R.id.buy_now_button;
                return view.findViewById(i);
            case 28:
                return ((C38507GwS) this.A01).A00.findViewById(R.id.divider);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                view = ((C38507GwS) this.A01).A00;
                i = R.id.merchant_avatar;
                return view.findViewById(i);
            case 30:
                view = ((C38507GwS) this.A01).A00;
                i = R.id.merchant_username;
                return view.findViewById(i);
            case 31:
                return AbstractC166997dE.A0S(((C38507GwS) this.A01).A00, R.id.offer_available_label);
            case 32:
                View view2 = ((C38507GwS) this.A01).A00;
                return AbstractC16960so.A1M(new II6(AbstractC166987dD.A0c(view2, R.id.thumbnail_image_tint_0), AbstractC166987dD.A0c(view2, R.id.product_thumbnail_sold_out_slash_0), (ViewGroup) AbstractC166987dD.A0c(view2, R.id.thumbnail_image_container_0), AbstractC37302Gc3.A0K(view2, R.id.thumbnail_image_0)), new II6(AbstractC166987dD.A0c(view2, R.id.thumbnail_image_tint_1), AbstractC166987dD.A0c(view2, R.id.product_thumbnail_sold_out_slash_1), (ViewGroup) AbstractC166987dD.A0c(view2, R.id.thumbnail_image_container_1), AbstractC37302Gc3.A0K(view2, R.id.thumbnail_image_1)), new II6(AbstractC166987dD.A0c(view2, R.id.thumbnail_image_tint_2), AbstractC166987dD.A0c(view2, R.id.product_thumbnail_sold_out_slash_2), (ViewGroup) AbstractC166987dD.A0c(view2, R.id.thumbnail_image_container_2), AbstractC37302Gc3.A0K(view2, R.id.thumbnail_image_2)));
            case 33:
                view = ((C38507GwS) this.A01).A00;
                i = R.id.subtitle;
                return view.findViewById(i);
            case 34:
                view = ((C38507GwS) this.A01).A00;
                i = R.id.view_cart_button_bottom;
                return view.findViewById(i);
            case 35:
                view = ((C38507GwS) this.A01).A00;
                i = R.id.view_cart_button_top;
                return view.findViewById(i);
            case 36:
                return AbstractC166987dD.A1F(Collections.unmodifiableList(((C42314Ioc) this.A01).A00.A03.A03));
            case 37:
                ProductCollectionFragment productCollectionFragment = ((HFJ) this.A01).A03;
                C3DN A0r2 = AbstractC31172DnG.A0r(productCollectionFragment.requireActivity());
                ProductCollectionHeader productCollectionHeader = productCollectionFragment.A03;
                String str = productCollectionFragment.A0I;
                if (A0r2 != null && str != null && productCollectionHeader != null) {
                    UserSession userSession2 = productCollectionFragment.A00;
                    String str2 = productCollectionFragment.A0G;
                    String str3 = productCollectionFragment.A0H;
                    String str4 = productCollectionFragment.A0J;
                    String str5 = "";
                    if (AbstractC76433bn.A00(productCollectionFragment.A0D) == null) {
                        A00 = "";
                    } else {
                        A00 = AbstractC76433bn.A00(productCollectionFragment.A0D);
                    }
                    C5GU c5gu = productCollectionFragment.A02;
                    C14360o3.A0B(userSession2, 0);
                    AbstractC25233BEq.A0w(1, str2, str4, A00);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(userSession2, str2), "shops_collection_share_tap");
                    if (A0f.isSampled()) {
                        AbstractC31171DnF.A1I(A0f, "instagram_shopping_product_collection");
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06("submodule", str3);
                        AbstractC37300Gc1.A0v(c0Zx, str2);
                        AbstractC37302Gc3.A0u(A0f, c0Zx, str4);
                        C0Zx c0Zx2 = new C0Zx();
                        c0Zx2.A06("product_collection_id", str);
                        c0Zx2.A06("product_collection_type", String.valueOf(c5gu));
                        A0f.AAQ(c0Zx2, "collections_logging_info");
                        A0f.AAP("first_entry_point", "instagram_shopping_product_collection");
                        AbstractC37301Gc2.A18(A0f, A00);
                        A0f.AAK(null, "marketer_igid");
                        A0f.Cht();
                    }
                    ProductImageContainer productImageContainer = productCollectionHeader.A00.A00;
                    if (productImageContainer != null && productImageContainer.BGx().AlQ() != null) {
                        imageUrlBase = (ImageUrlBase) AbstractC166987dD.A16(productCollectionHeader.A00.A00.BGx().AlQ());
                    } else {
                        imageUrlBase = null;
                    }
                    C34726FRp A07 = C28531Zo.A04.A02.A07(productCollectionFragment, productCollectionFragment.A00, C2EY.A1b);
                    String obj = productCollectionFragment.A02.toString();
                    if (AbstractC76433bn.A00(productCollectionFragment.A0D) == null) {
                        A002 = "";
                    } else {
                        A002 = AbstractC76433bn.A00(productCollectionFragment.A0D);
                    }
                    if (AbstractC37300Gc1.A0U(productCollectionFragment.A0D) != null) {
                        str5 = AbstractC37300Gc1.A0U(productCollectionFragment.A0D);
                    }
                    A07.A07.putParcelable(AbstractC111324zv.A00(309), new ProductCollectionShareInfo(imageUrlBase, productCollectionFragment.A0D.A03.Bhu(), null, str, obj, A002, str5, productCollectionHeader.A04, productCollectionHeader.A03, productCollectionFragment.A0Y));
                    A0r2.A0J(A07.A00());
                }
                return C0eB.A00;
            case 38:
                C38979HEh c38979HEh = (C38979HEh) this.A01;
                UserSession userSession3 = c38979HEh.A01;
                InterfaceC60442pS interfaceC60442pS = c38979HEh.A03;
                return new C42748Ivm(interfaceC60442pS, userSession3, null, interfaceC60442pS, true);
            case 39:
                view = ((C38459Gvg) this.A01).A00;
                i = R.id.description;
                return view.findViewById(i);
            case 40:
                view = ((C38459Gvg) this.A01).A00;
                i = R.id.image;
                return view.findViewById(i);
            case Seq.NULL_REFNUM /* 41 */:
                view = ((C38482Gw3) this.A01).A02;
                i = R.id.description;
                return view.findViewById(i);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                view = ((C38482Gw3) this.A01).A02;
                i = R.id.title;
                return view.findViewById(i);
            case 43:
                view = ((C38510GwV) this.A01).A00;
                i = R.id.aggregated_rating;
                return view.findViewById(i);
            case 44:
                view = ((C38510GwV) this.A01).A00;
                i = R.id.discounts;
                return view.findViewById(i);
            case 45:
                view = ((C38510GwV) this.A01).A00;
                i = R.id.header;
                return view.findViewById(i);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                view = ((C38510GwV) this.A01).A00;
                i = R.id.loyalty_unconnected_info;
                return view.findViewById(i);
            case 47:
                view = ((C38510GwV) this.A01).A00;
                i = R.id.merchant_username_price_incentive_experiment;
                return view.findViewById(i);
            case 48:
                view = ((C38510GwV) this.A01).A00;
                i = R.id.per_unit_price;
                return view.findViewById(i);
            case 49:
                view = ((C38510GwV) this.A01).A00;
                i = R.id.reasons_to_buy;
                return view.findViewById(i);
        }
    }
}
