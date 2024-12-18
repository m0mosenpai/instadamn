package X;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.telecom.CallAudioState;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public abstract class OMu {
    public BroadcastReceiver A00;
    public final Context A01;
    public final AudioManager A02;
    public final C53738Npq A04;
    public final C55000OUz A05;
    public final OMO A06;
    public final C54156Nws A07;
    public final OEF A09;
    public final ExecutorService A0A;
    public EnumC53129Nei aomAudioModeState;
    public volatile EnumC53278NhG aomCurrentAudioOutput;
    public boolean aomDisableEarpieceMode;
    public volatile boolean aomIsHeadsetAttached;
    public int aomSavedAudioMode;
    public volatile boolean aomShouldSpeakerOnHeadsetUnplug;
    public final C55739Op8 audioManagerQplLogger;
    public final C55124Obl audioRecordMonitor;
    public final C012504o A03 = new C012504o(0);
    public final O1W A08 = new O1W(this);

    public void A04() {
        this.aomShouldSpeakerOnHeadsetUnplug = false;
        this.aomIsHeadsetAttached = false;
        this.aomAudioModeState = EnumC53129Nei.A04;
        OEF oef = this.A09;
        C50739Mat c50739Mat = oef.A00;
        if (c50739Mat != null) {
            oef.A03.unregisterContentObserver(c50739Mat);
        }
        oef.A00 = null;
        oef.A02 = null;
        OMO omo = this.A06;
        AudioDeviceCallback audioDeviceCallback = omo.A00;
        if (audioDeviceCallback != null) {
            this.A02.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        omo.A00 = null;
    }

    public final int A00() {
        int ordinal = this.aomAudioModeState.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2 && ordinal != 0) {
            throw new IllegalStateException();
        }
        return 3;
    }

    public final EnumC53278NhG A01() {
        CallAudioState callAudioState;
        int route;
        if (this instanceof N09) {
            return this.aomCurrentAudioOutput;
        }
        C50758MbO A01 = C1W6.A01(((N08) this).A05);
        if (A01 != null && (callAudioState = A01.getCallAudioState()) != null && (route = callAudioState.getRoute()) != 1) {
            if (route != 2) {
                if (route != 4) {
                    if (route != 5 && route == 8) {
                        return EnumC53278NhG.A05;
                    }
                } else {
                    return EnumC53278NhG.A04;
                }
            } else {
                return EnumC53278NhG.A02;
            }
        }
        return EnumC53278NhG.A03;
    }

    public void A02() {
        C55124Obl c55124Obl = this.audioRecordMonitor;
        if (c55124Obl.A04.A00 != null) {
            C55124Obl.A00(c55124Obl, "system_info_on_call_end");
            c55124Obl.A03.removeCallbacks(c55124Obl.A05);
            AudioManager.AudioRecordingCallback audioRecordingCallback = c55124Obl.A00;
            if (audioRecordingCallback != null) {
                c55124Obl.A02.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
        }
        this.audioManagerQplLogger.AW1();
        C53738Npq c53738Npq = this.A04;
        if (c53738Npq instanceof N0A) {
            if (C18U.A06(C06090Tz.A05, ((N0A) c53738Npq).A00, 36316151806300173L)) {
                OEF oef = this.A09;
                C50739Mat c50739Mat = oef.A00;
                if (c50739Mat != null) {
                    oef.A03.unregisterContentObserver(c50739Mat);
                }
                oef.A00 = null;
                oef.A02 = null;
            }
        }
        OMO omo = this.A06;
        AudioDeviceCallback audioDeviceCallback = omo.A00;
        if (audioDeviceCallback != null) {
            this.A02.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        omo.A00 = null;
    }

    public void A03() {
        this.audioManagerQplLogger.AWC();
        this.aomDisableEarpieceMode = false;
        this.aomIsHeadsetAttached = this.A02.isWiredHeadsetOn();
    }

    public final void A05() {
        Iterator it = AbstractC166987dD.A1F(this.A03).iterator();
        while (it.hasNext()) {
            ((OHJ) it.next()).A00();
        }
    }

    public final void A06() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        C50734Man c50734Man = new C50734Man(this);
        this.A00 = c50734Man;
        C0DJ.A00(c50734Man, this.A01, intentFilter);
        C55124Obl c55124Obl = this.audioRecordMonitor;
        if (c55124Obl.A04.A00 != null) {
            C55124Obl.A00(c55124Obl, "system_info_on_init_call");
            C55124Obl.A02(c55124Obl, "recording_configs_on_init", null);
            AudioManager.AudioRecordingCallback audioRecordingCallback = c55124Obl.A00;
            if (audioRecordingCallback != null) {
                c55124Obl.A02.registerAudioRecordingCallback(audioRecordingCallback, null);
            }
        }
    }

    public final void A07() {
        OEF oef = this.A09;
        O1W o1w = this.A08;
        C14360o3.A0B(o1w, 0);
        if (oef.A00 != null) {
            C0K8.A0P("VolumeChangeAnnouncer", "Observer already registered", Arrays.copyOf(new Object[0], 0));
            return;
        }
        C50739Mat c50739Mat = new C50739Mat(AbstractC167007dF.A0J(), o1w, oef);
        oef.A03.registerContentObserver(Settings.System.CONTENT_URI, true, c50739Mat);
        oef.A00 = c50739Mat;
    }

    public final void A08(EnumC53278NhG enumC53278NhG) {
        BluetoothDevice bluetoothDevice;
        CallAudioState callAudioState;
        Collection<BluetoothDevice> supportedBluetoothDevices;
        int i;
        if (this instanceof N09) {
            N09 n09 = (N09) this;
            C14360o3.A0B(enumC53278NhG, 0);
            ((OMu) n09).A05.A00("changeAudio to %s", enumC53278NhG);
            n09.audioManagerQplLogger.Cnc("change_audio", String.valueOf(enumC53278NhG));
            AbstractRunnableC56835PKf.A00(n09, n09.A00(), false);
            int ordinal = enumC53278NhG.ordinal();
            if (ordinal != 2) {
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 3) {
                            throw B4Z.A00();
                        }
                    } else {
                        C55038OZk c55038OZk = n09.A09;
                        int i2 = c55038OZk.A05.A00;
                        if (i2 == 1 || i2 == 2) {
                            C55038OZk.A01(c55038OZk, true);
                        }
                        ((OMu) n09).A06.A02(true);
                        n09.A0D = true;
                    }
                } else if (!n09.aomIsHeadsetAttached && n09.aomDisableEarpieceMode) {
                    return;
                }
                C55038OZk c55038OZk2 = n09.A09;
                int i3 = c55038OZk2.A05.A00;
                if (i3 == 1 || i3 == 2) {
                    C55038OZk.A01(c55038OZk2, true);
                }
                ((OMu) n09).A06.A02(false);
                n09.A0D = false;
            } else {
                C55038OZk c55038OZk3 = n09.A09;
                C55100ObB c55100ObB = c55038OZk3.A05;
                if (c55100ObB.A05() && (i = c55100ObB.A00) != 1 && i != 2) {
                    C55038OZk.A00(c55038OZk3);
                }
            }
            Thread currentThread = Thread.currentThread();
            Handler handler = n09.A07;
            if (C14360o3.A0K(currentThread, handler.getLooper().getThread())) {
                n09.A0D();
                return;
            } else {
                handler.post(new PL3(n09));
                return;
            }
        }
        N08 n08 = (N08) this;
        C14360o3.A0B(enumC53278NhG, 0);
        ((OMu) n08).A05.A00("changeAudio to %s", enumC53278NhG);
        n08.audioManagerQplLogger.Cnc("change_audio", String.valueOf(enumC53278NhG));
        C1W6 c1w6 = n08.A05;
        int ordinal2 = enumC53278NhG.ordinal();
        int i4 = 4;
        if (ordinal2 != 2) {
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 3) {
                        throw B4Z.A00();
                    }
                } else {
                    i4 = 8;
                }
            } else {
                i4 = 1;
            }
        } else {
            i4 = 2;
        }
        C50758MbO A01 = C1W6.A01(c1w6);
        if (A01 != null && (callAudioState = A01.getCallAudioState()) != null && (supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices()) != null) {
            bluetoothDevice = (BluetoothDevice) AbstractC001800i.A0A(supportedBluetoothDevices);
        } else {
            bluetoothDevice = null;
        }
        if (i4 == 2 && bluetoothDevice != null) {
            A01.requestBluetoothAudio(bluetoothDevice);
        } else if (A01 != null) {
            A01.setAudioRoute(i4);
        }
    }

    public final void A09(boolean z) {
        EnumC53278NhG enumC53278NhG;
        this.A05.A00("setSpeakerphone: %s", Boolean.valueOf(z));
        this.audioManagerQplLogger.Cnc("set_speakerphone", String.valueOf(z));
        if (z) {
            enumC53278NhG = EnumC53278NhG.A05;
        } else if (this.aomIsHeadsetAttached) {
            enumC53278NhG = EnumC53278NhG.A04;
        } else {
            enumC53278NhG = EnumC53278NhG.A03;
        }
        A08(enumC53278NhG);
        this.aomShouldSpeakerOnHeadsetUnplug = z;
    }

    public final boolean A0A() {
        CallAudioState callAudioState;
        if (this instanceof N09) {
            return AbstractC167007dF.A1X(this.aomCurrentAudioOutput, EnumC53278NhG.A03);
        }
        C50758MbO A01 = C1W6.A01(((N08) this).A05);
        if (A01 != null && (callAudioState = A01.getCallAudioState()) != null && callAudioState.getRoute() != 1) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        CallAudioState callAudioState;
        if (this instanceof N09) {
            return AbstractC167007dF.A1X(this.aomCurrentAudioOutput, EnumC53278NhG.A05);
        }
        C50758MbO A01 = C1W6.A01(((N08) this).A05);
        if (A01 != null && (callAudioState = A01.getCallAudioState()) != null && callAudioState.getRoute() == 8) {
            return true;
        }
        return false;
    }

    public OMu(Context context, AudioManager audioManager, C53738Npq c53738Npq, InterfaceC58103PpS interfaceC58103PpS, C55000OUz c55000OUz, OMO omo, C54156Nws c54156Nws, ExecutorService executorService) {
        this.A01 = context;
        this.A07 = c54156Nws;
        this.A02 = audioManager;
        this.A05 = c55000OUz;
        this.A0A = executorService;
        this.A04 = c53738Npq;
        this.A06 = omo;
        C55739Op8 c55739Op8 = new C55739Op8(interfaceC58103PpS);
        this.audioManagerQplLogger = c55739Op8;
        this.A09 = new OEF(context, audioManager, c53738Npq, c55000OUz, executorService);
        this.audioRecordMonitor = new C55124Obl(context, audioManager, c55739Op8, c55000OUz, executorService);
        this.aomSavedAudioMode = -2;
        this.aomCurrentAudioOutput = EnumC53278NhG.A03;
        this.aomAudioModeState = EnumC53129Nei.A04;
    }
}
