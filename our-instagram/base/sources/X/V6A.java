package X;

import android.media.MediaPlayer;

/* loaded from: classes11.dex */
public final class V6A extends AbstractRunnableC14200nk {
    public final /* synthetic */ C66325U8y A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6A(C66325U8y c66325U8y) {
        super(957719190, 2, false, false);
        this.A00 = c66325U8y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer mediaPlayer = this.A00.A00;
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}
