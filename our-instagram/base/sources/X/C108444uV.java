package X;

import android.net.wifi.ScanResult;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4uV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108444uV {
    public final C0JM A00;
    public final C0JO A01;

    public C108444uV(C0JM c0jm, C0JO c0jo) {
        this.A00 = c0jm;
        this.A01 = c0jo;
    }

    public final void A00(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScanResult scanResult = (ScanResult) it.next();
                if (scanResult != null) {
                    long now = this.A00.now() - scanResult.timestamp;
                    if (Math.abs(now) <= 600000) {
                        scanResult.timestamp = (this.A01.now() - now) * 1000;
                    }
                }
            }
        }
    }
}
