package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* loaded from: classes9.dex */
public final class PQH implements Runnable {
    public final /* synthetic */ C47705L4m A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public PQH(C47705L4m c47705L4m, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = c47705L4m;
        this.A01 = audioOverlayTrack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C54839OLy) this.A00.A04.getValue()).A02(this.A01);
    }
}
