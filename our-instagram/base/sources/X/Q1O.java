package X;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q1O extends ScanCallback {
    public final /* synthetic */ C62710SMy A00;

    public Q1O(C62710SMy c62710SMy) {
        this.A00 = c62710SMy;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onBatchScanResults(List list) {
        super.onBatchScanResults(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onScanResult(1, (ScanResult) it.next());
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        this.A00.A00 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // android.bluetooth.le.ScanCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScanResult(int r12, android.bluetooth.le.ScanResult r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1O.onScanResult(int, android.bluetooth.le.ScanResult):void");
    }
}
