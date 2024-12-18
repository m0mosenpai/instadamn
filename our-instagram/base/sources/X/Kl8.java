package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* loaded from: classes8.dex */
public abstract class Kl8 {
    public static final C45506KCv A00(UserSession userSession, C8BU c8bu, AudioOverlayTrack audioOverlayTrack, boolean z) {
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("is_existing_track", z);
        A05.putParcelable("selected_audio_track", audioOverlayTrack);
        C45506KCv c45506KCv = new C45506KCv();
        c45506KCv.setArguments(A05);
        c45506KCv.A00 = c8bu;
        return c45506KCv;
    }
}
