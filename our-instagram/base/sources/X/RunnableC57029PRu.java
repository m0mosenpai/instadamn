package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.PRu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57029PRu implements Runnable {
    public final /* synthetic */ AudioOverlayTrack A00;
    public final /* synthetic */ C50870Me1 A01;

    public RunnableC57029PRu(AudioOverlayTrack audioOverlayTrack, C50870Me1 c50870Me1) {
        this.A01 = c50870Me1;
        this.A00 = audioOverlayTrack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50870Me1.A02(this.A00, this.A01);
    }
}
