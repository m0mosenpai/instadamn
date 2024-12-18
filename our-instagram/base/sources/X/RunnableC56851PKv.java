package X;

import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import java.util.Arrays;

/* renamed from: X.PKv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56851PKv implements Runnable {
    public final /* synthetic */ AndroidAudioRecorder A00;

    public RunnableC56851PKv(AndroidAudioRecorder androidAudioRecorder) {
        this.A00 = androidAudioRecorder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidAudioRecorder androidAudioRecorder = this.A00;
        C53701Noq c53701Noq = AndroidAudioRecorder.Companion;
        if (androidAudioRecorder.isRecordingAudioData.get()) {
            C55219Oei.A02("mss:AndroidAudioRecorder", "Audio recording already started!", null, Arrays.copyOf(new Object[0], 0));
        } else {
            androidAudioRecorder.prepare();
            AndroidAudioRecorder.access$startAudioRecordingInternal(androidAudioRecorder);
        }
    }
}
