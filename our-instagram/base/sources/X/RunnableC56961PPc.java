package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.Arrays;

/* renamed from: X.PPc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56961PPc implements Runnable {
    public final /* synthetic */ C51996Myi A00;
    public final /* synthetic */ boolean A01;

    public RunnableC56961PPc(C51996Myi c51996Myi, boolean z) {
        this.A00 = c51996Myi;
        this.A01 = z;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, X.9vC] */
    @Override // java.lang.Runnable
    public final void run() {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        C51996Myi c51996Myi = this.A00;
        boolean z = c51996Myi.A04;
        boolean z2 = this.A01;
        if (z != z2) {
            C54580O9h c54580O9h = c51996Myi.A09;
            OMu oMu = c54580O9h.A00;
            if (z2) {
                oMu.A03();
                OWW oww = c54580O9h.A02;
                oww.A05.A00("requesting audio focus for call", new Object[0]);
                oww.A01();
                oww.A02();
                SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setUsage(2);
                builder.setContentType(1);
                AudioAttributesCompat A0M = AbstractC50522MSa.A0M(builder);
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = oww.A02;
                ?? obj = new Object();
                obj.A03 = AH6.A05;
                obj.A00 = 2;
                obj.A01(onAudioFocusChangeListener);
                obj.A03 = A0M;
                AH6 A00 = obj.A00();
                oww.A01 = A00;
                if (!OWW.A00(A00, oww)) {
                    c54580O9h.A01.A00("Failed to acquire audio focus.", new Object[0]);
                }
                EnumC53129Nei enumC53129Nei = EnumC53129Nei.A03;
                if (oMu instanceof N09) {
                    N09 n09 = (N09) oMu;
                    C14360o3.A0B(enumC53129Nei, 0);
                    n09.aomAudioModeState = enumC53129Nei;
                    AbstractRunnableC56835PKf.A00(n09, n09.A00(), false);
                    C55124Obl c55124Obl = n09.audioRecordMonitor;
                    if (c55124Obl.A04.A00 != null) {
                        Handler handler = c55124Obl.A03;
                        Runnable runnable = c55124Obl.A05;
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    }
                }
            } else {
                if (oMu instanceof N09) {
                    N09 n092 = (N09) oMu;
                    n092.A09.A05.A02();
                    AudioManager audioManager = ((OMu) n092).A02;
                    if (false != audioManager.isMicrophoneMute()) {
                        try {
                            audioManager.setMicrophoneMute(false);
                            n092.audioManagerQplLogger.Cnc("set_microphone_mute", String.valueOf(false));
                        } catch (SecurityException e) {
                            C0K8.A0L("RtcAudioOutputManagerBase", "Exception when calling AudioManager#setMicrophoneMute", e, Arrays.copyOf(new Object[0], 0));
                        }
                    }
                    OMO omo = ((OMu) n092).A06;
                    omo.A02(false);
                    int i = n092.aomSavedAudioMode;
                    if (i != -2) {
                        AbstractRunnableC56835PKf.A00(n092, i, true);
                    }
                    n092.A08.A00(null);
                    if (n092.A00 != null && n092.A04) {
                        n092.A04 = false;
                        n092.A07.post(new PL4(n092));
                    }
                    BroadcastReceiver broadcastReceiver = ((OMu) n092).A00;
                    if (broadcastReceiver != null) {
                        ((OMu) n092).A01.unregisterReceiver(broadcastReceiver);
                        ((OMu) n092).A00 = null;
                    }
                    omo.A01(((OMu) n092).A01);
                } else {
                    N08 n08 = (N08) oMu;
                    AudioManager audioManager2 = ((OMu) n08).A02;
                    audioManager2.setMicrophoneMute(false);
                    if (audioManager2.isSpeakerphoneOn()) {
                        n08.A08(EnumC53278NhG.A03);
                    }
                    n08.A03.A00(null);
                    BroadcastReceiver broadcastReceiver2 = ((OMu) n08).A00;
                    if (broadcastReceiver2 != null) {
                        ((OMu) n08).A01.unregisterReceiver(broadcastReceiver2);
                        ((OMu) n08).A00 = null;
                    }
                    if (n08.A00 != null && (bluetoothManager = (BluetoothManager) n08.A06.getValue()) != null && (adapter = bluetoothManager.getAdapter()) != null) {
                        adapter.closeProfileProxy(1, n08.A00);
                    }
                }
                c54580O9h.A02.A01();
                oMu.A02();
            }
            RunnableC56960PPb runnableC56960PPb = new RunnableC56960PPb(c51996Myi, z2);
            if (c51996Myi.A00 != null) {
                runnableC56960PPb.run();
            } else {
                c51996Myi.A0B.add(runnableC56960PPb);
            }
            c51996Myi.A04 = z2;
        }
    }
}
