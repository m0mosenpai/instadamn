package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.CreatorViewerSignalDetails;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39877HmQ {
    public static Map A00(CreatorViewerSignalDetails creatorViewerSignalDetails) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (creatorViewerSignalDetails.Adm() != null) {
            CreatorViewerSignalAudioDetails Adm = creatorViewerSignalDetails.Adm();
            if (Adm != null) {
                treeUpdaterJNI2 = Adm.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("audio_details", treeUpdaterJNI2);
        }
        if (creatorViewerSignalDetails.Bdg() != null) {
            CreatorViewerSignalPlainDetails Bdg = creatorViewerSignalDetails.Bdg();
            if (Bdg != null) {
                treeUpdaterJNI = Bdg.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("plain_details", treeUpdaterJNI);
        }
        if (creatorViewerSignalDetails.Bm4() != null) {
            CreatorViewerSignalReelsTextDetails Bm4 = creatorViewerSignalDetails.Bm4();
            if (Bm4 != null) {
                treeUpdaterJNI3 = Bm4.F7o();
            }
            A1I.put("reels_text_details", treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
