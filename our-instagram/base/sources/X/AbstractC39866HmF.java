package X;

import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39866HmF {
    public static Map A00(CreatorViewerBottomCTA creatorViewerBottomCTA) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (creatorViewerBottomCTA.AhZ() != null) {
            CreatorViewerBottomCTAType AhZ = creatorViewerBottomCTA.AhZ();
            C14360o3.A0B(AhZ, 0);
            A1I.put("bottom_cta_type", AhZ.A00);
        }
        if (creatorViewerBottomCTA.getText() != null) {
            AbstractC37300Gc1.A15(creatorViewerBottomCTA.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
