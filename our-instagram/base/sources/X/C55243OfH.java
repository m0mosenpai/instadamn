package X;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import java.util.Arrays;

/* renamed from: X.OfH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55243OfH implements BluetoothProfile.ServiceListener {
    public final /* synthetic */ C55100ObB A00;
    public final /* synthetic */ C55000OUz A01;

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        C14360o3.A0B(bluetoothProfile, 1);
        if (i == 1) {
            C55100ObB c55100ObB = this.A00;
            c55100ObB.A01 = (BluetoothHeadset) bluetoothProfile;
            OGv oGv = c55100ObB.A0G;
            if (oGv != null) {
                C55038OZk c55038OZk = oGv.A00;
                boolean A05 = c55038OZk.A05.A05();
                c55038OZk.A07.A00(AnonymousClass001.A1D("onServiceConnected: turning bluetooth on: ", A05), new Object[0]);
                if (A05) {
                    C55038OZk.A00(c55038OZk);
                }
                O1X o1x = c55038OZk.A01;
                if (o1x == null) {
                    C14360o3.A0F("callback");
                    throw C00O.createAndThrow();
                }
                o1x.A00.A0D();
                return;
            }
            C0K8.A0O("DefaultBluetoothManager", "Bluetooth connected but listener is null", Arrays.copyOf(new Object[0], 0));
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            C55100ObB c55100ObB = this.A00;
            c55100ObB.A01 = null;
            OGv oGv = c55100ObB.A0G;
            if (oGv != null) {
                C55038OZk c55038OZk = oGv.A00;
                c55038OZk.A07.A00("onServiceDisconnected: turning bluetooth off", new Object[0]);
                C55038OZk.A01(c55038OZk, true);
                O1X o1x = c55038OZk.A01;
                if (o1x == null) {
                    C14360o3.A0F("callback");
                    throw C00O.createAndThrow();
                }
                o1x.A00.A0D();
            }
        }
    }

    public C55243OfH(C55100ObB c55100ObB, C55000OUz c55000OUz) {
        this.A00 = c55100ObB;
        this.A01 = c55000OUz;
    }
}
