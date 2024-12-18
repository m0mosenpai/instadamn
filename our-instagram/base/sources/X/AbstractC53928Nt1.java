package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Nt1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53928Nt1 {
    public static final OKn A00(AudioOverlayTrack audioOverlayTrack) {
        JIN A01;
        int i;
        C14360o3.A0B(audioOverlayTrack, 0);
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        boolean z = true;
        if (musicAssetModel == null || !musicAssetModel.A0U) {
            z = false;
        }
        if (z) {
            if (musicAssetModel != null) {
                A01 = AbstractC37963Gn5.A02(musicAssetModel);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (musicAssetModel != null) {
            A01 = AbstractC37963Gn5.A01(musicAssetModel);
        } else {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        JIN jin = A01;
        Integer num = C05F.A01;
        int i2 = audioOverlayTrack.A03;
        MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
        if (musicAssetModel2 != null) {
            i = musicAssetModel2.A00;
        } else {
            i = audioOverlayTrack.A02;
        }
        return new OKn(jin, num, i2, i);
    }
}
