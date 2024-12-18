package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.FormattedString;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39885HmY {
    public static Map A00(CreatorViewerSignalReelsTextDetails creatorViewerSignalReelsTextDetails) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (creatorViewerSignalReelsTextDetails.C3a() != null) {
            FormattedString C3a = creatorViewerSignalReelsTextDetails.C3a();
            if (C3a != null) {
                treeUpdaterJNI = C3a.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subtitle", treeUpdaterJNI);
        }
        if (creatorViewerSignalReelsTextDetails.C6K() != null) {
            ClipsTextFormatType C6K = creatorViewerSignalReelsTextDetails.C6K();
            if (C6K != null) {
                str = C6K.A00;
            }
            A1I.put("text_format_type", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
