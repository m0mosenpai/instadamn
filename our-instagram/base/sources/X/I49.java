package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf;
import com.instagram.api.schemas.TextReviewStatus;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.model.shopping.reels.ProductStickerIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I49 {
    public static Map A00(ProductStickerIntf productStickerIntf) {
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productStickerIntf.Asf() != null) {
            A1I.put("creation_method", productStickerIntf.Asf());
        }
        String str = null;
        if (productStickerIntf.Azc() != null) {
            DropsLaunchAnimationIntf Azc = productStickerIntf.Azc();
            if (Azc != null) {
                treeUpdaterJNI3 = Azc.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("drops_launch_animation", treeUpdaterJNI3);
        }
        if (productStickerIntf.B2m() != null) {
            DropsEventPageNavigationMetadata B2m = productStickerIntf.B2m();
            if (B2m != null) {
                treeUpdaterJNI2 = B2m.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("event_page_navigation_metadata", treeUpdaterJNI2);
        }
        if (productStickerIntf.getId() != null) {
            AbstractC37300Gc1.A12(productStickerIntf.getId(), A1I);
        }
        if (productStickerIntf.CZo() != null) {
            A1I.put("is_organic_product_tagging", productStickerIntf.CZo());
        }
        if (productStickerIntf.Cct() != null) {
            A1I.put("is_set_reminder_button_enabled", productStickerIntf.Cct());
        }
        if (productStickerIntf.getMediaId() != null) {
            AbstractC37300Gc1.A18(productStickerIntf.getMediaId(), A1I);
        }
        if (productStickerIntf.BhA() != null) {
            ProductDetailsProductItemDictIntf BhA = productStickerIntf.BhA();
            if (BhA != null) {
                treeUpdaterJNI = BhA.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("product_item", treeUpdaterJNI);
        }
        if (productStickerIntf.C0p() != null) {
            List<StoryProductItemStickerTappableDataIntf> C0p = productStickerIntf.C0p();
            if (C0p != null) {
                arrayList = AbstractC166987dD.A1E();
                for (StoryProductItemStickerTappableDataIntf storyProductItemStickerTappableDataIntf : C0p) {
                    if (storyProductItemStickerTappableDataIntf != null) {
                        arrayList.add(storyProductItemStickerTappableDataIntf.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("stickers", arrayList);
        }
        if (productStickerIntf.getText() != null) {
            AbstractC37300Gc1.A15(productStickerIntf.getText(), A1I);
        }
        if (productStickerIntf.C6J() != null) {
            A1I.put("text_format", productStickerIntf.C6J());
        }
        if (productStickerIntf.C6h() != null) {
            TextReviewStatus C6h = productStickerIntf.C6h();
            if (C6h != null) {
                str = C6h.A00;
            }
            A1I.put("text_review_status", str);
        }
        if (productStickerIntf.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, productStickerIntf.getUserId());
        }
        if (productStickerIntf.CEu() != null) {
            A1I.put("vibrant_text_color", productStickerIntf.CEu());
        }
        if (productStickerIntf.CHE() != null) {
            A1I.put("was_text_edited", productStickerIntf.CHE());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
