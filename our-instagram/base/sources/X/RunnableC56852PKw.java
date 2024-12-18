package X;

import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;

/* renamed from: X.PKw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56852PKw implements Runnable {
    public final /* synthetic */ AndroidAudioRecorder A00;

    public RunnableC56852PKw(AndroidAudioRecorder androidAudioRecorder) {
        this.A00 = androidAudioRecorder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidAudioRecorder.access$restartRecorder(this.A00);
    }
}
