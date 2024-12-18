package X;

import android.media.MediaPlayer;
import android.os.Handler;
import java.lang.reflect.Field;

/* renamed from: X.U8y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66325U8y extends MediaPlayer {
    public final MediaPlayer A00;

    @Override // android.media.MediaPlayer
    public final void reset() {
        try {
            Field declaredField = MediaPlayer.class.getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.A00);
            C14360o3.A0C(obj, "null cannot be cast to non-null type android.os.Handler");
            ((Handler) obj).removeCallbacksAndMessages(null);
        } catch (Exception e) {
            C0w9.A03("CustomMediaPlayer", AnonymousClass001.A0R("Error during reflection on MediaPlayer: ", e.getMessage()));
        }
    }

    public C66325U8y(MediaPlayer mediaPlayer) {
        this.A00 = mediaPlayer;
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        C14120nc.A00().ATO(new V6A(this));
    }
}
