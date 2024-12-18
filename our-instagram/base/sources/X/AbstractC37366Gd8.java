package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gd8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37366Gd8 {
    public static Map A00(C3XR c3xr) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (c3xr.BVc() != null) {
            MusicInfo BVc = c3xr.BVc();
            if (BVc != null) {
                treeUpdaterJNI = BVc.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("music_info", treeUpdaterJNI);
        }
        if (c3xr.BZw() != null) {
            OriginalSoundDataIntf BZw = c3xr.BZw();
            if (BZw != null) {
                treeUpdaterJNI2 = BZw.F7o();
            }
            linkedHashMap.put("original_sound_info", treeUpdaterJNI2);
        }
        if (c3xr.BdH() != null) {
            linkedHashMap.put("pinned_media_ids", c3xr.BdH());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
