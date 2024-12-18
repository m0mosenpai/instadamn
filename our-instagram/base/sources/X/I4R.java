package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I4R {
    public static Map A00(UpcomingEventMedia upcomingEventMedia) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (upcomingEventMedia.AXw() != null) {
            A1I.put("accessibility_caption", upcomingEventMedia.AXw());
        }
        if (upcomingEventMedia.B3N() != null) {
            A1I.put("explore_pivot_grid", upcomingEventMedia.B3N());
        }
        if (upcomingEventMedia.BB7() != null) {
            A1I.put("has_audio", upcomingEventMedia.BB7());
        }
        if (upcomingEventMedia.getId() != null) {
            AbstractC37300Gc1.A12(upcomingEventMedia.getId(), A1I);
        }
        ArrayList arrayList = null;
        if (upcomingEventMedia.BGV() != null) {
            ProductImageContainer BGV = upcomingEventMedia.BGV();
            if (BGV != null) {
                treeUpdaterJNI2 = BGV.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("image", treeUpdaterJNI2);
        }
        if (upcomingEventMedia.BGx() != null) {
            ImageInfo BGx = upcomingEventMedia.BGx();
            if (BGx != null) {
                treeUpdaterJNI = BGx.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("image_versions2", treeUpdaterJNI);
        }
        if (upcomingEventMedia.getProductType() != null) {
            A1I.put("product_type", upcomingEventMedia.getProductType());
        }
        if (upcomingEventMedia.CF5() != null) {
            A1I.put("video_duration", upcomingEventMedia.CF5());
        }
        if (upcomingEventMedia.CFe() != null) {
            List CFe = upcomingEventMedia.CFe();
            if (CFe != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = CFe.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1W(arrayList, it);
                }
            }
            A1I.put("video_versions", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
