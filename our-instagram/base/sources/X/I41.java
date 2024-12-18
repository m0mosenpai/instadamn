package X;

import com.instagram.api.schemas.StoryMultiProductStickerLinkData;
import com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.shopping.reels.MultiProductStickerIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I41 {
    public static Map A00(MultiProductStickerIntf multiProductStickerIntf) {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (multiProductStickerIntf.getId() != null) {
            AbstractC37300Gc1.A12(multiProductStickerIntf.getId(), A1I);
        }
        if (multiProductStickerIntf.CZo() != null) {
            A1I.put("is_organic_product_tagging", multiProductStickerIntf.CZo());
        }
        ArrayList arrayList3 = null;
        if (multiProductStickerIntf.BNi() != null) {
            List<StoryMultiProductStickerLinkData> BNi = multiProductStickerIntf.BNi();
            if (BNi != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (StoryMultiProductStickerLinkData storyMultiProductStickerLinkData : BNi) {
                    if (storyMultiProductStickerLinkData != null) {
                        arrayList2.add(storyMultiProductStickerLinkData.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("links", arrayList2);
        }
        if (multiProductStickerIntf.getMediaId() != null) {
            AbstractC37300Gc1.A18(multiProductStickerIntf.getMediaId(), A1I);
        }
        if (multiProductStickerIntf.BVN() != null) {
            List BVN = multiProductStickerIntf.BVN();
            if (BVN != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = BVN.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1U(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1I.put("multi_product_items", arrayList);
        }
        if (multiProductStickerIntf.C0p() != null) {
            List<StoryProductItemStickerTappableDataIntf> C0p = multiProductStickerIntf.C0p();
            if (C0p != null) {
                arrayList3 = AbstractC166987dD.A1E();
                for (StoryProductItemStickerTappableDataIntf storyProductItemStickerTappableDataIntf : C0p) {
                    if (storyProductItemStickerTappableDataIntf != null) {
                        arrayList3.add(storyProductItemStickerTappableDataIntf.F7o());
                    }
                }
            }
            A1I.put("stickers", arrayList3);
        }
        if (multiProductStickerIntf.getText() != null) {
            AbstractC37300Gc1.A15(multiProductStickerIntf.getText(), A1I);
        }
        if (multiProductStickerIntf.C6J() != null) {
            A1I.put("text_format", multiProductStickerIntf.C6J());
        }
        if (multiProductStickerIntf.C6i() != null) {
            A1I.put("text_review_status", multiProductStickerIntf.C6i());
        }
        if (multiProductStickerIntf.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, multiProductStickerIntf.getUserId());
        }
        if (multiProductStickerIntf.CEu() != null) {
            A1I.put("vibrant_text_color", multiProductStickerIntf.CEu());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
