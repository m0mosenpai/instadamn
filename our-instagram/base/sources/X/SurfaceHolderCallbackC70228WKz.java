package X;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.widget.VideoView;
import java.lang.reflect.Field;

/* renamed from: X.WKz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class SurfaceHolderCallbackC70228WKz implements SurfaceHolder.Callback {
    public final /* synthetic */ SurfaceHolder.Callback A00;
    public final /* synthetic */ VideoView A01;
    public final /* synthetic */ C4FE A02;
    public final /* synthetic */ Field A03;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C14360o3.A0B(surfaceHolder, 0);
        this.A00.surfaceChanged(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C14360o3.A0B(surfaceHolder, 0);
        if (C18U.A06(C06090Tz.A05, this.A02.A02, 36325952921351709L)) {
            C14120nc.A00().ATO(new V6Q(this.A00, surfaceHolder));
        } else {
            this.A00.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer;
        C14360o3.A0B(surfaceHolder, 0);
        Field field = this.A03;
        VideoView videoView = this.A01;
        Object obj = field.get(videoView);
        if ((obj instanceof MediaPlayer) && (mediaPlayer = (MediaPlayer) obj) != null) {
            field.set(videoView, new C66325U8y(mediaPlayer));
        }
        this.A00.surfaceDestroyed(surfaceHolder);
    }

    public SurfaceHolderCallbackC70228WKz(SurfaceHolder.Callback callback, VideoView videoView, C4FE c4fe, Field field) {
        this.A00 = callback;
        this.A02 = c4fe;
        this.A03 = field;
        this.A01 = videoView;
    }
}
