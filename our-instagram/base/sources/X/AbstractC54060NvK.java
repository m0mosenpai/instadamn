package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.NvK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54060NvK {
    public static final AudioOverlayTrack A00(JIN jin, int i) {
        MusicAssetModel A02 = MusicAssetModel.A02(jin);
        return new AudioOverlayTrack(A02, AbstractC54061NvL.A00(A02.A00, i, A02.A0J), i);
    }
}
