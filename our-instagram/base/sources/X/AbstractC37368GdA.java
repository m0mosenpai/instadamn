package X;

import com.instagram.api.schemas.MusicInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37368GdA {
    public static Map A00(MusicInfo musicInfo) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (musicInfo.BVV() != null) {
            A1I.put("music_asset_info", musicInfo.BVV().F7o());
        }
        if (musicInfo.BVZ() != null) {
            A1I.put("music_canonical_id", musicInfo.BVZ());
        }
        if (musicInfo.BVa() != null) {
            A1I.put("music_consumption_info", musicInfo.BVa().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
