package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.common.ProductItem;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* renamed from: X.Ie6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41734Ie6 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r1.equals(true) == false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.II0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, X.IKX] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.Io5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, com.instagram.model.payments.common.ProductItem] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.instagram.model.payments.checkout.CheckoutLaunchParams, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.model.payments.checkout.CheckoutLaunchParams A01(com.instagram.user.model.Product r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41734Ie6.A01(com.instagram.user.model.Product, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Set, boolean):com.instagram.model.payments.checkout.CheckoutLaunchParams");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (X.AbstractC166997dE.A1Z(r18.Cd7(), true) == false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.II0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, X.IKX] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.Io5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.instagram.model.payments.checkout.CheckoutLaunchParams, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.model.payments.checkout.CheckoutLaunchParams A00(com.instagram.common.session.UserSession r17, com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf r18, com.instagram.user.model.User r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, java.util.Set r33) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41734Ie6.A00(com.instagram.common.session.UserSession, com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf, com.instagram.user.model.User, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Set):com.instagram.model.payments.checkout.CheckoutLaunchParams");
    }

    public static void A03(AnonymousClass182 anonymousClass182, EnumC39556HdS enumC39556HdS, String str, String str2) {
        anonymousClass182.A0r("checkout_configuration");
        anonymousClass182.A0d();
        anonymousClass182.A0S("version", "1.1.2");
        anonymousClass182.A0r("order_status_model");
        anonymousClass182.A0d();
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, enumC39556HdS.A00);
        anonymousClass182.A0a();
        anonymousClass182.A0r("payment_info");
        anonymousClass182.A0d();
        anonymousClass182.A0S("payment_item_type", "IG_NMOR_SHOPPING");
        anonymousClass182.A0S("ig_receiver_id", str);
        anonymousClass182.A0S("ig_referrer_fbid", str2);
    }

    public static void A04(AnonymousClass182 anonymousClass182, IKX ikx, Object obj, String str) {
        anonymousClass182.A0S("merchant_igid", str);
        anonymousClass182.A0r("extra_data");
        C26161Ox.A00(IBI.A00, "SHOPPING").EOu(anonymousClass182, obj);
        anonymousClass182.A0r("ig_attribution_data");
        anonymousClass182.A0d();
        String str2 = ikx.A04;
        if (str2 != null) {
            anonymousClass182.A0S("marketer_igid", str2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.instagram.model.payments.common.ProductItem] */
    public static final ProductItem A02(C41730Ie1 c41730Ie1) {
        Product A04 = c41730Ie1.A04();
        if (A04 != null) {
            ProductDetailsProductItemDict productDetailsProductItemDict = A04.A01;
            ProductCheckoutProperties productCheckoutProperties = productDetailsProductItemDict.A0C;
            if (productCheckoutProperties != null) {
                CurrencyAmountInfo currencyAmountInfo = productCheckoutProperties.A00;
                if (currencyAmountInfo != null) {
                    ProductLaunchInformation productLaunchInformation = productDetailsProductItemDict.A0F;
                    String str = null;
                    if (productLaunchInformation != null) {
                        str = String.valueOf(Long.valueOf(AbstractC25232BEp.A0t(productLaunchInformation.BMJ())));
                    }
                    String str2 = A04.A0H;
                    int A03 = c41730Ie1.A03();
                    ?? obj = new Object();
                    obj.A03 = str2;
                    obj.A01 = currencyAmountInfo.F5F();
                    obj.A00 = A03;
                    obj.A02 = str;
                    return obj;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
