package X;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* renamed from: X.OfG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55242OfG implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ N08 A00;

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        C14360o3.A0B(bluetoothProfile, 1);
        if (i == 1) {
            this.A00.A00 = (BluetoothHeadset) bluetoothProfile;
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            N08 n08 = this.A00;
            n08.A00 = null;
            n08.A0C();
        }
    }

    public C55242OfG(N08 n08) {
        this.A00 = n08;
    }
}
