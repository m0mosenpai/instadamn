package X;

import android.media.AudioManager;
import java.util.List;

/* loaded from: classes9.dex */
public final class Mb4 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ C55124Obl A00;

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List list) {
        C14360o3.A0B(list, 0);
        super.onRecordingConfigChanged(list);
        C55124Obl.A02(this.A00, "recording_configs_changed", list);
    }

    public Mb4(C55124Obl c55124Obl) {
        this.A00 = c55124Obl;
    }
}
