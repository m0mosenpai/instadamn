package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I0M {
    public static Map A00(ReelCTAIntf reelCTAIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI4;
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (reelCTAIntf.Ath() != null) {
            ShoppingSwipeUpCTATextIcon Ath = reelCTAIntf.Ath();
            if (Ath != null) {
                str = Ath.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(4219), str);
        }
        if (reelCTAIntf.Ati() != null) {
            A1I.put(AbstractC111324zv.A00(4220), reelCTAIntf.Ati());
        }
        if (reelCTAIntf.Atj() != null) {
            A1I.put(AbstractC111324zv.A00(4221), reelCTAIntf.Atj());
        }
        if (reelCTAIntf.Ats() != null) {
            A1I.put("cta_type", reelCTAIntf.Ats());
        }
        if (reelCTAIntf.B0a() != null) {
            EffectPreviewIntf B0a = reelCTAIntf.B0a();
            if (B0a != null) {
                treeUpdaterJNI4 = B0a.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("effect_preview", treeUpdaterJNI4);
        }
        if (reelCTAIntf.B64() != null) {
            A1I.put(AbstractC111324zv.A00(4453), reelCTAIntf.B64());
        }
        if (reelCTAIntf.B65() != null) {
            A1I.put(MSV.A00(1179), reelCTAIntf.B65());
        }
        if (reelCTAIntf.BBv() != null) {
            A1I.put(AbstractC111324zv.A00(4540), reelCTAIntf.BBv());
        }
        if (reelCTAIntf.BNi() != null) {
            List BNi = reelCTAIntf.BNi();
            if (BNi != null) {
                arrayList2 = AbstractC166987dD.A1E();
                Iterator it = BNi.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList2, it);
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("links", arrayList2);
        }
        if (reelCTAIntf.BVO() != null) {
            ReelMultiProductLinkIntf BVO = reelCTAIntf.BVO();
            if (BVO != null) {
                treeUpdaterJNI3 = BVO.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put(AbstractC111324zv.A00(1116), treeUpdaterJNI3);
        }
        if (reelCTAIntf.BYV() != null) {
            A1I.put(AbstractC43591JPw.A00(184), reelCTAIntf.BYV());
        }
        if (reelCTAIntf.Bgp() != null) {
            List Bgp = reelCTAIntf.Bgp();
            if (Bgp != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it2 = Bgp.iterator();
                while (it2.hasNext()) {
                    AbstractC37303Gc4.A1R(arrayList, it2);
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(1183), arrayList);
        }
        if (reelCTAIntf.Bgs() != null) {
            ProductCollectionLinkIntf Bgs = reelCTAIntf.Bgs();
            if (Bgs != null) {
                treeUpdaterJNI2 = Bgs.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put(AbstractC111324zv.A00(1184), treeUpdaterJNI2);
        }
        if (reelCTAIntf.BhC() != null) {
            ReelProductLinkIntf BhC = reelCTAIntf.BhC();
            if (BhC != null) {
                treeUpdaterJNI = BhC.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("product_link", treeUpdaterJNI);
        }
        if (reelCTAIntf.Bi5() != null) {
            ProfileShopLinkIntf Bi5 = reelCTAIntf.Bi5();
            if (Bi5 != null) {
                treeUpdaterJNI5 = Bi5.F7o();
            }
            A1I.put("profile_shop_link", treeUpdaterJNI5);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
