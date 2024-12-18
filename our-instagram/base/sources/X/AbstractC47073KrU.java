package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.KrU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47073KrU {
    public static final Bundle A00(UserSession userSession, MusicAssetModel musicAssetModel) {
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("music_profile_should_open_for_editing", true);
        A05.putParcelable("music_profile_open_for_editing_audio_track", new AudioOverlayTrack(musicAssetModel, musicAssetModel.A05(), musicAssetModel.A00));
        return A05;
    }
}
