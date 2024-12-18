package X;

import android.view.View;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.Ozs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56331Ozs implements MOW {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ClipsEditMetadataController A01;

    @Override // X.MOW
    public final void Dun(AudioOverlayTrack audioOverlayTrack) {
        MusicAssetModel musicAssetModel;
        if (audioOverlayTrack != null) {
            musicAssetModel = audioOverlayTrack.A08;
        } else {
            musicAssetModel = null;
        }
        ClipsEditMetadataController clipsEditMetadataController = this.A01;
        clipsEditMetadataController.A0H = musicAssetModel != null ? AbstractC50522MSa.A0Y(MusicProduct.A07, audioOverlayTrack, musicAssetModel, clipsEditMetadataController.A14) : null;
        C54839OLy c54839OLy = clipsEditMetadataController.A0B;
        if (c54839OLy != null) {
            c54839OLy.A01(this.A00, false);
        }
        ClipsEditMetadataController.A0C(clipsEditMetadataController);
    }

    public C56331Ozs(View view, ClipsEditMetadataController clipsEditMetadataController) {
        this.A01 = clipsEditMetadataController;
        this.A00 = view;
    }
}
