package X;

import com.facebook.rsys.audio.gen.AudioApi;

/* renamed from: X.PPb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56960PPb implements Runnable {
    public final /* synthetic */ C51996Myi A00;
    public final /* synthetic */ boolean A01;

    public RunnableC56960PPb(C51996Myi c51996Myi, boolean z) {
        this.A00 = c51996Myi;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioApi audioApi = this.A00.A00;
        if (audioApi != null) {
            int i = 0;
            if (this.A01) {
                i = 2;
            }
            audioApi.setAudioActivationState(i);
        }
    }
}
