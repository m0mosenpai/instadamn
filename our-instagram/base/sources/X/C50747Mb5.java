package X;

import android.media.AudioManager;
import java.util.List;

/* renamed from: X.Mb5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50747Mb5 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ C55193Odz A00;

    public C50747Mb5(C55193Odz c55193Odz) {
        this.A00 = c55193Odz;
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List list) {
        super.onRecordingConfigChanged(list);
        C55193Odz.A03(this.A00);
    }
}
