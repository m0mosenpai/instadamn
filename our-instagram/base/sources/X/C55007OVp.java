package X;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Handler;
import java.util.Collection;
import java.util.List;

/* renamed from: X.OVp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55007OVp {
    public InterfaceC16660sJ A00;
    public boolean A01;
    public final Handler A02 = AbstractC167007dF.A0J();
    public final InterfaceC09390do A03 = C57548PgM.A00(this, 12);
    public final AudioManager A04;

    public static final void A00(C55007OVp c55007OVp) {
        List<AudioRecordingConfiguration> activeRecordingConfigurations = c55007OVp.A04.getActiveRecordingConfigurations();
        C14360o3.A07(activeRecordingConfigurations);
        boolean z = true;
        if (!(activeRecordingConfigurations instanceof Collection) || !activeRecordingConfigurations.isEmpty()) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : activeRecordingConfigurations) {
                if (audioRecordingConfiguration.isClientSilenced() && (audioRecordingConfiguration.getClientAudioSource() == 7 || audioRecordingConfiguration.getClientAudioSource() == 6)) {
                    break;
                }
            }
        }
        z = false;
        boolean z2 = c55007OVp.A01;
        c55007OVp.A01 = z;
        if (z2 != z) {
            c55007OVp.A02.postDelayed(new RunnableC56908PNb(c55007OVp), 500L);
        }
    }

    public final void A01(InterfaceC16660sJ interfaceC16660sJ) {
        AudioManager audioManager = this.A04;
        InterfaceC09390do interfaceC09390do = this.A03;
        AudioManager.AudioRecordingCallback audioRecordingCallback = (AudioManager.AudioRecordingCallback) interfaceC09390do.getValue();
        if (interfaceC16660sJ != null) {
            audioManager.registerAudioRecordingCallback(audioRecordingCallback, this.A02);
            ((AudioManager.AudioRecordingCallback) interfaceC09390do.getValue()).onRecordingConfigChanged(audioManager.getActiveRecordingConfigurations());
        } else {
            audioManager.unregisterAudioRecordingCallback(audioRecordingCallback);
        }
        this.A00 = interfaceC16660sJ;
        if (interfaceC16660sJ != null) {
            AbstractC25227BEk.A1Q(interfaceC16660sJ, this.A01);
        }
    }

    public C55007OVp(Context context) {
        this.A04 = AbstractC50522MSa.A0E(context);
    }
}
