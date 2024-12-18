package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HwG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40425HwG {
    public static Map A00(TrackOrOriginalSoundSchemaIntf trackOrOriginalSoundSchemaIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (trackOrOriginalSoundSchemaIntf.BTR() != null) {
            TrackMetadata BTR = trackOrOriginalSoundSchemaIntf.BTR();
            if (BTR != null) {
                treeUpdaterJNI2 = BTR.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("metadata", treeUpdaterJNI2);
        }
        if (trackOrOriginalSoundSchemaIntf.BZv() != null) {
            OriginalSoundDataIntf BZv = trackOrOriginalSoundSchemaIntf.BZv();
            if (BZv != null) {
                treeUpdaterJNI = BZv.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("original_sound", treeUpdaterJNI);
        }
        if (trackOrOriginalSoundSchemaIntf.CA8() != null) {
            TrackData CA8 = trackOrOriginalSoundSchemaIntf.CA8();
            if (CA8 != null) {
                treeUpdaterJNI3 = CA8.F7o();
            }
            A1I.put("track", treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
