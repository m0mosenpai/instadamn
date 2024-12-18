package X;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.S1c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62181S1c {
    public static ArrayList A00(List list, long j, long j2) {
        if (list == null) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ScanResult scanResult = (ScanResult) it2.next();
            if (j2 - AbstractC166987dD.A0L(scanResult.timestamp + 500) <= j) {
                A1E.add(scanResult);
            }
        }
        return A1E;
    }
}
