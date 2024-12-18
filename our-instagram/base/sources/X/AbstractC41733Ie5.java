package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ie5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41733Ie5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final User createMerchant(JP7 jp7, String str) {
        SimpleImageUrl simpleImageUrl;
        boolean A1R = AbstractC167007dF.A1R(0, jp7, str);
        Parcelable.Creator creator = User.CREATOR;
        MerchantCheckoutStyle merchantCheckoutStyle = MerchantCheckoutStyle.A06;
        C2JS c2js = (C2JS) jp7;
        String A09 = c2js.A09("profile_image_url");
        if (A09 != null) {
            simpleImageUrl = AbstractC25225BEi.A0t(A09);
        } else {
            simpleImageUrl = null;
        }
        return AbstractC38851rI.A02(merchantCheckoutStyle, SellerShoppableFeedType.A06, simpleImageUrl, null, false, null, str, null, c2js.getOptionalStringField(A1R ? 1 : 0, AbstractC37314GcG.A01(43, 8, 86)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ShippingAndReturnsMetadata createShippingAndReturn(JP8 jp8) {
        DeliveryWindowInfoImpl deliveryWindowInfoImpl;
        CurrencyAmountInfoImpl currencyAmountInfoImpl;
        CurrencyAmountInfoImpl currencyAmountInfoImpl2;
        C14360o3.A0B(jp8, 0);
        C2JS c2js = (C2JS) jp8;
        C2JS optionalTreeField = c2js.getOptionalTreeField(12, "estimated_delivery_window", C66909Ucz.class, 1464035300);
        String str = null;
        if (optionalTreeField != null) {
            deliveryWindowInfoImpl = new DeliveryWindowInfoImpl(optionalTreeField.getCoercedTimeField(0, "maximum_date"), optionalTreeField.getCoercedTimeField(1, "minimum_date"));
        } else {
            deliveryWindowInfoImpl = null;
        }
        Boolean A0o = AbstractC31174DnI.A0o(c2js, "is_final_sale", 13);
        C2JS optionalTreeField2 = c2js.getOptionalTreeField(14, "return_cost", Ud0.class, 837738522);
        if (optionalTreeField2 != null) {
            currencyAmountInfoImpl = AbstractC37304Gc5.A0I(optionalTreeField2, optionalTreeField2.getOptionalStringField(0, "amount"), optionalTreeField2.A08("amount_with_offset"));
        } else {
            currencyAmountInfoImpl = null;
        }
        Integer A0Z = AbstractC37304Gc5.A0Z(c2js, "return_policy_time", 15);
        C2JS optionalTreeField3 = c2js.getOptionalTreeField(16, "shipping_cost", Ud1.class, -1058977092);
        if (optionalTreeField3 != null) {
            currencyAmountInfoImpl2 = AbstractC37304Gc5.A0I(optionalTreeField3, optionalTreeField3.getOptionalStringField(0, "amount"), optionalTreeField3.A08("amount_with_offset"));
        } else {
            currencyAmountInfoImpl2 = null;
        }
        C2JS optionalTreeField4 = c2js.getOptionalTreeField(16, "shipping_cost", Ud1.class, -1058977092);
        if (optionalTreeField4 != null) {
            str = optionalTreeField4.A0B(AbstractC111324zv.A00(47));
        }
        return new ShippingAndReturnsMetadata(currencyAmountInfoImpl, currencyAmountInfoImpl2, deliveryWindowInfoImpl, A0o, A0Z, str);
    }

    public static final User A00(C60291Qx3 c60291Qx3, String str) {
        C2JS optionalTreeField = c60291Qx3.getOptionalTreeField(2, "merchant", C60287Qwz.class, 1000975349);
        SimpleImageUrl simpleImageUrl = null;
        if (optionalTreeField == null) {
            return null;
        }
        Parcelable.Creator creator = User.CREATOR;
        Boolean A0a = AbstractC166997dE.A0a();
        MerchantCheckoutStyle merchantCheckoutStyle = MerchantCheckoutStyle.A06;
        String optionalStringField = optionalTreeField.getOptionalStringField(2, "profile_image_url");
        if (optionalStringField != null) {
            simpleImageUrl = AbstractC25225BEi.A0t(optionalStringField);
        }
        return AbstractC38851rI.A02(merchantCheckoutStyle, SellerShoppableFeedType.A06, simpleImageUrl, null, A0a, null, str, null, optionalTreeField.A08(AbstractC37314GcG.A01(43, 8, 86)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ProductCheckoutProperties createProductCheckoutProperties(JP9 jp9, JP8 jp8) {
        boolean A1R = AbstractC167007dF.A1R(0, jp9, jp8);
        C2JS c2js = (C2JS) jp8;
        Boolean A0o = AbstractC31174DnI.A0o(c2js, "can_add_to_bag", 0);
        Boolean A0o2 = AbstractC31174DnI.A0o(c2js, "can_enable_restock_reminder", A1R ? 1 : 0);
        Boolean A0o3 = AbstractC31174DnI.A0o(c2js, "can_show_inventory_quantity", 2);
        C2JS c2js2 = (C2JS) jp9;
        CurrencyAmountInfoImpl currencyAmountInfoImpl = new CurrencyAmountInfoImpl(AbstractC37304Gc5.A0Z(c2js2, "offset", 3), c2js2.A07("amount"), c2js2.getOptionalStringField(A1R ? 1 : 0, "amount_with_offset"), c2js2.A09("currency"));
        Integer A0Z = AbstractC37304Gc5.A0Z(c2js, "full_inventory_quantity", 3);
        Boolean A0o4 = AbstractC31174DnI.A0o(c2js, "has_free_shipping", 4);
        Boolean A0o5 = AbstractC31174DnI.A0o(c2js, "has_free_two_day_shipping", 5);
        Integer A0Z2 = AbstractC37304Gc5.A0Z(c2js, "full_inventory_quantity", 3);
        Boolean A0o6 = AbstractC31174DnI.A0o(c2js, "is_purchase_protected", 7);
        Boolean A0o7 = AbstractC31174DnI.A0o(c2js, "is_shopify_merchant", 8);
        Long A0V = AbstractC31171DnF.A0V(c2js.getCoercedIntField(9, "pre_order_estimate_fulfill_date"));
        return new ProductCheckoutProperties(currencyAmountInfoImpl, createShippingAndReturn(jp8), A0o, A0o2, A0o3, A0o4, A0o5, null, A0o6, A0o7, AbstractC31174DnI.A0o(c2js, "product_group_has_inventory", 10), A0Z, A0Z2, AbstractC37304Gc5.A0Z(c2js, AbstractC111324zv.A00(548), 18), AbstractC37304Gc5.A0Z(c2js, "viewer_purchase_limit", 11), A0V, null, c2js.getOptionalStringField(17, "receiver_id"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.IMp, java.lang.Object] */
    public static final List createShoppingCartItem(JPA jpa, User user) {
        ImmutableList A06;
        C2JS optionalTreeField;
        String A07;
        C2JS optionalTreeField2;
        ProductCheckoutProperties productCheckoutProperties;
        String str;
        String name;
        String A072;
        String A073;
        C14360o3.A0B(user, 1);
        if (jpa == 0 || (A06 = ((C2JS) jpa).A06(C59194QaS.class, "edges", 980062615)) == null) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator<E> it = A06.iterator();
        while (it.hasNext()) {
            C2JS c2js = (C2JS) it.next();
            C2JS A03 = c2js.A03(C59193QaR.class, "node", -1109366972);
            if (A03 != null && (optionalTreeField = A03.getOptionalTreeField(1, "product", C66911Ud5.class, 292231587)) != null && (A07 = optionalTreeField.A07("strong_id__")) != null && (optionalTreeField2 = c2js.getOptionalTreeField(0, "node", C59193QaR.class, -1109366972)) != null) {
                int coercedIntField = optionalTreeField2.getCoercedIntField(0, "quantity");
                JP8 jp8 = (JP8) optionalTreeField.getOptionalTreeField(13, "checkout_info", C67558Unw.class, -1761359578);
                JP9 jp9 = (JP9) optionalTreeField.A04(C67559Unx.class, "current_price", -1067939739);
                if (jp8 != null && jp9 != null) {
                    productCheckoutProperties = createProductCheckoutProperties(jp9, jp8);
                } else {
                    productCheckoutProperties = null;
                }
                String str2 = null;
                String str3 = null;
                String optionalStringField = optionalTreeField.getOptionalStringField(1, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String A0A = optionalTreeField.A0A(DevServerEntity.COLUMN_DESCRIPTION);
                C2JS optionalTreeField3 = optionalTreeField.getOptionalTreeField(9, "strikethrough_price", C66910Ud4.class, 141350089);
                if (optionalTreeField3 != null && (A073 = optionalTreeField3.A07(AbstractC43591JPw.A00(78))) != null) {
                    str3 = A073;
                }
                C2JS optionalTreeField4 = optionalTreeField.getOptionalTreeField(10, "listing_price", Ud2.class, -1259573883);
                if (optionalTreeField4 != null && (A072 = optionalTreeField4.A07(AbstractC111324zv.A00(47))) != null) {
                    str2 = A072;
                }
                Boolean A0o = AbstractC31174DnI.A0o(optionalTreeField, "has_viewer_saved", 5);
                Boolean A0o2 = AbstractC31174DnI.A0o(optionalTreeField, AbstractC111324zv.A00(995), 6);
                Boolean A0o3 = AbstractC31174DnI.A0o(optionalTreeField, "has_variants", 7);
                EnumC39601HeB enumC39601HeB = (EnumC39601HeB) optionalTreeField.getOptionalEnumField(8, AbstractC111324zv.A00(440), EnumC39601HeB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (enumC39601HeB != null && (name = enumC39601HeB.name()) != null) {
                    str = AbstractC167007dF.A0h(name);
                } else {
                    str = null;
                }
                ProductReviewStatus productReviewStatus = (ProductReviewStatus) ProductReviewStatus.A01.get(str);
                if (productReviewStatus == null) {
                    productReviewStatus = ProductReviewStatus.A09;
                }
                Product A01 = C41746IeK.A01(productReviewStatus, productCheckoutProperties, null, user, AbstractC31174DnI.A0o(optionalTreeField, "can_viewer_see_rnr", 11), A0o3, A0o, A0o2, AbstractC31174DnI.A0o(optionalTreeField, "is_in_stock", 12), str2, null, A0A, str3, null, optionalStringField, A07);
                C41730Ie1 c41730Ie1 = new C41730Ie1();
                ?? obj = new Object();
                obj.A00 = new ProductTile(A01);
                c41730Ie1.A01 = coercedIntField;
                c41730Ie1.A02 = obj;
                A1E.add(c41730Ie1);
            }
        }
        return A1E;
    }
}
