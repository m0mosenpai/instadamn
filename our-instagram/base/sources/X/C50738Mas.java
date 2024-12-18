package X;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.Mas, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50738Mas extends ContentObserver {
    public final AudioManager A00;

    public C50738Mas(AudioManager audioManager, Handler handler) {
        super(handler);
        this.A00 = audioManager;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        super.onChange(z, uri);
        String path = uri.getPath();
        if (path != null && path.contains("/volume_music_")) {
            AudioManager audioManager = this.A00;
            audioManager.getStreamVolume(3);
            audioManager.getStreamMaxVolume(3);
        }
    }
}
