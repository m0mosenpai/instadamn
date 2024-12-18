package X;

import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.InspirationSignalType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39881HmU {
    public static Map A00(CreatorViewerSignalModel creatorViewerSignalModel) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (creatorViewerSignalModel.AxA() != null) {
            A1I.put("details", creatorViewerSignalModel.AxA().F7o());
        }
        if (creatorViewerSignalModel.BxI() != null) {
            InspirationSignalType BxI = creatorViewerSignalModel.BxI();
            C14360o3.A0B(BxI, 0);
            A1I.put("signal_type", BxI.A00);
        }
        if (creatorViewerSignalModel.getTitle() != null) {
            AbstractC37300Gc1.A17(creatorViewerSignalModel.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
