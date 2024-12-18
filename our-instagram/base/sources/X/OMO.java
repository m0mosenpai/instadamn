package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Build;
import java.util.List;

/* loaded from: classes9.dex */
public final class OMO {
    public AudioDeviceCallback A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public final AudioManager A04;
    public final BroadcastReceiver A05;
    public final String A06;

    public OMO(AudioManager audioManager) {
        C14360o3.A0B(audioManager, 1);
        this.A04 = audioManager;
        this.A05 = new C50735Mao(this);
        this.A06 = "FbAudioManager";
        this.A01 = AbstractC166987dD.A1E();
    }

    public final synchronized void A00(Context context) {
        if (Build.VERSION.SDK_INT >= 29 && !this.A03) {
            this.A02 = this.A04.isSpeakerphoneOn();
            C0DJ.A00(this.A05, context, new IntentFilter("android.media.action.SPEAKERPHONE_STATE_CHANGED"));
            this.A03 = true;
        }
    }

    public final synchronized void A01(Context context) {
        if (Build.VERSION.SDK_INT >= 29 && this.A03) {
            context.unregisterReceiver(this.A05);
            this.A03 = false;
        }
    }

    public final synchronized void A02(boolean z) {
        this.A04.setSpeakerphoneOn(z);
        this.A02 = z;
    }

    public final synchronized boolean A03() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29 && this.A03) {
            z = this.A02;
        } else {
            try {
                z = this.A04.isSpeakerphoneOn();
            } catch (Exception e) {
                C0K8.A0F(this.A06, "audioManager.isSpeakerphoneOn failed with exception", e);
                z = false;
            }
        }
        return z;
    }
}
