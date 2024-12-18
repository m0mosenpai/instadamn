package X;

import android.media.MediaRecorder;

/* loaded from: classes12.dex */
public final class Y87 implements MediaRecorder.OnInfoListener {
    public final /* synthetic */ C73407YBt A00;

    public Y87(C73407YBt c73407YBt) {
        this.A00 = c73407YBt;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        this.A00.A01.DSC(mediaRecorder, i, i2, false);
    }
}
