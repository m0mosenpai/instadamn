package X;

import com.instagram.ui.widget.volume.VolumeIndicator;

/* loaded from: classes8.dex */
public final class M2V implements Runnable {
    public final /* synthetic */ VolumeIndicator A00;

    public M2V(VolumeIndicator volumeIndicator) {
        this.A00 = volumeIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VolumeIndicator volumeIndicator = this.A00;
        volumeIndicator.animate().setDuration(300L).setListener(new C46074KaV(volumeIndicator, 9)).alpha(0.0f);
    }
}
