package X;

import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;

/* loaded from: classes9.dex */
public final class PPR implements Runnable {
    public final /* synthetic */ AndroidAudioRecorder A00;
    public final /* synthetic */ O6E A01;

    public PPR(AndroidAudioRecorder androidAudioRecorder, O6E o6e) {
        this.A00 = androidAudioRecorder;
        this.A01 = o6e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.release();
        C11T.A02(new RunnableC56956POx(this.A01.A00));
    }
}
