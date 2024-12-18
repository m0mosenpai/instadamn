package X;

import android.media.MediaPlayer;
import android.widget.VideoView;

/* loaded from: classes8.dex */
public final class LN1 implements MediaPlayer.OnCompletionListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LN1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.A00 != 0) {
            InterfaceC16820sZ interfaceC16820sZ = ((C4FE) this.A02).A07;
            if (interfaceC16820sZ != null && !AbstractC25231BEo.A1b(interfaceC16820sZ)) {
                ((VideoView) this.A01).start();
                return;
            }
            return;
        }
        ((InterfaceC16660sJ) this.A01).invoke(null);
        mediaPlayer.release();
        AbstractC25225BEi.A1U(this.A02, null);
    }
}
