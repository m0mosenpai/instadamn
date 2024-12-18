package X;

import android.media.AudioManager;
import java.util.List;

/* loaded from: classes9.dex */
public final class Mb6 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ C55007OVp A00;

    public Mb6(C55007OVp c55007OVp) {
        this.A00 = c55007OVp;
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List list) {
        super.onRecordingConfigChanged(list);
        C55007OVp.A00(this.A00);
    }
}
