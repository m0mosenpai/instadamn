package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.FormattedString;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39875HmO {
    public static Map A00(CreatorViewerSignalAudioDetails creatorViewerSignalAudioDetails) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (creatorViewerSignalAudioDetails.Ads() != null) {
            TrackOrOriginalSoundSchemaIntf Ads = creatorViewerSignalAudioDetails.Ads();
            if (Ads != null) {
                treeUpdaterJNI = Ads.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("audio_info", treeUpdaterJNI);
        }
        if (creatorViewerSignalAudioDetails.C3a() != null) {
            FormattedString C3a = creatorViewerSignalAudioDetails.C3a();
            if (C3a != null) {
                treeUpdaterJNI2 = C3a.F7o();
            }
            A1I.put("subtitle", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
