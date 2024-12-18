package X;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.List;

/* renamed from: X.0fB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fB {
    public static void A00(BluetoothLeScanner bluetoothLeScanner, ScanCallback scanCallback) {
        C02870Bl c02870Bl;
        C14360o3.A0B(scanCallback, 0);
        C06850Yc c06850Yc = C0BR.A00;
        int hashCode = scanCallback.hashCode();
        synchronized (c06850Yc) {
            SparseArray sparseArray = c06850Yc.A00;
            Boolean bool = (Boolean) sparseArray.get(hashCode);
            if (bool != null) {
                sparseArray.remove(hashCode);
                if (bool.booleanValue()) {
                    c02870Bl = c06850Yc.A02;
                } else {
                    c02870Bl = c06850Yc.A01;
                }
                int i = c02870Bl.A01 - 1;
                c02870Bl.A01 = i;
                if (i == 0) {
                    c02870Bl.A02 += SystemClock.uptimeMillis() - c02870Bl.A03;
                }
            }
        }
        bluetoothLeScanner.stopScan(scanCallback);
    }

    public static void A01(BluetoothLeScanner bluetoothLeScanner, ScanCallback scanCallback, ScanSettings scanSettings, List list) {
        C02870Bl c02870Bl;
        boolean z = false;
        if (scanSettings.getScanMode() == -1) {
            z = true;
        }
        C14360o3.A0B(scanCallback, 0);
        C06850Yc c06850Yc = C0BR.A00;
        int hashCode = scanCallback.hashCode();
        synchronized (c06850Yc) {
            SparseArray sparseArray = c06850Yc.A00;
            if (sparseArray.get(hashCode) == null) {
                sparseArray.put(hashCode, Boolean.valueOf(z));
                if (!z) {
                    c02870Bl = c06850Yc.A01;
                } else {
                    c02870Bl = c06850Yc.A02;
                }
                int i = c02870Bl.A01;
                if (i == 0) {
                    c02870Bl.A03 = SystemClock.uptimeMillis();
                }
                c02870Bl.A00++;
                c02870Bl.A01 = i + 1;
            }
        }
        bluetoothLeScanner.startScan((List<ScanFilter>) list, scanSettings, scanCallback);
    }
}
