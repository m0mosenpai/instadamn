package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.ObB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55100ObB {
    public int A00;
    public BluetoothHeadset A01;
    public BroadcastReceiver A02;
    public AudioDeviceCallback A03;
    public boolean A04;
    public BluetoothAdapter A05;
    public final Context A06;
    public final C53738Npq A07;
    public final BluetoothProfile.ServiceListener A08;
    public final BroadcastReceiver A09;
    public final AudioManager A0A;
    public final InterfaceC58103PpS A0B;
    public final C55000OUz A0C;
    public final OMO A0D;
    public final C12W A0E;
    public final C19L A0F;
    public volatile OGv A0G;

    public C55100ObB(Context context, AudioManager audioManager, C53738Npq c53738Npq, InterfaceC58103PpS interfaceC58103PpS, C55000OUz c55000OUz, C12W c12w) {
        C14360o3.A0B(audioManager, 2);
        this.A06 = context;
        this.A07 = c53738Npq;
        this.A0E = c12w;
        this.A08 = new C55243OfH(this, c55000OUz);
        this.A09 = new C50736Maq(this, 0);
        this.A0A = audioManager;
        this.A0C = c55000OUz;
        this.A0B = new C55739Op8(interfaceC58103PpS);
        this.A0F = AnonymousClass194.A02(c12w);
        this.A0D = new OMO(audioManager);
    }

    public static final void A00(C55100ObB c55100ObB, boolean z) {
        if (z) {
            try {
                AudioManager audioManager = c55100ObB.A0A;
                audioManager.startBluetoothSco();
                audioManager.setBluetoothScoOn(true);
                return;
            } catch (NullPointerException e) {
                C0K8.A0L("DefaultBluetoothManager", "AudioManager#startBluetoothSco failed", e, Arrays.copyOf(new Object[0], 0));
                c55100ObB.A04 = false;
                return;
            }
        }
        AudioManager audioManager2 = c55100ObB.A0A;
        audioManager2.setBluetoothScoOn(false);
        audioManager2.stopBluetoothSco();
    }

    public static final boolean A01(C55100ObB c55100ObB) {
        AudioDeviceInfo[] devices = c55100ObB.A0A.getDevices(2);
        C14360o3.A07(devices);
        List<AudioDeviceInfo> asList = Arrays.asList(devices);
        C14360o3.A07(asList);
        for (AudioDeviceInfo audioDeviceInfo : asList) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                return true;
            }
        }
        return false;
    }

    public final void A02() {
        BluetoothAdapter bluetoothAdapter;
        A04(false);
        BroadcastReceiver broadcastReceiver = this.A02;
        if (broadcastReceiver != null) {
            try {
                this.A06.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            this.A06.unregisterReceiver(this.A09);
        } catch (IllegalArgumentException unused2) {
        }
        BluetoothHeadset bluetoothHeadset = this.A01;
        if (bluetoothHeadset != null && (bluetoothAdapter = this.A05) != null) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
        }
        OMO omo = this.A0D;
        AudioDeviceCallback audioDeviceCallback = omo.A00;
        if (audioDeviceCallback != null) {
            this.A0A.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        AudioDeviceCallback audioDeviceCallback2 = this.A03;
        if (audioDeviceCallback2 != null) {
            this.A0A.unregisterAudioDeviceCallback(audioDeviceCallback2);
        }
        omo.A00 = null;
        this.A03 = null;
        this.A05 = null;
    }

    public final void A03(OGv oGv) {
        C14360o3.A0B(oGv, 0);
        A02();
        this.A0G = oGv;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.A05 = defaultAdapter;
        if (defaultAdapter != null) {
            Context context = this.A06;
            defaultAdapter.getProfileProxy(context, this.A08, 1);
            if (Build.VERSION.SDK_INT < 31) {
                BroadcastReceiver broadcastReceiver = this.A02;
                if (broadcastReceiver == null) {
                    broadcastReceiver = new C50736Maq(this, 1);
                    this.A02 = broadcastReceiver;
                }
                C0DJ.A00(broadcastReceiver, context, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
            } else {
                OMO omo = this.A0D;
                AudioManager audioManager = this.A0A;
                C14360o3.A0B(audioManager, 0);
                if (omo.A00 == null) {
                    C50746Mb2 c50746Mb2 = new C50746Mb2(omo);
                    omo.A00 = c50746Mb2;
                    audioManager.registerAudioDeviceCallback(c50746Mb2, AbstractC167007dF.A0J());
                }
                if (this.A03 == null) {
                    Mb3 mb3 = new Mb3(this);
                    this.A03 = mb3;
                    audioManager.registerAudioDeviceCallback(mb3, AbstractC167007dF.A0J());
                }
            }
            Intent A00 = C0DJ.A00(this.A09, context, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            if (A00 != null) {
                this.A00 = A00.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            }
        }
    }

    public final void A04(boolean z) {
        this.A0B.Cnc("toggle_bluetooth_headset", String.valueOf(z));
        if (this.A04 != z) {
            this.A04 = z;
            if (C18U.A06(C06090Tz.A05, ((N0A) this.A07).A00, 36322942149274380L)) {
                AbstractC166987dD.A1Z(new PYw(this, null, 0, z), this.A0F);
            } else {
                A00(this, z);
            }
        }
    }

    public final boolean A05() {
        BluetoothAdapter bluetoothAdapter = this.A05;
        BluetoothHeadset bluetoothHeadset = this.A01;
        if ((C18U.A06(C06090Tz.A05, ((N0A) this.A07).A00, 36316151806234636L) || (bluetoothAdapter != null && bluetoothAdapter.isEnabled() && this.A0A.isBluetoothScoAvailableOffCall())) && bluetoothHeadset != null) {
            if (Build.VERSION.SDK_INT > 30) {
                if (A01(this)) {
                    return true;
                }
                return false;
            }
            List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
            C14360o3.A07(connectedDevices);
            if (!connectedDevices.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
