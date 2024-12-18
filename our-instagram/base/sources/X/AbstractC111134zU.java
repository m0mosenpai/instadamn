package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.ColorAtTextRangeDict;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.Entity;
import com.instagram.api.schemas.EntityImpl;
import com.instagram.api.schemas.InlineStyleAtRangeDict;
import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductAffiliateInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelInformationDict;
import com.instagram.api.schemas.ProductArtsLabelInformationDictImpl;
import com.instagram.api.schemas.ProductArtsLabelsDict;
import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductDiscountsDictImpl;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDict;
import com.instagram.api.schemas.Range;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeSurfaces;
import com.instagram.api.schemas.SellerBadgeType;
import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4zU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111134zU {
    public static ProductDetailsProductItemDict parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductAffiliateInformationDictImpl productAffiliateInformationDictImpl = null;
            ProductArtsLabelsDict productArtsLabelsDict = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            ProductCheckoutProperties productCheckoutProperties = null;
            ProductCheckoutProperties productCheckoutProperties2 = null;
            CheckoutStyle checkoutStyle = null;
            CommerceReviewStatisticsDict commerceReviewStatisticsDict = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ProductDiscountsDictImpl productDiscountsDictImpl = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str11 = null;
            Long l = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            ProductLaunchInformationImpl productLaunchInformationImpl = null;
            LoyaltyToplineInfoDictImpl loyaltyToplineInfoDictImpl = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            String str12 = null;
            User user = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            ProductReviewStatus productReviewStatus = null;
            String str16 = null;
            ArrayList arrayList = null;
            String str17 = null;
            String str18 = null;
            ProductReviewStatus productReviewStatus2 = null;
            ArrayList arrayList2 = null;
            SellerBadgeDict sellerBadgeDict = null;
            XFBsizeCalibrationScore xFBsizeCalibrationScore = null;
            Integer num = null;
            ProductImageContainerImpl productImageContainerImpl2 = null;
            String str19 = null;
            UntaggableReason untaggableReason = null;
            ArrayList arrayList3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("affiliate_information".equals(A0q)) {
                    productAffiliateInformationDictImpl = HrW.parseFromJson(c16l);
                } else if ("arts_labels".equals(A0q)) {
                    productArtsLabelsDict = AbstractC40162Hra.parseFromJson(c16l);
                } else if ("can_share_to_story".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("can_viewer_see_rnr".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("can_viewer_see_structured_attributes".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("checkout_info".equals(A0q)) {
                    productCheckoutProperties = IRC.parseFromJson(c16l);
                } else if ("checkout_properties".equals(A0q)) {
                    productCheckoutProperties2 = IRC.parseFromJson(c16l);
                } else if ("checkout_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    checkoutStyle = (CheckoutStyle) CheckoutStyle.A01.get(A1P4);
                    if (checkoutStyle == null) {
                        checkoutStyle = CheckoutStyle.A07;
                    }
                } else if ("commerce_review_statistics".equals(A0q)) {
                    commerceReviewStatisticsDict = AbstractC39848Hlw.parseFromJson(c16l);
                } else if ("compound_product_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("current_price".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("current_price_amount".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("current_price_stripped".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("debug_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("discount_information".equals(A0q)) {
                    productDiscountsDictImpl = AbstractC40170Hri.parseFromJson(c16l);
                } else if ("external_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("full_price".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("full_price_amount".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("full_price_stripped".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("has_variants".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("has_viewer_saved".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("ig_is_product_editable_on_mobile".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("instance_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("instantiation_timestamp".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("is_enabled_for_hpp".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_in_stock".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_low_stock".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("launch_information".equals(A0q)) {
                    productLaunchInformationImpl = AbstractC40744I3y.parseFromJson(c16l);
                } else if ("loyalty_info".equals(A0q)) {
                    loyaltyToplineInfoDictImpl = AbstractC40052Hpe.parseFromJson(c16l);
                } else if ("main_image".equals(A0q)) {
                    productImageContainerImpl = AbstractC111144zV.parseFromJson(c16l);
                } else if ("main_image_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("merchant".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("per_unit_price".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("price".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("product_appeal_review_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    productReviewStatus = (ProductReviewStatus) ProductReviewStatus.A01.get(A1P3);
                    if (productReviewStatus == null) {
                        productReviewStatus = ProductReviewStatus.A09;
                    }
                } else if ("product_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if ("product_images".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ProductImageContainerImpl parseFromJson = AbstractC111144zV.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("recommended_size".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str17 = null;
                    } else {
                        str17 = c16l.A1P();
                    }
                } else if ("retailer_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str18 = null;
                    } else {
                        str18 = c16l.A1P();
                    }
                } else if ("review_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    productReviewStatus2 = (ProductReviewStatus) ProductReviewStatus.A01.get(A1P2);
                    if (productReviewStatus2 == null) {
                        productReviewStatus2 = ProductReviewStatus.A09;
                    }
                } else if ("rich_text_description".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            TextWithEntitiesBlockDict parseFromJson2 = AbstractC40416Hw4.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("seller_badge".equals(A0q)) {
                    sellerBadgeDict = AbstractC40233Hsw.parseFromJson(c16l);
                } else if ("size_calibration_score".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    xFBsizeCalibrationScore = (XFBsizeCalibrationScore) XFBsizeCalibrationScore.A01.get(A1P);
                    if (xFBsizeCalibrationScore == null) {
                        xFBsizeCalibrationScore = XFBsizeCalibrationScore.A09;
                    }
                } else if ("size_calibration_score_num_reviews".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("thumbnail_image".equals(A0q)) {
                    productImageContainerImpl2 = AbstractC111144zV.parseFromJson(c16l);
                } else if ("uci_invalidation_code".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str19 = null;
                    } else {
                        str19 = c16l.A1P();
                    }
                } else if ("untaggable_reason".equals(A0q)) {
                    untaggableReason = AbstractC33766Evs.parseFromJson(c16l);
                } else if ("variant_values".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ProductVariantPossibleValueDict parseFromJson3 = Hs3.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                c16l.A0z();
            }
            return new ProductDetailsProductItemDict(checkoutStyle, commerceReviewStatisticsDict, loyaltyToplineInfoDictImpl, productAffiliateInformationDictImpl, productArtsLabelsDict, productDiscountsDictImpl, productReviewStatus, productReviewStatus2, sellerBadgeDict, untaggableReason, xFBsizeCalibrationScore, productCheckoutProperties, productCheckoutProperties2, productImageContainerImpl, productImageContainerImpl2, productLaunchInformationImpl, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductDetailsProductItemDict productDetailsProductItemDict) {
        anonymousClass182.A0d();
        ProductAffiliateInformationDict productAffiliateInformationDict = productDetailsProductItemDict.A03;
        if (productAffiliateInformationDict != null) {
            anonymousClass182.A0r("affiliate_information");
            ProductAffiliateInformationDictImpl EyG = productAffiliateInformationDict.EyG();
            anonymousClass182.A0d();
            String str = EyG.A00;
            if (str != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(1902), str);
            }
            String str2 = EyG.A01;
            if (str2 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(835), str2);
            }
            anonymousClass182.A0a();
        }
        ProductArtsLabelsDict productArtsLabelsDict = productDetailsProductItemDict.A04;
        if (productArtsLabelsDict != null) {
            anonymousClass182.A0r("arts_labels");
            anonymousClass182.A0d();
            List<ProductArtsLabelInformationDict> list = productArtsLabelsDict.A00;
            if (list != null) {
                C16V.A03(anonymousClass182, "labels");
                for (ProductArtsLabelInformationDict productArtsLabelInformationDict : list) {
                    if (productArtsLabelInformationDict != null) {
                        ProductArtsLabelInformationDictImpl EyH = productArtsLabelInformationDict.EyH();
                        anonymousClass182.A0d();
                        String str3 = EyH.A00;
                        if (str3 != null) {
                            anonymousClass182.A0S(AbstractC111324zv.A00(1071), str3);
                        }
                        String str4 = EyH.A01;
                        if (str4 != null) {
                            anonymousClass182.A0S("label_type", str4);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        Boolean bool = productDetailsProductItemDict.A0H;
        if (bool != null) {
            anonymousClass182.A0T("can_share_to_story", bool.booleanValue());
        }
        Boolean bool2 = productDetailsProductItemDict.A0I;
        if (bool2 != null) {
            anonymousClass182.A0T("can_viewer_see_rnr", bool2.booleanValue());
        }
        Boolean bool3 = productDetailsProductItemDict.A0J;
        if (bool3 != null) {
            anonymousClass182.A0T("can_viewer_see_structured_attributes", bool3.booleanValue());
        }
        ProductCheckoutProperties productCheckoutProperties = productDetailsProductItemDict.A0B;
        if (productCheckoutProperties != null) {
            anonymousClass182.A0r("checkout_info");
            IRC.A00(anonymousClass182, productCheckoutProperties);
        }
        ProductCheckoutProperties productCheckoutProperties2 = productDetailsProductItemDict.A0C;
        if (productCheckoutProperties2 != null) {
            anonymousClass182.A0r("checkout_properties");
            IRC.A00(anonymousClass182, productCheckoutProperties2);
        }
        CheckoutStyle checkoutStyle = productDetailsProductItemDict.A00;
        if (checkoutStyle != null) {
            anonymousClass182.A0S("checkout_style", checkoutStyle.A00);
        }
        CommerceReviewStatisticsDict commerceReviewStatisticsDict = productDetailsProductItemDict.A01;
        if (commerceReviewStatisticsDict != null) {
            anonymousClass182.A0r("commerce_review_statistics");
            anonymousClass182.A0d();
            Float f = commerceReviewStatisticsDict.A00;
            if (f != null) {
                anonymousClass182.A0P("average_rating", f.floatValue());
            }
            List<AdsRatingAndReviewStarType> list2 = commerceReviewStatisticsDict.A02;
            if (list2 != null) {
                C16V.A03(anonymousClass182, AbstractC111324zv.A00(512));
                for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : list2) {
                    if (adsRatingAndReviewStarType != null) {
                        anonymousClass182.A0u(adsRatingAndReviewStarType.A00);
                    }
                }
                anonymousClass182.A0Z();
            }
            Integer num = commerceReviewStatisticsDict.A01;
            if (num != null) {
                anonymousClass182.A0Q("review_count", num.intValue());
            }
            anonymousClass182.A0a();
        }
        String str5 = productDetailsProductItemDict.A0S;
        if (str5 != null) {
            anonymousClass182.A0S("compound_product_id", str5);
        }
        String str6 = productDetailsProductItemDict.A0T;
        if (str6 != null) {
            anonymousClass182.A0S("current_price", str6);
        }
        String str7 = productDetailsProductItemDict.A0U;
        if (str7 != null) {
            anonymousClass182.A0S("current_price_amount", str7);
        }
        String str8 = productDetailsProductItemDict.A0V;
        if (str8 != null) {
            anonymousClass182.A0S("current_price_stripped", str8);
        }
        String str9 = productDetailsProductItemDict.A0W;
        if (str9 != null) {
            anonymousClass182.A0S("debug_info", str9);
        }
        String str10 = productDetailsProductItemDict.A0X;
        if (str10 != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str10);
        }
        ProductDiscountsDict productDiscountsDict = productDetailsProductItemDict.A05;
        if (productDiscountsDict != null) {
            anonymousClass182.A0r("discount_information");
            ProductDiscountsDictImpl EyN = productDiscountsDict.EyN();
            anonymousClass182.A0d();
            List<ProductDiscountInformationDict> list3 = EyN.A00;
            if (list3 != null) {
                C16V.A03(anonymousClass182, "discounts");
                for (ProductDiscountInformationDict productDiscountInformationDict : list3) {
                    if (productDiscountInformationDict != null) {
                        ProductDiscountInformationDictImpl EyM = productDiscountInformationDict.EyM();
                        anonymousClass182.A0d();
                        String str11 = EyM.A00;
                        if (str11 != null) {
                            anonymousClass182.A0S("cta_text", str11);
                        }
                        String str12 = EyM.A01;
                        if (str12 != null) {
                            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str12);
                        }
                        String str13 = EyM.A02;
                        if (str13 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str13);
                        }
                        String str14 = EyM.A03;
                        if (str14 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str14);
                        }
                        String str15 = EyM.A04;
                        if (str15 != null) {
                            anonymousClass182.A0S(AbstractC111324zv.A00(1253), str15);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str16 = productDetailsProductItemDict.A0Y;
        if (str16 != null) {
            anonymousClass182.A0S("external_url", str16);
        }
        String str17 = productDetailsProductItemDict.A0Z;
        if (str17 != null) {
            anonymousClass182.A0S("full_price", str17);
        }
        String str18 = productDetailsProductItemDict.A0a;
        if (str18 != null) {
            anonymousClass182.A0S("full_price_amount", str18);
        }
        String str19 = productDetailsProductItemDict.A0b;
        if (str19 != null) {
            anonymousClass182.A0S("full_price_stripped", str19);
        }
        Boolean bool4 = productDetailsProductItemDict.A0K;
        if (bool4 != null) {
            anonymousClass182.A0T("has_variants", bool4.booleanValue());
        }
        Boolean bool5 = productDetailsProductItemDict.A0L;
        if (bool5 != null) {
            anonymousClass182.A0T("has_viewer_saved", bool5.booleanValue());
        }
        Boolean bool6 = productDetailsProductItemDict.A0M;
        if (bool6 != null) {
            anonymousClass182.A0T("ig_is_product_editable_on_mobile", bool6.booleanValue());
        }
        String str20 = productDetailsProductItemDict.A0c;
        if (str20 != null) {
            anonymousClass182.A0S("instance_id", str20);
        }
        Long l = productDetailsProductItemDict.A0R;
        if (l != null) {
            anonymousClass182.A0R("instantiation_timestamp", l.longValue());
        }
        Boolean bool7 = productDetailsProductItemDict.A0N;
        if (bool7 != null) {
            anonymousClass182.A0T("is_enabled_for_hpp", bool7.booleanValue());
        }
        Boolean bool8 = productDetailsProductItemDict.A0O;
        if (bool8 != null) {
            anonymousClass182.A0T("is_in_stock", bool8.booleanValue());
        }
        Boolean bool9 = productDetailsProductItemDict.A0P;
        if (bool9 != null) {
            anonymousClass182.A0T("is_low_stock", bool9.booleanValue());
        }
        ProductLaunchInformation productLaunchInformation = productDetailsProductItemDict.A0F;
        if (productLaunchInformation != null) {
            anonymousClass182.A0r("launch_information");
            ProductLaunchInformationImpl F6E = productLaunchInformation.F6E();
            anonymousClass182.A0d();
            String str21 = F6E.A03;
            if (str21 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(903), str21);
            }
            Boolean bool10 = F6E.A00;
            if (bool10 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(2437), bool10.booleanValue());
            }
            Boolean bool11 = F6E.A01;
            if (bool11 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(1046), bool11.booleanValue());
            }
            Long l2 = F6E.A02;
            if (l2 != null) {
                anonymousClass182.A0R(AbstractC111324zv.A00(2656), l2.longValue());
            }
            anonymousClass182.A0a();
        }
        LoyaltyToplineInfoDict loyaltyToplineInfoDict = productDetailsProductItemDict.A02;
        if (loyaltyToplineInfoDict != null) {
            anonymousClass182.A0r("loyalty_info");
            LoyaltyToplineInfoDictImpl Ew8 = loyaltyToplineInfoDict.Ew8();
            anonymousClass182.A0d();
            Boolean bool12 = Ew8.A00;
            if (bool12 != null) {
                anonymousClass182.A0T(AbstractC111324zv.A00(461), bool12.booleanValue());
            }
            String str22 = Ew8.A01;
            if (str22 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(469), str22);
            }
            anonymousClass182.A0a();
        }
        ProductImageContainer productImageContainer = productDetailsProductItemDict.A0D;
        if (productImageContainer != null) {
            anonymousClass182.A0r("main_image");
            AbstractC111144zV.A00(anonymousClass182, productImageContainer.F6D());
        }
        String str23 = productDetailsProductItemDict.A0d;
        if (str23 != null) {
            anonymousClass182.A0S("main_image_id", str23);
        }
        User user = productDetailsProductItemDict.A0G;
        if (user != null) {
            anonymousClass182.A0r("merchant");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str24 = productDetailsProductItemDict.A0e;
        if (str24 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str24);
        }
        String str25 = productDetailsProductItemDict.A0f;
        if (str25 != null) {
            anonymousClass182.A0S("per_unit_price", str25);
        }
        String str26 = productDetailsProductItemDict.A0g;
        if (str26 != null) {
            anonymousClass182.A0S("price", str26);
        }
        ProductReviewStatus productReviewStatus = productDetailsProductItemDict.A06;
        if (productReviewStatus != null) {
            anonymousClass182.A0S("product_appeal_review_status", productReviewStatus.A00);
        }
        String str27 = productDetailsProductItemDict.A0h;
        if (str27 != null) {
            anonymousClass182.A0S("product_id", str27);
        }
        List<ProductImageContainer> list4 = productDetailsProductItemDict.A0l;
        if (list4 != null) {
            C16V.A03(anonymousClass182, "product_images");
            for (ProductImageContainer productImageContainer2 : list4) {
                if (productImageContainer2 != null) {
                    AbstractC111144zV.A00(anonymousClass182, productImageContainer2.F6D());
                }
            }
            anonymousClass182.A0Z();
        }
        String str28 = productDetailsProductItemDict.A0i;
        if (str28 != null) {
            anonymousClass182.A0S("recommended_size", str28);
        }
        String str29 = productDetailsProductItemDict.A0j;
        if (str29 != null) {
            anonymousClass182.A0S("retailer_id", str29);
        }
        ProductReviewStatus productReviewStatus2 = productDetailsProductItemDict.A07;
        if (productReviewStatus2 != null) {
            anonymousClass182.A0S("review_status", productReviewStatus2.A00);
        }
        List<TextWithEntitiesBlockDict> list5 = productDetailsProductItemDict.A0m;
        if (list5 != null) {
            C16V.A03(anonymousClass182, "rich_text_description");
            for (TextWithEntitiesBlockDict textWithEntitiesBlockDict : list5) {
                if (textWithEntitiesBlockDict != null) {
                    anonymousClass182.A0d();
                    String str30 = textWithEntitiesBlockDict.A02;
                    if (str30 != null) {
                        anonymousClass182.A0S("block_type", str30);
                    }
                    Integer num2 = textWithEntitiesBlockDict.A01;
                    if (num2 != null) {
                        anonymousClass182.A0Q("depth", num2.intValue());
                    }
                    TextWithEntities textWithEntities = textWithEntitiesBlockDict.A00;
                    if (textWithEntities != null) {
                        anonymousClass182.A0r("text_with_entities");
                        anonymousClass182.A0d();
                        List<ColorAtTextRangeDict> list6 = textWithEntities.A03;
                        if (list6 != null) {
                            C16V.A03(anonymousClass182, AbstractC58317Pt9.A00(94));
                            for (ColorAtTextRangeDict colorAtTextRangeDict : list6) {
                                if (colorAtTextRangeDict != null) {
                                    anonymousClass182.A0d();
                                    String str31 = colorAtTextRangeDict.A02;
                                    if (str31 != null) {
                                        anonymousClass182.A0S(AbstractC58317Pt9.A00(105), str31);
                                    }
                                    String str32 = colorAtTextRangeDict.A03;
                                    if (str32 != null) {
                                        anonymousClass182.A0S(AbstractC58317Pt9.A00(106), str32);
                                    }
                                    Integer num3 = colorAtTextRangeDict.A00;
                                    if (num3 != null) {
                                        anonymousClass182.A0Q("length", num3.intValue());
                                    }
                                    Integer num4 = colorAtTextRangeDict.A01;
                                    if (num4 != null) {
                                        anonymousClass182.A0Q("offset", num4.intValue());
                                    }
                                    anonymousClass182.A0a();
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        List<InlineStyleAtRangeDict> list7 = textWithEntities.A04;
                        if (list7 != null) {
                            C16V.A03(anonymousClass182, AbstractC58317Pt9.A00(111));
                            for (InlineStyleAtRangeDict inlineStyleAtRangeDict : list7) {
                                if (inlineStyleAtRangeDict != null) {
                                    anonymousClass182.A0d();
                                    Integer num5 = inlineStyleAtRangeDict.A00;
                                    if (num5 != null) {
                                        anonymousClass182.A0Q(AbstractC58317Pt9.A00(110), num5.intValue());
                                    }
                                    Integer num6 = inlineStyleAtRangeDict.A01;
                                    if (num6 != null) {
                                        anonymousClass182.A0Q("length", num6.intValue());
                                    }
                                    Integer num7 = inlineStyleAtRangeDict.A02;
                                    if (num7 != null) {
                                        anonymousClass182.A0Q("offset", num7.intValue());
                                    }
                                    anonymousClass182.A0a();
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        LinkAction linkAction = textWithEntities.A00;
                        if (linkAction != null) {
                            anonymousClass182.A0S(AbstractC58317Pt9.A00(115), linkAction.A00);
                        }
                        List<Range> list8 = textWithEntities.A05;
                        if (list8 != null) {
                            C16V.A03(anonymousClass182, "ranges");
                            for (Range range : list8) {
                                if (range != null) {
                                    anonymousClass182.A0d();
                                    Entity entity = range.A00;
                                    if (entity != null) {
                                        anonymousClass182.A0r("entity");
                                        EntityImpl EtC = entity.EtC();
                                        anonymousClass182.A0d();
                                        String str33 = EtC.A00;
                                        if (str33 != null) {
                                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str33);
                                        }
                                        String str34 = EtC.A01;
                                        if (str34 != null) {
                                            anonymousClass182.A0S("typename", str34);
                                        }
                                        String str35 = EtC.A02;
                                        if (str35 != null) {
                                            anonymousClass182.A0S("url", str35);
                                        }
                                        anonymousClass182.A0a();
                                    }
                                    Integer num8 = range.A01;
                                    if (num8 != null) {
                                        anonymousClass182.A0Q("length", num8.intValue());
                                    }
                                    Integer num9 = range.A02;
                                    if (num9 != null) {
                                        anonymousClass182.A0Q("offset", num9.intValue());
                                    }
                                    anonymousClass182.A0a();
                                }
                            }
                            anonymousClass182.A0Z();
                        }
                        String str36 = textWithEntities.A02;
                        if (str36 != null) {
                            anonymousClass182.A0S("text", str36);
                        }
                        Long l3 = textWithEntities.A01;
                        if (l3 != null) {
                            anonymousClass182.A0R("timestamp", l3.longValue());
                        }
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        SellerBadgeDict sellerBadgeDict = productDetailsProductItemDict.A08;
        if (sellerBadgeDict != null) {
            anonymousClass182.A0r("seller_badge");
            anonymousClass182.A0d();
            String str37 = sellerBadgeDict.A01;
            if (str37 != null) {
                anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str37);
            }
            String str38 = sellerBadgeDict.A02;
            if (str38 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str38);
            }
            List<SellerBadgeSurfaces> list9 = sellerBadgeDict.A03;
            if (list9 != null) {
                C16V.A03(anonymousClass182, "surfaces");
                for (SellerBadgeSurfaces sellerBadgeSurfaces : list9) {
                    if (sellerBadgeSurfaces != null) {
                        anonymousClass182.A0u(sellerBadgeSurfaces.A00);
                    }
                }
                anonymousClass182.A0Z();
            }
            SellerBadgeType sellerBadgeType = sellerBadgeDict.A00;
            if (sellerBadgeType != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, sellerBadgeType.A00);
            }
            anonymousClass182.A0a();
        }
        XFBsizeCalibrationScore xFBsizeCalibrationScore = productDetailsProductItemDict.A0A;
        if (xFBsizeCalibrationScore != null) {
            anonymousClass182.A0S("size_calibration_score", xFBsizeCalibrationScore.A00);
        }
        Integer num10 = productDetailsProductItemDict.A0Q;
        if (num10 != null) {
            anonymousClass182.A0Q("size_calibration_score_num_reviews", num10.intValue());
        }
        ProductImageContainer productImageContainer3 = productDetailsProductItemDict.A0E;
        if (productImageContainer3 != null) {
            anonymousClass182.A0r("thumbnail_image");
            AbstractC111144zV.A00(anonymousClass182, productImageContainer3.F6D());
        }
        String str39 = productDetailsProductItemDict.A0k;
        if (str39 != null) {
            anonymousClass182.A0S("uci_invalidation_code", str39);
        }
        UntaggableReason untaggableReason = productDetailsProductItemDict.A09;
        if (untaggableReason != null) {
            anonymousClass182.A0r("untaggable_reason");
            anonymousClass182.A0d();
            LinkWithText linkWithText = untaggableReason.A01;
            if (linkWithText != null) {
                anonymousClass182.A0r("action");
                anonymousClass182.A0d();
                String str40 = linkWithText.A00;
                if (str40 != null) {
                    anonymousClass182.A0S("text", str40);
                }
                String str41 = linkWithText.A01;
                if (str41 != null) {
                    anonymousClass182.A0S("url", str41);
                }
                anonymousClass182.A0a();
            }
            String str42 = untaggableReason.A03;
            if (str42 != null) {
                anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str42);
            }
            LinkWithText linkWithText2 = untaggableReason.A02;
            if (linkWithText2 != null) {
                anonymousClass182.A0r("help_link");
                anonymousClass182.A0d();
                String str43 = linkWithText2.A00;
                if (str43 != null) {
                    anonymousClass182.A0S("text", str43);
                }
                String str44 = linkWithText2.A01;
                if (str44 != null) {
                    anonymousClass182.A0S("url", str44);
                }
                anonymousClass182.A0a();
            }
            InstagramProductTaggabilityState instagramProductTaggabilityState = untaggableReason.A00;
            if (instagramProductTaggabilityState != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(538), instagramProductTaggabilityState.A00);
            }
            String str45 = untaggableReason.A04;
            if (str45 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str45);
            }
            anonymousClass182.A0a();
        }
        List<ProductVariantPossibleValueDict> list10 = productDetailsProductItemDict.A0n;
        if (list10 != null) {
            C16V.A03(anonymousClass182, "variant_values");
            for (ProductVariantPossibleValueDict productVariantPossibleValueDict : list10) {
                if (productVariantPossibleValueDict != null) {
                    anonymousClass182.A0d();
                    String str46 = productVariantPossibleValueDict.A01;
                    if (str46 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str46);
                    }
                    anonymousClass182.A0T(AbstractC111324zv.A00(4769), productVariantPossibleValueDict.A05);
                    String str47 = productVariantPossibleValueDict.A02;
                    if (str47 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str47);
                    }
                    String str48 = productVariantPossibleValueDict.A03;
                    if (str48 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(1129), str48);
                    }
                    String str49 = productVariantPossibleValueDict.A04;
                    if (str49 != null) {
                        anonymousClass182.A0S(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str49);
                    }
                    ProductVariantVisualStyle productVariantVisualStyle = productVariantPossibleValueDict.A00;
                    if (productVariantVisualStyle != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(1370), productVariantVisualStyle.A00);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
