package X;

import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfo;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IRC {
    public static ProductCheckoutProperties parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            CurrencyAmountInfoImpl currencyAmountInfoImpl = null;
            Integer num = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str = null;
            Integer num2 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Long l = null;
            Boolean bool9 = null;
            String str2 = null;
            ShippingAndReturnsMetadata shippingAndReturnsMetadata = null;
            Integer num3 = null;
            Integer num4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("can_add_to_bag".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("can_enable_restock_reminder".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("can_show_inventory_quantity".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("currency_amount".equals(A0s)) {
                    currencyAmountInfoImpl = AbstractC41329IQz.parseFromJson(c16l);
                } else if ("full_inventory_quantity".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("has_free_shipping".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("has_free_two_day_shipping".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("ig_referrer_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("inventory_quantity".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("is_item_in_cart".equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                } else if ("is_purchase_protected".equals(A0s)) {
                    bool7 = AbstractC166997dE.A0d(c16l);
                } else if ("is_shopify_merchant".equals(A0s)) {
                    bool8 = AbstractC166997dE.A0d(c16l);
                } else if ("pre_order_estimate_fulfill_date".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("product_group_has_inventory".equals(A0s)) {
                    bool9 = AbstractC166997dE.A0d(c16l);
                } else if ("receiver_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("shipping_and_return".equals(A0s)) {
                    shippingAndReturnsMetadata = AbstractC40727I3h.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(547).equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else {
                    num4 = AbstractC31178DnM.A0V(c16l, num4, A0s, "viewer_purchase_limit");
                }
                c16l.A0z();
            }
            return new ProductCheckoutProperties(currencyAmountInfoImpl, shippingAndReturnsMetadata, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, num2, num3, num4, l, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductCheckoutProperties productCheckoutProperties) {
        anonymousClass182.A0d();
        Boolean bool = productCheckoutProperties.A02;
        if (bool != null) {
            anonymousClass182.A0T("can_add_to_bag", bool.booleanValue());
        }
        Boolean bool2 = productCheckoutProperties.A03;
        if (bool2 != null) {
            anonymousClass182.A0T("can_enable_restock_reminder", bool2.booleanValue());
        }
        Boolean bool3 = productCheckoutProperties.A04;
        if (bool3 != null) {
            anonymousClass182.A0T("can_show_inventory_quantity", bool3.booleanValue());
        }
        CurrencyAmountInfo currencyAmountInfo = productCheckoutProperties.A00;
        if (currencyAmountInfo != null) {
            anonymousClass182.A0r("currency_amount");
            AbstractC41329IQz.A00(anonymousClass182, currencyAmountInfo.F5F());
        }
        Integer num = productCheckoutProperties.A0B;
        if (num != null) {
            anonymousClass182.A0Q("full_inventory_quantity", num.intValue());
        }
        Boolean bool4 = productCheckoutProperties.A05;
        if (bool4 != null) {
            anonymousClass182.A0T("has_free_shipping", bool4.booleanValue());
        }
        Boolean bool5 = productCheckoutProperties.A06;
        if (bool5 != null) {
            anonymousClass182.A0T("has_free_two_day_shipping", bool5.booleanValue());
        }
        String str = productCheckoutProperties.A0G;
        if (str != null) {
            anonymousClass182.A0S("ig_referrer_fbid", str);
        }
        Integer num2 = productCheckoutProperties.A0C;
        if (num2 != null) {
            anonymousClass182.A0Q("inventory_quantity", num2.intValue());
        }
        Boolean bool6 = productCheckoutProperties.A07;
        if (bool6 != null) {
            anonymousClass182.A0T("is_item_in_cart", bool6.booleanValue());
        }
        Boolean bool7 = productCheckoutProperties.A08;
        if (bool7 != null) {
            anonymousClass182.A0T("is_purchase_protected", bool7.booleanValue());
        }
        Boolean bool8 = productCheckoutProperties.A09;
        if (bool8 != null) {
            anonymousClass182.A0T("is_shopify_merchant", bool8.booleanValue());
        }
        Long l = productCheckoutProperties.A0F;
        if (l != null) {
            anonymousClass182.A0R("pre_order_estimate_fulfill_date", l.longValue());
        }
        Boolean bool9 = productCheckoutProperties.A0A;
        if (bool9 != null) {
            anonymousClass182.A0T("product_group_has_inventory", bool9.booleanValue());
        }
        String str2 = productCheckoutProperties.A0H;
        if (str2 != null) {
            anonymousClass182.A0S("receiver_id", str2);
        }
        ShippingAndReturnsMetadata shippingAndReturnsMetadata = productCheckoutProperties.A01;
        if (shippingAndReturnsMetadata != null) {
            anonymousClass182.A0r("shipping_and_return");
            anonymousClass182.A0d();
            DeliveryWindowInfo deliveryWindowInfo = shippingAndReturnsMetadata.A02;
            if (deliveryWindowInfo != null) {
                anonymousClass182.A0r("estimated_delivery_window");
                DeliveryWindowInfoImpl F5G = deliveryWindowInfo.F5G();
                anonymousClass182.A0d();
                anonymousClass182.A0R("maximum_date", F5G.A00);
                anonymousClass182.A0R("minimum_date", F5G.A01);
                anonymousClass182.A0a();
            }
            Boolean bool10 = shippingAndReturnsMetadata.A03;
            if (bool10 != null) {
                anonymousClass182.A0T("is_final_sale", bool10.booleanValue());
            }
            CurrencyAmountInfo currencyAmountInfo2 = shippingAndReturnsMetadata.A00;
            if (currencyAmountInfo2 != null) {
                anonymousClass182.A0r("return_cost");
                AbstractC41329IQz.A00(anonymousClass182, currencyAmountInfo2.F5F());
            }
            Integer num3 = shippingAndReturnsMetadata.A04;
            if (num3 != null) {
                anonymousClass182.A0Q("return_policy_time", num3.intValue());
            }
            CurrencyAmountInfo currencyAmountInfo3 = shippingAndReturnsMetadata.A01;
            if (currencyAmountInfo3 != null) {
                anonymousClass182.A0r("shipping_cost");
                AbstractC41329IQz.A00(anonymousClass182, currencyAmountInfo3.F5F());
            }
            String str3 = shippingAndReturnsMetadata.A05;
            if (str3 != null) {
                anonymousClass182.A0S("shipping_cost_stripped", str3);
            }
            anonymousClass182.A0a();
        }
        Integer num4 = productCheckoutProperties.A0D;
        if (num4 != null) {
            anonymousClass182.A0Q(AbstractC111324zv.A00(547), num4.intValue());
        }
        Integer num5 = productCheckoutProperties.A0E;
        if (num5 != null) {
            anonymousClass182.A0Q("viewer_purchase_limit", num5.intValue());
        }
        anonymousClass182.A0a();
    }
}
