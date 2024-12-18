package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import com.instagram.api.schemas.LoyaltyToplineInfoDict;
import com.instagram.api.schemas.ProductAffiliateInformationDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import com.instagram.api.schemas.ProductDiscountsDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.TextWithEntitiesBlockDictIntf;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.api.schemas.XFBsizeCalibrationScore;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class IAA {
    public static Map A00(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        String str;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        String str4;
        TreeUpdaterJNI treeUpdaterJNI9;
        TreeUpdaterJNI treeUpdaterJNI10;
        TreeUpdaterJNI treeUpdaterJNI11;
        TreeUpdaterJNI treeUpdaterJNI12;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList3 = null;
        if (productDetailsProductItemDictIntf.AaP() != null) {
            ProductAffiliateInformationDict AaP = productDetailsProductItemDictIntf.AaP();
            if (AaP != null) {
                treeUpdaterJNI12 = AaP.F7o();
            } else {
                treeUpdaterJNI12 = null;
            }
            A1I.put(AbstractC111324zv.A00(3858), treeUpdaterJNI12);
        }
        if (productDetailsProductItemDictIntf.Aci() != null) {
            ProductArtsLabelsDictIntf Aci = productDetailsProductItemDictIntf.Aci();
            if (Aci != null) {
                treeUpdaterJNI11 = Aci.F7o();
            } else {
                treeUpdaterJNI11 = null;
            }
            A1I.put("arts_labels", treeUpdaterJNI11);
        }
        if (productDetailsProductItemDictIntf.Akw() != null) {
            A1I.put(AbstractC111324zv.A00(4058), productDetailsProductItemDictIntf.Akw());
        }
        if (productDetailsProductItemDictIntf.AlJ() != null) {
            A1I.put("can_viewer_see_rnr", productDetailsProductItemDictIntf.AlJ());
        }
        if (productDetailsProductItemDictIntf.AlK() != null) {
            A1I.put(AbstractC111324zv.A00(4060), productDetailsProductItemDictIntf.AlK());
        }
        if (productDetailsProductItemDictIntf.AnM() != null) {
            ProductCheckoutPropertiesIntf AnM = productDetailsProductItemDictIntf.AnM();
            if (AnM != null) {
                treeUpdaterJNI10 = AnM.F7o();
            } else {
                treeUpdaterJNI10 = null;
            }
            A1I.put("checkout_info", treeUpdaterJNI10);
        }
        if (productDetailsProductItemDictIntf.AnN() != null) {
            ProductCheckoutPropertiesIntf AnN = productDetailsProductItemDictIntf.AnN();
            if (AnN != null) {
                treeUpdaterJNI9 = AnN.F7o();
            } else {
                treeUpdaterJNI9 = null;
            }
            A1I.put("checkout_properties", treeUpdaterJNI9);
        }
        if (productDetailsProductItemDictIntf.AnQ() != null) {
            CheckoutStyle AnQ = productDetailsProductItemDictIntf.AnQ();
            if (AnQ != null) {
                str4 = AnQ.A00;
            } else {
                str4 = null;
            }
            A1I.put("checkout_style", str4);
        }
        if (productDetailsProductItemDictIntf.Apr() != null) {
            CommerceReviewStatisticsDictIntf Apr = productDetailsProductItemDictIntf.Apr();
            if (Apr != null) {
                treeUpdaterJNI8 = Apr.F7o();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1I.put(AbstractC111324zv.A00(4160), treeUpdaterJNI8);
        }
        if (productDetailsProductItemDictIntf.getCompoundProductId() != null) {
            A1I.put("compound_product_id", productDetailsProductItemDictIntf.getCompoundProductId());
        }
        if (productDetailsProductItemDictIntf.getCurrentPrice() != null) {
            A1I.put("current_price", productDetailsProductItemDictIntf.getCurrentPrice());
        }
        if (productDetailsProductItemDictIntf.getCurrentPriceAmount() != null) {
            A1I.put(AbstractC111324zv.A00(4227), productDetailsProductItemDictIntf.getCurrentPriceAmount());
        }
        if (productDetailsProductItemDictIntf.getCurrentPriceStripped() != null) {
            A1I.put(AbstractC111324zv.A00(4228), productDetailsProductItemDictIntf.getCurrentPriceStripped());
        }
        if (productDetailsProductItemDictIntf.getDebugInfo() != null) {
            A1I.put("debug_info", productDetailsProductItemDictIntf.getDebugInfo());
        }
        if (productDetailsProductItemDictIntf.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, productDetailsProductItemDictIntf.getDescription());
        }
        if (productDetailsProductItemDictIntf.AyJ() != null) {
            ProductDiscountsDict AyJ = productDetailsProductItemDictIntf.AyJ();
            if (AyJ != null) {
                treeUpdaterJNI7 = AyJ.F7o();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1I.put(AbstractC111324zv.A00(4322), treeUpdaterJNI7);
        }
        if (productDetailsProductItemDictIntf.getExternalUrl() != null) {
            A1I.put("external_url", productDetailsProductItemDictIntf.getExternalUrl());
        }
        if (productDetailsProductItemDictIntf.getFullPrice() != null) {
            A1I.put("full_price", productDetailsProductItemDictIntf.getFullPrice());
        }
        if (productDetailsProductItemDictIntf.getFullPriceAmount() != null) {
            A1I.put(AbstractC111324zv.A00(4488), productDetailsProductItemDictIntf.getFullPriceAmount());
        }
        if (productDetailsProductItemDictIntf.getFullPriceStripped() != null) {
            A1I.put(AbstractC111324zv.A00(4489), productDetailsProductItemDictIntf.getFullPriceStripped());
        }
        if (productDetailsProductItemDictIntf.BCv() != null) {
            A1I.put("has_variants", productDetailsProductItemDictIntf.BCv());
        }
        if (productDetailsProductItemDictIntf.BCz() != null) {
            A1I.put("has_viewer_saved", productDetailsProductItemDictIntf.BCz());
        }
        if (productDetailsProductItemDictIntf.BFj() != null) {
            A1I.put(AbstractC111324zv.A00(995), productDetailsProductItemDictIntf.BFj());
        }
        if (productDetailsProductItemDictIntf.BIa() != null) {
            A1I.put("instance_id", productDetailsProductItemDictIntf.BIa());
        }
        if (productDetailsProductItemDictIntf.BId() != null) {
            A1I.put(AbstractC111324zv.A00(4709), productDetailsProductItemDictIntf.BId());
        }
        if (productDetailsProductItemDictIntf.CTp() != null) {
            A1I.put(AbstractC111324zv.A00(4739), productDetailsProductItemDictIntf.CTp());
        }
        if (productDetailsProductItemDictIntf.CWQ() != null) {
            A1I.put("is_in_stock", productDetailsProductItemDictIntf.CWQ());
        }
        if (productDetailsProductItemDictIntf.CXv() != null) {
            A1I.put(AbstractC111324zv.A00(4754), productDetailsProductItemDictIntf.CXv());
        }
        if (productDetailsProductItemDictIntf.BMK() != null) {
            ProductLaunchInformation BMK = productDetailsProductItemDictIntf.BMK();
            if (BMK != null) {
                treeUpdaterJNI6 = BMK.F7o();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1I.put(AbstractC111324zv.A00(2657), treeUpdaterJNI6);
        }
        if (productDetailsProductItemDictIntf.BPP() != null) {
            LoyaltyToplineInfoDict BPP = productDetailsProductItemDictIntf.BPP();
            if (BPP != null) {
                treeUpdaterJNI5 = BPP.F7o();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1I.put(AbstractC111324zv.A00(2687), treeUpdaterJNI5);
        }
        if (productDetailsProductItemDictIntf.BPX() != null) {
            ProductImageContainer BPX = productDetailsProductItemDictIntf.BPX();
            if (BPX != null) {
                treeUpdaterJNI4 = BPX.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("main_image", treeUpdaterJNI4);
        }
        if (productDetailsProductItemDictIntf.getMainImageId() != null) {
            A1I.put(AbstractC111324zv.A00(4859), productDetailsProductItemDictIntf.getMainImageId());
        }
        User BSW = productDetailsProductItemDictIntf.BSW();
        if (BSW != null) {
            AbstractC37301Gc2.A1Q(BSW, A1I);
        }
        if (productDetailsProductItemDictIntf.getName() != null) {
            AbstractC37300Gc1.A14(productDetailsProductItemDictIntf.getName(), A1I);
        }
        if (productDetailsProductItemDictIntf.BcL() != null) {
            A1I.put("per_unit_price", productDetailsProductItemDictIntf.BcL());
        }
        if (productDetailsProductItemDictIntf.getPrice() != null) {
            A1I.put("price", productDetailsProductItemDictIntf.getPrice());
        }
        if (productDetailsProductItemDictIntf.Bgm() != null) {
            ProductReviewStatus Bgm = productDetailsProductItemDictIntf.Bgm();
            if (Bgm != null) {
                str3 = Bgm.A00;
            } else {
                str3 = null;
            }
            A1I.put(AbstractC111324zv.A00(5094), str3);
        }
        if (productDetailsProductItemDictIntf.getProductId() != null) {
            A1I.put("product_id", productDetailsProductItemDictIntf.getProductId());
        }
        if (productDetailsProductItemDictIntf.Bh8() != null) {
            List<ProductImageContainer> Bh8 = productDetailsProductItemDictIntf.Bh8();
            if (Bh8 != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (ProductImageContainer productImageContainer : Bh8) {
                    if (productImageContainer != null) {
                        arrayList2.add(productImageContainer.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put(AbstractC111324zv.A00(5098), arrayList2);
        }
        if (productDetailsProductItemDictIntf.Bl9() != null) {
            A1I.put(AbstractC111324zv.A00(2958), productDetailsProductItemDictIntf.Bl9());
        }
        if (productDetailsProductItemDictIntf.getRetailerId() != null) {
            A1I.put("retailer_id", productDetailsProductItemDictIntf.getRetailerId());
        }
        if (productDetailsProductItemDictIntf.BpF() != null) {
            ProductReviewStatus BpF = productDetailsProductItemDictIntf.BpF();
            if (BpF != null) {
                str2 = BpF.A00;
            } else {
                str2 = null;
            }
            A1I.put("review_status", str2);
        }
        if (productDetailsProductItemDictIntf.BpM() != null) {
            List<TextWithEntitiesBlockDictIntf> BpM = productDetailsProductItemDictIntf.BpM();
            if (BpM != null) {
                arrayList = AbstractC166987dD.A1E();
                for (TextWithEntitiesBlockDictIntf textWithEntitiesBlockDictIntf : BpM) {
                    if (textWithEntitiesBlockDictIntf != null) {
                        arrayList.add(textWithEntitiesBlockDictIntf.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(3027), arrayList);
        }
        if (productDetailsProductItemDictIntf.Bt4() != null) {
            SellerBadgeDictIntf Bt4 = productDetailsProductItemDictIntf.Bt4();
            if (Bt4 != null) {
                treeUpdaterJNI3 = Bt4.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("seller_badge", treeUpdaterJNI3);
        }
        if (productDetailsProductItemDictIntf.Bxe() != null) {
            XFBsizeCalibrationScore Bxe = productDetailsProductItemDictIntf.Bxe();
            if (Bxe != null) {
                str = Bxe.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(5380), str);
        }
        if (productDetailsProductItemDictIntf.Bxf() != null) {
            A1I.put(AbstractC111324zv.A00(5381), productDetailsProductItemDictIntf.Bxf());
        }
        if (productDetailsProductItemDictIntf.C85() != null) {
            ProductImageContainer C85 = productDetailsProductItemDictIntf.C85();
            if (C85 != null) {
                treeUpdaterJNI2 = C85.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("thumbnail_image", treeUpdaterJNI2);
        }
        if (productDetailsProductItemDictIntf.CC7() != null) {
            A1I.put(AbstractC111324zv.A00(5522), productDetailsProductItemDictIntf.CC7());
        }
        if (productDetailsProductItemDictIntf.CD2() != null) {
            UntaggableReasonIntf CD2 = productDetailsProductItemDictIntf.CD2();
            if (CD2 != null) {
                treeUpdaterJNI = CD2.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1359), treeUpdaterJNI);
        }
        if (productDetailsProductItemDictIntf.CEf() != null) {
            List<ProductVariantPossibleValueDictIntf> CEf = productDetailsProductItemDictIntf.CEf();
            if (CEf != null) {
                arrayList3 = AbstractC166987dD.A1E();
                for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : CEf) {
                    if (productVariantPossibleValueDictIntf != null) {
                        arrayList3.add(productVariantPossibleValueDictIntf.F7o());
                    }
                }
            }
            A1I.put("variant_values", arrayList3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
