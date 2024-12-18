package X;

import com.instagram.api.schemas.CreatorViewerSignalInfo;
import com.instagram.api.schemas.CreatorViewerSignalType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39879HmS {
    public static Map A00(CreatorViewerSignalInfo creatorViewerSignalInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (creatorViewerSignalInfo.BxH() != null) {
            CreatorViewerSignalType BxH = creatorViewerSignalInfo.BxH();
            C14360o3.A0B(BxH, 0);
            A1I.put("signal_type", BxH.A00);
        }
        if (creatorViewerSignalInfo.getText() != null) {
            AbstractC37300Gc1.A15(creatorViewerSignalInfo.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
