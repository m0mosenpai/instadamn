package X;

import com.instagram.api.schemas.WorldLocationPagesInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hwm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40457Hwm {
    public static Map A00(WorldLocationPagesInfo worldLocationPagesInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (worldLocationPagesInfo.getCoverPhoto() != null) {
            A1I.put("cover_photo", worldLocationPagesInfo.getCoverPhoto());
        }
        if (worldLocationPagesInfo.Ber() != null) {
            A1I.put("post_count", worldLocationPagesInfo.Ber());
        }
        if (worldLocationPagesInfo.getWorldId() != null) {
            A1I.put("world_id", worldLocationPagesInfo.getWorldId());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
