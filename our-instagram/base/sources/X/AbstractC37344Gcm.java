package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gcm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37344Gcm {
    public static Map A00(ImageInfo imageInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = null;
        if (imageInfo.AZl() != null) {
            AdditionalCandidates AZl = imageInfo.AZl();
            if (AZl != null) {
                treeUpdaterJNI3 = AZl.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            linkedHashMap.put("additional_candidates", treeUpdaterJNI3);
        }
        if (imageInfo.Abq() != null) {
            SpriteSheetInfoCandidates Abq = imageInfo.Abq();
            if (Abq != null) {
                treeUpdaterJNI2 = Abq.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("animated_thumbnail_spritesheet_info_candidates", treeUpdaterJNI2);
        }
        if (imageInfo.AlQ() != null) {
            List<ExtendedImageUrl> AlQ = imageInfo.AlQ();
            if (AlQ != null) {
                arrayList = new ArrayList();
                for (ExtendedImageUrl extendedImageUrl : AlQ) {
                    if (extendedImageUrl != null) {
                        arrayList.add(extendedImageUrl.A00());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("candidates", arrayList);
        }
        if (imageInfo.Br7() != null) {
            SpriteSheetInfoCandidates Br7 = imageInfo.Br7();
            if (Br7 != null) {
                treeUpdaterJNI = Br7.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("scrubber_spritesheet_info_candidates", treeUpdaterJNI);
        }
        if (imageInfo.BzD() != null) {
            List<ExtendedImageUrl> BzD = imageInfo.BzD();
            if (BzD != null) {
                arrayList2 = new ArrayList();
                for (ExtendedImageUrl extendedImageUrl2 : BzD) {
                    if (extendedImageUrl2 != null) {
                        arrayList2.add(extendedImageUrl2.A00());
                    }
                }
            }
            linkedHashMap.put("spins_underlying_media_candidates", arrayList2);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
