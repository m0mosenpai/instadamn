package X;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import java.util.List;

/* loaded from: classes9.dex */
public final class OHJ {
    public final /* synthetic */ C54996OUf A00;

    public OHJ(C54996OUf c54996OUf) {
        this.A00 = c54996OUf;
    }

    public final void A00() {
        C52714NTz c52714NTz;
        AudioOutputRoute audioOutputRoute;
        BluetoothHeadset bluetoothHeadset;
        List<BluetoothDevice> connectedDevices;
        BluetoothDevice bluetoothDevice;
        String[] strArr;
        long currentTimeMillis;
        C54996OUf c54996OUf = this.A00;
        OMu oMu = c54996OUf.A09.A09.A00;
        if (oMu.A01() == EnumC53278NhG.A02) {
            int i = Build.VERSION.SDK_INT;
            String str = null;
            Context context = c54996OUf.A07;
            if (i > 30) {
                AudioDeviceInfo[] devices = AbstractC50522MSa.A0E(context).getDevices(2);
                C14360o3.A07(devices);
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                        CharSequence productName = audioDeviceInfo.getProductName();
                        if (productName != null) {
                            str = productName.toString();
                        }
                    }
                }
            } else if (!AbstractC53742Npu.A00() || context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") != -1) {
                if (oMu instanceof N09) {
                    bluetoothHeadset = ((N09) oMu).A09.A05.A01;
                } else {
                    bluetoothHeadset = ((N08) oMu).A00;
                }
                if (bluetoothHeadset != null && (connectedDevices = bluetoothHeadset.getConnectedDevices()) != null && (bluetoothDevice = (BluetoothDevice) AbstractC001800i.A0J(connectedDevices)) != null) {
                    str = bluetoothDevice.getName();
                }
            }
            c52714NTz = c54996OUf.A0W.A00.A05;
            if (!c52714NTz.A04) {
                c52714NTz.A04 = true;
                NU1 nu1 = c52714NTz.A09;
                Integer num = C05F.A0G;
                if (str == null) {
                    currentTimeMillis = System.currentTimeMillis();
                    strArr = new String[0];
                } else {
                    strArr = new String[]{str};
                    currentTimeMillis = System.currentTimeMillis();
                }
                nu1.A02(new C51874MwI(num, C05F.A00, strArr, currentTimeMillis, false));
            }
        } else {
            c52714NTz = c54996OUf.A0W.A00.A05;
            c52714NTz.A04 = false;
        }
        int ordinal = oMu.A01().ordinal();
        if (ordinal != 2) {
            if (ordinal != 0) {
                if (ordinal != 3) {
                    audioOutputRoute = AudioOutputRoute.SPEAKER;
                } else {
                    audioOutputRoute = AudioOutputRoute.HEADSET;
                }
            } else {
                audioOutputRoute = AudioOutputRoute.EARPIECE;
            }
        } else {
            audioOutputRoute = AudioOutputRoute.BLUETOOTH;
        }
        C14360o3.A0A(audioOutputRoute);
        oMu.A00();
        C14360o3.A0B(audioOutputRoute, 0);
        c52714NTz.A07 = audioOutputRoute.equals(AudioOutputRoute.SPEAKER);
        if (audioOutputRoute.equals(AudioOutputRoute.EARPIECE)) {
            C52714NTz.A00(c52714NTz);
        } else {
            ((C54812OKl) c52714NTz.A0B.getValue()).A01(false);
        }
        C05A c05a = c52714NTz.A0C;
        C56624PBu c56624PBu = new C56624PBu(audioOutputRoute);
        C14360o3.A0B(c05a, 0);
        c05a.F8m(c56624PBu);
    }
}
