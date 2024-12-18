package X;

import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Gme, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37941Gme {
    public static final MusicAssetModel A00(TrackData trackData) {
        if (trackData != null) {
            return MusicAssetModel.A01(trackData, false);
        }
        return null;
    }
}
