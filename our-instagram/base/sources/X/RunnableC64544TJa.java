package X;

import android.bluetooth.le.ScanSettings;
import com.facebook.blescan.BleScanOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TJa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64544TJa implements Runnable {
    public final /* synthetic */ BleScanOperation A00;

    public RunnableC64544TJa(BleScanOperation bleScanOperation) {
        this.A00 = bleScanOperation;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Comparator] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ArrayList A0q;
        try {
            BleScanOperation bleScanOperation = this.A00;
            C62710SMy c62710SMy = bleScanOperation.A01;
            synchronized (c62710SMy) {
                try {
                    if (!c62710SMy.A07) {
                        C64478TFo c64478TFo = c62710SMy.A08;
                        if (c64478TFo == null || (!C218914p.A09())) {
                            List list = c62710SMy.A0A;
                            synchronized (list) {
                                try {
                                    list.clear();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            c62710SMy.A00 = 0;
                            try {
                                if (c62710SMy.A02 != null && c62710SMy.A03 != null) {
                                    if (c62710SMy.A04 != null) {
                                        c62710SMy.A00();
                                    }
                                    c62710SMy.A06.now();
                                    c62710SMy.A04 = new Q1O(c62710SMy);
                                    c62710SMy.A01 = 2;
                                    ScanSettings.Builder builder = new ScanSettings.Builder();
                                    builder.setScanMode(c62710SMy.A01);
                                    builder.setReportDelay(0L);
                                    C0fB.A01(c62710SMy.A03, c62710SMy.A04, builder.build(), null);
                                    c62710SMy.A07 = true;
                                    if (c64478TFo != null) {
                                        synchronized (c64478TFo) {
                                            try {
                                                List list2 = c64478TFo.A00;
                                                list2.add(AbstractC25225BEi.A16(c62710SMy));
                                                if (list2.size() == 1) {
                                                    C218914p.A08.A0B(c64478TFo);
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                } else {
                                    throw new C61248Rjm(C05F.A1F);
                                }
                            } catch (Exception e) {
                                Integer num = C05F.A1F;
                                Exception exc = new Exception(AnonymousClass001.A0R("Ble scan error: ", "UNKNOWN_ERROR"), e);
                                num.getClass();
                                throw exc;
                            }
                        }
                    } else {
                        throw new C61248Rjm(C05F.A15);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
            try {
                bleScanOperation.A01.A00();
            } catch (Exception e2) {
                C0K8.A0F("com.facebook.blescan.BleScanOperation", "Exception stopping BLE scanning", e2);
            }
            C62710SMy c62710SMy2 = bleScanOperation.A01;
            synchronized (c62710SMy2) {
                try {
                    i = c62710SMy2.A00;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (i == 0) {
                C62710SMy c62710SMy3 = bleScanOperation.A01;
                synchronized (c62710SMy3) {
                    List list3 = c62710SMy3.A0A;
                    synchronized (list3) {
                        A0q = AbstractC25230BEn.A0q(list3);
                        A0q.addAll(list3);
                    }
                }
                if (A0q.size() > bleScanOperation.A00.A00) {
                    Collections.sort(A0q, new Object());
                    A0q.subList(bleScanOperation.A00.A00, A0q.size()).clear();
                }
                byte[] bArr = AbstractC62869SUt.A00;
                if (C0K8.A01.isLoggable(3) && !A0q.isEmpty()) {
                    A0q.size();
                    Iterator it = A0q.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                BleScanOperation.A00(bleScanOperation);
                bleScanOperation.A01(A0q);
                return;
            }
            throw new C61248Rjm(C05F.A1F);
        } catch (C61248Rjm e3) {
            BleScanOperation bleScanOperation2 = this.A00;
            BleScanOperation.A00(bleScanOperation2);
            bleScanOperation2.A02(e3);
        } catch (Exception unused2) {
            BleScanOperation bleScanOperation3 = this.A00;
            C61248Rjm c61248Rjm = new C61248Rjm(C05F.A1F);
            BleScanOperation.A00(bleScanOperation3);
            bleScanOperation3.A02(c61248Rjm);
        }
    }
}
